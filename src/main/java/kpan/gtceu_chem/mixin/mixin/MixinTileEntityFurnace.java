package kpan.gtceu_chem.mixin.mixin;

import kpan.gtceu_chem.mixin.interfaces.IMixinTileEntityFurnace;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityFurnace;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(TileEntityFurnace.class)
public class MixinTileEntityFurnace implements IMixinTileEntityFurnace {

	int needCookTime = 10;

	@Overwrite
	public int getCookTime(ItemStack stack) {
		//作成にかかる時間
		return needCookTime;
		//return 100;
	}

	@Override
	public void setNeedCookTime(int tick) { needCookTime = tick; }
}
