package com.chartle.automaticarmorequipper.init;

import com.chartle.automaticarmorequipper.item.ItemAAE;
import com.chartle.automaticarmorequipper.item.ItemArmorCard;
import com.chartle.automaticarmorequipper.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Hilko on 21/08/2014.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemAAE armorCard = new ItemArmorCard();

    public static void init()
    {
        GameRegistry.registerItem(armorCard, "armorCard");
    }
}
