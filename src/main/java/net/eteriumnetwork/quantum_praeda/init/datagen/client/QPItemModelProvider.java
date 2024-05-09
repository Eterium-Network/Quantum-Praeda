package net.eteriumnetwork.quantum_praeda.init.datagen.client;

import net.eteriumnetwork.quantum_praeda.QuantumPraeda;
import net.eteriumnetwork.quantum_praeda.init.RegistryItem;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class QPItemModelProvider extends ItemModelProvider {
    public QPItemModelProvider(PackOutput output, String modid, ExistingFileHelper existingFileHelper) {
        super(output, modid, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(RegistryItem.RAW_NEUTRINIO);
        simpleItem(RegistryItem.RAW_PHOTONITA);
        simpleItem(RegistryItem.RAW_SPINORITA);
        simpleItem(RegistryItem.RAW_QUANTUMITE);
        simpleItem(RegistryItem.RAW_ENTANGLION);
        simpleItem(RegistryItem.RAW_GRAVITONITA);
        simpleItem(RegistryItem.RAW_SUPERCONDUTITA);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(
                item.getId().getPath(),
                new ResourceLocation("item/generated")
        ).texture(
            "layer0",
            new ResourceLocation(
                QuantumPraeda.MODID,
                "item/"+item.getId().getPath()
            )
        );
    }
}
