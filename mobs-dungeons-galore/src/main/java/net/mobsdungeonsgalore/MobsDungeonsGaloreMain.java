package net.mobsdungeonsgalore;

import net.fabricmc.api.ModInitializer;
import net.mobsdungeonsgalore.init.EntityInit;
import net.mobsdungeonsgalore.init.SoundInit;

public class MobsDungeonsGaloreMain implements ModInitializer {
	@Override
	public void onInitialize() {
		
		EntityInit.Init();
		SoundInit.Init();
		
		System.out.println("Hello Fabric world!");
	}
}
