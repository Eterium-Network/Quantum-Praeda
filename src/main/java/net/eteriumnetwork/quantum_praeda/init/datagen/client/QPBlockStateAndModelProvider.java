package net.eteriumnetwork.quantum_praeda.init.datagen.client;

import net.eteriumnetwork.quantum_praeda.init.RegistryBlock;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class QPBlockStateAndModelProvider extends BlockStateProvider {
    public QPBlockStateAndModelProvider(PackOutput output, String modid, ExistingFileHelper exFileHelper) {
        super(output, modid, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlockWithItem(
                RegistryBlock.QUANTUMITE_ORE.get(),
                models().cubeAll(
                        RegistryBlock.QUANTUMITE_ORE.getId().getPath(),
                        modLoc("block/"+RegistryBlock.QUANTUMITE_ORE.getId().getPath())
                )
        );
        simpleBlockWithItem(
                RegistryBlock.DEEPSLATE_QUANTUMITE_ORE.get(),
                models().cubeAll(
                        RegistryBlock.DEEPSLATE_QUANTUMITE_ORE.getId().getPath(),
                        modLoc("block/"+RegistryBlock.DEEPSLATE_QUANTUMITE_ORE.getId().getPath())
                )
        );
        simpleBlockWithItem(
                RegistryBlock.NETHER_QUANTUMITE_ORE.get(),
                models().cubeAll(
                        RegistryBlock.NETHER_QUANTUMITE_ORE.getId().getPath(),
                        modLoc("block/"+RegistryBlock.NETHER_QUANTUMITE_ORE.getId().getPath())
                )
        );
        simpleBlockWithItem(
                RegistryBlock.END_QUANTUMITE_ORE.get(),
                models().cubeAll(
                        RegistryBlock.END_QUANTUMITE_ORE.getId().getPath(),
                        modLoc("block/"+RegistryBlock.END_QUANTUMITE_ORE.getId().getPath())
                )
        );
        simpleBlockWithItem(
                RegistryBlock.QUANTUMITE_BLOCK.get(),
                models().cubeAll(
                        RegistryBlock.QUANTUMITE_BLOCK.getId().getPath(),
                        modLoc("block/"+RegistryBlock.QUANTUMITE_BLOCK.getId().getPath())
                )
        );

        simpleBlockWithItem(
                RegistryBlock.NEUTRINIO_ORE.get(),
                models().cubeAll(
                        RegistryBlock.NEUTRINIO_ORE.getId().getPath(),
                        modLoc("block/"+RegistryBlock.NEUTRINIO_ORE.getId().getPath())
                )
        );
        simpleBlockWithItem(
                RegistryBlock.DEEPSLATE_NEUTRINIO_ORE.get(),
                models().cubeAll(
                        RegistryBlock.DEEPSLATE_NEUTRINIO_ORE.getId().getPath(),
                        modLoc("block/"+RegistryBlock.DEEPSLATE_NEUTRINIO_ORE.getId().getPath())
                )
        );
        simpleBlockWithItem(
                RegistryBlock.NETHER_NEUTRINIO_ORE.get(),
                models().cubeAll(
                        RegistryBlock.NETHER_NEUTRINIO_ORE.getId().getPath(),
                        modLoc("block/"+RegistryBlock.NETHER_NEUTRINIO_ORE.getId().getPath())
                )
        );
        simpleBlockWithItem(
                RegistryBlock.END_NEUTRINIO_ORE.get(),
                models().cubeAll(
                        RegistryBlock.END_NEUTRINIO_ORE.getId().getPath(),
                        modLoc("block/"+RegistryBlock.END_NEUTRINIO_ORE.getId().getPath())
                )
        );
        simpleBlockWithItem(
                RegistryBlock.NEUTRINIO_BLOCK.get(),
                models().cubeAll(
                        RegistryBlock.NEUTRINIO_BLOCK.getId().getPath(),
                        modLoc("block/"+RegistryBlock.NEUTRINIO_BLOCK.getId().getPath())
                )
        );

        simpleBlockWithItem(
                RegistryBlock.GRAVITONITA_ORE.get(),
                models().cubeAll(
                        RegistryBlock.GRAVITONITA_ORE.getId().getPath(),
                        modLoc("block/"+RegistryBlock.GRAVITONITA_ORE.getId().getPath())
                )
        );
        simpleBlockWithItem(
                RegistryBlock.DEEPSLATE_GRAVITONITA_ORE.get(),
                models().cubeAll(
                        RegistryBlock.DEEPSLATE_GRAVITONITA_ORE.getId().getPath(),
                        modLoc("block/"+RegistryBlock.DEEPSLATE_GRAVITONITA_ORE.getId().getPath())
                )
        );
        simpleBlockWithItem(
                RegistryBlock.NETHER_GRAVITONITA_ORE.get(),
                models().cubeAll(
                        RegistryBlock.NETHER_GRAVITONITA_ORE.getId().getPath(),
                        modLoc("block/"+RegistryBlock.NETHER_GRAVITONITA_ORE.getId().getPath())
                )
        );
        simpleBlockWithItem(
                RegistryBlock.END_GRAVITONITA_ORE.get(),
                models().cubeAll(
                        RegistryBlock.END_GRAVITONITA_ORE.getId().getPath(),
                        modLoc("block/"+RegistryBlock.END_GRAVITONITA_ORE.getId().getPath())
                )
        );
        simpleBlockWithItem(
                RegistryBlock.GRAVITONITA_BLOCK.get(),
                models().cubeAll(
                        RegistryBlock.GRAVITONITA_BLOCK.getId().getPath(),
                        modLoc("block/"+RegistryBlock.GRAVITONITA_BLOCK.getId().getPath())
                )
        );

        simpleBlockWithItem(
                RegistryBlock.PHOTONITA_ORE.get(),
                models().cubeAll(
                        RegistryBlock.PHOTONITA_ORE.getId().getPath(),
                        modLoc("block/"+RegistryBlock.PHOTONITA_ORE.getId().getPath())
                )
        );
        simpleBlockWithItem(
                RegistryBlock.DEEPSLATE_PHOTONITA_ORE.get(),
                models().cubeAll(
                        RegistryBlock.DEEPSLATE_PHOTONITA_ORE.getId().getPath(),
                        modLoc("block/"+RegistryBlock.DEEPSLATE_PHOTONITA_ORE.getId().getPath())
                )
        );
        simpleBlockWithItem(
                RegistryBlock.NETHER_PHOTONITA_ORE.get(),
                models().cubeAll(
                        RegistryBlock.NETHER_PHOTONITA_ORE.getId().getPath(),
                        modLoc("block/"+RegistryBlock.NETHER_PHOTONITA_ORE.getId().getPath())
                )
        );
        simpleBlockWithItem(
                RegistryBlock.END_PHOTONITA_ORE.get(),
                models().cubeAll(
                        RegistryBlock.END_PHOTONITA_ORE.getId().getPath(),
                        modLoc("block/"+RegistryBlock.END_PHOTONITA_ORE.getId().getPath())
                )
        );
        simpleBlockWithItem(
                RegistryBlock.PHOTONITA_BLOCK.get(),
                models().cubeAll(
                        RegistryBlock.PHOTONITA_BLOCK.getId().getPath(),
                        modLoc("block/"+RegistryBlock.PHOTONITA_BLOCK.getId().getPath())
                )
        );

        simpleBlockWithItem(
                RegistryBlock.SPINORITA_ORE.get(),
                models().cubeAll(
                        RegistryBlock.SPINORITA_ORE.getId().getPath(),
                        modLoc("block/"+RegistryBlock.SPINORITA_ORE.getId().getPath())
                )
        );
        simpleBlockWithItem(
                RegistryBlock.DEEPSLATE_SPINORITA_ORE.get(),
                models().cubeAll(
                        RegistryBlock.DEEPSLATE_SPINORITA_ORE.getId().getPath(),
                        modLoc("block/"+RegistryBlock.DEEPSLATE_SPINORITA_ORE.getId().getPath())
                )
        );
        simpleBlockWithItem(
                RegistryBlock.NETHER_SPINORITA_ORE.get(),
                models().cubeAll(
                        RegistryBlock.NETHER_SPINORITA_ORE.getId().getPath(),
                        modLoc("block/"+RegistryBlock.NETHER_SPINORITA_ORE.getId().getPath())
                )
        );
        simpleBlockWithItem(
                RegistryBlock.END_SPINORITA_ORE.get(),
                models().cubeAll(
                        RegistryBlock.END_SPINORITA_ORE.getId().getPath(),
                        modLoc("block/"+RegistryBlock.END_SPINORITA_ORE.getId().getPath())
                )
        );
        simpleBlockWithItem(
                RegistryBlock.SPINORITA_BLOCK.get(),
                models().cubeAll(
                        RegistryBlock.SPINORITA_BLOCK.getId().getPath(),
                        modLoc("block/"+RegistryBlock.SPINORITA_BLOCK.getId().getPath())
                )
        );

        simpleBlockWithItem(
                RegistryBlock.ENTANGLION_ORE.get(),
                models().cubeAll(
                        RegistryBlock.ENTANGLION_ORE.getId().getPath(),
                        modLoc("block/"+RegistryBlock.ENTANGLION_ORE.getId().getPath())
                )
        );
        simpleBlockWithItem(
                RegistryBlock.DEEPSLATE_ENTANGLION_ORE.get(),
                models().cubeAll(
                        RegistryBlock.DEEPSLATE_ENTANGLION_ORE.getId().getPath(),
                        modLoc("block/"+RegistryBlock.DEEPSLATE_ENTANGLION_ORE.getId().getPath())
                )
        );
        simpleBlockWithItem(
                RegistryBlock.NETHER_ENTANGLION_ORE.get(),
                models().cubeAll(
                        RegistryBlock.NETHER_ENTANGLION_ORE.getId().getPath(),
                        modLoc("block/"+RegistryBlock.NETHER_ENTANGLION_ORE.getId().getPath())
                )
        );
        simpleBlockWithItem(
                RegistryBlock.END_ENTANGLION_ORE.get(),
                models().cubeAll(
                        RegistryBlock.END_ENTANGLION_ORE.getId().getPath(),
                        modLoc("block/"+RegistryBlock.END_ENTANGLION_ORE.getId().getPath())
                )
        );
        simpleBlockWithItem(
                RegistryBlock.ENTANGLION_BLOCK.get(),
                models().cubeAll(
                        RegistryBlock.ENTANGLION_BLOCK.getId().getPath(),
                        modLoc("block/"+RegistryBlock.ENTANGLION_BLOCK.getId().getPath())
                )
        );

        simpleBlockWithItem(
                RegistryBlock.SUPERCONDUTITA_ORE.get(),
                models().cubeAll(
                        RegistryBlock.SUPERCONDUTITA_ORE.getId().getPath(),
                        modLoc("block/"+RegistryBlock.SUPERCONDUTITA_ORE.getId().getPath())
                )
        );
        simpleBlockWithItem(
                RegistryBlock.DEEPSLATE_SUPERCONDUTITA_ORE.get(),
                models().cubeAll(
                        RegistryBlock.DEEPSLATE_SUPERCONDUTITA_ORE.getId().getPath(),
                        modLoc("block/"+RegistryBlock.DEEPSLATE_SUPERCONDUTITA_ORE.getId().getPath())
                )
        );
        simpleBlockWithItem(
                RegistryBlock.NETHER_SUPERCONDUTITA_ORE.get(),
                models().cubeAll(
                        RegistryBlock.NETHER_SUPERCONDUTITA_ORE.getId().getPath(),
                        modLoc("block/"+RegistryBlock.NETHER_SUPERCONDUTITA_ORE.getId().getPath())
                )
        );
        simpleBlockWithItem(
                RegistryBlock.END_SUPERCONDUTITA_ORE.get(),
                models().cubeAll(
                        RegistryBlock.END_SUPERCONDUTITA_ORE.getId().getPath(),
                        modLoc("block/"+RegistryBlock.END_SUPERCONDUTITA_ORE.getId().getPath())
                )
        );
        simpleBlockWithItem(
                RegistryBlock.SUPERCONDUTITA_BLOCK.get(),
                models().cubeAll(
                        RegistryBlock.SUPERCONDUTITA_BLOCK.getId().getPath(),
                        modLoc("block/"+RegistryBlock.SUPERCONDUTITA_BLOCK.getId().getPath())
                )
        );

        simpleBlockWithItem(
            RegistryBlock.ENTANGLION_TRANSMITTER.get(),
            models().cube(
                RegistryBlock.ENTANGLION_TRANSMITTER.getId().getPath(),
                modLoc(
                    "block/"
                    + RegistryBlock.ENTANGLION_TRANSMITTER.getId().getPath()
                    + "_down"
                ),
                modLoc(
                    "block/"
                    + RegistryBlock.ENTANGLION_TRANSMITTER.getId().getPath()
                    + "_up"
                ),
                modLoc(
                    "block/"
                    + RegistryBlock.ENTANGLION_TRANSMITTER.getId().getPath()
                    + "_north"
                ),
                modLoc(
                    "block/"
                    + RegistryBlock.ENTANGLION_TRANSMITTER.getId().getPath()
                    + "_south"
                ),
                modLoc(
                    "block/"
                    + RegistryBlock.ENTANGLION_TRANSMITTER.getId().getPath()
                    + "_east"
                ),
                modLoc(
                "block/"
                    + RegistryBlock.ENTANGLION_TRANSMITTER.getId().getPath()
                    + "_west"
                )
            )
        );
        simpleBlockWithItem(
                RegistryBlock.QUANTUMITE_REFINER.get(),
                models().cube(
                    RegistryBlock.QUANTUMITE_REFINER.getId().getPath(),
                    modLoc(
                        "block/"
                        + RegistryBlock.QUANTUMITE_REFINER.getId().getPath()
                        + "_down"
                    ),
                    modLoc(
                        "block/"
                        + RegistryBlock.QUANTUMITE_REFINER.getId().getPath()
                        + "_up"
                    ),
                    modLoc(
                        "block/"
                        + RegistryBlock.QUANTUMITE_REFINER.getId().getPath()
                        + "_north"
                    ),
                    modLoc(
                        "block/"
                        + RegistryBlock.QUANTUMITE_REFINER.getId().getPath()
                        + "_south"
                    ),
                    modLoc(
                        "block/"
                        + RegistryBlock.QUANTUMITE_REFINER.getId().getPath()
                        + "_east"
                    ),
                    modLoc(
                        "block/"
                        + RegistryBlock.QUANTUMITE_REFINER.getId().getPath()
                        + "_west"
                    )
            )
        );
        simpleBlockWithItem(
                RegistryBlock.GRAVITONITA_COMPRESSOR.get(),
                models().cube(
            RegistryBlock.GRAVITONITA_COMPRESSOR.getId().getPath(),
            modLoc(
        "block/"
                + RegistryBlock.GRAVITONITA_COMPRESSOR.getId().getPath()
                + "_down"
            ),
            modLoc(
        "block/"
                + RegistryBlock.GRAVITONITA_COMPRESSOR.getId().getPath()
                + "_up"
            ),
            modLoc(
        "block/"
                + RegistryBlock.GRAVITONITA_COMPRESSOR.getId().getPath()
                + "_north"
            ),
            modLoc(
        "block/"
                + RegistryBlock.GRAVITONITA_COMPRESSOR.getId().getPath()
                + "_south"
            ),
            modLoc(
        "block/"
                + RegistryBlock.GRAVITONITA_COMPRESSOR.getId().getPath()
                + "_east"
            ),
            modLoc(
        "block/"
                + RegistryBlock.GRAVITONITA_COMPRESSOR.getId().getPath()
                + "_west"
            )
                )
        );
        simpleBlockWithItem(
                RegistryBlock.SUPERCONDUTITA_FORGE.get(),
                models().cube(
            RegistryBlock.SUPERCONDUTITA_FORGE.getId().getPath(),
            modLoc(
        "block/"
                + RegistryBlock.SUPERCONDUTITA_FORGE.getId().getPath()
                + "_down"
            ),
            modLoc(
        "block/"
                + RegistryBlock.SUPERCONDUTITA_FORGE.getId().getPath()
                + "_up"
            ),
            modLoc(
        "block/"
                + RegistryBlock.SUPERCONDUTITA_FORGE.getId().getPath()
                + "_north"
            ),
            modLoc(
        "block/"
                + RegistryBlock.SUPERCONDUTITA_FORGE.getId().getPath()
                + "_south"
            ),
            modLoc(
        "block/"
                + RegistryBlock.SUPERCONDUTITA_FORGE.getId().getPath()
                + "_east"
            ),
            modLoc(
        "block/"
                + RegistryBlock.SUPERCONDUTITA_FORGE.getId().getPath()
                + "_west"
            )
                )
        );
        simpleBlockWithItem(
                RegistryBlock.PHOTONITA_INFUSER.get(),
                models().cube(
            RegistryBlock.PHOTONITA_INFUSER.getId().getPath(),
            modLoc(
        "block/"
                + RegistryBlock.PHOTONITA_INFUSER.getId().getPath()
                + "_down"
            ),
            modLoc(
        "block/"
                + RegistryBlock.PHOTONITA_INFUSER.getId().getPath()
                + "_up"
            ),
            modLoc(
        "block/"
                + RegistryBlock.PHOTONITA_INFUSER.getId().getPath()
                + "_north"
            ),
            modLoc(
        "block/"
                + RegistryBlock.PHOTONITA_INFUSER.getId().getPath()
                + "_south"
            ),
            modLoc(
        "block/"
                + RegistryBlock.PHOTONITA_INFUSER.getId().getPath()
                + "_east"
            ),
            modLoc(
        "block/"
                + RegistryBlock.PHOTONITA_INFUSER.getId().getPath()
                + "_west"
            )
                )
        );
        simpleBlockWithItem(
                RegistryBlock.NEUTRINIO_EXTRACTOR.get(),
                models().cube(
            RegistryBlock.NEUTRINIO_EXTRACTOR.getId().getPath(),
            modLoc(
        "block/"
                + RegistryBlock.NEUTRINIO_EXTRACTOR.getId().getPath()
                + "_down"
            ),
            modLoc(
        "block/"
                + RegistryBlock.NEUTRINIO_EXTRACTOR.getId().getPath()
                + "_up"
            ),
            modLoc(
        "block/"
                + RegistryBlock.NEUTRINIO_EXTRACTOR.getId().getPath()
                + "_north"
            ),
            modLoc(
        "block/"
                + RegistryBlock.NEUTRINIO_EXTRACTOR.getId().getPath()
                + "_south"
            ),
            modLoc(
        "block/"
                + RegistryBlock.NEUTRINIO_EXTRACTOR.getId().getPath()
                + "_east"
            ),
            modLoc(
        "block/"
                + RegistryBlock.NEUTRINIO_EXTRACTOR.getId().getPath()
                + "_west"
            )
                )
        );
        simpleBlockWithItem(
                RegistryBlock.SPINORITA_ASSEMBLER.get(),
                models().cube(
            RegistryBlock.SPINORITA_ASSEMBLER.getId().getPath(),
            modLoc(
        "block/"
                + RegistryBlock.SPINORITA_ASSEMBLER.getId().getPath()
                + "_down"
            ),
            modLoc(
        "block/"
                + RegistryBlock.SPINORITA_ASSEMBLER.getId().getPath()
                + "_up"
            ),
            modLoc(
        "block/"
                + RegistryBlock.SPINORITA_ASSEMBLER.getId().getPath()
                + "_north"
            ),
            modLoc(
        "block/"
                + RegistryBlock.SPINORITA_ASSEMBLER.getId().getPath()
                + "_south"
            ),
            modLoc(
        "block/"
                + RegistryBlock.SPINORITA_ASSEMBLER.getId().getPath()
                + "_east"
            ),
            modLoc(
        "block/"
                + RegistryBlock.SPINORITA_ASSEMBLER.getId().getPath()
                + "_west"
            )
                )
        );
    }
}
