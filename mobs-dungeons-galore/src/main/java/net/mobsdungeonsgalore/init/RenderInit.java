package net.mobsdungeonsgalore.init;

import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.mobsdungeonsgalore.entity.render.GiantLizardRenderer;

public class RenderInit 
{
	
	public static void Init() 
	{
		EntityRendererRegistry.INSTANCE.register(EntityInit.GIANTLIZARD_ENTITY,
				(dispatcher,context) -> new GiantLizardRenderer(dispatcher));
	}
}
