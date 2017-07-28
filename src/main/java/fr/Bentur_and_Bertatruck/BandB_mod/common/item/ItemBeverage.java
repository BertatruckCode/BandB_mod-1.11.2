package fr.Bentur_and_Bertatruck.BandB_mod.common.item;

import fr.Bentur_and_Bertatruck.BandB_mod.common.BandB_mod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemBeverage extends ItemBase {

	String name;
	Item itemDrop;

	public ItemBeverage(String name) {
		super(name);
		this.setMaxStackSize(32);
		this.setCreativeTab(CreativeTabs.BREWING);
		//this.setCreativeTab(BandbCreativeTabs.CreativeTabsBeverage);
		this.name = name;
	}

	public Item getBottleEmpty(){
		String str = BandB_mod.MODID + ":itemBottle" + name.substring(12);
		
		return Item.getByNameOrId(str);
	}

	// check if the player has the itemDrop in is inventory
	public int playerHasItemDrop(EntityPlayer player) {
		for (int i = 0; i < player.inventory.mainInventory.size(); i++) {
			ItemStack itemstack = player.inventory.mainInventory.get(i);
			if (itemstack != null) {
				Item item = itemstack.getItem();

				if (item == itemDrop) {
					return i;
				}
			}
		}
		return -1;
	}
	
	/**
     * Called when the equipped item is right clicked.
     */
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn){
        playerIn.setActiveHand(handIn);
        return new ActionResult(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}
