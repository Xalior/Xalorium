package com.xalior.minecraft.xalorium.blocks.xalorium_ore;

/**
 * Created by darran on 19/12/2016.
 */

import net.minecraft.item.ItemBlock;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupCommon
{
    public static BlockXaloriumOre blockXaloriumOre;  // this holds the unique instance of your block
    public static ItemBlock itemBlockXaloriumOre;  // this holds the unique instance of the ItemBlock corresponding to your block

    public static void preInitCommon()
    {
        // each instance of your block should have two names:
        // 1) a registry name that is used to uniquely identify this block.  Should be unique within your mod.  use lower case.
        // 2) an 'unlocalised name' that is used to retrieve the text name of your block in the player's language.  For example-
        //    the unlocalised name might be "water", which is printed on the user's screen as "Wasser" in German or
        //    "aqua" in Italian.
        //
        //    Multiple blocks can have the same unlocalised name - for example
        //  +----RegistryName----+---UnlocalisedName----+
        //  |  flowing_water     +       water          |
        //  |  stationary_water  +       water          |
        //  +--------------------+----------------------+
        //
        blockXaloriumOre = (BlockXaloriumOre)(new BlockXaloriumOre().setUnlocalizedName("Xalorium Ore"));
        blockXaloriumOre.setRegistryName("block_xalorium_ore");

        final int IRON_HARVEST_LEVEL = 2;
        final float STONE_HARDNESS = 10F;
        blockXaloriumOre.setHardness(STONE_HARDNESS);
        blockXaloriumOre.setHarvestLevel("pickaxe", IRON_HARVEST_LEVEL); // can also set in the constructor if desired

        GameRegistry.register(blockXaloriumOre);

        // We also need to create and register an ItemBlock for this block otherwise it won't appear in the inventory
        itemBlockXaloriumOre = new ItemBlock(blockXaloriumOre);
        itemBlockXaloriumOre.setRegistryName(blockXaloriumOre.getRegistryName());
        GameRegistry.register(itemBlockXaloriumOre);
    }

    public static void initCommon()
    {
    }

    public static void postInitCommon()
    {
    }

}