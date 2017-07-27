package fr.Bentur_and_Bertatruck.BandB_mod.common;

import org.apache.logging.log4j.Logger;

import fr.Bentur_and_Bertatruck.BandB_mod.common.loader.BandBBeverages;
import fr.Bentur_and_Bertatruck.BandB_mod.common.loader.BandBItems;
import fr.Bentur_and_Bertatruck.BandB_mod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = "bandb_mod", name = "BandB_mod", version = "10.0.0", acceptedMinecraftVersions = "[1.11.2]")
public class BandB_mod {

	public static final String MODID = "bandb_mod";

	@Instance("BandB_mod.MODID")
	public static BandB_mod instance;

    public static Logger logger;
    
    
	@SidedProxy(clientSide = "fr.Bentur_and_Bertatruck.BandB_mod.proxy.ClientProxy", serverSide = "fr.Bentur_and_Bertatruck.BandB_mod.proxy.ServerProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
	    logger = event.getModLog(); // initialise le logger.  event.getModLog() retourne un logger avec votre modid
	       
	    BandBItems.register();
	    BandBBeverages.register();

	    if(event.getSide() == Side.CLIENT){
			BandBItems.registerRender();
			BandBBeverages.registerRender();
		}

	}

	@EventHandler
	public void init(FMLInitializationEvent event) {}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {}
	
	
}