package fr.Bentur_and_Bertatruck.BandB_mod.proxy;

import java.io.File;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void preInit(File configFile){
		super.preInit(configFile);
	    System.out.println("pre init c�t� client");	   
	}
	
	@Override
	public void init(){
		super.init();
    }
	
	
}
