package fr.Bentur_and_Bertatruck.proxy;

import java.io.File;

public class BandB_mod_ClientProxy extends BandB_mod_CommonProxy {
	
	@Override
	public void preInit(File configFile){
		super.preInit(configFile);
	    System.out.println("pre init côté client");	   
	}
	
	@Override
	public void init(){
		super.init();
    }
	
	
}
