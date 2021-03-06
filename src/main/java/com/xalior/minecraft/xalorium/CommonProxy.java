package com.xalior.minecraft.xalorium;

/**
 * Created by darran on 19/12/2016.
 */

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * CommonProxy is used to set up the mod and start it running.  It contains all the code that should run on both the
 *   Standalone client and the dedicated server.
 *   For more background information see here http://greyminecraftcoder.blogspot.com/2013/11/how-forge-starts-up-your-code.html
 */
public abstract class CommonProxy {

    /**
     * Run before anything else. Read your config, create blocks, items, etc, and register them with the GameRegistry
     */
    public void preInit()
    {
        //read config first
//        mbe70_configuration.StartupCommon.preInitCommon();



        com.xalior.minecraft.xalorium.items.xalorium_dust.StartupCommon.preInitCommon();
        com.xalior.minecraft.xalorium.blocks.xalorium_ore.StartupCommon.preInitCommon();
        com.xalior.minecraft.xalorium.items.xalorium_ingot.StartupCommon.preInitCommon();
        com.xalior.minecraft.xalorium.blocks.xalorium_lamp.StartupCommon.preInitCommon();
        com.xalior.minecraft.xalorium.blocks.packing_crate.StartupCommon.preInitCommon();
    }

    /**
     * Do your mod setup. Build whatever data structures you care about. Register recipes,
     * send FMLInterModComms messages to other mods.
     */
    public void init()
    {
        //read config first
//        minecraftbyexample.mbe70_configuration.StartupCommon.initCommon();

        com.xalior.minecraft.xalorium.items.xalorium_dust.StartupCommon.initCommon();
        com.xalior.minecraft.xalorium.blocks.xalorium_ore.StartupCommon.initCommon();
        com.xalior.minecraft.xalorium.items.xalorium_ingot.StartupCommon.initCommon();
        com.xalior.minecraft.xalorium.blocks.xalorium_lamp.StartupCommon.initCommon();
        com.xalior.minecraft.xalorium.blocks.packing_crate.StartupCommon.initCommon();

        // and some we have enough setup to do some worldgen...


        GameRegistry.registerWorldGenerator(new WorldGen(), 0);
    }

    /**
     * Handle interaction with other mods, complete your setup based on this.
     */
    public void postInit()
    {
        //read config first
//        minecraftbyexample.mbe70_configuration.StartupCommon.postInitCommon();

        com.xalior.minecraft.xalorium.items.xalorium_dust.StartupCommon.postInitCommon();
        com.xalior.minecraft.xalorium.blocks.xalorium_ore.StartupCommon.postInitCommon();
        com.xalior.minecraft.xalorium.items.xalorium_ingot.StartupCommon.postInitCommon();
        com.xalior.minecraft.xalorium.blocks.xalorium_lamp.StartupCommon.postInitCommon();
        com.xalior.minecraft.xalorium.blocks.packing_crate.StartupCommon.postInitCommon();
    }

    // helper to determine whether the given player is in creative mode
    //  not necessary for most examples
    abstract public boolean playerIsInCreativeMode(EntityPlayer player);

    /**
     * is this a dedicated server?
     * @return true if this is a dedicated server, false otherwise
     */
    abstract public boolean isDedicatedServer();
}
