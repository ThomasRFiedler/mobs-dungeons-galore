package net.mobsdungeonsgalore;

import net.fabricmc.api.ModInitializer;
import net.mobsdungeonsgalore.init.EntityInit;

public class MobsDungeonsGaloreMain implements ModInitializer {
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		EntityInit.Init();
		
		System.out.println("Hello Fabric world!");
	}
}
