package com.xalior.minecraft.xalorium.blocks.packing_crate;

/**
 * Created by darran on 21/12/2016.
 */

import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupCommon
{
    public static BlockPackingCrate blockPackingCrate;  // this holds the unique instance of your block
    public static ItemBlock itemBlockPackingCrate;  // this holds the unique instance of the ItemBlock corresponding to your block

    public static void preInitCommon()
    {
        blockPackingCrate = (BlockPackingCrate)(new BlockPackingCrate().setUnlocalizedName("Packing Crate"));
        blockPackingCrate.setRegistryName("block_packing_crate");

        final int IRON_HARVEST_LEVEL = 2;
        final float STONE_HARDNESS = 10F;
        blockPackingCrate.setHardness(STONE_HARDNESS);
        blockPackingCrate.setHarvestLevel("pickaxe", IRON_HARVEST_LEVEL); // can also set in the constructor if desired

        GameRegistry.register(blockPackingCrate);

        // We also need to create and register an ItemBlock for this block otherwise it won't appear in the inventory
        itemBlockPackingCrate = new ItemBlock(blockPackingCrate);
        itemBlockPackingCrate.setRegistryName(blockPackingCrate.getRegistryName());
        GameRegistry.register(itemBlockPackingCrate);
    }

    public static void initCommon()
    {
    }

    public static void postInitCommon()
    {
    }

}