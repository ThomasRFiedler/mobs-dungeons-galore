package net.mobsdungeonsgalore.entity.render;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.mobsdungeonsgalore.entity.ThatThingEntity;
import net.mobsdungeonsgalore.entity.model.ThatThingModel;

@Environment(EnvType.CLIENT)
public class ThatThingRenderer extends MobEntityRenderer<ThatThingEntity, ThatThingModel<ThatThingEntity>>
{
    private static final Identifier TEXTURE = new Identifier("mobsdungeonsgalore:/textures/entity/thatthing.png");

    public ThatThingRenderer(EntityRenderDispatcher entityRenderDispatcher)
    {
        super(entityRenderDispatcher, new ThatThingModel<>(), 0.5F);
    }
    @Override
    public Identifier getTexture(ThatThingEntity thatThingEntity)
    {
        return TEXTURE;
    }
}
