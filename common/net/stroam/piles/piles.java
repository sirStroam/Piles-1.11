package net.stroam.piles;

import java.util.Random;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = piles.MOD_ID, name = piles.MOD_NAME, version = piles.VERSION, dependencies = piles.DEPENDENCIES)
public class piles {

	//constants
	public static final String MOD_ID = "piles";
	public static final String MOD_NAME = "piles";
	public static final String VERSION = "@VERSION@";
	public static final String DEPENDENCIES = "required-after:forge@[13.20.0.2299,)";
	public static final String RESOURCE_PREFIX = MOD_ID.toLowerCase() + ":"; //piles:
	
	// variables
	public static Random random = new Random();
	
	@Instance(MOD_ID)
	public static piles instance;
	
	@SidedProxy(clientSide = "net.stroam.piles.ClientProxy", serverSide = "net.stroam.piles.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		proxy.preInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
		proxy.Init(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
		proxy.postInit(event);
	}
	
	
}
