package net.mobsdungeonsgalore.init;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SoundInit 
{
	
    public static final Identifier ENTITY_GIANTLIZARD_DEATH_ID = new Identifier("mobsdungeonsgalore:entity.giantlizard.death");
    public static SoundEvent ENTITY_GIANTLIZARD_DEATH = new SoundEvent(ENTITY_GIANTLIZARD_DEATH_ID);
    
    public static final Identifier ENTITY_GIANTLIZARD_HURT_ID = new Identifier("mobsdungeonsgalore:entity.giantlizard.hurt");
    public static SoundEvent ENTITY_GIANTLIZARD_HURT = new SoundEvent(ENTITY_GIANTLIZARD_HURT_ID);
    
    public static final Identifier ENTITY_GIANTLIZARD_AMBIENT_ID = new Identifier("mobsdungeonsgalore:entity.giantlizard.ambient");
    public static SoundEvent ENTITY_GIANTLIZARD_AMBIENT = new SoundEvent(ENTITY_GIANTLIZARD_AMBIENT_ID);

    public static void Init() 
    {
    	Registry.register(Registry.SOUND_EVENT, SoundInit.ENTITY_GIANTLIZARD_DEATH_ID, ENTITY_GIANTLIZARD_DEATH);
    	Registry.register(Registry.SOUND_EVENT, SoundInit.ENTITY_GIANTLIZARD_HURT_ID, ENTITY_GIANTLIZARD_HURT);
    	Registry.register(Registry.SOUND_EVENT, SoundInit.ENTITY_GIANTLIZARD_AMBIENT_ID, ENTITY_GIANTLIZARD_AMBIENT);

    }
}
