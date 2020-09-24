package net.mobsdungeonsgalore.entity.model;

import com.google.common.collect.ImmutableList;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.CompositeEntityModel;
import net.mobsdungeonsgalore.entity.GiantLizardEntity;

@Environment(EnvType.CLIENT)
public class GiantLizardModel<T extends GiantLizardEntity> extends CompositeEntityModel<T>
{	
	body = (new ModelPart(this).setTextureSize(128,128));
		body.setPivot(0.0F, 13.0F, 1.4828F);
		body.setTextureOffset(0, 23).addCuboid(-7.0F, -5.0F, -9.9655F, 14.0F, 11.0F, 10.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addCuboid(-8.0F, -6.0F, 0.0345F, 16.0F, 13.0F, 10.0F, 0.0F, false);

		leftLeg = (new ModelPart(this).setTextureSize(128,128));
		leftLeg.setPivot(-5.0F, 20.0F, 8.0F);
		leftLeg.setTextureOffset(41, 58).addCuboid(-2.0F, 0.0F, -3.0F, 4.0F, 5.0F, 5.0F, 0.0F, false);

		head = (new ModelPart(this).setTextureSize(128,128));
		head.setPivot(0.0F, 13.0F, -9.5172F);
		head.setTextureOffset(43, 14).addCuboid(-5.0F, -4.0F, -7.9655F, 10.0F, 6.0F, 9.0F, 0.0F, false);
		head.setTextureOffset(42, 0).addCuboid(-4.0F, -3.0F, -12.9655F, 8.0F, 5.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addCuboid(3.0F, -3.0F, -6.9655F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 4).addCuboid(-6.0F, -3.0F, -6.9655F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(22, 52).addCuboid(-3.0F, 2.0F, -4.9655F, 6.0F, 3.0F, 6.0F, 0.0F, false);

		jaw = (new ModelPart(this).setTextureSize(128,128));
		jaw.setPivot(0.0F, 3.0F, -5.0F);
		head.addChild(jaw);
		jaw.setTextureOffset(48, 29).addCuboid(-3.0F, 0.0F, -6.9655F, 6.0F, 1.0F, 7.0F, 0.0F, false);
		jaw.setTextureOffset(0, 6).addCuboid(3.0F, -1.0F, -1.9655F, 0.0F, 1.0F, 2.0F, 0.0F, false);
		jaw.setTextureOffset(0, 7).addCuboid(3.0F, -1.0F, -4.9655F, 0.0F, 1.0F, 2.0F, 0.0F, false);
		jaw.setTextureOffset(0, 0).addCuboid(2.0F, -1.0F, -6.9655F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		jaw.setTextureOffset(0, 3).addCuboid(3.0F, -1.0F, -6.9655F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		jaw.setTextureOffset(0, 23).addCuboid(-1.0F, -1.0F, -6.9655F, 2.0F, 1.0F, 0.0F, 0.0F, false);
		jaw.setTextureOffset(0, 5).addCuboid(-3.0F, -1.0F, -6.9655F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		jaw.setTextureOffset(0, 0).addCuboid(-3.0F, -1.0F, -6.9655F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		jaw.setTextureOffset(4, 7).addCuboid(-3.0F, -1.0F, -4.9655F, 0.0F, 1.0F, 2.0F, 0.0F, false);
		jaw.setTextureOffset(4, 6).addCuboid(-3.0F, -1.0F, -1.9655F, 0.0F, 1.0F, 2.0F, 0.0F, false);

		tail = (new ModelPart(this).setTextureSize(128,128));
		tail.setPivot(0.0F, 15.0F, 12.4828F);
		tail.setTextureOffset(41, 41).addCuboid(-6.0F, -6.0F, -0.9655F, 12.0F, 10.0F, 7.0F, 0.0F, false);
		tail.setTextureOffset(0, 44).addCuboid(-4.0F, -4.0F, 6.0345F, 8.0F, 7.0F, 6.0F, 0.0F, false);
		tail.setTextureOffset(65, 7).addCuboid(-3.0F, -2.0F, 12.0345F, 6.0F, 4.0F, 3.0F, 0.0F, false);

		rightLeg = (new ModelPart(this).setTextureSize(128,128));
		rightLeg.setPivot(5.0F, 20.0F, 8.0F);
		rightLeg.setTextureOffset(0, 57).addCuboid(-2.0F, 0.0F, -3.0F, 4.0F, 5.0F, 5.0F, 0.0F, false);

		rightArm = (new ModelPart(this).setTextureSize(128,128));
		rightArm.setPivot(4.0F, 19.0F, -6.0F);
		rightArm.setTextureOffset(18, 61).addCuboid(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		leftArm = (new ModelPart(this).setTextureSize(128,128));
		leftArm.setPivot(-4.0F, 19.0F, -6.0F);
		leftArm.setTextureOffset(59, 59).addCuboid(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
	}


	@Override
	public Iterable<ModelPart> getParts() 
	{
		return ImmutableList.of(head, body, tail, rightLeg, leftLeg, rightArm, leftArm);
	}

	@Override
	public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) 
	{
	    this.head.pitch = headPitch * 0.017453292F;
	    this.head.yaw = headYaw * 0.017453292F;
	    this.rightLeg.pitch = MathHelper.cos(limbAngle * 0.6662F) * 1.4F * limbDistance;
	    this.leftLeg.pitch = MathHelper.cos(limbAngle * 0.6662F + 3.1415927F) * 1.4F * limbDistance;
	    this.rightArm.pitch = MathHelper.cos(limbAngle * 0.6662F + 3.1415927F) * 1.4F * limbDistance;
	    this.leftArm.pitch = MathHelper.cos(limbAngle * 0.6662F) * 1.4F * limbDistance;
		
	}




	


}
