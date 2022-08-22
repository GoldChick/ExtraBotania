package chick.extrabotany.datagen.recipes;

import chick.extrabotany.common.ModBlocks;
import chick.extrabotany.common.ModItems;
import chick.extrabotany.common.crafting.*;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;
import vazkii.botania.common.lib.ModTags;

import java.util.function.Consumer;

import static chick.extrabotany.ExtraBotany.MODID;
import static vazkii.botania.common.block.ModSubtiles.bergamute;

public class ModCraftingTableRecipes extends RecipeProvider
{
    public ModCraftingTableRecipes(DataGenerator generatorIn)
    {
        super(generatorIn);
    }

    @Override
    public @NotNull String getName()
    {
        return "extrabotany craftingTable recipes";
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer)
    {
        SpecialRecipeBuilder.special(CocktailRecipe.SERIALIZER)
                .save(consumer, "cocktail_upgrade_craft");
        SpecialRecipeBuilder.special(LenPotionRecipe.SERIALIZER)
                .save(consumer, "len_potion_bind_craft");
        SpecialRecipeBuilder.special(GrenadeRecipe.SERIALIZER)
                .save(consumer, "grenade_bind_craft");
        SpecialRecipeBuilder.special(DupeRuneRecipe.SERIALIZER)
                .save(consumer, "rune_dupe_craft");
        SpecialRecipeBuilder.special(GoldClothRecipe.SERIALIZER)
                .save(consumer, "gold_cloth_craft");

        ShapedRecipeBuilder.shaped(ModItems.MANA_READER.get())
                .pattern(" xo")
                .pattern("azx")
                .pattern("za ")
                .define('o', vazkii.botania.common.item.ModItems.manaDiamond)
                .define('x', vazkii.botania.common.item.ModItems.manaPowder)
                .define('z', vazkii.botania.common.item.ModItems.livingwoodTwig)
                .define('a', ModItems.NIGHTMAREFUEL_PROP.get())
                .group(MODID)
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.NIGHTMAREFUEL_PROP.get()))
                .save(consumer, "manareader");
        ShapedRecipeBuilder.shaped(ModItems.THE_CHAOS.get())
                .pattern(" x ")
                .pattern("xzb")
                .pattern(" b ")
                .define('x', ModItems.SHADOW_INGOT.get())
                .define('z', ModItems.SPIRIT_PROP.get())
                .define('b', ModItems.PHOTON_INGOT.get())
                .group(MODID)
                .unlockedBy("ingots", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.SHADOW_INGOT.get(), ModItems.PHOTON_INGOT.get()))
                .save(consumer, "the_chaos");
        ShapedRecipeBuilder.shaped(ModItems.THE_ORIGIN.get())
                .pattern(" x ")
                .pattern("xzb")
                .pattern(" b ")
                .define('x', vazkii.botania.common.item.ModItems.terrasteel)
                .define('z', Blocks.POINTED_DRIPSTONE)
                .define('b', ModItems.AERIALITE_INGOT.get())
                .group(MODID)
                .unlockedBy("ingots", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.AERIALITE_INGOT.get(), ModItems.PHOTON_INGOT.get()))
                .save(consumer, "the_origin");
        ShapedRecipeBuilder.shaped(ModItems.THE_END.get())
                .pattern(" x ")
                .pattern("xzb")
                .pattern(" b ")
                .define('x', ModItems.ORICHALCOS.get())
                .define('z', Items.ENDER_EYE)
                .define('b', vazkii.botania.common.item.ModItems.gaiaIngot)
                .group(MODID)
                .unlockedBy("ingots", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ORICHALCOS.get()))
                .save(consumer, "the_end");
        ShapedRecipeBuilder.shaped(ModItems.EMPTY_BOTTLE.get())
                .pattern("x x")
                .pattern("x x")
                .pattern(" x ")
                .define('x', vazkii.botania.common.block.ModBlocks.manaGlass)
                .group(MODID)
                .unlockedBy("glass", InventoryChangeTrigger.TriggerInstance.hasItems(vazkii.botania.common.block.ModBlocks.manaGlass))
                .save(consumer, "empty_bottle");
        ShapedRecipeBuilder.shaped(ModItems.ROD_OF_DISCORD.get())
                .pattern(" ag")
                .pattern(" xa")
                .pattern("x  ")
                .define('x', vazkii.botania.common.item.ModItems.livingwoodTwig)
                .define('a', vazkii.botania.common.item.ModItems.pixieDust)
                .define('g', ModItems.THE_CHAOS.get())
                .group(MODID)
                .unlockedBy("thechaos", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.THE_CHAOS.get()))
                .save(consumer, "rodofdiscord");
        ShapedRecipeBuilder.shaped(ModItems.JINGWEI_FEATHER.get())
                .pattern("gag")
                .pattern("bxb")
                .pattern("geg")
                .define('x', Items.FEATHER)
                .define('b', vazkii.botania.common.item.ModItems.runeFire)
                .define('a', vazkii.botania.common.item.ModItems.pixieDust)
                .define('g', vazkii.botania.common.item.ModItems.redQuartz)
                .define('e', vazkii.botania.common.item.ModItems.lensFire)
                .group(MODID)
                .unlockedBy("feather", InventoryChangeTrigger.TriggerInstance.hasItems(Items.FEATHER))
                .save(consumer, "jingweifeather");
        ShapedRecipeBuilder.shaped(ModItems.RED_SCARF.get())
                .pattern("aaa")
                .pattern("axa")
                .pattern("aaa")
                .define('x', ModItems.SPIRIT_PROP.get())
                .define('a', vazkii.botania.common.item.ModItems.redPetal)
                .group(MODID)
                .unlockedBy("redPetal", InventoryChangeTrigger.TriggerInstance.hasItems(vazkii.botania.common.item.ModItems.redPetal))
                .save(consumer, "redscarf");
        ShapedRecipeBuilder.shaped(ModItems.FOX_EAR.get())
                .pattern("aaa")
                .pattern("axa")
                .pattern("aaa")
                .define('x', ModItems.SPIRIT_PROP.get())
                .define('a', vazkii.botania.common.item.ModItems.pinkPetal)
                .group(MODID)
                .unlockedBy("pinkPetal", InventoryChangeTrigger.TriggerInstance.hasItems(vazkii.botania.common.item.ModItems.pinkPetal))
                .save(consumer, "foxear");
        ShapedRecipeBuilder.shaped(ModItems.BLACK_GLASSES.get())
                .pattern("aaa")
                .pattern("axa")
                .pattern("aaa")
                .define('x', ModItems.SPIRIT_PROP.get())
                .define('a', vazkii.botania.common.item.ModItems.blackPetal)
                .group(MODID)
                .unlockedBy("blackPetal", InventoryChangeTrigger.TriggerInstance.hasItems(vazkii.botania.common.item.ModItems.blackPetal))
                .save(consumer, "blackglasses");
        ShapedRecipeBuilder.shaped(ModItems.STONE_MASK.get())
                .pattern("aaa")
                .pattern("axa")
                .pattern("aaa")
                .define('x', ModItems.SPIRIT_PROP.get())
                .define('a', vazkii.botania.common.item.ModItems.grayPetal)
                .group(MODID)
                .unlockedBy("grayPetal", InventoryChangeTrigger.TriggerInstance.hasItems(vazkii.botania.common.item.ModItems.grayPetal))
                .save(consumer, "stonemask");
        ShapedRecipeBuilder.shaped(ModItems.SAGES_MANA_RING.get())
                .pattern("aba")
                .pattern("cxc")
                .pattern("aca")
                .define('x', vazkii.botania.common.item.ModItems.manaRingGreater)
                .define('a', vazkii.botania.common.item.ModItems.terrasteel)
                .define('b', ModItems.HERO_MEDAL.get())
                .define('c', vazkii.botania.common.item.ModItems.manaTablet)
                .group(MODID)
                .unlockedBy("heromedal", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.HERO_MEDAL.get()))
                .save(consumer, "sages_mana_ring");
        ShapedRecipeBuilder.shaped(ModBlocks.DIMENSION_CATALYST.get())
                .pattern("aba")
                .pattern("gxw")
                .pattern("aca")
                .define('x', vazkii.botania.common.block.ModBlocks.alchemyCatalyst)
                .define('a', vazkii.botania.common.block.ModBlocks.livingrock)
                .define('b', Items.ENDER_PEARL)
                .define('g', Items.DIAMOND)
                .define('w', Items.BLAZE_ROD)
                .define('c', ModItems.SPIRITFUEL_PROP.get())
                .group(MODID)
                .unlockedBy("alchemycatalyst", InventoryChangeTrigger.TriggerInstance.hasItems(vazkii.botania.common.block.ModBlocks.alchemyCatalyst))
                .save(consumer, "dimension_catalyst");
        ShapedRecipeBuilder.shaped(ModItems.PEACE_AMULET.get())
                .pattern(" a ")
                .pattern("axa")
                .pattern(" a ")
                .define('x', vazkii.botania.common.block.ModBlocks.livingwood)
                .define('a', vazkii.botania.common.block.ModBlocks.livingrock)
                .group(MODID)
                .unlockedBy("rock", InventoryChangeTrigger.TriggerInstance.hasItems(vazkii.botania.common.block.ModBlocks.livingrock))
                .save(consumer, "peace_amulet");
        ShapedRecipeBuilder.shaped(ModItems.GOLD_CLOTH.get())
                .pattern("bab")
                .pattern("axa")
                .pattern("bab")
                .define('x', Items.GOLD_INGOT)
                .define('a', vazkii.botania.common.item.ModItems.manaweaveCloth)
                .define('b', vazkii.botania.common.item.ModItems.lifeEssence)
                .group(MODID)
                .unlockedBy("life_essence", InventoryChangeTrigger.TriggerInstance.hasItems(vazkii.botania.common.item.ModItems.lifeEssence))
                .save(consumer, "gold_cloth");
        ShapedRecipeBuilder.shaped(ModItems.UNIVERSAL_PETAL.get(), 8)
                .pattern("aaa")
                .pattern("axa")
                .pattern("aaa")
                .define('x', vazkii.botania.common.item.ModItems.lifeEssence)
                .define('a', ModTags.Items.PETALS)
                .group(MODID)
                .unlockedBy("life_essence", InventoryChangeTrigger.TriggerInstance.hasItems(vazkii.botania.common.item.ModItems.lifeEssence))
                .save(consumer, "universal_petal");

        shapelessRecipes(consumer);
        weaponRecipes(consumer);
        armorRecipes(consumer);
    }

    private void shapelessRecipes(Consumer<FinishedRecipe> consumer)
    {
        ShapelessRecipeBuilder.shapeless(ModItems.GILDED_MASHED_POTATO.get())
                .requires(ModItems.GILDED_POTATO.get())
                .requires(Items.BOWL)
                .requires(Items.SUGAR)
                .group(MODID)
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.GILDED_POTATO.get()))
                .save(consumer, "gildedmashedpotato");
        ShapelessRecipeBuilder.shapeless(ModItems.LEN_SMELT.get())
                .requires(vazkii.botania.common.item.ModItems.lensNormal)
                .requires(vazkii.botania.common.item.ModItems.manaPowder)
                .requires(vazkii.botania.common.item.ModItems.runeFire)
                .group(MODID)
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(vazkii.botania.common.item.ModItems.lensNormal))
                .save(consumer, "len_smelt");
        ShapelessRecipeBuilder.shapeless(ModItems.LEN_POTION.get())
                .requires(vazkii.botania.common.item.ModItems.lensNormal)
                .requires(vazkii.botania.common.item.ModItems.manaPowder)
                .requires(vazkii.botania.common.item.ModItems.runeSpring)
                .requires(vazkii.botania.common.item.ModItems.dragonstone)
                .requires(vazkii.botania.common.item.ModItems.enderAirBottle)
                .group(MODID)
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(vazkii.botania.common.item.ModItems.lensNormal))
                .save(consumer, "len_potion");
        ShapelessRecipeBuilder.shapeless(ModItems.LEN_TRACE.get())
                .requires(vazkii.botania.common.item.ModItems.lensNormal)
                .requires(vazkii.botania.common.item.ModItems.runeGreed)
                .requires(vazkii.botania.common.item.ModItems.manaPowder)
                .group(MODID)
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(vazkii.botania.common.item.ModItems.lensNormal))
                .save(consumer, "len_trace");
        ShapelessRecipeBuilder.shapeless(ModItems.TICKET.get())
                .requires(vazkii.botania.common.item.ModItems.gaiaIngot)
                .requires(ModItems.THE_CHAOS.get())
                .group(MODID)
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(vazkii.botania.common.item.ModItems.gaiaIngot))
                .save(consumer, "ticket");
        ShapelessRecipeBuilder.shapeless(ModItems.ELEMENT_RUNE.get(), 8)
                .requires(vazkii.botania.common.item.ModItems.lifeEssence)
                .requires(vazkii.botania.common.item.ModItems.runeFire)
                .requires(vazkii.botania.common.item.ModItems.runeAir)
                .requires(vazkii.botania.common.item.ModItems.runeEarth)
                .requires(vazkii.botania.common.item.ModItems.runeWater)
                .requires(vazkii.botania.common.item.ModItems.runeSpring)
                .requires(vazkii.botania.common.item.ModItems.runeSummer)
                .requires(vazkii.botania.common.item.ModItems.runeAutumn)
                .requires(vazkii.botania.common.item.ModItems.runeWinter)
                .group(MODID)
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(vazkii.botania.common.item.ModItems.lifeEssence))
                .save(consumer, "element_rune");
        ShapelessRecipeBuilder.shapeless(ModItems.SIN_RUNE.get(), 8)
                .requires(vazkii.botania.common.item.ModItems.lifeEssence)
                .requires(vazkii.botania.common.item.ModItems.runeMana)
                .requires(vazkii.botania.common.item.ModItems.runeGreed)
                .requires(vazkii.botania.common.item.ModItems.runeEnvy)
                .requires(vazkii.botania.common.item.ModItems.runeWrath)
                .requires(vazkii.botania.common.item.ModItems.runeSloth)
                .requires(vazkii.botania.common.item.ModItems.runeGluttony)
                .requires(vazkii.botania.common.item.ModItems.runePride)
                .requires(vazkii.botania.common.item.ModItems.runeLust)
                .group(MODID)
                .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(vazkii.botania.common.item.ModItems.lifeEssence))
                .save(consumer, "sin_rune");

    }

    private void weaponRecipes(Consumer<FinishedRecipe> consumer)
    {
        ShapedRecipeBuilder.shaped(ModItems.SHADOW_KATANA.get())
                .pattern("x  ")
                .pattern("x  ")
                .pattern("#  ")
                .define('x', ModItems.SHADOW_INGOT.get())
                .define('#', bergamute)
                .group(MODID)
                .unlockedBy("shadowium", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.SHADOW_INGOT.get()))
                .save(consumer, "shadow_katana");
        ShapedRecipeBuilder.shaped(ModItems.TRUE_SHADOW_KATANA.get())
                .pattern(" b#")
                .pattern("xab")
                .pattern("#x ")
                .define('x', vazkii.botania.common.item.ModItems.lifeEssence)
                .define('#', ModItems.SHADOW_KATANA.get())
                .define('a', ModItems.THE_ORIGIN.get())
                .define('b', Blocks.BLACKSTONE)
                .group(MODID)
                .unlockedBy("gaia", InventoryChangeTrigger.TriggerInstance.hasItems(vazkii.botania.common.item.ModItems.lifeEssence))
                .save(consumer, "true_shadow_katana");
        ShapedRecipeBuilder.shaped(ModItems.TRUE_TERRA_BLADE.get())
                .pattern(" db")
                .pattern("xad")
                .pattern("#x ")
                .define('x', vazkii.botania.common.item.ModItems.lifeEssence)
                .define('#', vazkii.botania.common.item.ModItems.terraSword)
                .define('a', ModItems.THE_ORIGIN.get())
                .define('b', vazkii.botania.common.item.ModItems.terrasteel)
                .define('d', Blocks.MOSS_BLOCK)
                .group(MODID)
                .unlockedBy("gaia", InventoryChangeTrigger.TriggerInstance.hasItems(vazkii.botania.common.item.ModItems.lifeEssence))
                .save(consumer, "true_terra_blade");
        ShapedRecipeBuilder.shaped(ModItems.TRUE_THUNSTAR_CALLER.get())
                .pattern("bdk")
                .pattern("xad")
                .pattern("#xb")
                .define('x', vazkii.botania.common.item.ModItems.lifeEssence)
                .define('#', vazkii.botania.common.item.ModItems.thunderSword)
                .define('k', vazkii.botania.common.item.ModItems.starSword)
                .define('a', ModItems.THE_ORIGIN.get())
                .define('b', Blocks.LIGHTNING_ROD)
                .define('d', ModItems.AERIALITE_INGOT.get())
                .group(MODID)
                .unlockedBy("gaia", InventoryChangeTrigger.TriggerInstance.hasItems(vazkii.botania.common.item.ModItems.lifeEssence))
                .save(consumer, "true_thunstar_caller");
        ShapedRecipeBuilder.shaped(ModItems.INFLUX_WAVER.get())
                .pattern(" bd")
                .pattern("xab")
                .pattern("#x ")
                .define('x', vazkii.botania.common.item.ModItems.gaiaIngot)
                .define('#', vazkii.botania.common.item.ModItems.terraSword)
                .define('a', ModItems.THE_ORIGIN.get())
                .define('b', ModItems.CORAL_ITEM)
                .define('d', Items.HEART_OF_THE_SEA)
                .group(MODID)
                .unlockedBy("gaia", InventoryChangeTrigger.TriggerInstance.hasItems(vazkii.botania.common.item.ModItems.lifeEssence))
                .save(consumer, "influx_waver");
    }

    private void armorRecipes(Consumer<FinishedRecipe> consumer)
    {
        ShapedRecipeBuilder.shaped(ModItems.SHADOW_WARRIOR_HELM.get())
                .pattern("xxx")
                .pattern("x x")
                .pattern("   ")
                .define('x', ModItems.SHADOW_INGOT.get())
                .group(MODID)
                .unlockedBy("shadowium", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.SHADOW_INGOT.get()))
                .save(consumer, "shadowwarrior_helm");
        ShapedRecipeBuilder.shaped(ModItems.SHADOW_WARRIOR_CHEST.get())
                .pattern("x x")
                .pattern("xxx")
                .pattern("xxx")
                .define('x', ModItems.SHADOW_INGOT.get())
                .group(MODID)
                .unlockedBy("shadowium", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.SHADOW_INGOT.get()))
                .save(consumer, "shadowwarrior_chest");
        ShapedRecipeBuilder.shaped(ModItems.SHADOW_WARRIOR_LEGS.get())
                .pattern("xxx")
                .pattern("x x")
                .pattern("x x")
                .define('x', ModItems.SHADOW_INGOT.get())
                .group(MODID)
                .unlockedBy("shadowium", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.SHADOW_INGOT.get()))
                .save(consumer, "shadowwarrior_legs");
        ShapedRecipeBuilder.shaped(ModItems.SHADOW_WARRIOR_BOOTS.get())
                .pattern("x x")
                .pattern("x x")
                .pattern("   ")
                .define('x', ModItems.SHADOW_INGOT.get())
                .group(MODID)
                .unlockedBy("shadowium", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.SHADOW_INGOT.get()))
                .save(consumer, "shadowwarrior_boots");
        ShapedRecipeBuilder.shaped(ModItems.GOBLINSLAYER_HELM.get())
                .pattern("xxx")
                .pattern("x x")
                .pattern("   ")
                .define('x', ModItems.PHOTON_INGOT.get())
                .group(MODID)
                .unlockedBy("photonium", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.PHOTON_INGOT.get()))
                .save(consumer, "goblinslayer_helm");
        ShapedRecipeBuilder.shaped(ModItems.GOBLINSLAYER_CHEST.get())
                .pattern("x x")
                .pattern("xxx")
                .pattern("xxx")
                .define('x', ModItems.PHOTON_INGOT.get())
                .group(MODID)
                .unlockedBy("photonium", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.PHOTON_INGOT.get()))
                .save(consumer, "goblinslayer_chest");
        ShapedRecipeBuilder.shaped(ModItems.GOBLINSLAYER_LEGS.get())
                .pattern("xxx")
                .pattern("x x")
                .pattern("x x")
                .define('x', ModItems.PHOTON_INGOT.get())
                .group(MODID)
                .unlockedBy("photonium", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.PHOTON_INGOT.get()))
                .save(consumer, "goblinslayer_legs");
        ShapedRecipeBuilder.shaped(ModItems.GOBLINSLAYER_BOOTS.get())
                .pattern("x x")
                .pattern("x x")
                .pattern("   ")
                .define('x', ModItems.PHOTON_INGOT.get())
                .group(MODID)
                .unlockedBy("photonium", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.PHOTON_INGOT.get()))
                .save(consumer, "goblinslayer_boots");
        ShapedRecipeBuilder.shaped(ModItems.MIKU_HELM.get())
                .pattern("xxx")
                .pattern("xax")
                .pattern("xxx")
                .define('x', vazkii.botania.common.item.ModItems.manaweaveCloth)
                .define('a', vazkii.botania.common.item.ModItems.manasteelHelm)
                .group(MODID)
                .unlockedBy("manaweave", InventoryChangeTrigger.TriggerInstance.hasItems(vazkii.botania.common.item.ModItems.manaweaveCloth))
                .save(consumer, "miku_helm");
        ShapedRecipeBuilder.shaped(ModItems.MIKU_CHEST.get())
                .pattern("xxx")
                .pattern("xax")
                .pattern("xxx")
                .define('x', vazkii.botania.common.item.ModItems.manaweaveCloth)
                .define('a', vazkii.botania.common.item.ModItems.manasteelChest)
                .group(MODID)
                .unlockedBy("manaweave", InventoryChangeTrigger.TriggerInstance.hasItems(vazkii.botania.common.item.ModItems.manaweaveCloth))
                .save(consumer, "miku_chest");
        ShapedRecipeBuilder.shaped(ModItems.MIKU_LEGS.get())
                .pattern("xxx")
                .pattern("xax")
                .pattern("xxx")
                .define('x', vazkii.botania.common.item.ModItems.manaweaveCloth)
                .define('a', vazkii.botania.common.item.ModItems.manasteelLegs)
                .group(MODID)
                .unlockedBy("manaweave", InventoryChangeTrigger.TriggerInstance.hasItems(vazkii.botania.common.item.ModItems.manaweaveCloth))
                .save(consumer, "miku_legs");
        ShapedRecipeBuilder.shaped(ModItems.MIKU_BOOTS.get())
                .pattern("xxx")
                .pattern("xax")
                .pattern("xxx")
                .define('x', vazkii.botania.common.item.ModItems.manaweaveCloth)
                .define('a', vazkii.botania.common.item.ModItems.manasteelBoots)
                .group(MODID)
                .unlockedBy("manaweave", InventoryChangeTrigger.TriggerInstance.hasItems(vazkii.botania.common.item.ModItems.manaweaveCloth))
                .save(consumer, "miku_boots");
        ShapedRecipeBuilder.shaped(ModItems.MAID_HELM.get())
                .pattern("xxx")
                .pattern("bab")
                .pattern("   ")
                .define('x', vazkii.botania.common.item.ModItems.gaiaIngot)
                .define('a', vazkii.botania.common.item.ModItems.terrasteelHelm)
                .define('b', ModItems.GOLD_CLOTH.get())
                .group(MODID)
                .unlockedBy("gaia_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(vazkii.botania.common.item.ModItems.gaiaIngot))
                .save(consumer, "maid_helm");
        ShapedRecipeBuilder.shaped(ModItems.MAID_CHEST.get())
                .pattern("b b")
                .pattern("bab")
                .pattern("xxx")
                .define('x', vazkii.botania.common.item.ModItems.gaiaIngot)
                .define('a', vazkii.botania.common.item.ModItems.terrasteelChest)
                .define('b', ModItems.GOLD_CLOTH.get())
                .group(MODID)
                .unlockedBy("gaia_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(vazkii.botania.common.item.ModItems.gaiaIngot))
                .save(consumer, "maid_chest");
        ShapedRecipeBuilder.shaped(ModItems.MAID_LEGS.get())
                .pattern("xxx")
                .pattern("bab")
                .pattern("b b")
                .define('x', vazkii.botania.common.item.ModItems.gaiaIngot)
                .define('a', vazkii.botania.common.item.ModItems.terrasteelLegs)
                .define('b', ModItems.GOLD_CLOTH.get())
                .group(MODID)
                .unlockedBy("gaia_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(vazkii.botania.common.item.ModItems.gaiaIngot))
                .save(consumer, "maid_legs");
        ShapedRecipeBuilder.shaped(ModItems.MAID_BOOTS.get())
                .pattern("   ")
                .pattern("bab")
                .pattern("xxx")
                .define('x', vazkii.botania.common.item.ModItems.gaiaIngot)
                .define('a', vazkii.botania.common.item.ModItems.terrasteelBoots)
                .define('b', ModItems.GOLD_CLOTH.get())
                .group(MODID)
                .unlockedBy("gaia_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(vazkii.botania.common.item.ModItems.gaiaIngot))
                .save(consumer, "maid_boots");
    }
}