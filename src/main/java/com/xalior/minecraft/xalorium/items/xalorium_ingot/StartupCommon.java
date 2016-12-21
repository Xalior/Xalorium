package com.xalior.minecraft.xalorium.items.xalorium_ingot;

/**
 * Created by darran on 19/12/2016.
 */

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupCommon
{
    public static ItemXaloriumIngot itemXaloriumIngot;  // this holds the unique instance of your block

    public static void preInitCommon()
    {
        itemXaloriumIngot = (ItemXaloriumIngot)(new ItemXaloriumIngot().setUnlocalizedName("Xalorium Ingot"));
        itemXaloriumIngot.setRegistryName("item_xalorium_ingot");

        GameRegistry.register(itemXaloriumIngot);
        // Create the ability to smelt dust into ingots...
        GameRegistry.addSmelting(com.xalior.minecraft.xalorium.items.xalorium_dust.StartupCommon.itemXaloriumDust, new ItemStack(itemXaloriumIngot, 1), 5.0F);
    }

    public static void initCommon()
    {
    }

    public static void postInitCommon()
    {
    }

}