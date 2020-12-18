package net.rhseung.stay.data.client;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.rhseung.stay.Stay;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Stay.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
        ModelFile gearGenerated = getExistingFile(mcLoc("item/handheld"));

        // TODO ItemModels
        itemModel(itemGenerated, "metal_ingot_copper");
        itemModel(itemGenerated, "metal_ingot_polyrite");
        itemModel(itemGenerated, "food_ryebread");
        // TODO BlockModels
        itemModel(itemGenerated, "stone_ore_copper");
        itemModel(itemGenerated, "metal_pile_copper");
        // TODO ToolModels
        itemModel(gearGenerated, "gear_sword_copper");
        itemModel(gearGenerated, "gear_pick_copper");
        itemModel(gearGenerated, "gear_axe_copper");
        itemModel(gearGenerated, "gear_shovel_copper");
        itemModel(gearGenerated, "gear_hoe_copper");
        itemModel(gearGenerated, "gear_paxel_copper");
        // TODO ArmorModels
        itemModel(itemGenerated, "gear_helmet_copper");
        itemModel(itemGenerated, "gear_chestplate_copper");
        itemModel(itemGenerated, "gear_leggings_copper");
        itemModel(itemGenerated, "gear_boots_copper");
    }

    private ItemModelBuilder itemModel(ModelFile itemGenerated, String itemName) {
        return getBuilder(itemName).parent(itemGenerated).texture("layer0", "item/" + itemName.replaceAll("_", "/"));
    }
    private ItemModelBuilder toolModel(ModelFile gearGenerated, String gearName) {
        return getBuilder(gearName).parent(gearGenerated).texture("layer0", "item/" + gearName.replaceAll("_", "/"));
    }
}
