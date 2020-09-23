package net.mobsdungeonsgalore.entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.world.World;


public class GiantLizardEntity extends HostileEntity {

    public GiantLizardEntity(EntityType<? extends HostileEntity> entityType, World world) 
    {    	
        super(entityType, world);
        
    }
    
    public static DefaultAttributeContainer.Builder createGiantLizardAttributes() 
    {
    	return HostileEntity.createHostileAttributes()
    			.add(EntityAttributes.GENERIC_MAX_HEALTH, 30.00)
    			.add(EntityAttributes.GENERIC_MOVEMENT_SPEED,0.25D)
    			.add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 5.00)
    			.add(EntityAttributes.GENERIC_FOLLOW_RANGE, 12.00);
    }
}