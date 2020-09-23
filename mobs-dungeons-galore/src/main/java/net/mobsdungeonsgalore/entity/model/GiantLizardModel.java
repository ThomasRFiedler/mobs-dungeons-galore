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
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart leftLeg;
	private final ModelPart leftArm;
	private final ModelPart rightArm;
	private final ModelPart rightLeg;
	private final ModelPart tail;

	public GiantLizardModel() {
		this.textureWidth = 128;
		this.textureHeight = 128;

		this.head = (new ModelPart(this).setTextureSize(128,128));
		this.head.setPivot(0.0F, 13.0F, 8.4828F);
		this.head.setTextureOffset(43, 14).addCuboid(-5.0F, -4.0F, 0.0F, 10.0F, 6.0F, 9.0F, 0.0F);
		this.head.setTextureOffset(42, 0).addCuboid(-4.0F, -3.0F, 9.0F, 8.0F, 5.0F, 5.0F, 0.0F);
		this.head.setTextureOffset(0, 0).addCuboid(3.0F, -3.0F, 6.0F, 3.0F, 2.0F, 2.0F, 0.0F);
		this.head.setTextureOffset(0, 4).addCuboid(-6.0F, -3.0F, 6.0F, 3.0F, 2.0F, 2.0F, 0.0F);
		this.head.setTextureOffset(22, 52).addCuboid(-3.0F, 2.0F, 0.0F, 6.0F, 3.0F, 6.0F, 0.0F);
		this.head.setTextureOffset(48, 29).addCuboid(-3.0F, 3.0F, 6.0F, 6.0F, 1.0F, 7.0F, 0.0F);
		this.head.setTextureOffset(0, 6).addCuboid(3.0F, 2.0F, 6.0F, 0.0F, 1.0F, 2.0F, 0.0F);
		this.head.setTextureOffset(0, 7).addCuboid(3.0F, 2.0F, 9.0F, 0.0F, 1.0F, 2.0F, 0.0F);
		this.head.setTextureOffset(0, 3).addCuboid(3.0F, 2.0F, 12.0F, 0.0F, 1.0F, 1.0F, 0.0F);
		this.head.setTextureOffset(0, 23).addCuboid(-1.0F, 2.0F, 13.0F, 2.0F, 1.0F, 0.0F, 0.0F);
		this.head.setTextureOffset(0, 5).addCuboid(-3.0F, 2.0F, 13.0F, 1.0F, 1.0F, 0.0F, 0.0F);
		this.head.setTextureOffset(4, 6).addCuboid(-3.0F, 2.0F, 6.0F, 0.0F, 1.0F, 2.0F, 0.0F);
		this.head.setTextureOffset(4, 7).addCuboid(-3.0F, 2.0F, 9.0F, 0.0F, 1.0F, 2.0F, 0.0F);
		this.head.setTextureOffset(0, 0).addCuboid(-3.0F, 2.0F, 12.0F, 0.0F, 1.0F, 1.0F, 0.0F);
		this.head.setTextureOffset(0, 0).addCuboid(2.0F, 2.0F, 13.0F, 1.0F, 1.0F, 0.0F, 0.0F);

		this.body = (new ModelPart(this).setTextureSize(128,128));
		this.body.setPivot(0.0F, 13.0F, -1.5172F);
		this.body.setTextureOffset(0, 23).addCuboid(-7.0F, -5.0F, 0.0F, 14.0F, 11.0F, 10.0F, 0.0F);
		this.body.setTextureOffset(0, 0).addCuboid(-8.0F, -6.0F, -10.0F, 16.0F, 13.0F, 10.0F, 0.0F);

		this.leftLeg = (new ModelPart(this).setTextureSize(128,128));
		this.leftLeg.setPivot(-6.0F, 20.0F, -8.0F);
		this.leftLeg.setTextureOffset(41, 58).addCuboid(-1.0F, 0.0F, -2.0F, 4.0F, 5.0F, 5.0F, 0.0F);

		this.leftArm = (new ModelPart(this).setTextureSize(128,128));
		this.leftArm.setPivot(-4.0F, 19.0F, 6.0F);
		this.leftArm.setTextureOffset(59, 59).addCuboid(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F);

		this.rightArm = (new ModelPart(this).setTextureSize(128,128));
		this.rightArm.setPivot(4.0F, 19.0F, 6.0F);
		this.rightArm.setTextureOffset(18, 61).addCuboid(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F);

		this.rightLeg = (new ModelPart(this).setTextureSize(128,128));
		this.rightLeg.setPivot(6.0F, 20.0F, -7.0F);
		this.rightLeg.setTextureOffset(0, 57).addCuboid(-3.0F, 0.0F, -3.0F, 4.0F, 5.0F, 5.0F, 0.0F);

		this.tail = (new ModelPart(this).setTextureSize(128,128));
		this.tail.setPivot(0.0F, 15.0F, -10.5172F);
		this.tail.setTextureOffset(41, 41).addCuboid(-6.0F, -6.0F, -8.0F, 12.0F, 10.0F, 7.0F, 0.0F);
		this.tail.setTextureOffset(0, 44).addCuboid(-4.0F, -4.0F, -14.0F, 8.0F, 7.0F, 6.0F, 0.0F);
		this.tail.setTextureOffset(65, 7).addCuboid(-3.0F, -2.0F, -17.0F, 6.0F, 4.0F, 3.0F, 0.0F);
	}

	@Override
	public Iterable<ModelPart> getParts() {
		return ImmutableList.of(this.head, this.body, this.tail, this.rightLeg, this.leftLeg, this.rightArm, this.leftArm);
	}

	@Override
	public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw,
			float headPitch) {
		// TODO Auto-generated method stub
		
	}




	


}
