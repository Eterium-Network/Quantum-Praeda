package net.eteriumnetwork.quantum_praeda.init;

import net.eteriumnetwork.quantum_praeda.QuantumPraeda;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class QPCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, QuantumPraeda.MODID);

    public static final RegistryObject<CreativeModeTab> QUANTUM_PRAEDA_INGREDIENTS_TAB = CREATIVE_MODE_TABS.register(
            "quantum_praeda_ingredients_tab",
            () -> CreativeModeTab.builder()
                .icon(() -> new ItemStack(RegistryItem.RAW_GRAVITONITA.get()))
                .title(Component.translatable("creativeTab.quantum_praeda_ingredients_tab"))
                .displayItems((parameters, output) -> {
                    output.accept(RegistryItem.RAW_ENTANGLION.get());
                    output.accept(RegistryItem.RAW_GRAVITONITA.get());
                    output.accept(RegistryItem.RAW_NEUTRINIO.get());
                    output.accept(RegistryItem.RAW_PHOTONITA.get());
                    output.accept(RegistryItem.RAW_QUANTUMITE.get());
                    output.accept(RegistryItem.RAW_SPINORITA.get());
                    output.accept(RegistryItem.RAW_SUPERCONDUTITA.get());

                    output.accept(RegistryBlock.ENTANGLION_BLOCK.get());
                    output.accept(RegistryBlock.ENTANGLION_ORE.get());
                    output.accept(RegistryBlock.GRAVITONITA_ORE.get());
                    output.accept(RegistryBlock.NEUTRINIO_ORE.get());
                    output.accept(RegistryBlock.PHOTONITA_ORE.get());
                    output.accept(RegistryBlock.QUANTUMITE_ORE.get());
                    output.accept(RegistryBlock.SPINORITA_ORE.get());
                    output.accept(RegistryBlock.SUPERCONDUTITA_ORE.get());
                }
            ).build()
    );

    public static final RegistryObject<CreativeModeTab> QUANTUM_PRAEDA_MACHINES_TAB = CREATIVE_MODE_TABS.register(
            "quantum_praeda_machine_tab",
            () -> CreativeModeTab.builder()
                .icon(() -> new ItemStack(RegistryBlock.SPINORITA_ASSEMBLER.get()))
                .title(Component.translatable("creativeTab.quantum_praeda_machine_tab"))
                .displayItems((parameters, output) -> {
                    output.accept(RegistryBlock.ENTANGLION_TRANSMITTER.get());
                    output.accept(RegistryBlock.GRAVITONITA_COMPRESSOR.get());
                    output.accept(RegistryBlock.NEUTRINIO_EXTRACTOR.get());
                    output.accept(RegistryBlock.PHOTONITA_INFUSER.get());
                    output.accept(RegistryBlock.QUANTUMITE_REFINER.get());
                    output.accept(RegistryBlock.SPINORITA_ASSEMBLER.get());
                    output.accept(RegistryBlock.SUPERCONDUTITA_FORGE.get());
                }
            ).build()
    );

    public static void register(IEventBus modEventBus) {
        CREATIVE_MODE_TABS.register(modEventBus);

    }

}
