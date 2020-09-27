package net.mobsdungeonsgalore.entity.model;

import com.google.common.collect.ImmutableList;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.CompositeEntityModel;
import net.minecraft.util.math.MathHelper;
import net.mobsdungeonsgalore.entity.ThatThingEntity;

@Environment(EnvType.CLIENT)
public class ThatThingModel<T extends ThatThingEntity> extends CompositeEntityModel<T>
{
    private final ModelPart head;
    private final ModelPart body;
    private final ModelPart lowerJaw;
    private final ModelPart upperJaw;
    private final ModelPart rightLeg;
    private final ModelPart leftLeg;

    public ThatThingModel()
    {
        head = (new ModelPart(this).setTextureSize(128,128));;
        head.setPivot(0.0F, -5.0F, 0.0F);
        head.setTextureOffset(0, 56).addCuboid(-7.0F, -11.0F, -6.0F, 14.0F, 11.0F, 12.0F, 0.0F, false);
        head.setTextureOffset(0, 33).addCuboid(9.0F, -12.0F, -2.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
        head.setTextureOffset(52, 0).addCuboid(7.0F, -9.0F, -2.0F, 2.0F, 5.0F, 3.0F, 0.0F, false);
        head.setTextureOffset(48, 40).addCuboid(-9.0F, -9.0F, -2.0F, 2.0F, 5.0F, 3.0F, 0.0F, false);
        head.setTextureOffset(0, 0).addCuboid(-12.0F, -12.0F, -2.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
        head.setTextureOffset(48, 33).addCuboid(-3.0F, -8.0F, -7.0F, 6.0F, 6.0F, 1.0F, 0.0F, false);

        body = (new ModelPart(this).setTextureSize(128,128));;
        body.setPivot(0.0F, 3.0F, 0.0F);
        body.setTextureOffset(0, 0).addCuboid(-9.0F, -8.0F, -8.0F, 18.0F, 17.0F, 16.0F, 0.0F, false);

        upperJaw = (new ModelPart(this).setTextureSize(128,128));;
        upperJaw.setPivot(0.0F, -2.0F, -8.0F);
        upperJaw.setTextureOffset(48, 48).addCuboid(-8.0F, -2.0F, -16.0F, 16.0F, 4.0F, 16.0F, 0.0F, false);
        upperJaw.setTextureOffset(40, 53).addCuboid(4.0F, 2.0F, -16.0F, 4.0F, 2.0F, 0.0F, 0.0F, false);
        upperJaw.setTextureOffset(32, 53).addCuboid(-8.0F, 2.0F, -16.0F, 4.0F, 2.0F, 0.0F, 0.0F, false);
        upperJaw.setTextureOffset(52, 10).addCuboid(-3.0F, 2.0F, -16.0F, 6.0F, 2.0F, 0.0F, 0.0F, false);
        upperJaw.setTextureOffset(24, 49).addCuboid(8.0F, 2.0F, -4.0F, 0.0F, 2.0F, 4.0F, 0.0F, false);
        upperJaw.setTextureOffset(0, 37).addCuboid(8.0F, 2.0F, -11.0F, 0.0F, 2.0F, 6.0F, 0.0F, false);
        upperJaw.setTextureOffset(0, 8).addCuboid(-8.0F, 2.0F, -11.0F, 0.0F, 2.0F, 6.0F, 0.0F, false);
        upperJaw.setTextureOffset(16, 49).addCuboid(-8.0F, 2.0F, -4.0F, 0.0F, 2.0F, 4.0F, 0.0F, false);
        upperJaw.setTextureOffset(8, 49).addCuboid(8.0F, 2.0F, -16.0F, 0.0F, 2.0F, 4.0F, 0.0F, false);
        upperJaw.setTextureOffset(0, 49).addCuboid(-8.0F, 2.0F, -16.0F, 0.0F, 2.0F, 4.0F, 0.0F, false);

        lowerJaw = (new ModelPart(this).setTextureSize(128,128));;
        lowerJaw.setPivot(0.0F, 7.0F, -8.0F);
        lowerJaw.setTextureOffset(0, 33).addCuboid(-8.0F, -2.0F, -16.0F, 16.0F, 4.0F, 16.0F, 0.0F, false);
        lowerJaw.setTextureOffset(52, 14).addCuboid(-8.0F, -4.0F, -16.0F, 4.0F, 2.0F, 0.0F, 0.0F, false);
        lowerJaw.setTextureOffset(52, 12).addCuboid(4.0F, -4.0F, -16.0F, 4.0F, 2.0F, 0.0F, 0.0F, false);
        lowerJaw.setTextureOffset(52, 8).addCuboid(-3.0F, -4.0F, -16.0F, 6.0F, 2.0F, 0.0F, 0.0F, false);
        lowerJaw.setTextureOffset(8, 43).addCuboid(-8.0F, -4.0F, -16.0F, 0.0F, 2.0F, 4.0F, 0.0F, false);
        lowerJaw.setTextureOffset(0, 6).addCuboid(-8.0F, -4.0F, -11.0F, 0.0F, 2.0F, 6.0F, 0.0F, false);
        lowerJaw.setTextureOffset(0, 43).addCuboid(-8.0F, -4.0F, -4.0F, 0.0F, 2.0F, 4.0F, 0.0F, false);
        lowerJaw.setTextureOffset(8, 41).addCuboid(8.0F, -4.0F, -16.0F, 0.0F, 2.0F, 4.0F, 0.0F, false);
        lowerJaw.setTextureOffset(0, 4).addCuboid(8.0F, -4.0F, -11.0F, 0.0F, 2.0F, 6.0F, 0.0F, false);
        lowerJaw.setTextureOffset(0, 41).addCuboid(8.0F, -4.0F, -4.0F, 0.0F, 2.0F, 4.0F, 0.0F, false);

        rightLeg = (new ModelPart(this).setTextureSize(128,128));;
        rightLeg.setPivot(-8.0F, 5.0F, 1.0F);
        rightLeg.setTextureOffset(68, 0).addCuboid(-8.0F, -5.0F, -6.0F, 7.0F, 24.0F, 10.0F, 0.0F, false);

        leftLeg = (new ModelPart(this).setTextureSize(128,128));;
        leftLeg.setPivot(9.0F, 5.0F, 0.0F);
        leftLeg.setTextureOffset(52, 68).addCuboid(0.0F, -5.0F, -5.0F, 7.0F, 24.0F, 10.0F, 0.0F, false);
    
    }
    @Override
    public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch)
    {
        this.head.pitch = headPitch * 0.017453292F;
        this.head.yaw = headYaw * 0.017453292F;
        this.rightLeg.pitch = MathHelper.cos(limbAngle * 0.6662F) * 1.4F * limbDistance;
        this.leftLeg.pitch = MathHelper.cos(limbAngle * 0.6662F + 3.1415927F) * 1.4F * limbDistance;

    }
    @Override
    public Iterable<ModelPart> getParts()
    {
        return ImmutableList.of(body, rightLeg, leftLeg, upperJaw, lowerJaw, head);
    }

    @Override
    public void animateModel(T thatThingEntity, float f, float g, float h) {
        int i = thatThingEntity.getAttackTicksLeft();

        if (i > 0) {
            this.upperJaw.pitch = -2.5F + 2.5F * MathHelper.method_24504((float)i - h, 50.0F);
            this.lowerJaw.pitch = 2.5F - 2.5F * MathHelper.method_24504((float)i - h, 50.0F);
        } else {
            this.upperJaw.pitch = (-1.6F + 1.5F * MathHelper.method_24504(f, 10.0F))*(g/2);
            this.lowerJaw.pitch = (1.6F - 1.5F * MathHelper.method_24504(f, 10.0F))*(g/2);
        }
    }
}
