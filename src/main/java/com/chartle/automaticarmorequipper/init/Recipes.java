package com.chartle.automaticarmorequipper.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

/**
 * Created by Hilko on 21/08/2014.
 */
public class Recipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.armorEquipper),"iIi","ici","iIi",'i',"ingotIron",'I',"blockIron",'c',new ItemStack(ModItems.armorCard)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.armorCard),"hgc","ggg","lgb",'h',new ItemStack(Items.leather_helmet),'c',new ItemStack(Items.leather_chestplate),'g',"ingotGold",'l',new ItemStack(Items.leather_leggings),'b',new ItemStack(Items.leather_boots)));
    }
}
