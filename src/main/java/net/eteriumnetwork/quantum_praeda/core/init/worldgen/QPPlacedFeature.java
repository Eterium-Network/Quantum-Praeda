package net.eteriumnetwork.quantum_praeda.core.init.worldgen;

import net.eteriumnetwork.quantum_praeda.QuantumPraeda;
import net.eteriumnetwork.quantum_praeda.core.init.RegistryBlock;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.awt.event.HierarchyBoundsAdapter;
import java.util.List;

public class QPPlacedFeature {
    public static final ResourceKey<PlacedFeature> OVERWORLD_QUANTUMITE_ORE_PLACED_KEY =
            registerKey(RegistryBlock.QUANTUMITE_ORE.getId().getPath()+"_placed");
    public static final ResourceKey<PlacedFeature> NETHER_QUANTUMITE_ORE_PLACED_KEY =
            registerKey(RegistryBlock.NETHER_QUANTUMITE_ORE.getId().getPath()+"_placed");
    public static final ResourceKey<PlacedFeature> END_QUANTUMITE_ORE_PLACED_KEY =
            registerKey(RegistryBlock.END_QUANTUMITE_ORE.getId().getPath()+"_placed");

    public static final ResourceKey<PlacedFeature> END_NEUTRINIO_ORE_PLACED_KEY =
            registerKey(RegistryBlock.END_NEUTRINIO_ORE.getId().getPath()+"_placed");

    public static final ResourceKey<PlacedFeature> END_GRAVITONITA_ORE_PLACED_KEY =
            registerKey(RegistryBlock.END_GRAVITONITA_ORE.getId().getPath()+"_placed");

    public static final ResourceKey<PlacedFeature> OVERWORLD_PHOTONITA_ORE_PLACED_KEY =
            registerKey(RegistryBlock.PHOTONITA_ORE.getId().getPath()+"_placed");

    public static final ResourceKey<PlacedFeature> NETHER_ENTANGLION_ORE_PLACED_KEY =
            registerKey(RegistryBlock.NETHER_ENTANGLION_ORE.getId().getPath()+"_placed");
    public static final ResourceKey<PlacedFeature> END_ENTANGLION_ORE_PLACED_KEY =
            registerKey(RegistryBlock.END_ENTANGLION_ORE.getId().getPath()+"_placed");

    public static final ResourceKey<PlacedFeature> DEEPSLATE_SUPERCONDUTITA_ORE_PLACED_KEY =
            registerKey(RegistryBlock.DEEPSLATE_SUPERCONDUTITA_ORE.getId().getPath());
    public static final ResourceKey<PlacedFeature> NETHER_SUPERCONDUTITA_ORE_PLACED_KEY =
            registerKey(RegistryBlock.NETHER_SUPERCONDUTITA_ORE.getId().getPath()+"_placed");

    public static final ResourceKey<PlacedFeature> DEEPSLATE_SPINORITA_ORE_PLACED_KEY =
        registerKey(RegistryBlock.DEEPSLATE_SPINORITA_ORE.getId().getPath()+"_placed");
    public static final ResourceKey<PlacedFeature> NETHER_SPINORITA_ORE_PLACED_KEY =
            registerKey(RegistryBlock.NETHER_SPINORITA_ORE.getId().getPath()+"_placed");
    public static final ResourceKey<PlacedFeature> END_SPINORITA_ORE_PLACED_KEY =
            registerKey(RegistryBlock.END_SPINORITA_ORE.getId().getPath()+"_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatureHolder = context.lookup(Registries.CONFIGURED_FEATURE);
        register(
                context,
                OVERWORLD_QUANTUMITE_ORE_PLACED_KEY,
                configuredFeatureHolder.getOrThrow(QPConfiguredFeature.OVERWORLD_QUANTUMITE_ORE_KEY),
                QPOrePlacement.commonOrePlacement(
                        4,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(-64),
                                VerticalAnchor.absolute(80)
                        )
                )
        );
        register(
                context,
                NETHER_QUANTUMITE_ORE_PLACED_KEY,
                configuredFeatureHolder.getOrThrow(QPConfiguredFeature.NETHER_QUANTUMITE_ORE_KEY),
                QPOrePlacement.commonOrePlacement(
                        4,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(-64),
                                VerticalAnchor.absolute(80)
                        )
                )
        );
        register(
                context,
                END_QUANTUMITE_ORE_PLACED_KEY,
                configuredFeatureHolder.getOrThrow(QPConfiguredFeature.END_QUANTUMITE_ORE_KEY),
                QPOrePlacement.commonOrePlacement(
                        4,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(-64),
                                VerticalAnchor.absolute(80)
                        )
                )
        );
        register(
                context,
                END_NEUTRINIO_ORE_PLACED_KEY,
                configuredFeatureHolder.getOrThrow(QPConfiguredFeature.END_NEUTRINIO_ORE_KEY),
                QPOrePlacement.rareOrePlacement(
                        2,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(-64),
                                VerticalAnchor.absolute(80)
                        )
                )
        );
        register(
                context,
                END_GRAVITONITA_ORE_PLACED_KEY,
                configuredFeatureHolder.getOrThrow(QPConfiguredFeature.END_GRAVITONITA_ORE_KEY),
                QPOrePlacement.commonOrePlacement(
                        12,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(-64),
                                VerticalAnchor.absolute(80)
                        )
                )
        );
        register(
                context,
                OVERWORLD_PHOTONITA_ORE_PLACED_KEY,
                configuredFeatureHolder.getOrThrow(QPConfiguredFeature.OVERWORLD_PHOTONITA_ORE_KEY),
                QPOrePlacement.rareOrePlacement(
                        8,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(-64),
                                VerticalAnchor.absolute(80)
                        )
                )
        );
        register(
                context,
                NETHER_ENTANGLION_ORE_PLACED_KEY,
                configuredFeatureHolder.getOrThrow(QPConfiguredFeature.NETHER_ENTANGLION_ORE_KEY),
                QPOrePlacement.rareOrePlacement(
                        8,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(-64),
                                VerticalAnchor.absolute(80)
                        )
                )
        );
        register(
                context,
                END_ENTANGLION_ORE_PLACED_KEY,
                configuredFeatureHolder.getOrThrow(QPConfiguredFeature.END_ENTANGLION_ORE_KEY),
                QPOrePlacement.rareOrePlacement(
                        8,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(-64),
                                VerticalAnchor.absolute(80)
                        )
                )
        );
        register(
                context,
                DEEPSLATE_SUPERCONDUTITA_ORE_PLACED_KEY,
                configuredFeatureHolder.getOrThrow(QPConfiguredFeature.DEEPSLATE_SUPERCONDUTITA_ORE_KEY),
                QPOrePlacement.rareOrePlacement(
                        8,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(-64),
                                VerticalAnchor.absolute(80)
                        )
                )
        );
        register(
                context,
                NETHER_SUPERCONDUTITA_ORE_PLACED_KEY,
                configuredFeatureHolder.getOrThrow(QPConfiguredFeature.NETHER_SUPERCONDUTITA_ORE_KEY),
                QPOrePlacement.rareOrePlacement(
                        8,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(-64),
                                VerticalAnchor.absolute(80)
                        )
                )
        );

        register(
            context,
            DEEPSLATE_SPINORITA_ORE_PLACED_KEY,
            configuredFeatureHolder.getOrThrow(QPConfiguredFeature.DEEPSLATE_SPINORITA_ORE_KEY),
            QPOrePlacement.commonOrePlacement(
                8,
                HeightRangePlacement.uniform(
                    VerticalAnchor.absolute(-64),
                    VerticalAnchor.absolute(80)
                )
            )
        );
        register(
                context,
                NETHER_SPINORITA_ORE_PLACED_KEY,
                configuredFeatureHolder.getOrThrow(QPConfiguredFeature.NETHER_SPINORITA_ORE_KEY),
                QPOrePlacement.rareOrePlacement(
                        8,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(-64),
                                VerticalAnchor.absolute(80)
                        )
                )
        );
        register(
                context,
                END_SPINORITA_ORE_PLACED_KEY,
                configuredFeatureHolder.getOrThrow(QPConfiguredFeature.END_SPINORITA_ORE_KEY),
                QPOrePlacement.rareOrePlacement(
                        8,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(-64),
                                VerticalAnchor.absolute(80)
                        )
                )
        );
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(QuantumPraeda.MODID, name));
    }

    private static void register(
            BootstapContext<PlacedFeature> context,
            ResourceKey<PlacedFeature> key,
            Holder<ConfiguredFeature<?, ?>> configuredFeatureHolder,
            List<PlacementModifier> modifierList
    ) {
        context.register(key, new PlacedFeature(configuredFeatureHolder, List.copyOf(modifierList)));
    }
}
