package com.chinaex123.mooncake_delight.dataGen;

import com.chinaex123.mooncake_delight.MooncakeDelight;
import com.chinaex123.mooncake_delight.block.Crops.SesameCrop;
import com.chinaex123.mooncake_delight.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.function.Function;

public class ModBlockStatesProvider extends BlockStateProvider {
    public ModBlockStatesProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MooncakeDelight.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        crop(ModBlocks.SESAME_CROP.get(), "sesame_crop_stage", SesameCrop.AGE);
    }

    public void crop(CropBlock block, String name, IntegerProperty property) {
        Function<BlockState, ConfiguredModel[]> function = state ->
                cropStates(state, name, property);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] cropStates(BlockState state, String modelName, IntegerProperty property) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(property),
                ResourceLocation.fromNamespaceAndPath(MooncakeDelight.MOD_ID, "block/" + modelName + state.getValue(property))).renderType("cutout"));

        return models;
    }

//    public void crossCrop(CropBlock block, String name, IntegerProperty property) {
//        Function<BlockState, ConfiguredModel[]> function = state ->
//                crossStates(state, name, property);
//
//        getVariantBuilder(block).forAllStates(function);
//    }

//    private ConfiguredModel[] crossStates(BlockState state, String modelName, IntegerProperty property) {
//        ConfiguredModel[] models = new ConfiguredModel[1];
//        models[0] = new ConfiguredModel(models().cross(modelName + state.getValue(property),
//                ResourceLocation.fromNamespaceAndPath(MooncakeDelight.MOD_ID, "block/" + modelName + state.getValue(property))).renderType("cutout"));
//
//        return models;
//    }

//    private void blockItem(DeferredBlock<?> block) {
//        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(MooncakeDelight.MOD_ID + ":block/" + block.getId().getPath()));
//    }
//    private void blockItem(DeferredBlock<?> block, String append) {
//        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(MooncakeDelight.MOD_ID + ":block/" + block.getId().getPath() + append));
//    }
}
