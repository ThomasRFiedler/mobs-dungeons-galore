package net.mobsdungeonsgalore.init;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.mobsdungeonsgalore.entity.GiantLizardEntity;
import net.mobsdungeonsgalore.entity.TrollEntity;

public class EntityInit 
{	
	public static final EntityType<GiantLizardEntity> GIANTLIZARD_ENTITY = FabricEntityTypeBuilder
			.create(SpawnGroup.CREATURE,GiantLizardEntity::new)
			.dimensions(EntityDimensions.fixed(1.5F,1.0F)).build();
	
	public static final EntityType<TrollEntity> TROLL_ENTITY = FabricEntityTypeBuilder
			.create(SpawnGroup.MONSTER,TrollEntity::new)
			.dimensions(EntityDimensions.fixed(1.0F, 2.5F)).build();
	
	public static void Init()
	{
		Registry.register(Registry.ENTITY_TYPE, new Identifier("mobsdungeonsgalore","giant_lizard"), GIANTLIZARD_ENTITY);
		Registry.register(Registry.ENTITY_TYPE, new Identifier("mobsdungeonsgalore","troll"), TROLL_ENTITY);
		
		
		FabricDefaultAttributeRegistry.register(GIANTLIZARD_ENTITY, GiantLizardEntity.createGiantLizardAttributes());
		FabricDefaultAttributeRegistry.register(TROLL_ENTITY, TrollEntity.createTrollAttributes());
	}

}
