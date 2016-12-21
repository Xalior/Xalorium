package com.xalior.minecraft.xalorium.items.xalorium_dust;

import com.xalior.minecraft.xalorium.Xalorium;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

/**
 * Created by darran on 20/12/2016.
 */
public class ItemXaloriumDust extends Item implements IFuelHandler{

    public ItemXaloriumDust() {
        setCreativeTab(Xalorium.tabXalorium);
    }

    public int getBurnTime(ItemStack fuel) {
        final int BURN_TIME_SECONDS = 120;
        if (fuel != null && fuel.getItem() == StartupCommon.itemXaloriumDust) {
            return BURN_TIME_SECONDS * 20;
        } else {
            return 0;
        }
    }
}
