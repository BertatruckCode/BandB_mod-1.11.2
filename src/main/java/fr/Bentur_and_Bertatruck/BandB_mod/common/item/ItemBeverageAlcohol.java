package fr.Bentur_and_Bertatruck.BandB_mod.common.item;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemBeverageAlcohol extends ItemBeverage {
	
	Item itemDrop;

	public ItemBeverageAlcohol(String name) {
		super(name);
		itemDrop = this.getBottleEmpty();
	}

	public ItemStack onItemUseFinish(ItemStack item, World world, EntityPlayer player) {
		if (!player.capabilities.isCreativeMode) {
			item.shrink(1);
		}

		if (!world.isRemote) {
			player.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, 100, 1));
			player.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, 200, 1));
			player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 500, 2));

		}
		if (!(this.playerHasItemDrop(player)>-1) && player.inventory.getFirstEmptyStack() == -1) {
			EntityItem entityItem = new EntityItem(world, player.posX, player.posY + 1, player.posZ, new ItemStack(itemDrop, 1));
			if (!world.isRemote)
				world.spawnEntity(entityItem);
		} else
			player.inventory.addItemStackToInventory(new ItemStack(itemDrop));
		
		return item;
	}

	public int getMaxItemUseDuration(ItemStack item) {
		return 32;
	}

	/**
	 * returns the action that specifies what animation to play when the items
	 * is being used
	 */
	public EnumAction getItemUseAction(ItemStack item) {
		return EnumAction.DRINK;
	}

}
