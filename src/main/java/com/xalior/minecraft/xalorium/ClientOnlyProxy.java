package com.xalior.minecraft.xalorium;

/**
 * Created by darran on 19/12/2016.
 */

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * ClientOnlyProxy is used to set up the mod and start it running.  It contains all the code that should run on ONLY the client.
 *   For more background information see here http://greyminecraftcoder.blogspot.com/2013/11/how-forge-starts-up-your-code.html
 */
public class ClientOnlyProxy extends CommonProxy
{
    /**
     * Run before anything else. Read your config, create blocks, items, etc, and register them with the GameRegistry
     */
    @SideOnly(Side.CLIENT)
    public void preInit()
    {

        super.preInit();
        //read config first
//        mbe70_configuration.StartupClientOnly.preInitClientOnly();

        com.xalior.minecraft.xalorium.items.xalorium_dust.StartupClientOnly.preInitClientOnly();
        com.xalior.minecraft.xalorium.blocks.xalorium_ore.StartupClientOnly.preInitClientOnly();
    }

    /**
     * Do your mod setup. Build whatever data structures you care about. Register recipes,
     * send FMLInterModComms messages to other mods.
     */
    public void init()
    {

        super.init();
        //read config first
//        minecraftbyexample.mbe70_configuration.StartupClientOnly.initClientOnly();

        com.xalior.minecraft.xalorium.items.xalorium_dust.StartupClientOnly.initClientOnly();
        com.xalior.minecraft.xalorium.blocks.xalorium_ore.StartupClientOnly.initClientOnly();
    }

    /**
     * Handle interaction with other mods, complete your setup based on this.
     */
    public void postInit()
    {
        super.postInit();
        //read config first
//        minecraftbyexample.mbe70_configuration.StartupClientOnly.postInitClientOnly();

        com.xalior.minecraft.xalorium.items.xalorium_dust.StartupClientOnly.postInitClientOnly();
        com.xalior.minecraft.xalorium.blocks.xalorium_ore.StartupClientOnly.postInitClientOnly();
    }

    // helper to determine whether the given player is in creative mode
    //  not necessary for most examples

    @SideOnly(Side.CLIENT)
    @Override
    public boolean playerIsInCreativeMode(EntityPlayer player) {
        if (player instanceof EntityPlayerMP) {
            EntityPlayerMP entityPlayerMP = (EntityPlayerMP)player;
            return entityPlayerMP.interactionManager.isCreative();
        } else if (player instanceof EntityPlayerSP) {
            return Minecraft.getMinecraft().playerController.isInCreativeMode();
        }
        return false;
    }

    @Override
    public boolean isDedicatedServer() {return false;}

}
