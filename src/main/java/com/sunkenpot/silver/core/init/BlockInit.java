package com.sunkenpot.silver.core.init;

import com.sunkenpot.silver.Silver;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Silver.MOD_ID);

	public static final RegistryObject<Block> SILVER_ORE = BLOCKS
			.register("silver_ore",
					() -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.GRAY)
							.hardnessAndResistance(5f, 6f).harvestTool(ToolType.PICKAXE).harvestLevel(2)
							.sound(SoundType.STONE)));

	public static final RegistryObject<Block> SILVER_BLOCK = BLOCKS
			.register("silver_block",
					() -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.GRAY)
							.hardnessAndResistance(5f, 6f).harvestTool(ToolType.PICKAXE).harvestLevel(2)
							.sound(SoundType.METAL)));
}
