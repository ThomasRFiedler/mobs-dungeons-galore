package net.mobsdungeonsgalore;

import net.fabricmc.api.ClientModInitializer;
import net.mobsdungeonsgalore.init.RenderInit;

public class MobsDungeonsGaloreClient implements ClientModInitializer 
{
	
	@Override
	public void onInitializeClient() 
	{
		RenderInit.Init();
	}
}
