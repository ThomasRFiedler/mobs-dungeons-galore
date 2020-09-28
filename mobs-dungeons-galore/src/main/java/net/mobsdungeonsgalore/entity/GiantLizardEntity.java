package net.mobsdungeonsgalore.entity;
import java.util.UUID;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.Durations;
import net.minecraft.entity.ai.goal.AnimalMateGoal;
import net.minecraft.entity.ai.goal.AttackWithOwnerGoal;
import net.minecraft.entity.ai.goal.FollowTargetGoal;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.ai.goal.LookAroundGoal;
import net.minecraft.entity.ai.goal.LookAtEntityGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.RevengeGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.WanderAroundFarGoal;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.Angerable;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.recipe.Ingredient;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.IntRange;
import net.minecraft.world.World;
import net.mobsdungeonsgalore.init.EntityInit;

public class GiantLizardEntity extends TameableEntity implements Angerable {

	private static final TrackedData<Integer> ANGER_TIME;
	private static final Ingredient BREEDING_INGREDIENT;
	private static final IntRange ANGER_TIME_RANGE;
	private static final Goal FollowPlayerIfAngry = null;
	private UUID targetUuid;
	
    public GiantLizardEntity(EntityType<? extends TameableEntity> entityType, World world) 
    {    	
        super(entityType, world);
        this.stepHeight = 1.0F;
        this.setTamed(false);
        
    }
    
    @Override
    public void initGoals() 
    {
    	this.goalSelector.add(1, new SwimGoal(this));
    	this.goalSelector.add(2, new AnimalMateGoal(this, 1.0D));
    	this.goalSelector.add(3, new WanderAroundFarGoal(this, 1.0D));
    	this.goalSelector.add(4, new LookAtEntityGoal(this, PlayerEntity.class, 6.0F));
        this.goalSelector.add(5, new LookAroundGoal(this));
        this.goalSelector.add(6, new MeleeAttackGoal(this, 1.0D, true));
        this.goalSelector.add(7, new WanderAroundFarGoal(this, 1.0D));
        this.targetSelector.add(1, new AttackWithOwnerGoal(this));
        this.targetSelector.add(2, (new RevengeGoal(this, new Class[0])).setGroupRevenge());
        this.targetSelector.add(3, new GiantLizardEntity.FollowPlayerIfAngry(this));
        
    }
    
    static class FollowPlayerIfAngry extends FollowTargetGoal<PlayerEntity> 
    {
    	public FollowPlayerIfAngry(GiantLizardEntity entity) 
    	{
    		super(entity, PlayerEntity.class, true);
    	}

    }
    
    @Override
    public void initDataTracker() 
    {
    	super.initDataTracker();
    	this.dataTracker.startTracking(ANGER_TIME, 0);
    }
    
    public static DefaultAttributeContainer.Builder createGiantLizardAttributes() 
    {
    	return HostileEntity.createHostileAttributes()
    			.add(EntityAttributes.GENERIC_MAX_HEALTH, 30.00)
    			.add(EntityAttributes.GENERIC_MOVEMENT_SPEED,0.3D)
    			.add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 10.00)
    			.add(EntityAttributes.GENERIC_FOLLOW_RANGE, 12.00);
    }

    @Override
    public void writeCustomDataToTag(CompoundTag tag) 
    {
        this.angerToTag(tag);
     }
    
	@Override
	public int getAngerTime()
	{	
		return (Integer)this.dataTracker.get(ANGER_TIME);
	}

	@Override
	public void setAngerTime(int ticks) 
	{
		this.dataTracker.set(ANGER_TIME, ticks);
		
	}

	@Override
	public UUID getAngryAt() 
	{
		return this.targetUuid;
	}
	
	@Override
	public void setAngryAt(UUID uuid)
	{
	      this.targetUuid = uuid;
	}
	
	@Override
	public void chooseRandomAngerTime() 
	{
		this.setAngerTime(ANGER_TIME_RANGE.choose(this.random));
		
	}
	
	@Override
	public GiantLizardEntity createChild(ServerWorld world, PassiveEntity entity) 
	{	
		GiantLizardEntity giantLizardEntity = (GiantLizardEntity)EntityInit.GIANTLIZARD_ENTITY.create(world);
		
		return giantLizardEntity;
	}
	
	static 
	{
		ANGER_TIME = DataTracker.registerData(GiantLizardEntity.class, TrackedDataHandlerRegistry.INTEGER);
		BREEDING_INGREDIENT = Ingredient.ofItems(Items.PORKCHOP, Items.BEEF, Items.MUTTON, Items.CHICKEN, Items.COD, Items.SALMON, Items.RABBIT, Items.ROTTEN_FLESH);
		ANGER_TIME_RANGE = Durations.betweenSeconds(20, 39);
	}

    
    
}
