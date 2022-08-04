package chick.extrabotany.common.blocks;

import chick.extrabotany.ExtraBotany;
import chick.extrabotany.common.blocks.functional.SubTileSerenitian;
import chick.extrabotany.common.blocks.generating.SubTileGeminiOrchid;
import chick.extrabotany.common.blocks.generating.SubTileMoonlightLily;
import chick.extrabotany.common.blocks.generating.SubTileOmniViolet;
import chick.extrabotany.common.blocks.generating.SubTileSunshineLily;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import vazkii.botania.api.block.IWandHUD;
import vazkii.botania.api.subtile.TileEntityFunctionalFlower;
import vazkii.botania.api.subtile.TileEntityGeneratingFlower;
import vazkii.botania.common.block.BlockFloatingSpecialFlower;
import vazkii.botania.common.block.BlockSpecialFlower;
import vazkii.botania.common.block.tile.ModTiles;
import vazkii.botania.common.item.block.ItemBlockSpecialFlower;
import vazkii.botania.xplat.IXplatAbstractions;

import java.util.*;
import java.util.function.BiConsumer;

public class ModSubtiles
{
    private static final Item.Properties props = new Item.Properties().tab(ExtraBotany.ITEM_GROUP);
    private static final BlockBehaviour.Properties FLOWER_PROPS = BlockBehaviour.Properties.copy(Blocks.POPPY);
    private static final BlockBehaviour.Properties FLOATING_PROPS = BlockBehaviour.Properties.of(Material.DIRT).strength(0.5F).sound(SoundType.GRAVEL).lightLevel(s -> 15);


    //generating
    public static final Block sunshinelily = new BlockSpecialFlower(MobEffects.ABSORPTION, 10, FLOWER_PROPS, () -> ModSubtiles.SUNSHINELILY);
    public static final Block sunshinelilyFloating = new BlockFloatingSpecialFlower(FLOATING_PROPS, () -> ModSubtiles.SUNSHINELILY);

    public static final Block moonlightlily = new BlockSpecialFlower(MobEffects.BLINDNESS, 10, FLOWER_PROPS, () -> ModSubtiles.MOONLIGHTLILY);
    public static final Block moonlightlilyFloating = new BlockFloatingSpecialFlower(FLOATING_PROPS, () -> ModSubtiles.MOONLIGHTLILY);
    public static final Block omniviolet = new BlockSpecialFlower(MobEffects.DAMAGE_BOOST, 10, FLOWER_PROPS, () -> ModSubtiles.OMNIVIOLET);
    public static final Block omnivioletFloating = new BlockFloatingSpecialFlower(FLOATING_PROPS, () -> ModSubtiles.OMNIVIOLET);
    public static final Block geminiorchid = new BlockSpecialFlower(MobEffects.HEALTH_BOOST, 10, FLOWER_PROPS, () -> ModSubtiles.GEMINIORCHID);
    public static final Block geminiorchidFloating = new BlockFloatingSpecialFlower(FLOATING_PROPS, () -> ModSubtiles.GEMINIORCHID);
    //functional
    public static final Block serenitian = new BlockSpecialFlower(MobEffects.ABSORPTION, 48, FLOWER_PROPS, () -> ModSubtiles.SERENITIAN);
    public static final Block serenitianFloating = new BlockFloatingSpecialFlower(FLOATING_PROPS, () -> ModSubtiles.SERENITIAN);

    //block entity types
    public static final BlockEntityType<SubTileSunshineLily> SUNSHINELILY = IXplatAbstractions.INSTANCE.createBlockEntityType(SubTileSunshineLily::new, sunshinelily, sunshinelilyFloating);
    public static final BlockEntityType<SubTileMoonlightLily> MOONLIGHTLILY = IXplatAbstractions.INSTANCE.createBlockEntityType(SubTileMoonlightLily::new, moonlightlily, moonlightlilyFloating);
    public static final BlockEntityType<SubTileOmniViolet> OMNIVIOLET = IXplatAbstractions.INSTANCE.createBlockEntityType(SubTileOmniViolet::new, omniviolet, omnivioletFloating);
    public static final BlockEntityType<SubTileGeminiOrchid> GEMINIORCHID = IXplatAbstractions.INSTANCE.createBlockEntityType(SubTileGeminiOrchid::new, geminiorchid, geminiorchidFloating);
    public static final BlockEntityType<SubTileSerenitian> SERENITIAN = IXplatAbstractions.INSTANCE.createBlockEntityType(SubTileSerenitian::new, serenitian, serenitianFloating);

    //generating items
    public static final Item sunshinelily_item = new ItemBlockSpecialFlower(sunshinelily, props);
    public static final Item sunshinelilyFloating_item = new ItemBlockSpecialFlower(sunshinelilyFloating, props);
    public static final Item moonlightlily_item = new ItemBlockSpecialFlower(moonlightlily, props);
    public static final Item moonlightlilyFloating_item = new ItemBlockSpecialFlower(moonlightlilyFloating, props);
    public static final Item omniviolet_item = new ItemBlockSpecialFlower(omniviolet, props);
    public static final Item omnivioletFloating_item = new ItemBlockSpecialFlower(omnivioletFloating, props);
    public static final Item geminiorchid_item = new ItemBlockSpecialFlower(geminiorchid, props);
    public static final Item geminiorchidFloating_item = new ItemBlockSpecialFlower(geminiorchidFloating, props);
    //functional items
    public static final Item serenitian_item = new ItemBlockSpecialFlower(serenitian, props);
    public static final Item serenitianFloating_item = new ItemBlockSpecialFlower(serenitianFloating, props);

    public static void registerBlocks(BiConsumer<Block, ResourceLocation> r)
    {
        //generating
        r.accept(sunshinelily, idfor("sunshine_lily"));
        r.accept(moonlightlily, idfor("moonlight_lily"));
        r.accept(omniviolet, idfor("omni_violet"));
        r.accept(geminiorchid, idfor("gemini_orchid"));
        r.accept(sunshinelilyFloating, floating(idfor("sunshine_lily")));
        r.accept(moonlightlilyFloating, floating(idfor("moonlight_lily")));
        r.accept(omnivioletFloating, floating(idfor("omni_violet")));
        r.accept(geminiorchidFloating, floating(idfor("gemini_orchid")));
        //functional
        r.accept(serenitian, idfor("serenitian"));
        r.accept(serenitianFloating, floating(idfor("serenitian")));
    }

    public static void registerItemBlocks(BiConsumer<Item, ResourceLocation> r)
    {
        //generating
        r.accept(sunshinelily_item, getId(sunshinelily));
        r.accept(moonlightlily_item, getId(moonlightlily));
        r.accept(omniviolet_item, getId(omniviolet));
        r.accept(geminiorchid_item, getId(geminiorchid));
        r.accept(sunshinelilyFloating_item, getId(sunshinelilyFloating));
        r.accept(moonlightlilyFloating_item, getId(moonlightlilyFloating));
        r.accept(omnivioletFloating_item, getId(omnivioletFloating));
        r.accept(geminiorchidFloating_item, getId(geminiorchidFloating));
        //functional
        r.accept(serenitian_item, getId(serenitian));
        r.accept(serenitianFloating_item, getId(serenitianFloating));
    }

    public static void registerWandHudCaps(ModTiles.BECapConsumer<IWandHUD> consumer)
    {
        consumer.accept(be -> new TileEntityGeneratingFlower.GeneratingWandHud<>((TileEntityGeneratingFlower) be),
                SUNSHINELILY, MOONLIGHTLILY, OMNIVIOLET, GEMINIORCHID);
        consumer.accept(be -> new TileEntityFunctionalFlower.FunctionalWandHud<>((TileEntityFunctionalFlower) be),
                SERENITIAN);
    }

    public static void registerTEs(BiConsumer<BlockEntityType<?>, ResourceLocation> r)
    {
        r.accept(SUNSHINELILY, getId(sunshinelily));
        r.accept(MOONLIGHTLILY, getId(moonlightlily));
        r.accept(OMNIVIOLET, getId(omniviolet));
        r.accept(GEMINIORCHID, getId(geminiorchid));
        //functional
        r.accept(SERENITIAN, getId(serenitian));
    }


    private static ResourceLocation getId(Block b)
    {
        return new ResourceLocation(ExtraBotany.MODID, b.getRegistryName().getPath());
    }

    private static ResourceLocation floating(ResourceLocation orig)
    {
        return new ResourceLocation(ExtraBotany.MODID, "floating_" + orig.getPath());
    }

    private static ResourceLocation idfor(String path)
    {
        return new ResourceLocation(ExtraBotany.MODID, path);
    }
}
