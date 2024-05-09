package net.eteriumnetwork.quantum_praeda.init.datagen;

import net.eteriumnetwork.quantum_praeda.QuantumPraeda;
import net.eteriumnetwork.quantum_praeda.init.datagen.client.QPBlockStateAndModelProvider;
import net.eteriumnetwork.quantum_praeda.init.datagen.client.QPItemModelProvider;
import net.eteriumnetwork.quantum_praeda.init.datagen.server.QPBlockTagProvider;
import net.eteriumnetwork.quantum_praeda.init.datagen.server.QPItemTagProvider;
import net.eteriumnetwork.quantum_praeda.init.datagen.server.QPLootTableProvider;
import net.eteriumnetwork.quantum_praeda.init.datagen.server.QPRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = QuantumPraeda.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class QPDataGenerator {

    /**
     * @implNote This method is responsible from generate the data pack of mod.
     */
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator dataGenerator = event.getGenerator();
        PackOutput dataOutput = dataGenerator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        // Server Data Generation
        dataGenerator.addProvider(
            event.includeServer(),
            new QPRecipeProvider(dataOutput)
        );
        dataGenerator.addProvider(event.includeServer(), QPLootTableProvider.create(dataOutput));
        QPBlockTagProvider blockTagProvider = dataGenerator.addProvider(event.includeServer(),
            new QPBlockTagProvider(dataOutput, lookupProvider, QuantumPraeda.MODID, existingFileHelper)
        );
        dataGenerator.addProvider(
            event.includeServer(),
            new QPItemTagProvider(
                dataOutput,
                lookupProvider,
                blockTagProvider.contentsGetter(),
                QuantumPraeda.MODID,
                existingFileHelper
            )
        );

        // Client Data Generation
        dataGenerator.addProvider(
            event.includeClient(),
            new QPItemModelProvider(dataOutput, QuantumPraeda.MODID, existingFileHelper)
        );
        dataGenerator.addProvider(
                event.includeClient(),
                new QPBlockStateAndModelProvider(dataOutput, QuantumPraeda.MODID, existingFileHelper)
        );
    }
}
