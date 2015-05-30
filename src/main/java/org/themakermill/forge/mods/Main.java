package org.themakermill.forge.mods;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import com.example.examplemod.ExampleMod;


@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main {
	
	public static final String MODID = "The Maker Mill Mods";
	public static final String VERSION = "0.1";
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		MinecraftForge.EVENT_BUS.register(new BlockBreakMessage());
		MinecraftForge.EVENT_BUS.register(new MinecartExploder());
		MinecraftForge.EVENT_BUS.register(new ExplodingAnvil());
		MinecraftForge.EVENT_BUS.register(new DiamondOreTrap());
	}

}
