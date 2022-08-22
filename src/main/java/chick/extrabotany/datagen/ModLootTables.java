package chick.extrabotany.datagen;

import chick.extrabotany.ExtraBotany;
import chick.extrabotany.common.ModBlocks;
import chick.extrabotany.common.ModItems;
import chick.extrabotany.common.blocks.ModSubtiles;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.Registry;
import net.minecraft.data.DataGenerator;
import vazkii.botania.common.block.BlockSpecialFlower;

import static net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer;

public class ModLootTables extends BaseLootTableProvider
{

    public ModLootTables(DataGenerator dataGeneratorIn)
    {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables()
    {
        //lootTables.put(
        //        ModBlocks.YLG_ORE.get(),
        //        createSilkTouchTable("yeluogui_ore", ModBlocks.YLG_ORE.get(), ModItems.RAW_YLG_CHUNK.get(), 1, 3)
        //);
        lootTables.put(ModBlocks.DIMENSION_CATALYST.get(),createSimpleTable("dimension_catalyst",ModBlocks.DIMENSION_CATALYST.get()));

        lootTables.put(ModSubtiles.omniviolet, createSimpleTable("omniviolet", ModSubtiles.omniviolet));
        lootTables.put(ModSubtiles.omnivioletFloating, createSimpleTable("floating_omniviolet", ModSubtiles.omnivioletFloating));
        lootTables.put(ModSubtiles.reikarorchid, createSimpleTable("reikarorchid", ModSubtiles.reikarorchid));
        lootTables.put(ModSubtiles.reikarorchidFloating, createSimpleTable("floating_reikarorchid", ModSubtiles.reikarorchidFloating));

        lootTables.put(ModSubtiles.serenitian, createSimpleTable("serenitian", ModSubtiles.serenitian));
        lootTables.put(ModSubtiles.serenitianFloating, createSimpleTable("floating_serenitian", ModSubtiles.serenitianFloating));
        lootTables.put(ModSubtiles.annoying, createSimpleTable("annoying", ModSubtiles.annoying));
        lootTables.put(ModSubtiles.annoyingFloating, createSimpleTable("floating_annoying", ModSubtiles.annoyingFloating));

    }
}