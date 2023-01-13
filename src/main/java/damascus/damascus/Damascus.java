package damascus.damascus;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Damascus implements ModInitializer {
    public static final String MOD_ID = "damascus";

    public static final ItemGroup DAMASCUS = FabricItemGroup.builder(new Identifier(MOD_ID, "damascus")).icon(()->new ItemStack(itemDefenitions.RAW_TUNGSTEN)).build();

    @Override
    public void onInitialize() {

        itemDefenitions.register();
        itemDefenitions.addItems();
        itemDefenitions.registerBlocks();
    }
}
