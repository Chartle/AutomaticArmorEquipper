package com.chartle.automaticarmorequipper.creativetab;

import com.chartle.automaticarmorequipper.init.ModBlocks;
import com.chartle.automaticarmorequipper.init.ModItems;
import com.chartle.automaticarmorequipper.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Hilko on 21/08/2014.
 */
public class CreativeTabAAE
{
    public static final CreativeTabs AAE_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.armorCard;
        }
    };
}
