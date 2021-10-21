package com.sunkenpot.silver.core.itemgroup;

import com.sunkenpot.silver.core.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class SilverItemGroup extends ItemGroup{

	public static final SilverItemGroup ITEM_GROUP= new SilverItemGroup(ItemGroup.GROUPS.length, "Silver");
	
	public SilverItemGroup(int index, String label) {
		super(index, label);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ItemStack createIcon() {
		// TODO Auto-generated method stub
		return new ItemStack(ItemInit.SILVER_INGOT.get());
	}

}
