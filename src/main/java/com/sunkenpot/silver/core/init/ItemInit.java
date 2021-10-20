package com.sunkenpot.silver.core.init;

import com.sunkenpot.silver.Silver;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Silver.MOD_ID);
	
	public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
			() -> new Item(new Item.Properties().group(ItemGroup.TOOLS)));
}
