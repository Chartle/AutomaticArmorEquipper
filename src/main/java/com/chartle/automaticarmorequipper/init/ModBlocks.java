package com.chartle.automaticarmorequipper.init;

import com.chartle.automaticarmorequipper.block.BlockAAE;
import com.chartle.automaticarmorequipper.block.BlockArmorEquipper;
import com.chartle.automaticarmorequipper.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Hilko on 21/08/2014.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockAAE armorEquipper = new BlockArmorEquipper();

    public static void init()
    {
        GameRegistry.registerBlock(armorEquipper, "armorEquipper");
    }
}
