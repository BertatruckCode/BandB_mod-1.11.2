package fr.Bentur_and_Bertatruck.BandB_mod.common.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemBeverageAlcohol extends ItemBeverage {
	
	Item itemDrop;

	public ItemBeverageAlcohol(String name) {
		super(name);
		itemDrop = this.getBottleEmpty();
	}

	public ItemStack onItemUseFinish(ItemStack stack, World world, EntityLivingBase entityLiving) {
		System.out.println("pus soif");
		System.out.println(itemDrop.getUnlocalizedName());
		
        EntityPlayer entityplayer = entityLiving instanceof EntityPlayer ? (EntityPlayer)entityLiving : null;

        if (entityplayer == null || !entityplayer.capabilities.isCreativeMode){
            stack.shrink(1);
        }

		if (!world.isRemote) {
			entityLiving.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, 100, 1));
			entityLiving.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, 200, 1));
			entityLiving.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 500, 2));

		}
		if (entityplayer == null || !entityplayer.capabilities.isCreativeMode){
            if (stack.isEmpty())
            {
                return new ItemStack(itemDrop);
            }

            if (entityplayer != null)
            {
                entityplayer.inventory.addItemStackToInventory(new ItemStack(itemDrop));
            }
        }
		
		return stack;
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
