package net.eteriumnetwork.quantum_praeda.core.init.datagen.server;

import net.eteriumnetwork.quantum_praeda.core.init.RegistryBlock;
import net.eteriumnetwork.quantum_praeda.core.init.RegistryItem;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class QPBlocksLootTable extends BlockLootSubProvider {

    protected QPBlocksLootTable() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(RegistryBlock.PHOTONITA_INFUSER.get());
        this.dropSelf(RegistryBlock.QUANTUMITE_REFINER.get());
        this.dropSelf(RegistryBlock.SPINORITA_ASSEMBLER.get());
        this.dropSelf(RegistryBlock.NEUTRINIO_EXTRACTOR.get());
        this.dropSelf(RegistryBlock.SUPERCONDUTITA_FORGE.get());
        this.dropSelf(RegistryBlock.ENTANGLION_TRANSMITTER.get());
        this.dropSelf(RegistryBlock.GRAVITONITA_COMPRESSOR.get());

        this.dropSelf(RegistryBlock.PHOTONITA_BLOCK.get());
        this.dropSelf(RegistryBlock.QUANTUMITE_BLOCK.get());
        this.dropSelf(RegistryBlock.SPINORITA_BLOCK.get());
        this.dropSelf(RegistryBlock.NEUTRINIO_BLOCK.get());
        this.dropSelf(RegistryBlock.ENTANGLION_BLOCK.get());
        this.dropSelf(RegistryBlock.GRAVITONITA_BLOCK.get());
        this.dropSelf(RegistryBlock.SUPERCONDUTITA_BLOCK.get());

        this.createQuantumOreDrops(
            RegistryBlock.QUANTUMITE_ORE.get(),
            RegistryItem.QUANTUMITE_RAW.get()
        );
        this.createQuantumOreDrops(
            RegistryBlock.DEEPSLATE_QUANTUMITE_ORE.get(),
            RegistryItem.QUANTUMITE_RAW.get()
        );
        this.createQuantumOreDrops(
            RegistryBlock.NETHER_QUANTUMITE_ORE.get(),
            RegistryItem.QUANTUMITE_RAW.get()
        );
        this.createQuantumOreDrops(
            RegistryBlock.END_QUANTUMITE_ORE.get(),
            RegistryItem.QUANTUMITE_RAW.get()
        );

        this.createQuantumOreDrops(
            RegistryBlock.NETHER_ENTANGLION_ORE.get(),
            RegistryItem.ENTANGLION_CRYSTAL.get()
        );
        this.createQuantumOreDrops(
            RegistryBlock.END_ENTANGLION_ORE.get(),
            RegistryItem.ENTANGLION_CRYSTAL.get()
        );

        this.createQuantumOreDrops(
            RegistryBlock.END_GRAVITONITA_ORE.get(),
            RegistryItem.GRAVITONITA_RAW.get()
        );

        this.createQuantumOreDrops(
            RegistryBlock.PHOTONITA_ORE.get(),
            RegistryItem.PHOTONITA_RAW.get()
        );

        this.createQuantumOreDrops(
            RegistryBlock.DEEPSLATE_SPINORITA_ORE.get(),
            RegistryItem.SPINORITA_RAW.get()
        );
        this.createQuantumOreDrops(
            RegistryBlock.NETHER_SPINORITA_ORE.get(),
            RegistryItem.SPINORITA_RAW.get()
        );
        this.createQuantumOreDrops(
            RegistryBlock.END_SPINORITA_ORE.get(),
            RegistryItem.SPINORITA_INGOT.get()
        );

        this.createQuantumOreDrops(
            RegistryBlock.NETHER_SUPERCONDUTITA_ORE.get(),
            RegistryItem.SUPERCONDUTITA_RAW.get()
        );
        this.createQuantumOreDrops(
            RegistryBlock.DEEPSLATE_SUPERCONDUTITA_ORE.get(),
            RegistryItem.SUPERCONDUTITA_RAW.get()
        );

        this.createQuantumOreDrops(
            RegistryBlock.DEEPSLATE_NEUTRINIO_ORE.get(),
            RegistryItem.NEUTRINIO_RAW.get()
        );
        this.createQuantumOreDrops(
            RegistryBlock.END_NEUTRINIO_ORE.get(),
            RegistryItem.NEUTRINIO_RAW.get()
        );
    }

    protected LootTable.Builder createQuantumOreDrops(Block block, Item item) {
        return createSilkTouchDispatchTable(
                block,
                this.applyExplosionDecay(
                    block,
                    LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(
                            UniformGenerator.between(2.0F, 5.0F))
                        ).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                )
        );
    }
    protected LootTable.Builder createQuantumDeepSlateOreDrops(Block block, Item item) {
        return createSilkTouchDispatchTable(
                block,
                this.applyExplosionDecay(
                    block,
                    LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(
                            UniformGenerator.between(5.0F, 8.0F))
                        )
                        .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                        .setQuality(2)
                )
        );
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return RegistryBlock.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
