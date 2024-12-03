package com.sunkenpot.silver.core.init;

import com.sunkenpot.silver.Silver;
import com.sunkenpot.silver.common.material.CustomToolMaterial;
import com.sunkenpot.silver.core.itemgroup.SilverItemGroup;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ShovelItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Silver.MOD_ID);

	public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
			() -> new Item(new Item.Properties().group(SilverItemGroup.ITEM_GROUP)));

	public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget",
			() -> new Item(new Item.Properties().group(SilverItemGroup.ITEM_GROUP)));

	public static final RegistryObject<Item> SILVER_PICKAXE = ITEMS.register("silver_pickaxe",
			() -> new PickaxeItem(CustomToolMaterial.SILVER_PICKAXE, 3, 1f,
					new Item.Properties().group(SilverItemGroup.ITEM_GROUP)));

	public static final RegistryObject<Item> SILVER_SWORD = ITEMS.register("silver_sword",
			() -> new SwordItem(CustomToolMaterial.SILVER_SWORD, 3, 1.7f,
					new Item.Properties().group(SilverItemGroup.ITEM_GROUP)));

	public static final RegistryObject<Item> SILVER_AXE = ITEMS.register("silver_axe",
			() -> new AxeItem(CustomToolMaterial.SILVER_AXE, 9, 0.9f,
					new Item.Properties().group(SilverItemGroup.ITEM_GROUP)));

	public static final RegistryObject<Item> SILVER_SHOVEL = ITEMS.register("silver_shovel",
			() -> new ShovelItem(CustomToolMaterial.SILVER_SHOVEL, 2f, 1f,
					new Item.Properties().group(SilverItemGroup.ITEM_GROUP)));
}
