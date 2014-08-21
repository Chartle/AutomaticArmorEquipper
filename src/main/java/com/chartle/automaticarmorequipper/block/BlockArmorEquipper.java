package com.chartle.automaticarmorequipper.block;

import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by Hilko on 21/08/2014.
 */
public class BlockArmorEquipper extends BlockAAE
{
    public BlockArmorEquipper()
    {
        super(Material.iron);
        this.setBlockName("armorEquipper");
        this.setBlockTextureName("armorEquipper");
    }
}
