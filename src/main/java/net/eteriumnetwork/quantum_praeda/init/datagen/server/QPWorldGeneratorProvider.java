package net.eteriumnetwork.quantum_praeda.init.datagen.server;

import net.eteriumnetwork.quantum_praeda.QuantumPraeda;
import net.eteriumnetwork.quantum_praeda.init.worldgen.QPBiomesModifiers;
import net.eteriumnetwork.quantum_praeda.init.worldgen.QPConfiguredFeature;
import net.eteriumnetwork.quantum_praeda.init.worldgen.QPPlacedFeature;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class QPWorldGeneratorProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, QPConfiguredFeature::bootstrap)
            .add(Registries.PLACED_FEATURE, QPPlacedFeature::bootstrap)
            .add(ForgeRegistries.Keys.BIOME_MODIFIERS, QPBiomesModifiers::bootstrap);

    public QPWorldGeneratorProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(QuantumPraeda.MODID));
    }
}
