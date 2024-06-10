package net.eteriumnetwork.quantum_praeda.core.init;

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
                .icon(() -> new ItemStack(RegistryItem.SPINORITA_RAW.get()))
                .title(Component.translatable("creativeTab.quantum_praeda_ingredients_tab"))
                .displayItems((parameters, output) -> {
                    output.accept(RegistryItem.ENTANGLION_CRYSTAL.get());
                    output.accept(RegistryItem.GRAVITONITA_RAW.get());
                    output.accept(RegistryItem.NEUTRINIO_RAW.get());
                    output.accept(RegistryItem.PHOTONITA_RAW.get());
                    output.accept(RegistryItem.QUANTUMITE_RAW.get());
                    output.accept(RegistryItem.SPINORITA_RAW.get());
                    output.accept(RegistryItem.SPINORITA_INGOT.get());
                    output.accept(RegistryItem.SUPERCONDUTITA_RAW.get());

                    output.accept(RegistryBlock.ENTANGLION_BLOCK.get());
                    output.accept(RegistryBlock.GRAVITONITA_BLOCK.get());
                    output.accept(RegistryBlock.NEUTRINIO_BLOCK.get());
                    output.accept(RegistryBlock.PHOTONITA_BLOCK.get());
                    output.accept(RegistryBlock.QUANTUMITE_BLOCK.get());
                    output.accept(RegistryBlock.SPINORITA_BLOCK.get());
                    output.accept(RegistryBlock.SUPERCONDUTITA_BLOCK.get());

                    output.accept(RegistryBlock.PHOTONITA_ORE.get());
                    output.accept(RegistryBlock.QUANTUMITE_ORE.get());

                    output.accept(RegistryBlock.DEEPSLATE_ENTANGLION_ORE.get());
                    output.accept(RegistryBlock.DEEPSLATE_NEUTRINIO_ORE.get());
                    output.accept(RegistryBlock.DEEPSLATE_QUANTUMITE_ORE.get());
                    output.accept(RegistryBlock.DEEPSLATE_SPINORITA_ORE.get());
                    output.accept(RegistryBlock.DEEPSLATE_SUPERCONDUTITA_ORE.get());

                    output.accept(RegistryBlock.NETHER_ENTANGLION_ORE.get());
                    output.accept(RegistryBlock.NETHER_QUANTUMITE_ORE.get());
                    output.accept(RegistryBlock.NETHER_SPINORITA_ORE.get());
                    output.accept(RegistryBlock.NETHER_SUPERCONDUTITA_ORE.get());

                    output.accept(RegistryBlock.END_ENTANGLION_ORE.get());
                    output.accept(RegistryBlock.END_GRAVITONITA_ORE.get());
                    output.accept(RegistryBlock.END_NEUTRINIO_ORE.get());
                    output.accept(RegistryBlock.END_QUANTUMITE_ORE.get());
                    output.accept(RegistryBlock.END_SPINORITA_ORE.get());
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
