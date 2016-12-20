package com.xalior.minecraft.xalorium.blocks.xalorium_ore;

/**
 * Created by darran on 19/12/2016.
 */

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class StartupClientOnly
{
    @SideOnly(Side.CLIENT)
    public static void preInitClientOnly()
    {
        // This step is necessary in order to make your block render properly when it is an item (i.e. in the inventory
        //   or in your hand or thrown on the ground).
        // It must be done on client only, and must be done after the block has been created in Common.preinit().
        ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation("xalorium:block_xalorium_ore", "inventory");
        final int DEFAULT_ITEM_SUBTYPE = 0;
        ModelLoader.setCustomModelResourceLocation(StartupCommon.itemBlockXaloriumOre, DEFAULT_ITEM_SUBTYPE, itemModelResourceLocation);
    }

    public static void initClientOnly()
    {
    }

    public static void postInitClientOnly()
    {
    }
}