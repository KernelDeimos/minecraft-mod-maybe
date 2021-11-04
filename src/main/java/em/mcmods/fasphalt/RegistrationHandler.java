package em.mcmods.fasphalt;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = ExampleMod.MODID)
public class RegistrationHandler {
    @SubscribeEvent
    public static void registerItems(Register<Item> event) {
        final Item[] items = {
            new Item()
                .setRegistryName(ExampleMod.MODID, "first_item")
                .setCreativeTab(CreativeTabs.MISC)
        };

        event.getRegistry().registerAll(items);
    }
}
