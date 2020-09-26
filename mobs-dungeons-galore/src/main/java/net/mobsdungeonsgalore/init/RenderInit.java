package net.mobsdungeonsgalore.init;

import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.mobsdungeonsgalore.entity.render.GiantLizardRenderer;
import net.mobsdungeonsgalore.entity.render.TrollRenderer;

public class RenderInit 
{
	
	public static void Init() 
	{
		EntityRendererRegistry.INSTANCE.register(EntityInit.GIANTLIZARD_ENTITY, (dispatcher,context) -> new GiantLizardRenderer(dispatcher));
		
		EntityRendererRegistry.INSTANCE.register(EntityInit.TROLL_ENTITY, (dispatcher,context) -> new TrollRenderer(dispatcher));
		
	}
}
