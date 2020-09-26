package net.mobsdungeonsgalore.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.AnimalMateGoal;
import net.minecraft.entity.ai.goal.AttackWithOwnerGoal;
import net.minecraft.entity.ai.goal.LookAroundGoal;
import net.minecraft.entity.ai.goal.LookAtEntityGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.RevengeGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.WanderAroundFarGoal;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.attribute.DefaultAttributeContainer.Builder;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class TrollEntity extends HostileEntity {

	public TrollEntity(EntityType<? extends HostileEntity> entityType, World world) {
		super(entityType, world);
	}

	public static Builder createTrollAttributes() {

    	return HostileEntity.createHostileAttributes()
    			.add(EntityAttributes.GENERIC_MAX_HEALTH, 40.00)
    			.add(EntityAttributes.GENERIC_MOVEMENT_SPEED,0.25D)
    			.add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 15.00)
    			.add(EntityAttributes.GENERIC_FOLLOW_RANGE, 24.00);
    }
	
    @Override
    public void initGoals() 
    {
    	this.goalSelector.add(1, new SwimGoal(this));
    	this.goalSelector.add(3, new WanderAroundFarGoal(this, 1.0D));
    	this.goalSelector.add(4, new LookAtEntityGoal(this, PlayerEntity.class, 6.0F));
        this.goalSelector.add(5, new LookAroundGoal(this));
        this.goalSelector.add(6, new MeleeAttackGoal(this, 1.0D, true));
        this.goalSelector.add(7, new WanderAroundFarGoal(this, 1.0D));
    
    }

}
