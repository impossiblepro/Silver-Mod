package com.sunkenpot.silver.common.material;
import java.util.function.Supplier;
import com.sunkenpot.silver.core.init.ItemInit;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemTier;
@SuppressWarnings("unused")
public enum CustomToolMaterial implements IItemTier{

	SILVER_PICKAXE(2, 672, 12.0f, 3.0f, 17, ()-> Ingredient.fromItems(ItemInit.SILVER_INGOT.get())),
	SILVER_SWORD(0, 334, 1.0f, 6.0f, 17, ()-> Ingredient.fromItems(ItemInit.SILVER_INGOT.get())),
	SILVER_AXE(2, 379, 12.0f, 10f, 17, ()-> Ingredient.fromItems(ItemInit.SILVER_INGOT.get())),
	SILVER_SHOVEL(2, 374, 12.0f, 4.5f, 17, ()-> Ingredient.fromItems(ItemInit.SILVER_INGOT.get()));
	
	
	private final int harvestLevel;
	private final int maxUses;
	private final float efficiency;
	private final float attackDamage;
	private final int enchantability;
	private final Ingredient repairMaterial;
	
	CustomToolMaterial(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial){
		this.harvestLevel=harvestLevel;
		this.maxUses=maxUses;
		this.efficiency = efficiency;
		this.attackDamage=attackDamage;
		this.enchantability=enchantability;
		this.repairMaterial=repairMaterial.get();
		
		
	}
	
	@Override
	public int getMaxUses() {
		// TODO Auto-generated method stub
		return this.maxUses;
	}
	@Override
	public float getEfficiency() {
		// TODO Auto-generated method stub
		return this.efficiency;
	}
	@Override
	public float getAttackDamage() {
		// TODO Auto-generated method stub
		return this.attackDamage;
	}
	@Override
	public int getHarvestLevel() {
		// TODO Auto-generated method stub
		return this.harvestLevel;
	}
	@Override
	public int getEnchantability() {
		// TODO Auto-generated method stub
		return this.enchantability;
	}
	@Override
	public Ingredient getRepairMaterial() {
		// TODO Auto-generated method stub
		return this.repairMaterial;
	}

}
