package net.eteriumnetwork.quantum_praeda.init.datagen.server;

import net.eteriumnetwork.quantum_praeda.init.RegistryBlock;
import net.eteriumnetwork.quantum_praeda.init.RegistryItem;
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
        this.dropSelf(RegistryBlock.ENTANGLION_TRANSMITTER.get());
        this.dropSelf(RegistryBlock.ENTANGLION_BLOCK.get());
        this.add(
            RegistryBlock.ENTANGLION_ORE.get(),
            block -> createQuantumOreDrops(
                RegistryBlock.ENTANGLION_ORE.get(),
                RegistryItem.RAW_ENTANGLION.get()
            )
        );

        this.dropSelf(RegistryBlock.GRAVITONITA_COMPRESSOR.get());
        this.dropSelf(RegistryBlock.GRAVITONITA_BLOCK.get());
        this.add(
                RegistryBlock.GRAVITONITA_ORE.get(),
                block -> createQuantumOreDrops(
                        RegistryBlock.GRAVITONITA_ORE.get(),
                        RegistryItem.RAW_GRAVITONITA.get()
                )
        );

        this.dropSelf(RegistryBlock.PHOTONITA_INFUSER.get());
        this.dropSelf(RegistryBlock.PHOTONITA_BLOCK.get());
        this.add(
                RegistryBlock.PHOTONITA_ORE.get(),
                block -> createQuantumOreDrops(
                        RegistryBlock.PHOTONITA_ORE.get(),
                        RegistryItem.RAW_PHOTONITA.get()
                )
        );

        this.dropSelf(RegistryBlock.SPINORITA_ASSEMBLER.get());
        this.dropSelf(RegistryBlock.SPINORITA_BLOCK.get());
        this.add(
                RegistryBlock.SPINORITA_ORE.get(),
                block -> createQuantumOreDrops(
                        RegistryBlock.SPINORITA_ORE.get(),
                        RegistryItem.RAW_SPINORITA.get()
                )
        );

        this.dropSelf(RegistryBlock.NEUTRINIO_EXTRACTOR.get());
        this.dropSelf(RegistryBlock.NEUTRINIO_BLOCK.get());
        this.add(
                RegistryBlock.NEUTRINIO_ORE.get(),
                block -> createQuantumOreDrops(
                        RegistryBlock.NEUTRINIO_ORE.get(),
                        RegistryItem.RAW_NEUTRINIO.get()
                )
        );

        this.dropSelf(RegistryBlock.SUPERCONDUTITA_FORGE.get());
        this.dropSelf(RegistryBlock.SUPERCONDUTITA_BLOCK.get());
        this.add(
                RegistryBlock.SUPERCONDUTITA_ORE.get(),
                block -> createQuantumOreDrops(
                        RegistryBlock.SUPERCONDUTITA_ORE.get(),
                        RegistryItem.RAW_SUPERCONDUTITA.get()
                )
        );

        this.dropSelf(RegistryBlock.QUANTUMITE_REFINER.get());
        this.dropSelf(RegistryBlock.QUANTUMITE_BLOCK.get());
        this.add(
                RegistryBlock.QUANTUMITE_ORE.get(),
                block -> createQuantumOreDrops(
                        RegistryBlock.QUANTUMITE_ORE.get(),
                        RegistryItem.RAW_QUANTUMITE.get()
                )
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

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return RegistryBlock.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}