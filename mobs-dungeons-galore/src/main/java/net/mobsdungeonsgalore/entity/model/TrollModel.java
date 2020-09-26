package net.mobsdungeonsgalore.entity.model;

import com.google.common.collect.ImmutableList;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.CompositeEntityModel;
import net.minecraft.util.math.MathHelper;
import net.mobsdungeonsgalore.entity.TrollEntity;

@Environment(EnvType.CLIENT)
public class TrollModel<T extends TrollEntity> extends CompositeEntityModel<T> 
{
	private final ModelPart rightLeg;
	private final ModelPart leftLeg;
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart leftArm;
	private final ModelPart rightArm;

	public TrollModel() {
		leftLeg = (new ModelPart(this).setTextureSize(128,128));
		leftLeg.setPivot(-4.5F, 8.0F, 1.5F);
		leftLeg.setTextureOffset(58, 31).addCuboid(-3.5F, 0.0F, -2.5F, 7.0F, 12.0F, 5.0F, 0.0F, false);
		leftLeg.setTextureOffset(40, 53).addCuboid(-3.5F, 12.0F, -6.5F, 7.0F, 4.0F, 9.0F, 0.0F, false);

		rightLeg = (new ModelPart(this).setTextureSize(128,128));
		rightLeg.setPivot(4.5F, 8.0F, 1.5F);
		rightLeg.setTextureOffset(0, 64).addCuboid(-3.5F, 0.0F, -2.5F, 7.0F, 12.0F, 5.0F, 0.0F, false);
		rightLeg.setTextureOffset(56, 0).addCuboid(-3.5F, 12.0F, -6.5F, 7.0F, 4.0F, 9.0F, 0.0F, false);

		body = (new ModelPart(this).setTextureSize(128,128));
		body.setPivot(0.0834F, -1.4521F, 0.8725F);
		body.setTextureOffset(0, 0).addCuboid(-9.0F, 0.0F, -4.7451F, 18.0F, 10.0F, 10.0F, 0.0F, false);
		body.setTextureOffset(0, 20).addCuboid(-8.0F, -9.0F, -3.7451F, 16.0F, 11.0F, 8.0F, 0.0F, false);

		head = (new ModelPart(this).setTextureSize(128,128));
		head.setPivot(0.0834F, -8.4521F, 0.8725F);
		//setRotationAngle(head, -0.0873F, 0.0F, 0.0F);
		head.setTextureOffset(0, 43).addCuboid(-5.0F, -10.2156F, -4.7108F, 10.0F, 11.0F, 10.0F, 0.0F, false);
		head.setTextureOffset(64, 66).addCuboid(-2.0F, -4.2156F, -6.7108F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		rightArm = (new ModelPart(this).setTextureSize(128,128));
		rightArm.setPivot(-8.0F, -5.0F, 1.0F);
		//setRotationAngle(rightArm, 0.0F, 0.0F, 0.2182F);
		rightArm.setTextureOffset(44, 66).addCuboid(-4.9566F, -2.669F, -2.0F, 6.0F, 17.0F, 4.0F, 0.0F, false);
		rightArm.setTextureOffset(31, 31).addCuboid(-4.4566F, 8.831F, -14.0F, 5.0F, 5.0F, 17.0F, 0.0F, false);
		rightArm.setTextureOffset(49, 13).addCuboid(-6.9566F, 5.331F, -21.0F, 11.0F, 11.0F, 7.0F, 0.0F, false);

		leftArm = (new ModelPart(this).setTextureSize(128,128));
		leftArm.setPivot(8.0F, -5.0F, 1.0F);
		//setRotationAngle(leftArm, 0.0F, 0.0F, -0.2182F);
		leftArm.setTextureOffset(24, 64).addCuboid(-1.0F, -3.0F, -2.0F, 6.0F, 17.0F, 4.0F, 0.0F, false);


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

	@Override
	public Iterable<ModelPart> getParts() {
		return ImmutableList.of(head, body, rightLeg, leftLeg, rightArm, leftArm);
	}



}
