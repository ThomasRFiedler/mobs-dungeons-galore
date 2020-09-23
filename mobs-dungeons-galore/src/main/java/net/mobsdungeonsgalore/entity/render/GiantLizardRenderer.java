package net.mobsdungeonsgalore.entity.render;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.mobsdungeonsgalore.entity.GiantLizardEntity;
import net.mobsdungeonsgalore.entity.model.GiantLizardModel;

@Environment(EnvType.CLIENT)
public class GiantLizardRenderer extends MobEntityRenderer<GiantLizardEntity, GiantLizardModel<GiantLizardEntity>>
{
	
	private static final Identifier TEXTURE = new Identifier("mobsdungeonsgalore:/textures/entity/giant_lizard.png");
	
	public GiantLizardRenderer(EntityRenderDispatcher entityRenderDispatcher) 
	{
		super(entityRenderDispatcher, new GiantLizardModel<>(), 0.5F);
	}
	@Override
	public Identifier getTexture(GiantLizardEntity giantLizardEntity) 
	{		
		return TEXTURE;
	}
}
