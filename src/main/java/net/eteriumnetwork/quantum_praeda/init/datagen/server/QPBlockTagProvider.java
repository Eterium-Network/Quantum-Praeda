package net.eteriumnetwork.quantum_praeda.init.datagen.server;

import net.eteriumnetwork.quantum_praeda.init.RegistryBlock;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class QPBlockTagProvider extends BlockTagsProvider {
    public QPBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, modId, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
            .add(RegistryBlock.NETHER_NEUTRINIO_ORE.get())
            .add(RegistryBlock.NETHER_QUANTUMITE_ORE.get())
            .add(RegistryBlock.NETHER_ENTANGLION_ORE.get())
            .add(RegistryBlock.NETHER_SUPERCONDUTITA_ORE.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
            .add(RegistryBlock.NEUTRINIO_ORE.get())
            .add(RegistryBlock.PHOTONITA_ORE.get())
            .add(RegistryBlock.QUANTUMITE_ORE.get())
            .add(RegistryBlock.ENTANGLION_ORE.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
            .add(RegistryBlock.PHOTONITA_INFUSER.get())
            .add(RegistryBlock.QUANTUMITE_REFINER.get())
            .add(RegistryBlock.NEUTRINIO_EXTRACTOR.get())
            .add(RegistryBlock.SPINORITA_ASSEMBLER.get())
            .add(RegistryBlock.ENTANGLION_TRANSMITTER.get())
            .add(RegistryBlock.GRAVITONITA_COMPRESSOR.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .add(RegistryBlock.NEUTRINIO_ORE.get())
            .add(RegistryBlock.PHOTONITA_ORE.get())
            .add(RegistryBlock.QUANTUMITE_ORE.get())
            .add(RegistryBlock.ENTANGLION_ORE.get())

            .add(RegistryBlock.DEEPSLATE_NEUTRINIO_ORE.get())
            .add(RegistryBlock.DEEPSLATE_QUANTUMITE_ORE.get())
            .add(RegistryBlock.DEEPSLATE_ENTANGLION_ORE.get())
            .add(RegistryBlock.DEEPSLATE_SUPERCONDUTITA_ORE.get())

            .add(RegistryBlock.NETHER_QUANTUMITE_ORE.get())
            .add(RegistryBlock.NETHER_ENTANGLION_ORE.get())
            .add(RegistryBlock.NETHER_SUPERCONDUTITA_ORE.get())

            .add(RegistryBlock.END_QUANTUMITE_ORE.get())
            .add(RegistryBlock.END_ENTANGLION_ORE.get())
            .add(RegistryBlock.END_GRAVITONITA_ORE.get())

            .add(RegistryBlock.PHOTONITA_INFUSER.get())
            .add(RegistryBlock.QUANTUMITE_REFINER.get())
            .add(RegistryBlock.NEUTRINIO_EXTRACTOR.get())
            .add(RegistryBlock.SPINORITA_ASSEMBLER.get())
            .add(RegistryBlock.ENTANGLION_TRANSMITTER.get())
            .add(RegistryBlock.GRAVITONITA_COMPRESSOR.get());
    }
}
