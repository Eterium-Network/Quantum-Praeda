package net.eteriumnetwork.quantum_praeda.core.init.datagen.client;

import net.eteriumnetwork.quantum_praeda.QuantumPraeda;
import net.eteriumnetwork.quantum_praeda.core.init.RegistryItem;
import net.eteriumnetwork.quantum_praeda.util.logger.QPLogger;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class QPItemModelProvider extends ItemModelProvider {
    public QPItemModelProvider(PackOutput output, String modid, ExistingFileHelper existingFileHelper) {
        super(output, modid, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        QPLogger.info("Stating Items Register Models: Registering the Models");
        simpleItem(RegistryItem.NEUTRINIO_RAW);
        simpleItem(RegistryItem.PHOTONITA_RAW);
        simpleItem(RegistryItem.SPINORITA_RAW);
        simpleItem(RegistryItem.SPINORITA_INGOT);
        simpleItem(RegistryItem.QUANTUMITE_RAW);
        simpleItem(RegistryItem.ENTANGLION_CRYSTAL);
        simpleItem(RegistryItem.GRAVITONITA_RAW);
        simpleItem(RegistryItem.SUPERCONDUTITA_RAW);
    }

    private void simpleItem(RegistryObject<Item> item) {
        QPLogger.debug("Stating Items Register Models: Writing file <<item: %s >>", item.getId().getPath());
        withExistingParent(
            item.getId().getPath(),
            new ResourceLocation("item/generated")
        ).texture(
            "layer0",
            new ResourceLocation(
                QuantumPraeda.MODID,
                "item/" + item.getId().getPath()
            )
        );
    }
}
