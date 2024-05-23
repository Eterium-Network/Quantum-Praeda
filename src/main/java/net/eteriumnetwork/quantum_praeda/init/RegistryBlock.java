package net.eteriumnetwork.quantum_praeda.init;

import net.eteriumnetwork.quantum_praeda.QuantumPraeda;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class RegistryBlock {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, QuantumPraeda.MODID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, QuantumPraeda.MODID);

    private static <T extends Block> RegistryObject<T> registerBlock(@NotNull String name, @NotNull Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return RegistryItem.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static final RegistryObject<Block> QUANTUMITE_ORE = registerBlock(
        "quantumite_ore",
        () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE),
                UniformInt.of(6, 9)
        )
    );
    public static final RegistryObject<Block> NEUTRINIO_ORE = registerBlock(
        "neutrinio_ore",
        () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE),
                UniformInt.of(6, 9)
        )
    );
    public static final RegistryObject<Block> GRAVITONITA_ORE = registerBlock(
        "gravitonita_ore",
        () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE),
                UniformInt.of(6, 9)
        )
    );
    public static final RegistryObject<Block> PHOTONITA_ORE = registerBlock(
      "photonita_ore",
        () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE),
                UniformInt.of(6, 9)
        )
    );
    public static final RegistryObject<Block> SPINORITA_ORE = registerBlock(
      "spinorita_ore",
        () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE),
                UniformInt.of(6, 9)
        )
    );
    public static final RegistryObject<Block> ENTANGLION_ORE = registerBlock(
        "entanglion_ore",
        () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE),
                UniformInt.of(6, 9)
        )
    );
    public static final RegistryObject<Block> SUPERCONDUTITA_ORE = registerBlock(
        "supercondutita_ore",
        () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE),
                UniformInt.of(6, 9)
        )
    );
    // ------------------------------------DEEPSLATE------------------------------------------- \\
    public static final RegistryObject<Block> DEEPSLATE_QUANTUMITE_ORE = registerBlock(
            "deepslate_quantumite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE),
                    UniformInt.of(6, 9)
            )
    );
    public static final RegistryObject<Block> DEEPSLATE_NEUTRINIO_ORE = registerBlock(
            "deepslate_neutrinio_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE),
                    UniformInt.of(6, 9)
            )
    );
    public static final RegistryObject<Block> DEEPSLATE_GRAVITONITA_ORE = registerBlock(
            "deepslate_gravitonita_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE),
                    UniformInt.of(6, 9)
            )
    );
    public static final RegistryObject<Block> DEEPSLATE_PHOTONITA_ORE = registerBlock(
            "deepslate_photonita_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE),
                    UniformInt.of(6, 9)
            )
    );
    public static final RegistryObject<Block> DEEPSLATE_SPINORITA_ORE = registerBlock(
            "deepslate_spinorita_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE),
                    UniformInt.of(6, 9)
            )
    );
    public static final RegistryObject<Block> DEEPSLATE_ENTANGLION_ORE = registerBlock(
            "deepslate_entanglion_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE),
                    UniformInt.of(6, 9)
            )
    );
    public static final RegistryObject<Block> DEEPSLATE_SUPERCONDUTITA_ORE = registerBlock(
        "deepslate_supercondutita_ore",
        () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE),
                UniformInt.of(6, 9)
        )
    );
    // -------------------------------------END------------------------------------------------ \\
    public static final RegistryObject<Block> END_QUANTUMITE_ORE = registerBlock(
            "end_quantumite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE),
                    UniformInt.of(6, 9)
            )
    );
    public static final RegistryObject<Block> END_NEUTRINIO_ORE = registerBlock(
            "end_neutrinio_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE),
                    UniformInt.of(6, 9)
            )
    );
    public static final RegistryObject<Block> END_GRAVITONITA_ORE = registerBlock(
            "end_gravitonita_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE),
                    UniformInt.of(6, 9)
            )
    );
    public static final RegistryObject<Block> END_ENTANGLION_ORE = registerBlock(
            "end_entanglion_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE),
                    UniformInt.of(6, 9)
            )
    );
    public static final RegistryObject<Block> END_SPINORITA_ORE = registerBlock(
            "end_spinorita_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE),
                    UniformInt.of(6, 9)
            )
    );
    public static final RegistryObject<Block> END_SUPERCONDUTITA_ORE = registerBlock(
        "end_supercondutita_ore",
        () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE),
                UniformInt.of(6, 9)
        )
    );
    // --------------------------------------NETHER--------------------------------------------- \\
    public static final RegistryObject<Block> NETHER_QUANTUMITE_ORE = registerBlock(
            "nether_quantumite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE),
                    UniformInt.of(6, 9)
            )
    );
    public static final RegistryObject<Block> NETHER_NEUTRINIO_ORE = registerBlock(
            "nether_neutrinio_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE),
                    UniformInt.of(6, 9)
            )
    );
    public static final RegistryObject<Block> NETHER_GRAVITONITA_ORE = registerBlock(
            "nether_gravitonita_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE),
                    UniformInt.of(6, 9)
            )
    );
    public static final RegistryObject<Block> NETHER_SPINORITA_ORE = registerBlock(
            "nether_spinorita_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE),
                    UniformInt.of(6, 9)
            )
    );
    public static final RegistryObject<Block> NETHER_ENTANGLION_ORE = registerBlock(
            "nether_entanglion_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE),
                    UniformInt.of(6, 9)
            )
    );
    public static final RegistryObject<Block> NETHER_SUPERCONDUTITA_ORE = registerBlock(
        "nether_supercondutita_ore",
        () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE),
                UniformInt.of(6, 9)
        )
    );
    // -----------------------------------BLOCKS------------------------------------------------- \\
    public static final RegistryObject<Block> ENTANGLION_BLOCK = registerBlock(
        "entanglion_block",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK))
    );
    public static final RegistryObject<Block> QUANTUMITE_BLOCK = registerBlock(
        "quantumite_block",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK))
    );
    public static final RegistryObject<Block> NEUTRINIO_BLOCK = registerBlock(
        "neutrinio_block",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK))
    );
    public static final RegistryObject<Block> GRAVITONITA_BLOCK = registerBlock(
        "gravitonita_block",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK))
    );
    public static final RegistryObject<Block> PHOTONITA_BLOCK = registerBlock(
        "photonita_block",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK))
    );
    public static final RegistryObject<Block> SPINORITA_BLOCK = registerBlock(
        "spinorita_block",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK))
    );
    public static final RegistryObject<Block> SUPERCONDUTITA_BLOCK = registerBlock(
        "supercondutita_block",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK))
    );

    public static final RegistryObject<Block> QUANTUMITE_REFINER = registerBlock(
        "quantumite_refiner",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).mapColor(MapColor.METAL)
                .sound(SoundType.METAL).randomTicks().requiresCorrectToolForDrops()
        )
    );
    public static final RegistryObject<Block> NEUTRINIO_EXTRACTOR = registerBlock(
        "neutrinio_extractor",
        () -> new Block(
            BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).mapColor(MapColor.METAL)
            .sound(SoundType.METAL).randomTicks().requiresCorrectToolForDrops()
        )
    );
    public static final RegistryObject<Block> GRAVITONITA_COMPRESSOR = registerBlock(
        "gravitonita_compressor",
        () -> new Block(
            BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).mapColor(MapColor.METAL)
            .sound(SoundType.METAL).randomTicks().requiresCorrectToolForDrops()
        )
    );
    public static final RegistryObject<Block> PHOTONITA_INFUSER = registerBlock(
        "photonita_infuser",
        () -> new Block(
            BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).mapColor(MapColor.METAL)
            .sound(SoundType.METAL).randomTicks().requiresCorrectToolForDrops()
        )
    );
    public static final RegistryObject<Block> SPINORITA_ASSEMBLER = registerBlock(
        "spinorita_assembler",
        () -> new Block(
            BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).mapColor(MapColor.METAL)
            .sound(SoundType.METAL).randomTicks().requiresCorrectToolForDrops()
        )
    );
    public static final RegistryObject<Block> ENTANGLION_TRANSMITTER = registerBlock(
        "entanglion_transmitter",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                .sound(SoundType.METAL).randomTicks().requiresCorrectToolForDrops()
        )
    );
    public static final RegistryObject<Block> SUPERCONDUTITA_FORGE = registerBlock(
        "supercondutita_forge",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                .sound(SoundType.METAL).randomTicks().requiresCorrectToolForDrops()
        )
    );

    public static void init(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
        BLOCK_ENTITIES.register(modEventBus);
    }

    public static void addCreative(@NotNull BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(QUANTUMITE_ORE);
            event.accept(NEUTRINIO_ORE);
            event.accept(GRAVITONITA_ORE);
            event.accept(PHOTONITA_ORE);
            event.accept(SPINORITA_ORE);
            event.accept(ENTANGLION_ORE);
            event.accept(SUPERCONDUTITA_ORE);
            event.accept(DEEPSLATE_QUANTUMITE_ORE);
            event.accept(DEEPSLATE_NEUTRINIO_ORE);
            event.accept(DEEPSLATE_GRAVITONITA_ORE);
            event.accept(DEEPSLATE_PHOTONITA_ORE);
            event.accept(DEEPSLATE_SPINORITA_ORE);
            event.accept(DEEPSLATE_ENTANGLION_ORE);
            event.accept(DEEPSLATE_SUPERCONDUTITA_ORE);
            event.accept(NETHER_QUANTUMITE_ORE);
            event.accept(NETHER_NEUTRINIO_ORE);
            event.accept(NETHER_GRAVITONITA_ORE);
            event.accept(NETHER_SPINORITA_ORE);
            event.accept(NETHER_ENTANGLION_ORE);
            event.accept(NETHER_SUPERCONDUTITA_ORE);
            event.accept(END_QUANTUMITE_ORE);
            event.accept(END_NEUTRINIO_ORE);
            event.accept(END_GRAVITONITA_ORE);
            event.accept(END_SPINORITA_ORE);
            event.accept(END_ENTANGLION_ORE);
            event.accept(END_SUPERCONDUTITA_ORE);

            event.accept(QUANTUMITE_BLOCK);
            event.accept(NEUTRINIO_BLOCK);
            event.accept(GRAVITONITA_BLOCK);
            event.accept(PHOTONITA_BLOCK);
            event.accept(SPINORITA_BLOCK);
            event.accept(ENTANGLION_BLOCK);
            event.accept(SUPERCONDUTITA_BLOCK);
        }
        if(event.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
            event.accept(QUANTUMITE_REFINER);
            event.accept(NEUTRINIO_EXTRACTOR);
            event.accept(GRAVITONITA_COMPRESSOR);
            event.accept(PHOTONITA_INFUSER);
            event.accept(SPINORITA_ASSEMBLER);
            event.accept(ENTANGLION_TRANSMITTER);
            event.accept(SUPERCONDUTITA_FORGE);
        }
    }
}
