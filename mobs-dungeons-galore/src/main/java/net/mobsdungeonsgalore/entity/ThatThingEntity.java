package net.mobsdungeonsgalore.entity;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class ThatThingEntity extends HostileEntity
{
    private int attackTicksLeft;

    public ThatThingEntity(EntityType<? extends HostileEntity> entityType, World world)
    {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder createThatThingAttributes()
    {
        return HostileEntity.createHostileAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 20.00)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED,0.33D)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 8.00)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 36.00);
    }

    @Override
    public void initGoals()
    {
        this.goalSelector.add(1, new SwimGoal(this));
        this.goalSelector.add(3, new WanderAroundFarGoal(this, 1.0D));
        this.goalSelector.add(8, new LookAtEntityGoal(this, PlayerEntity.class, 6.0F));
        this.goalSelector.add(8, new LookAroundGoal(this));
        this.goalSelector.add(2, new MeleeAttackGoal(this, 1.0D, true));
        this.targetSelector.add(1, new FollowTargetGoal(this, PlayerEntity.class, true));

    }
    @Environment(EnvType.CLIENT)
    public int getAttackTicksLeft() {
        return this.attackTicksLeft;
    }

    public void tickMovement()
    {
        super.tickMovement();
        if (this.attackTicksLeft > 0) { --this.attackTicksLeft; }

    }
    public boolean tryAttack(Entity target)
    {

        this.attackTicksLeft = 10;
        this.world.sendEntityStatus(this, (byte) 4);

        float f = this.getAttackDamage();
        float g = (int) f > 0 ? f / 2.0F + (float) this.random.nextInt((int) f) : f;

        boolean bl = target.damage(DamageSource.mob(this), g);
        if (bl) {
            this.dealDamage(this, target);
        }

        return bl;
    }

    @Environment(EnvType.CLIENT)
    public void handleStatus(byte status) {
        if (status == 4) {
            this.attackTicksLeft = 10;
        } else {
            super.handleStatus(status);
        }

    }

    private float getAttackDamage()
    {
        return (float)this.getAttributeValue(EntityAttributes.GENERIC_ATTACK_DAMAGE);
    }

}
