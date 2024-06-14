package net.eteriumnetwork.quantum_praeda.core.init.datagen.server;


import net.eteriumnetwork.quantum_praeda.core.init.RegistryBlock;
import net.eteriumnetwork.quantum_praeda.core.init.RegistryItem;
import net.eteriumnetwork.quantum_praeda.util.logger.QPLogger;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class QPBlocksLootTable extends BlockLootSubProvider  {

    protected QPBlocksLootTable() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    private void dropSelf(@NotNull BiConsumer<ResourceLocation, LootTable.Builder> consumer, Block block) {
        ResourceLocation blockID = ForgeRegistries.BLOCKS.getKey(block);
        LootTable.Builder table = LootTable.lootTable().withPool(
            LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                .add(LootItem.lootTableItem(block))
        );
        consumer.accept(blockID, table);
    }
    private void dropOre(@NotNull BiConsumer<ResourceLocation, LootTable.Builder> consumer, Block block, Item item) {
        ResourceLocation blockID = ForgeRegistries.BLOCKS.getKey(block);
        LootTable.Builder table = createSilkTouchDispatchTable(
            block,
            applyExplosionDecay(
                block,
                LootItem.lootTableItem(item)
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                    .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
            )
        );
        consumer.accept(blockID, table);
    }

    @Override
    public void generate(@NotNull BiConsumer<ResourceLocation, LootTable.Builder> consumer) {
        QPLogger.info("Generating Loot Tables: QUANTUM MACHINES...");
        dropSelf(consumer, RegistryBlock.PHOTONITA_INFUSER.get());
        dropSelf(consumer, RegistryBlock.QUANTUMITE_REFINER.get());
        dropSelf(consumer, RegistryBlock.SPINORITA_ASSEMBLER.get());
        dropSelf(consumer, RegistryBlock.NEUTRINIO_EXTRACTOR.get());
        dropSelf(consumer, RegistryBlock.SUPERCONDUTITA_FORGE.get());
        dropSelf(consumer, RegistryBlock.ENTANGLION_TRANSMITTER.get());
        dropSelf(consumer, RegistryBlock.GRAVITONITA_COMPRESSOR.get());
        QPLogger.info("Generating Loot Tables: QUANTUM BLOCKS...");
        dropSelf(consumer, RegistryBlock.PHOTONITA_BLOCK.get());
        dropSelf(consumer, RegistryBlock.QUANTUMITE_BLOCK.get());
        dropSelf(consumer, RegistryBlock.SPINORITA_BLOCK.get());
        dropSelf(consumer, RegistryBlock.NEUTRINIO_BLOCK.get());
        dropSelf(consumer, RegistryBlock.ENTANGLION_BLOCK.get());
        dropSelf(consumer, RegistryBlock.GRAVITONITA_BLOCK.get());
        dropSelf(consumer, RegistryBlock.SUPERCONDUTITA_BLOCK.get());

        QPLogger.info("Generating Loot Tables: QUANTUM ORES...");
        dropOre(
            consumer,
            RegistryBlock.QUANTUMITE_ORE.get(),
            RegistryItem.QUANTUMITE_RAW.get()
        );
        dropOre(
            consumer,
            RegistryBlock.DEEPSLATE_QUANTUMITE_ORE.get(),
            RegistryItem.QUANTUMITE_RAW.get()
        );
        dropOre(
            consumer,
            RegistryBlock.NETHER_QUANTUMITE_ORE.get(),
            RegistryItem.QUANTUMITE_RAW.get()
        );
        dropOre(
            consumer,
            RegistryBlock.END_QUANTUMITE_ORE.get(),
            RegistryItem.QUANTUMITE_RAW.get()
        );

        dropOre(
            consumer,
            RegistryBlock.NETHER_ENTANGLION_ORE.get(),
            RegistryItem.ENTANGLION_CRYSTAL.get()
        );
        dropOre(
            consumer,
            RegistryBlock.END_ENTANGLION_ORE.get(),
            RegistryItem.ENTANGLION_CRYSTAL.get()
        );

        dropOre(
            consumer,
            RegistryBlock.END_GRAVITONITA_ORE.get(),
            RegistryItem.GRAVITONITA_RAW.get()
        );

        dropOre(
            consumer,
            RegistryBlock.PHOTONITA_ORE.get(),
            RegistryItem.PHOTONITA_RAW.get()
        );

        dropOre(
            consumer,
            RegistryBlock.DEEPSLATE_SPINORITA_ORE.get(),
            RegistryItem.SPINORITA_RAW.get()
        );
        dropOre(
            consumer,
            RegistryBlock.NETHER_SPINORITA_ORE.get(),
            RegistryItem.SPINORITA_RAW.get()
        );
        dropOre(
            consumer,
            RegistryBlock.END_SPINORITA_ORE.get(),
            RegistryItem.SPINORITA_INGOT.get()
        );

        dropOre(
            consumer,
            RegistryBlock.NETHER_SUPERCONDUTITA_ORE.get(),
            RegistryItem.SUPERCONDUTITA_RAW.get()
        );
        dropOre(
            consumer,
            RegistryBlock.DEEPSLATE_SUPERCONDUTITA_ORE.get(),
            RegistryItem.SUPERCONDUTITA_RAW.get()
        );

        dropOre(
            consumer,
            RegistryBlock.DEEPSLATE_NEUTRINIO_ORE.get(),
            RegistryItem.NEUTRINIO_RAW.get()
        );
        dropOre(
            consumer,
            RegistryBlock.END_NEUTRINIO_ORE.get(),
            RegistryItem.NEUTRINIO_RAW.get()
        );
    }

    @Override
    protected void generate() {    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return RegistryBlock.BLOCKS.getEntries().stream().map(RegistryObject::get).collect(Collectors.toList());
    }
}
