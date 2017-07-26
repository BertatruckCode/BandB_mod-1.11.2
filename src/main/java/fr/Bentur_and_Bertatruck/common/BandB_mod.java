package fr.Bentur_and_Bertatruck.common;

import org.apache.logging.log4j.Logger;

import fr.Bentur_and_Bertatruck.proxy.BandB_mod_ClientProxy;
import fr.Bentur_and_Bertatruck.proxy.BandB_mod_CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "bandb_mod", name = "BandB_mod", version = "10.0.0", acceptedMinecraftVersions = "[1.11.2]")
public class BandB_mod {

	public static final String MODID = "bandb_mod";

	@Instance("BandB_mod.MODID")
	public static BandB_mod instance;

    public static Logger logger;
    
    
	@SidedProxy(clientSide = "fr.Bentur_and_Bertatruck.proxy.BandB_mod_ClientProxy", serverSide = "fr.Bentur_and_Bertatruck.proxy.BandB_mod_ServerProxy")
	public static BandB_mod_CommonProxy proxy;


	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
	       logger = event.getModLog(); // initialise le logger.  event.getModLog() retourne un logger avec votre modid
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {}
	
	
}