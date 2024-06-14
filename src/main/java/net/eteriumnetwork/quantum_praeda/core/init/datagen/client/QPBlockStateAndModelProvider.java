package net.eteriumnetwork.quantum_praeda.core.init.datagen.client;

import net.eteriumnetwork.quantum_praeda.core.init.RegistryBlock;
import net.eteriumnetwork.quantum_praeda.util.logger.QPLogger;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class QPBlockStateAndModelProvider extends BlockStateProvider {
    public QPBlockStateAndModelProvider(PackOutput output, String modid, ExistingFileHelper exFileHelper) {
        super(output, modid, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        QPLogger.info("Stating Registering States and Models: OVERWORLD QUANTUM ORES");
        this.simpleBlockWithItem(
            RegistryBlock.QUANTUMITE_ORE.get(),
            models().cubeAll(
                RegistryBlock.QUANTUMITE_BLOCK.getId().getPath(),
                modLoc("block/" + RegistryBlock.QUANTUMITE_ORE.getId().getPath())
            )
        );
        this.simpleBlockWithItem(
            RegistryBlock.PHOTONITA_ORE.get(),
            models().cubeAll(
                RegistryBlock.PHOTONITA_ORE.getId().getPath(),
                modLoc("block/"+RegistryBlock.PHOTONITA_ORE.getId().getPath())
            )
        );


        QPLogger.info("Stating Registering States and Models: DEEPSLATE QUANTUM ORES");
        this.simpleBlockWithItem(
            RegistryBlock.DEEPSLATE_QUANTUMITE_ORE.get(),
            models().cubeAll(
                RegistryBlock.DEEPSLATE_QUANTUMITE_ORE.getId().getPath(),
                modLoc("block/"+RegistryBlock.DEEPSLATE_QUANTUMITE_ORE.getId().getPath())
            )
        );
        this.simpleBlockWithItem(
            RegistryBlock.DEEPSLATE_NEUTRINIO_ORE.get(),
            models().cubeAll(
                RegistryBlock.QUANTUMITE_BLOCK.getId().getPath(),
                modLoc("block/" + RegistryBlock.DEEPSLATE_NEUTRINIO_ORE.getId().getPath())
            )
        );
        this.simpleBlockWithItem(
            RegistryBlock.DEEPSLATE_ENTANGLION_ORE.get(),
            models().cubeAll(
                RegistryBlock.DEEPSLATE_ENTANGLION_ORE.getId().getPath(),
                modLoc("block/"+RegistryBlock.DEEPSLATE_ENTANGLION_ORE.getId().getPath())
            )
        );
        this.simpleBlockWithItem(
            RegistryBlock.DEEPSLATE_SPINORITA_ORE.get(),
            models().cubeAll(
                RegistryBlock.DEEPSLATE_SPINORITA_ORE.getId().getPath(),
                modLoc("block/"+RegistryBlock.DEEPSLATE_SPINORITA_ORE.getId().getPath())
            )
        );
        this.simpleBlockWithItem(
            RegistryBlock.DEEPSLATE_SUPERCONDUTITA_ORE.get(),
            models().cubeAll(
                RegistryBlock.DEEPSLATE_SUPERCONDUTITA_ORE.getId().getPath(),
                modLoc("block/"+RegistryBlock.DEEPSLATE_SUPERCONDUTITA_ORE.getId().getPath())
            )
        );

        QPLogger.info("Stating Registering States and Models: NETHER QUANTUM ORES");
        this.simpleBlockWithItem(
            RegistryBlock.NETHER_QUANTUMITE_ORE.get(),
            models().cubeAll(
                RegistryBlock.NETHER_QUANTUMITE_ORE.getId().getPath(),
                modLoc("block/"+RegistryBlock.NETHER_QUANTUMITE_ORE.getId().getPath())
            )
        );
        this.simpleBlockWithItem(
            RegistryBlock.NETHER_SPINORITA_ORE.get(),
            models().cubeAll(
                RegistryBlock.NETHER_SPINORITA_ORE.getId().getPath(),
                modLoc("block/"+RegistryBlock.NETHER_SPINORITA_ORE.getId().getPath())
            )
        );
        this.simpleBlockWithItem(
            RegistryBlock.NETHER_ENTANGLION_ORE.get(),
            models().cubeAll(
                RegistryBlock.NETHER_ENTANGLION_ORE.getId().getPath(),
                modLoc("block/"+RegistryBlock.NETHER_ENTANGLION_ORE.getId().getPath())
            )
        );
        this.simpleBlockWithItem(
            RegistryBlock.NETHER_SUPERCONDUTITA_ORE.get(),
            models().cubeAll(
                RegistryBlock.NETHER_SUPERCONDUTITA_ORE.getId().getPath(),
                modLoc("block/"+RegistryBlock.NETHER_SUPERCONDUTITA_ORE.getId().getPath())
            )
        );

        QPLogger.info("Stating Registering States and Models: END QUANTUM ORES");
        this.simpleBlockWithItem(
            RegistryBlock.END_QUANTUMITE_ORE.get(),
            models().cubeAll(
                RegistryBlock.END_QUANTUMITE_ORE.getId().getPath(),
                modLoc("block/"+RegistryBlock.END_QUANTUMITE_ORE.getId().getPath())
            )
        );
        this.simpleBlockWithItem(
            RegistryBlock.END_NEUTRINIO_ORE.get(),
            models().cubeAll(
                RegistryBlock.END_NEUTRINIO_ORE.getId().getPath(),
                modLoc("block/"+RegistryBlock.END_NEUTRINIO_ORE.getId().getPath())
            )
        );
        this.simpleBlockWithItem(
            RegistryBlock.END_GRAVITONITA_ORE.get(),
            models().cubeAll(
                RegistryBlock.END_GRAVITONITA_ORE.getId().getPath(),
                modLoc("block/"+RegistryBlock.END_GRAVITONITA_ORE.getId().getPath())
            )
        );
        this.simpleBlockWithItem(
            RegistryBlock.END_SPINORITA_ORE.get(),
            models().cubeAll(
                RegistryBlock.END_SPINORITA_ORE.getId().getPath(),
                modLoc("block/"+RegistryBlock.END_SPINORITA_ORE.getId().getPath())
            )
        );
        this.simpleBlockWithItem(
            RegistryBlock.END_ENTANGLION_ORE.get(),
            models().cubeAll(
                RegistryBlock.END_ENTANGLION_ORE.getId().getPath(),
                modLoc("block/"+RegistryBlock.END_ENTANGLION_ORE.getId().getPath())
            )
        );

        QPLogger.info("Stating Registering States and Models: QUANTUM MACHINES...");
        this.simpleBlockWithItem(
            RegistryBlock.QUANTUMITE_REFINER.get(),
            models().cube(
                RegistryBlock.QUANTUMITE_REFINER.getId().getPath(),
                modLoc("block/"+RegistryBlock.QUANTUMITE_REFINER.getId().getPath()+"_down"),
                modLoc("block/"+RegistryBlock.QUANTUMITE_REFINER.getId().getPath()+"_up"),
                modLoc("block/"+RegistryBlock.QUANTUMITE_REFINER.getId().getPath()+"_north"),
                modLoc("block/"+RegistryBlock.QUANTUMITE_REFINER.getId().getPath()+"_south"),
                modLoc("block/"+RegistryBlock.QUANTUMITE_REFINER.getId().getPath()+"_east"),
                modLoc("block/"+RegistryBlock.QUANTUMITE_REFINER.getId().getPath()+"_west")
            )
        );
        this.simpleBlockWithItem(
            RegistryBlock.NEUTRINIO_EXTRACTOR.get(),
            models().cube(
                RegistryBlock.NEUTRINIO_EXTRACTOR.getId().getPath(),
                modLoc("block/"+RegistryBlock.NEUTRINIO_EXTRACTOR.getId().getPath()+"_down"),
                modLoc("block/"+RegistryBlock.NEUTRINIO_EXTRACTOR.getId().getPath()+"_up"),
                modLoc("block/"+RegistryBlock.NEUTRINIO_EXTRACTOR.getId().getPath()+"_north"),
                modLoc("block/"+RegistryBlock.NEUTRINIO_EXTRACTOR.getId().getPath()+"_south"),
                modLoc("block/"+RegistryBlock.NEUTRINIO_EXTRACTOR.getId().getPath()+"_east"),
                modLoc("block/"+RegistryBlock.NEUTRINIO_EXTRACTOR.getId().getPath()+"_west")
            )
        );
        this.simpleBlockWithItem(
            RegistryBlock.PHOTONITA_INFUSER.get(),
            models().cube(
                RegistryBlock.PHOTONITA_INFUSER.getId().getPath(),
                modLoc("block/"+RegistryBlock.PHOTONITA_INFUSER.getId().getPath()+"_down"),
                modLoc("block/"+RegistryBlock.PHOTONITA_INFUSER.getId().getPath()+"_up"),
                modLoc("block/"+RegistryBlock.PHOTONITA_INFUSER.getId().getPath()+"_north"),
                modLoc("block/"+RegistryBlock.PHOTONITA_INFUSER.getId().getPath()+"_south"),
                modLoc("block/"+RegistryBlock.PHOTONITA_INFUSER.getId().getPath()+"_east"),
                modLoc("block/"+RegistryBlock.PHOTONITA_INFUSER.getId().getPath()+"_west")
            )
        );
        this.simpleBlockWithItem(
            RegistryBlock.SPINORITA_ASSEMBLER.get(),
            models().cube(
                RegistryBlock.SPINORITA_ASSEMBLER.getId().getPath(),
                modLoc("block/"+RegistryBlock.SPINORITA_ASSEMBLER.getId().getPath()+"_down"),
                modLoc("block/"+RegistryBlock.SPINORITA_ASSEMBLER.getId().getPath()+"_up"),
                modLoc("block/"+RegistryBlock.SPINORITA_ASSEMBLER.getId().getPath()+"_north"),
                modLoc("block/"+RegistryBlock.SPINORITA_ASSEMBLER.getId().getPath()+"_south"),
                modLoc("block/"+RegistryBlock.SPINORITA_ASSEMBLER.getId().getPath()+"_east"),
                modLoc("block/"+RegistryBlock.SPINORITA_ASSEMBLER.getId().getPath()+"_west")
            )
        );
        this.simpleBlockWithItem(
            RegistryBlock.ENTANGLION_TRANSMITTER.get(),
            models().cube(
                RegistryBlock.ENTANGLION_TRANSMITTER.getId().getPath(),
                modLoc("block/"+RegistryBlock.ENTANGLION_TRANSMITTER.getId().getPath()+"_down"),
                modLoc("block/"+RegistryBlock.ENTANGLION_TRANSMITTER.getId().getPath()+"_up"),
                modLoc("block/"+RegistryBlock.ENTANGLION_TRANSMITTER.getId().getPath()+"_north"),
                modLoc("block/"+RegistryBlock.ENTANGLION_TRANSMITTER.getId().getPath()+"_south"),
                modLoc("block/"+RegistryBlock.ENTANGLION_TRANSMITTER.getId().getPath()+"_east"),
                modLoc("block/"+RegistryBlock.ENTANGLION_TRANSMITTER.getId().getPath()+"_west")
            )
        );
        this.simpleBlockWithItem(
            RegistryBlock.SUPERCONDUTITA_FORGE.get(),
            models().cube(
                RegistryBlock.SUPERCONDUTITA_FORGE.getId().getPath(),
                modLoc("block/"+RegistryBlock.SUPERCONDUTITA_FORGE.getId().getPath()+"_down"),
                modLoc("block/"+RegistryBlock.SUPERCONDUTITA_FORGE.getId().getPath()+"_up"),
                modLoc("block/"+RegistryBlock.SUPERCONDUTITA_FORGE.getId().getPath()+"_north"),
                modLoc("block/"+RegistryBlock.SUPERCONDUTITA_FORGE.getId().getPath()+"_south"),
                modLoc("block/"+RegistryBlock.SUPERCONDUTITA_FORGE.getId().getPath()+"_east"),
                modLoc("block/"+RegistryBlock.SUPERCONDUTITA_FORGE.getId().getPath()+"_west")
            )
        );

        QPLogger.info("Stating Registering States and Models: QUANTUM BLOCKS...");
        this.simpleBlockWithItem(
            RegistryBlock.QUANTUMITE_BLOCK.get(),
            models().cubeAll(
                RegistryBlock.QUANTUMITE_BLOCK.getId().getPath(),
                modLoc("block/"+RegistryBlock.QUANTUMITE_BLOCK.getId().getPath())
            )
        );
        this.simpleBlockWithItem(
            RegistryBlock.NEUTRINIO_BLOCK.get(),
            models().cubeAll(
                RegistryBlock.NEUTRINIO_BLOCK.getId().getPath(),
                modLoc("block/"+RegistryBlock.NEUTRINIO_BLOCK.getId().getPath())
            )
        );
        this.simpleBlockWithItem(
            RegistryBlock.PHOTONITA_BLOCK.get(),
            models().cubeAll(
                RegistryBlock.PHOTONITA_BLOCK.getId().getPath(),
                modLoc("block/"+RegistryBlock.PHOTONITA_BLOCK.getId().getPath())
            )
        );
        this.simpleBlockWithItem(
            RegistryBlock.GRAVITONITA_BLOCK.get(),
            models().cubeAll(
                RegistryBlock.END_GRAVITONITA_ORE.getId().getPath(),
                modLoc("block/"+RegistryBlock.END_GRAVITONITA_ORE.getId().getPath())
            )
        );
        this.simpleBlockWithItem(
            RegistryBlock.SPINORITA_BLOCK.get(),
            models().cubeAll(
                RegistryBlock.SPINORITA_BLOCK.getId().getPath(),
                modLoc("block/"+RegistryBlock.SPINORITA_BLOCK.getId().getPath())
            )
        );
        this.simpleBlockWithItem(
            RegistryBlock.ENTANGLION_BLOCK.get(),
            models().cubeAll(
                RegistryBlock.ENTANGLION_BLOCK.getId().getPath(),
                modLoc("block/"+RegistryBlock.ENTANGLION_BLOCK.getId().getPath())
            )
        );
        this.simpleBlockWithItem(
            RegistryBlock.SUPERCONDUTITA_BLOCK.get(),
            models().cubeAll(
                RegistryBlock.ENTANGLION_BLOCK.getId().getPath(),
                modLoc("block/"+RegistryBlock.ENTANGLION_BLOCK.getId().getPath())
            )
        );
    }
    @Override
    public void simpleBlockWithItem(Block block, ModelFile model) {
        QPLogger.debug(
            "BlockStateAndModel:{\n\tID: %s\n\tLocation: %s,\n\tLanguageKey: %s\n}",
            block.getDescriptionId(), model.getLocation().getPath(), block.getLootTable().toLanguageKey()
        );
        simpleBlock(block, model);
        simpleBlockItem(block, model);
    }
}