package fr.Bentur_and_Bertatruck.BandB_mod.common.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemBase extends Item{
	
	public ItemBase(String name){
		this.setUnlocalizedName(name);
		this.setRegistryName(name);		
		GameRegistry.register(this);	
	}

}
