package com.sunkenpot.silver.core.init;

import com.sunkenpot.silver.Silver;
import com.sunkenpot.silver.core.itemgroup.SilverItemGroup;

import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Silver.MOD_ID);

	public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
			() -> new Item(new Item.Properties().group(SilverItemGroup.ITEM_GROUP)));

	public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget",
			() -> new Item(new Item.Properties().group(SilverItemGroup.ITEM_GROUP)));
}
