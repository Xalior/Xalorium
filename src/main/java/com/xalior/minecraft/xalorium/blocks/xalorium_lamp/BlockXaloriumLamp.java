/**
 * Created by darran on 21/12/2016.
 */
package com.xalior.minecraft.xalorium.blocks.xalorium_lamp;

import com.xalior.minecraft.xalorium.Xalorium;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockXaloriumLamp extends Block implements ITileEntityProvider {

    public static final PropertyBool LIT = PropertyBool.create("lit");

    public BlockXaloriumLamp() {
        super(Material.GLASS);
        setCreativeTab(Xalorium.tabXalorium);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityXaloriumLamp();
    }

    private TileEntityXaloriumLamp getTE(IBlockAccess world, BlockPos pos) {
        return (TileEntityXaloriumLamp) world.getTileEntity(pos);
    }

    @Override
    public IBlockState getActualState(IBlockState state, IBlockAccess world, BlockPos pos) {
        return state.withProperty(LIT, getTE(world, pos).isLit());
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer (this, LIT);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return 0;
    }
}
