package net.eteriumnetwork.quantum_praeda.core.init;

import net.eteriumnetwork.quantum_praeda.QuantumPraeda;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

public class RegistryItem {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
        ForgeRegistries.ITEMS,
        QuantumPraeda.MODID
    );

    private static RegistryObject<Item> registryItem(@NotNull String name, @NotNull Item.Properties item) {
        return ITEMS.register(name, () -> new Item(item));
    }

    public static RegistryObject<Item> QUANTUMITE_RAW = registryItem(
        "quantumite_raw",
        new Item.Properties()
    );
    public static RegistryObject<Item> NEUTRINIO_RAW = registryItem(
        "neutrinio_raw",
        new Item.Properties()
    );
    public static RegistryObject<Item> GRAVITONITA_RAW = registryItem(
        "gravitonita_raw",
        new Item.Properties()
    );
    public static RegistryObject<Item> PHOTONITA_RAW = registryItem(
        "photonita_raw",
        new Item.Properties()
    );
    public static RegistryObject<Item> SPINORITA_RAW = registryItem(
        "spinorita_raw",
        new Item.Properties()
    );
    public static RegistryObject<Item> SPINORITA_INGOT = registryItem(
            "spinorita_ingot",
            new Item.Properties()
    );
    public static RegistryObject<Item> ENTANGLION_CRYSTAL = registryItem(
        "entanglion_crystal",
        new Item.Properties()
    );
    public static RegistryObject<Item> SUPERCONDUTITA_RAW = registryItem(
        "supercondutita_raw",
        new Item.Properties()
    );

    public static void init(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }

    public static void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(QUANTUMITE_RAW);
            event.accept(NEUTRINIO_RAW);
            event.accept(GRAVITONITA_RAW);
            event.accept(PHOTONITA_RAW);
            event.accept(SPINORITA_RAW);
            event.accept(SPINORITA_INGOT);
            event.accept(ENTANGLION_CRYSTAL);
            event.accept(SUPERCONDUTITA_RAW);
        }
    }
}
