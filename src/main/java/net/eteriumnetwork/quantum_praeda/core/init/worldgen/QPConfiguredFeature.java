package net.eteriumnetwork.quantum_praeda.core.init.worldgen;

import net.eteriumnetwork.quantum_praeda.QuantumPraeda;
import net.eteriumnetwork.quantum_praeda.core.init.RegistryBlock;
import net.eteriumnetwork.quantum_praeda.util.logger.QPLogger;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class QPConfiguredFeature {

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_QUANTUMITE_ORE_KEY =
            registerKey(RegistryBlock.QUANTUMITE_ORE.getId().getPath());
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_QUANTUMITE_ORE_KEY =
            registerKey(RegistryBlock.NETHER_QUANTUMITE_ORE.getId().getPath());
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_QUANTUMITE_ORE_KEY =
            registerKey(RegistryBlock.END_QUANTUMITE_ORE.getId().getPath());

    public static final ResourceKey<ConfiguredFeature<?, ?>> END_NEUTRINIO_ORE_KEY =
            registerKey(RegistryBlock.END_NEUTRINIO_ORE.getId().getPath());
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_NEUTRINIO_ORE_KEY =
        registerKey(RegistryBlock.DEEPSLATE_NEUTRINIO_ORE.getId().getPath());

    public static final ResourceKey<ConfiguredFeature<?, ?>> END_GRAVITONITA_ORE_KEY =
            registerKey(RegistryBlock.END_GRAVITONITA_ORE.getId().getPath());

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_PHOTONITA_ORE_KEY =
            registerKey(RegistryBlock.PHOTONITA_ORE.getId().getPath());

    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_ENTANGLION_ORE_KEY =
            registerKey(RegistryBlock.NETHER_ENTANGLION_ORE.getId().getPath());
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_ENTANGLION_ORE_KEY =
            registerKey(RegistryBlock.END_ENTANGLION_ORE.getId().getPath());
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_ENTANGLION_ORE_KEY =
        registerKey(RegistryBlock.DEEPSLATE_ENTANGLION_ORE.getId().getPath());

    public static final ResourceKey<ConfiguredFeature<?,?>> DEEPSLATE_SUPERCONDUTITA_ORE_KEY =
            registerKey(RegistryBlock.DEEPSLATE_SUPERCONDUTITA_ORE.getId().getPath());
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SUPERCONDUTITA_ORE_KEY =
            registerKey(RegistryBlock.NETHER_SUPERCONDUTITA_ORE.getId().getPath());

    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_SPINORITA_ORE_KEY =
        registerKey(RegistryBlock.DEEPSLATE_SPINORITA_ORE.getId().getPath());
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SPINORITA_ORE_KEY =
            registerKey(RegistryBlock.NETHER_SPINORITA_ORE.getId().getPath());
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_SPINORITA_ORE_KEY =
            registerKey(RegistryBlock.END_SPINORITA_ORE.getId().getPath());

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepSlateReplaceable = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherRackReplaceable = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest magmaBlockReplaceable = new BlockMatchTest(Blocks.MAGMA_BLOCK);
        RuleTest endReplaceable = new BlockMatchTest(Blocks.END_STONE);

        List<OreConfiguration.TargetBlockState> overworld_quantumite_ore = List.of(
                OreConfiguration.target(
                        stoneReplaceable,
                        RegistryBlock.QUANTUMITE_ORE.get().defaultBlockState()
                ),
                OreConfiguration.target(
                        deepSlateReplaceable,
                        RegistryBlock.DEEPSLATE_QUANTUMITE_ORE.get().defaultBlockState()
                )
        );
        List<OreConfiguration.TargetBlockState> overworld_neutrinio_ore = List.of(
                OreConfiguration.target(
                        deepSlateReplaceable,
                        RegistryBlock.DEEPSLATE_NEUTRINIO_ORE.get().defaultBlockState()
                )
        );
        List<OreConfiguration.TargetBlockState> overworld_photonita_ore = List.of(
                OreConfiguration.target(
                        stoneReplaceable,
                        RegistryBlock.PHOTONITA_ORE.get().defaultBlockState()
                )
        );
        List<OreConfiguration.TargetBlockState> overworld_spinorita_ore = List.of(
                OreConfiguration.target(
                        deepSlateReplaceable,
                        RegistryBlock.DEEPSLATE_SPINORITA_ORE.get().defaultBlockState()
                )
        );
        List<OreConfiguration.TargetBlockState> overworld_entanglion_ore = List.of(
                OreConfiguration.target(
                        deepSlateReplaceable,
                        RegistryBlock.DEEPSLATE_ENTANGLION_ORE.get().defaultBlockState()
                )
        );
        List<OreConfiguration.TargetBlockState> deepslate_supercondutita_ore = List.of(
                OreConfiguration.target(
                        magmaBlockReplaceable,
                        RegistryBlock.DEEPSLATE_SUPERCONDUTITA_ORE.get().defaultBlockState()
                )
        );
        // --------------------------------------OVERWORLD--------------------------------------------- \\
        QPLogger.info("Stating ConfigFeature Register: OVERWORLD QUANTUM ORES");
        register(
                context,
                OVERWORLD_QUANTUMITE_ORE_KEY,
                Feature.ORE, new OreConfiguration(overworld_quantumite_ore, 9)
        );
        register(
                context,
                OVERWORLD_PHOTONITA_ORE_KEY,
                Feature.ORE, new OreConfiguration(overworld_photonita_ore, 9)
        );
        QPLogger.info("Stating ConfigFeature Register: DEEPSLATE QUANTUM ORES");
        register(
                context,
                DEEPSLATE_SUPERCONDUTITA_ORE_KEY,
                Feature.ORE, new OreConfiguration(deepslate_supercondutita_ore, 9)
        );
        register(
            context,
            DEEPSLATE_SPINORITA_ORE_KEY,
            Feature.ORE, new OreConfiguration(overworld_spinorita_ore, 9)
        );
        register(
            context,
            DEEPSLATE_ENTANGLION_ORE_KEY,
            Feature.ORE, new OreConfiguration(overworld_entanglion_ore, 9)
        );
        register(
            context,
            DEEPSLATE_NEUTRINIO_ORE_KEY,
            Feature.ORE, new OreConfiguration(overworld_neutrinio_ore, 9)
        );


        // --------------------------------------NETHER--------------------------------------------- \\
        QPLogger.info("Stating ConfigFeature Register: NETHER QUANTUM ORES");
        register(
                context,
                NETHER_QUANTUMITE_ORE_KEY,
                Feature.ORE,
                new OreConfiguration(
                        netherRackReplaceable,
                        RegistryBlock.NETHER_QUANTUMITE_ORE.get().defaultBlockState(),
                        9
                )
        );
        register(
                context,
                NETHER_ENTANGLION_ORE_KEY,
                Feature.ORE,
                new OreConfiguration(
                        netherRackReplaceable,
                        RegistryBlock.NETHER_ENTANGLION_ORE.get().defaultBlockState(),
                        9
                )
        );
        register(
                context,
                NETHER_SUPERCONDUTITA_ORE_KEY,
                Feature.ORE,
                new OreConfiguration(
                        magmaBlockReplaceable,
                        RegistryBlock.NETHER_SUPERCONDUTITA_ORE.get().defaultBlockState(),
                        9
                )
        );
        register(
                context,
                NETHER_SPINORITA_ORE_KEY,
                Feature.ORE,
                new OreConfiguration(
                        netherRackReplaceable,
                        RegistryBlock.NETHER_SPINORITA_ORE.get().defaultBlockState(),
                        9
                )
        );
        // --------------------------------------END--------------------------------------------- \\
        QPLogger.info("Stating ConfigFeature Register: END QUANTUM ORES");
        register(
                context,
                END_QUANTUMITE_ORE_KEY,
                Feature.ORE,
                new OreConfiguration(
                        endReplaceable,
                        RegistryBlock.END_QUANTUMITE_ORE.get().defaultBlockState(),
                        9
                )
        );
        register(
                context,
                END_NEUTRINIO_ORE_KEY,
                Feature.ORE,
                new OreConfiguration(
                        endReplaceable,
                        RegistryBlock.END_NEUTRINIO_ORE.get().defaultBlockState(),
                        9
                )
        );
        register(
                context,
                END_GRAVITONITA_ORE_KEY,
                Feature.ORE,
                new OreConfiguration(
                        endReplaceable,
                        RegistryBlock.END_GRAVITONITA_ORE.get().defaultBlockState(),
                        9
                )
        );
        register(
                context,
                END_ENTANGLION_ORE_KEY,
                Feature.ORE,
                new OreConfiguration(
                        endReplaceable,
                        RegistryBlock.END_ENTANGLION_ORE.get().defaultBlockState(),
                        9
                )
        );
        register(
                context,
                END_SPINORITA_ORE_KEY,
                Feature.ORE,
                new OreConfiguration(
                        endReplaceable,
                        RegistryBlock.END_SPINORITA_ORE.get().defaultBlockState(),
                        9
                )
        );

    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        QPLogger.debug("RegisterKey: %s", name);
        return  ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(QuantumPraeda.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(
            BootstapContext<ConfiguredFeature<?, ?>> context,
            ResourceKey<ConfiguredFeature<?, ?>> key,
            F feature,
            FC configuration
    ) {
        QPLogger.debug(
            "\nConfiguredFeature: {\n\tnamespace: %s,\t\nlocation: %s,\t\nlanguageRef: %s\n}",
            key.location().getNamespace(), key.location(), key.location().toLanguageKey()
        );
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
