package net.eteriumnetwork.quantum_praeda.core.init.datagen.server;

import net.eteriumnetwork.quantum_praeda.QuantumPraeda;
import net.eteriumnetwork.quantum_praeda.core.init.RegistryBlock;
import net.eteriumnetwork.quantum_praeda.core.init.RegistryItem;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.Consumer;

public class QPRecipeProvider extends RecipeProvider implements IConditionBuilder {

    private final List<ItemLike> SUPERCONDUTITA_ORE_FUNGIBLE = List.of(
        RegistryBlock.DEEPSLATE_SUPERCONDUTITA_ORE.get(),
        RegistryBlock.NETHER_SUPERCONDUTITA_ORE.get()
    );
    private final List<ItemLike> SPINORITA_ORE_FUNGIBLE = List.of(
        RegistryBlock.DEEPSLATE_SPINORITA_ORE.get(),
        RegistryBlock.NETHER_SPINORITA_ORE.get(),
        RegistryBlock.END_SPINORITA_ORE.get()
    );
    private final List<ItemLike> NEUTRINIO_ORE_FUNGIBLE = List.of(
        RegistryBlock.DEEPSLATE_NEUTRINIO_ORE.get(),
        RegistryBlock.END_NEUTRINIO_ORE.get()
    );
    private final List<ItemLike> PHOTONITA_ORE_FUNGIBLE = List.of(
        RegistryBlock.PHOTONITA_ORE.get()
    );
    private final List<ItemLike> QUANTUMITE_ORE_FUNGIBLE = List.of(
        RegistryBlock.QUANTUMITE_ORE.get(),
        RegistryBlock.DEEPSLATE_QUANTUMITE_ORE.get(),
        RegistryBlock.NETHER_QUANTUMITE_ORE.get(),
        RegistryBlock.END_QUANTUMITE_ORE.get()
    );

    public QPRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> writer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RegistryBlock.ENTANGLION_BLOCK.get())
            .pattern("EEE")
            .pattern("EEE")
            .pattern("EEE")
            .define('E', RegistryItem.ENTANGLION_CRYSTAL::get)
            .group(QuantumPraeda.MODID+":crafting_block")
            .unlockedBy(getHasName(RegistryItem.ENTANGLION_CRYSTAL::get), has(RegistryItem.ENTANGLION_CRYSTAL::get))
        .save(writer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RegistryItem.ENTANGLION_CRYSTAL::get)
            .requires(RegistryBlock.ENTANGLION_BLOCK.get())
            .group(QuantumPraeda.MODID+":crafting_item")
            .unlockedBy(getHasName(RegistryBlock.ENTANGLION_BLOCK.get()), has(RegistryBlock.ENTANGLION_BLOCK.get()))
        .save(writer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RegistryBlock.GRAVITONITA_BLOCK.get())
            .pattern("GGG")
            .pattern("GGG")
            .pattern("GGG")
            .define('G', RegistryItem.GRAVITONITA_RAW::get)
            .group(QuantumPraeda.MODID+":crafting_block")
            .unlockedBy(getHasName(RegistryItem.GRAVITONITA_RAW::get), has(RegistryItem.GRAVITONITA_RAW::get))
        .save(writer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RegistryItem.GRAVITONITA_RAW::get)
            .requires(RegistryBlock.GRAVITONITA_BLOCK.get())
            .group(QuantumPraeda.MODID+":crafting_item")
            .unlockedBy(getHasName(RegistryBlock.GRAVITONITA_BLOCK.get()), has(RegistryBlock.GRAVITONITA_BLOCK.get()))
        .save(writer);

        oreBlasting(
            writer,
            SUPERCONDUTITA_ORE_FUNGIBLE,
            RecipeCategory.MISC,
            RegistryItem.SUPERCONDUTITA_RAW.get(),
            0.25f,
            100,
            QuantumPraeda.MODID+":crafting_ore_processing"
        );

        oreSmelting(
            writer,
            SUPERCONDUTITA_ORE_FUNGIBLE,
            RecipeCategory.MISC,
            RegistryItem.SUPERCONDUTITA_RAW.get(),
            0.25f,
            100,
            QuantumPraeda.MODID+":crafting_ore_processing"
        );

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RegistryBlock.SUPERCONDUTITA_BLOCK.get())
            .pattern("SSS")
            .pattern("SSS")
            .pattern("SSS")
            .define('S', RegistryItem.SUPERCONDUTITA_RAW::get)
            .group(QuantumPraeda.MODID+":crafting_block")
            .unlockedBy(getHasName(RegistryItem.SUPERCONDUTITA_RAW::get), has(RegistryItem.SUPERCONDUTITA_RAW::get))
        .save(writer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RegistryItem.SUPERCONDUTITA_RAW::get)
            .requires(RegistryBlock.SUPERCONDUTITA_BLOCK.get())
            .group(QuantumPraeda.MODID+":crafting_item")
            .unlockedBy(getHasName(RegistryBlock.SUPERCONDUTITA_BLOCK.get()), has(RegistryBlock.SUPERCONDUTITA_BLOCK.get()))
        .save(writer);

        oreBlasting(
            writer,
            SPINORITA_ORE_FUNGIBLE,
            RecipeCategory.MISC,
            RegistryItem.SPINORITA_INGOT.get(),
            0.25f,
            100,
            QuantumPraeda.MODID+":crafting_ore_processing"
        );

        oreSmelting(
            writer,
            SPINORITA_ORE_FUNGIBLE,
            RecipeCategory.MISC,
            RegistryItem.SPINORITA_INGOT.get(),
            0.25f,
            100,
            QuantumPraeda.MODID+":crafting_ore_processing"
        );
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RegistryBlock.SPINORITA_BLOCK.get())
            .pattern("SSS")
            .pattern("SSS")
            .pattern("SSS")
            .define('S', RegistryItem.SPINORITA_INGOT::get)
            .group(QuantumPraeda.MODID+":crafting_block")
            .unlockedBy(getHasName(RegistryItem.SPINORITA_INGOT::get), has(RegistryItem.SPINORITA_INGOT::get))
        .save(writer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RegistryItem.SPINORITA_INGOT::get)
            .requires(RegistryBlock.SPINORITA_BLOCK.get())
            .group(QuantumPraeda.MODID+":crafting_item")
            .unlockedBy(getHasName(RegistryBlock.SPINORITA_BLOCK.get()), has(RegistryBlock.SPINORITA_BLOCK.get()))
        .save(writer);

        oreBlasting(
            writer,
            NEUTRINIO_ORE_FUNGIBLE,
            RecipeCategory.MISC,
            RegistryItem.NEUTRINIO_RAW.get(),
            0.25f,
            100,
            QuantumPraeda.MODID+":crafting_ore_processing"
        );

        oreSmelting(
            writer,
            NEUTRINIO_ORE_FUNGIBLE,
            RecipeCategory.MISC,
            RegistryItem.NEUTRINIO_RAW.get(),
            0.25f,
            100,
            QuantumPraeda.MODID+":crafting_ore_processing"
        );

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RegistryBlock.NEUTRINIO_BLOCK.get())
            .pattern("NNN")
            .pattern("NNN")
            .pattern("NNN")
            .define('N', RegistryItem.NEUTRINIO_RAW::get)
            .group(QuantumPraeda.MODID+":crafting_block")
            .unlockedBy(getHasName(RegistryItem.NEUTRINIO_RAW::get), has(RegistryItem.NEUTRINIO_RAW::get))
        .save(writer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RegistryItem.NEUTRINIO_RAW::get)
            .requires(RegistryBlock.NEUTRINIO_BLOCK.get())
            .group(QuantumPraeda.MODID+":crafting_item")
            .unlockedBy(getHasName(RegistryBlock.NEUTRINIO_BLOCK.get()), has(RegistryBlock.NEUTRINIO_BLOCK.get()))
        .save(writer);

        oreBlasting(
            writer,
            PHOTONITA_ORE_FUNGIBLE,
            RecipeCategory.MISC,
            RegistryItem.PHOTONITA_RAW.get(),
            0.25f,
            100,
            QuantumPraeda.MODID+":crafting_ore_processing"
        );

        oreSmelting(
            writer,
            PHOTONITA_ORE_FUNGIBLE,
            RecipeCategory.MISC,
            RegistryItem.PHOTONITA_RAW.get(),
            0.25f,
            100,
            QuantumPraeda.MODID+":crafting_ore_processing"
        );

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RegistryBlock.PHOTONITA_BLOCK.get())
            .pattern("PPP")
            .pattern("PPP")
            .pattern("PPP")
            .define('P', RegistryItem.PHOTONITA_RAW::get)
            .group(QuantumPraeda.MODID+":crafting_block")
            .unlockedBy(getHasName(RegistryItem.PHOTONITA_RAW::get), has(RegistryItem.PHOTONITA_RAW::get))
        .save(writer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RegistryItem.PHOTONITA_RAW::get)
            .requires(RegistryBlock.PHOTONITA_BLOCK.get())
            .group(QuantumPraeda.MODID+":crafting_item")
            .unlockedBy(getHasName(RegistryBlock.PHOTONITA_BLOCK.get()), has(RegistryBlock.PHOTONITA_BLOCK.get()))
        .save(writer);

        oreBlasting(
            writer,
            QUANTUMITE_ORE_FUNGIBLE,
            RecipeCategory.MISC,
            RegistryItem.QUANTUMITE_RAW.get(),
            0.25f,
            100,
            QuantumPraeda.MODID+":crafting_ore_processing"
        );

        oreSmelting(
            writer,
            QUANTUMITE_ORE_FUNGIBLE,
            RecipeCategory.MISC,
            RegistryItem.QUANTUMITE_RAW.get(),
            0.25f,
            100,
            QuantumPraeda.MODID+":crafting_ore_processing"
        );

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RegistryBlock.QUANTUMITE_BLOCK.get())
            .pattern("QQQ")
            .pattern("QQQ")
            .pattern("QQQ")
            .define('Q', RegistryItem.QUANTUMITE_RAW::get)
            .group(QuantumPraeda.MODID+":crafting_block")
            .unlockedBy(getHasName(RegistryItem.QUANTUMITE_RAW::get), has(RegistryItem.QUANTUMITE_RAW::get))
        .save(writer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RegistryItem.QUANTUMITE_RAW::get)
            .requires(RegistryBlock.QUANTUMITE_BLOCK.get())
            .group(QuantumPraeda.MODID+":crafting_item")
            .unlockedBy(getHasName(RegistryBlock.QUANTUMITE_BLOCK.get()), has(RegistryBlock.QUANTUMITE_BLOCK.get()))
        .save(writer);
    }

    protected static void oreSmelting(
        @NotNull Consumer<FinishedRecipe> finishedRecipeConsumer,
        List<ItemLike> ingredients,
        @NotNull RecipeCategory category,
        @NotNull ItemLike result,
        float experience,
        int cookingTIme,
        @NotNull String group
    ) {
        oreCooking(
            finishedRecipeConsumer,
            RecipeSerializer.SMELTING_RECIPE,
            ingredients,
            category,
            result,
            experience,
            cookingTIme,
            group,
            "_from_smelting"
        );
    }

    protected static void oreBlasting(
        @NotNull Consumer<FinishedRecipe> finishedRecipeConsumer,
        List<ItemLike> ingredients,
        @NotNull RecipeCategory category,
        @NotNull ItemLike result,
        float experience,
        int cookingTime,
        @NotNull String group
    ) {
        oreCooking(
            finishedRecipeConsumer,
            RecipeSerializer.BLASTING_RECIPE,
            ingredients,
            category,
            result,
            experience,
            cookingTime,
            group,
            "_from_blasting"
        );
    }

    protected static void oreCooking(
        @NotNull Consumer<FinishedRecipe> finishedRecipeConsumer,
        @NotNull RecipeSerializer<? extends AbstractCookingRecipe> cookingSerializer,
        List<ItemLike> ingredients,
        @NotNull RecipeCategory category,
        @NotNull ItemLike result,
        float experience,
        int cookingTime,
        @NotNull String group,
        String recipeName
    ) {
        for(ItemLike itemlike : ingredients) {
            SimpleCookingRecipeBuilder.generic(
                Ingredient.of(itemlike),
                category,
                result,
                experience,
                cookingTime,
                cookingSerializer
            ).group(group).unlockedBy(
                getHasName(itemlike),
                has(itemlike)
            ).save(
                finishedRecipeConsumer,
                QuantumPraeda.MODID + ":" + getItemName(result) + recipeName + "_" + getItemName(itemlike)
            );
        }
    }
}
