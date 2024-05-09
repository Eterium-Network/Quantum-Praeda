package net.eteriumnetwork.quantum_praeda.init.datagen.server;

import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;

public class QPLootTableProvider {

    public static LootTableProvider create(PackOutput output) {
        return new LootTableProvider(output,Set.of(), List.of(
                new LootTableProvider.SubProviderEntry(
                        QPBlocksLootTable::new,
                        LootContextParamSets.BLOCK
                )
        ));
    }
}
