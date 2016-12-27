package com.xalior.minecraft.xalorium.blocks.xalorium_lamp;

/**
 * Created by darran on 21/12/2016.
 */

import com.xalior.minecraft.xalorium.Xalorium;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupCommon
{
    public static BlockXaloriumLamp blockXaloriumLamp;  // this holds the unique instance of your block
    public static ItemBlock itemBlockXaloriumLamp;  // this holds the unique instance of the ItemBlock corresponding to your block

    public static void preInitCommon()
    {
        blockXaloriumLamp = (BlockXaloriumLamp)(new BlockXaloriumLamp().setUnlocalizedName("Xalorium Lamp"));
        blockXaloriumLamp.setRegistryName("block_xalorium_lamp");

        final int WOOD_HARVEST_LEVEL = 1;
        final float STONE_HARDNESS = 10F;
        blockXaloriumLamp.setHardness(STONE_HARDNESS);
        blockXaloriumLamp.setHarvestLevel("pickaxe", WOOD_HARVEST_LEVEL); // can also set in the constructor if desired

        GameRegistry.register(blockXaloriumLamp);

        // We also need to create and register an ItemBlock for this block otherwise it won't appear in the inventory
        itemBlockXaloriumLamp = new ItemBlock(blockXaloriumLamp);
        itemBlockXaloriumLamp.setRegistryName(blockXaloriumLamp.getRegistryName());
        GameRegistry.register(itemBlockXaloriumLamp);

        GameRegistry.registerTileEntity(TileEntityXaloriumLamp.class, Xalorium.MODID + "_xalorium_lamp");

    }

    public static void initCommon()
    {
    }

    public static void postInitCommon()
    {
    }

}