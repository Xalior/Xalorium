package com.xalior.minecraft.xalorium;

import com.xalior.minecraft.xalorium.blocks.xalorium_ore.StartupCommon;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class WorldGen implements IWorldGenerator {
        final int SETTING_XALORIUM_ORE_FREQUENCY = 16;

        @Override
        public void generate(Random random, int chunkX, int chunkZ, World world,
                             IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
                switch (world.provider.getDimension()) {
                case -1:
                        generateNether();
                        break;
                case 0:
//                        BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
//
//                        if(b.biomeName.contains("Hill") ||
//                           b.biomeName.contains("Mountain")) {
//                            // Begin hilly generation!
                            generateSurface(world, random, chunkX * 16, chunkZ * 16);
//                        }
                        break;
                case 1:
                        generateEnd();
                        break;
                }
        }
 
        public void generateSurface(World world, Random rand, int chunkX, int chunkZ) {

		        for (int i = 0; i < SETTING_XALORIUM_ORE_FREQUENCY; i++) {
                        int randPosX = chunkX + rand.nextInt(16);
                        int randPosY = 64+rand.nextInt(64); 
                        int randPosZ = chunkZ + rand.nextInt(16);
                        (new WorldGenMinable(StartupCommon.blockXaloriumOre.getDefaultState(), 3+rand.nextInt(13)))
                                .generate(world, rand, new BlockPos(randPosX, randPosY, randPosZ));
                }
        }
 
        public void generateNether() {
        }
 
        public void generateEnd() {
        }
}