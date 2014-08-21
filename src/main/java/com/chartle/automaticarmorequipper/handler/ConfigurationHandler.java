package com.chartle.automaticarmorequipper.handler;

import com.chartle.automaticarmorequipper.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Hilko on 21/08/2014.
 */
public class ConfigurationHandler
{
    public static Configuration configuration;
    public static boolean armorEquipperUsePower = true;

    public static void init(File configFile)
    {
        if(configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        armorEquipperUsePower = configuration.getBoolean("armorEquipperUsePower", Configuration.CATEGORY_GENERAL, true, "Whether or not the Armor Equipper uses power");

        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }
}
