package fr.Bentur_and_Bertatruck.BandB_mod.common.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemBottle extends ItemBase {

	public ItemBottle(String name) {
		super(name);
		this.setMaxStackSize(32);
		this.setCreativeTab(CreativeTabs.BREWING);
		//this.setCreativeTab(BandbCreativeTabs.CreativeTabsBottle);
	}

}