package pixelmon.blocks;

import java.util.Random;

import cpw.mods.fml.client.registry.RenderingRegistry;

import pixelmon.Pixelmon;
import pixelmon.config.PixelmonBlocks;
import pixelmon.config.PixelmonCreativeTabs;
import pixelmon.config.PixelmonItems;
import pixelmon.enums.EnumEvolutionStone;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class BlockFossil extends Block {

	public BlockFossil(int id) {
		super(id, Material.rock);
		setStepSound(Block.soundStoneFootstep);
		setCreativeTab(PixelmonCreativeTabs.natural);
		setTextureFile("/pixelmon/block/blocks.png");
		blockIndexInTexture = 5;
	}

	@Override
	public int getRenderType() {
		return 0;
	}

	public int idDropped(int i, Random rand, int j) {
		int result = 0;
		switch (rand.nextInt(9)) {
		case 8:
			result = PixelmonItems.helixFossilUncovered.shiftedIndex;
			break;
		case 7:
			result = PixelmonItems.domeFossilUncovered.shiftedIndex;
			break;
		case 6:
			result = PixelmonItems.clawFossilUncovered.shiftedIndex;
			break;
		case 5:
			result = PixelmonItems.rootFossilUncovered.shiftedIndex;
			break;
		case 4:
			result = PixelmonItems.oldAmberUncovered.shiftedIndex;
			break;
		case 3:
			result = PixelmonItems.coverFossilUncovered.shiftedIndex;
			break;
		case 2:
			result = PixelmonItems.plumeFossilUncovered.shiftedIndex;
			break;
		case 1:
			result = PixelmonItems.skullFossilUncovered.shiftedIndex;
			break;
		case 0:
			result = PixelmonItems.armorFossilUncovered.shiftedIndex;
			break;
		}

		return result;
	}

}
