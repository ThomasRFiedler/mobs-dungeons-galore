package net.mobsdungeonsgalore.entity.render;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.mobsdungeonsgalore.entity.TrollEntity;
import net.mobsdungeonsgalore.entity.model.TrollModel;

@Environment(EnvType.CLIENT)
public class TrollRenderer extends MobEntityRenderer<TrollEntity, TrollModel<TrollEntity>>
{
	
	private static final Identifier TEXTURE = new Identifier("mobsdungeonsgalore:/textures/entity/troll.png");
	
	public TrollRenderer(EntityRenderDispatcher entityRenderDispatcher) 
	{
		super(entityRenderDispatcher, new TrollModel<>(), 0.5F);
	}

	@Override
	public Identifier getTexture(TrollEntity entity) 
	{		
		return TEXTURE;
	}
}
