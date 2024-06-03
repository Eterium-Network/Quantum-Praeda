package net.eteriumnetwork.quantum_praeda.init.worldgen;

import net.eteriumnetwork.quantum_praeda.QuantumPraeda;
import net.eteriumnetwork.quantum_praeda.init.RegistryBlock;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class QPBiomesModifiers {

    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_QUANTUMITE_ORE_KEY =
            registerKey("add_"+RegistryBlock.QUANTUMITE_ORE.getId().getPath());
    public static final ResourceKey<BiomeModifier> ADD_NETHER_QUANTUMITE_ORE_KEY =
            registerKey("add_"+RegistryBlock.NETHER_QUANTUMITE_ORE.getId().getPath());
    public static final ResourceKey<BiomeModifier> ADD_END_QUANTUMITE_ORE_KEY =
            registerKey("add_"+RegistryBlock.END_QUANTUMITE_ORE.getId().getPath());

    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_NEUTRINIO_ORE_KEY =
            registerKey("add_"+RegistryBlock.NEUTRINIO_ORE.getId().getPath());
    public static final ResourceKey<BiomeModifier> ADD_NETHER_NEUTRINIO_ORE_KEY =
            registerKey("add_"+RegistryBlock.NETHER_NEUTRINIO_ORE.getId().getPath());
    public static final ResourceKey<BiomeModifier> ADD_END_NEUTRINIO_ORE_KEY =
            registerKey("add_"+RegistryBlock.END_NEUTRINIO_ORE.getId().getPath());

    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_GRAVITONITA_ORE_KEY =
            registerKey("add_"+RegistryBlock.GRAVITONITA_ORE.getId().getPath());
    public static final ResourceKey<BiomeModifier> ADD_NETHER_GRAVITONITA_ORE_KEY =
            registerKey("add_"+RegistryBlock.NETHER_GRAVITONITA_ORE.getId().getPath());
    public static final ResourceKey<BiomeModifier> ADD_END_GRAVITONITA_ORE_KEY =
            registerKey("add_"+RegistryBlock.END_GRAVITONITA_ORE.getId().getPath());

    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_PHOTONITA_ORE_KEY =
            registerKey("add_"+RegistryBlock.PHOTONITA_ORE.getId().getPath());

    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_ENTANGLION_ORE_KEY =
            registerKey("add_"+RegistryBlock.ENTANGLION_ORE.getId().getPath());
    public static final ResourceKey<BiomeModifier> ADD_NETHER_ENTANGLION_ORE_KEY =
            registerKey("add_"+RegistryBlock.NETHER_ENTANGLION_ORE.getId().getPath());
    public static final ResourceKey<BiomeModifier> ADD_END_ENTANGLION_ORE_KEY =
            registerKey("add_"+RegistryBlock.END_ENTANGLION_ORE.getId().getPath());

    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_SUPERCONDUTITA_ORE_KEY =
            registerKey("add_"+RegistryBlock.SUPERCONDUTITA_ORE.getId().getPath());
    public static final ResourceKey<BiomeModifier> ADD_NETHER_SUPERCONDUTITA_ORE_KEY =
            registerKey("add_"+RegistryBlock.NETHER_SUPERCONDUTITA_ORE.getId().getPath());
    public static final ResourceKey<BiomeModifier> ADD_END_SUPERCONDUTITA_ORE_KEY =
            registerKey("add_"+RegistryBlock.END_SUPERCONDUTITA_ORE.getId().getPath());

    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_SPINORITA_ORE_KEY =
            registerKey("add_"+RegistryBlock.SPINORITA_ORE.getId().getPath());
    public static final ResourceKey<BiomeModifier> ADD_NETHER_SPINORITA_ORE_KEY =
            registerKey("add_"+RegistryBlock.NETHER_SPINORITA_ORE.getId().getPath());
    public static final ResourceKey<BiomeModifier> ADD_END_SPINORITA_ORE_KEY =
            registerKey("add_"+RegistryBlock.END_SPINORITA_ORE.getId().getPath());


    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(
                ADD_OVERWORLD_QUANTUMITE_ORE_KEY,
                new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                        biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                        HolderSet.direct(placedFeatures.getOrThrow(QPPlacedFeature.OVERWORLD_QUANTUMITE_ORE_PLACED_KEY)),
                        GenerationStep.Decoration.UNDERGROUND_ORES
                )
        );
        context.register(
                ADD_NETHER_QUANTUMITE_ORE_KEY,
                new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                        biomes.getOrThrow(BiomeTags.IS_NETHER),
                        HolderSet.direct(placedFeatures.getOrThrow(QPPlacedFeature.NETHER_QUANTUMITE_ORE_PLACED_KEY)),
                        GenerationStep.Decoration.UNDERGROUND_ORES
                )
        );
        context.register(
                ADD_END_QUANTUMITE_ORE_KEY,
                new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                        biomes.getOrThrow(BiomeTags.IS_END),
                        HolderSet.direct(placedFeatures.getOrThrow(QPPlacedFeature.END_QUANTUMITE_ORE_PLACED_KEY)),
                        GenerationStep.Decoration.UNDERGROUND_ORES
                )
        );
        context.register(
                ADD_OVERWORLD_NEUTRINIO_ORE_KEY,
                new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                        biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                        HolderSet.direct(placedFeatures.getOrThrow(QPPlacedFeature.OVERWORLD_NEUTRINIO_ORE_PLACED_KEY)),
                        GenerationStep.Decoration.UNDERGROUND_ORES
                )
        );
        context.register(
                ADD_NETHER_NEUTRINIO_ORE_KEY,
                new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                        biomes.getOrThrow(BiomeTags.IS_NETHER),
                        HolderSet.direct(placedFeatures.getOrThrow(QPPlacedFeature.NETHER_NEUTRINIO_ORE_PLACED_KEY)),
                        GenerationStep.Decoration.UNDERGROUND_ORES
                )
        );
        context.register(
                ADD_END_NEUTRINIO_ORE_KEY,
                new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                        biomes.getOrThrow(BiomeTags.IS_END),
                        HolderSet.direct(placedFeatures.getOrThrow(QPPlacedFeature.END_NEUTRINIO_ORE_PLACED_KEY)),
                        GenerationStep.Decoration.UNDERGROUND_ORES
                )
        );
        context.register(
                ADD_OVERWORLD_GRAVITONITA_ORE_KEY,
                new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                        biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                        HolderSet.direct(placedFeatures.getOrThrow(QPPlacedFeature.OVERWORLD_GRAVITONITA_ORE_PLACED_KEY)),
                        GenerationStep.Decoration.UNDERGROUND_ORES
                )
        );
        context.register(
                ADD_NETHER_GRAVITONITA_ORE_KEY,
                new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                        biomes.getOrThrow(BiomeTags.IS_NETHER),
                        HolderSet.direct(placedFeatures.getOrThrow(QPPlacedFeature.NETHER_GRAVITONITA_ORE_PLACED_KEY)),
                        GenerationStep.Decoration.UNDERGROUND_ORES
                )
        );
        context.register(
                ADD_END_GRAVITONITA_ORE_KEY,
                new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                        biomes.getOrThrow(BiomeTags.IS_END),
                        HolderSet.direct(placedFeatures.getOrThrow(QPPlacedFeature.END_GRAVITONITA_ORE_PLACED_KEY)),
                        GenerationStep.Decoration.UNDERGROUND_ORES
                )
        );
        context.register(
                ADD_OVERWORLD_PHOTONITA_ORE_KEY,
                new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                        biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                        HolderSet.direct(placedFeatures.getOrThrow(QPPlacedFeature.OVERWORLD_PHOTONITA_ORE_PLACED_KEY)),
                        GenerationStep.Decoration.UNDERGROUND_ORES
                )
        );
        context.register(
                ADD_OVERWORLD_ENTANGLION_ORE_KEY,
                new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                        biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                        HolderSet.direct(placedFeatures.getOrThrow(QPPlacedFeature.OVERWORLD_ENTANGLION_ORE_PLACED_KEY)),
                        GenerationStep.Decoration.UNDERGROUND_ORES
                )
        );
        context.register(
                ADD_NETHER_ENTANGLION_ORE_KEY,
                new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                        biomes.getOrThrow(BiomeTags.IS_NETHER),
                        HolderSet.direct(placedFeatures.getOrThrow(QPPlacedFeature.NETHER_ENTANGLION_ORE_PLACED_KEY)),
                        GenerationStep.Decoration.UNDERGROUND_ORES
                )
        );
        context.register(
                ADD_END_ENTANGLION_ORE_KEY,
                new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                        biomes.getOrThrow(BiomeTags.IS_END),
                        HolderSet.direct(placedFeatures.getOrThrow(QPPlacedFeature.END_ENTANGLION_ORE_PLACED_KEY)),
                        GenerationStep.Decoration.UNDERGROUND_ORES
                )
        );
        context.register(
                ADD_OVERWORLD_SUPERCONDUTITA_ORE_KEY,
                new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                        biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                        HolderSet.direct(placedFeatures.getOrThrow(QPPlacedFeature.OVERWORLD_SUPERCONDUTITA_ORE_PLACED_KEY)),
                        GenerationStep.Decoration.UNDERGROUND_ORES
                )
        );
        context.register(
                ADD_NETHER_SUPERCONDUTITA_ORE_KEY,
                new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                        biomes.getOrThrow(BiomeTags.IS_NETHER),
                        HolderSet.direct(placedFeatures.getOrThrow(QPPlacedFeature.NETHER_SUPERCONDUTITA_ORE_PLACED_KEY)),
                        GenerationStep.Decoration.UNDERGROUND_ORES
                )
        );
        context.register(
                ADD_END_SUPERCONDUTITA_ORE_KEY,
                new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                        biomes.getOrThrow(BiomeTags.IS_END),
                        HolderSet.direct(placedFeatures.getOrThrow(QPPlacedFeature.END_SUPERCONDUTITA_ORE_PLACED_KEY)),
                        GenerationStep.Decoration.UNDERGROUND_ORES
                )
        );
        context.register(
                ADD_OVERWORLD_SPINORITA_ORE_KEY,
                new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                        biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                        HolderSet.direct(placedFeatures.getOrThrow(QPPlacedFeature.OVERWORLD_SPINORITA_ORE_PLACED_KEY)),
                        GenerationStep.Decoration.UNDERGROUND_ORES
                )
        );
        context.register(
                ADD_NETHER_SPINORITA_ORE_KEY,
                new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                        biomes.getOrThrow(BiomeTags.IS_NETHER),
                        HolderSet.direct(placedFeatures.getOrThrow(QPPlacedFeature.NETHER_SPINORITA_ORE_PLACED_KEY)),
                        GenerationStep.Decoration.UNDERGROUND_ORES
                )
        );
        context.register(
                ADD_END_SPINORITA_ORE_KEY,
                new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                        biomes.getOrThrow(BiomeTags.IS_END),
                        HolderSet.direct(placedFeatures.getOrThrow(QPPlacedFeature.END_SPINORITA_ORE_PLACED_KEY)),
                        GenerationStep.Decoration.UNDERGROUND_ORES
                )
        );
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(
                ForgeRegistries.Keys.BIOME_MODIFIERS,
                new ResourceLocation(QuantumPraeda.MODID, name)
        );
    }
}