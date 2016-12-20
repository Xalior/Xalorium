package com.xalior.minecraft.xalorium.items.xalorium_dust;

/**
 * Created by darran on 19/12/2016.
 */

import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupCommon
{
    public static ItemXaloriumDust itemXaloriumDust;  // this holds the unique instance of your block

    public static void preInitCommon()
    {
        itemXaloriumDust = (ItemXaloriumDust)(new ItemXaloriumDust().setUnlocalizedName("Xalorium Dust"));
        itemXaloriumDust.setRegistryName("item_xalorium_dust");

        GameRegistry.register(itemXaloriumDust);
    }

    public static void initCommon()
    {
    }

    public static void postInitCommon()
    {
    }

}