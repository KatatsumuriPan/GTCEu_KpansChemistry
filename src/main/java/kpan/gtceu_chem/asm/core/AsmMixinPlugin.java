package kpan.gtceu_chem.asm.core;

import kpan.gtceu_chem.ModTagsGenerated;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin.MCVersion;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin.Name;
import org.apache.logging.log4j.LogManager;
import zone.rong.mixinbooter.IEarlyMixinLoader;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@IFMLLoadingPlugin.TransformerExclusions({ModTagsGenerated.MODGROUP + ".asm.core.", ModTagsGenerated.MODGROUP + ".asm.tf.", ModTagsGenerated.MODGROUP + ".mixin.", ModTagsGenerated.MODGROUP + ".util.MyReflectionHelper"})
@Name("AsmMixinPlugin")
@MCVersion("1.12.2")
public class AsmMixinPlugin implements IFMLLoadingPlugin, IEarlyMixinLoader {

	public AsmMixinPlugin() {
		LogManager.getLogger().debug("This is " + (AsmUtil.isDeobfEnvironment() ? "deobf" : "obf") + " environment");
	}

	@Override
	public String[] getASMTransformerClass() { return new String[]{ASMTransformer.class.getName()}; }

	@Override
	public String getModContainerClass() { return null; }

	@Nullable
	@Override
	public String getSetupClass() { return null; }

	@Override
	public void injectData(Map<String, Object> data) { }

	@Override
	public String getAccessTransformerClass() { return AccessTransformerForMixin.class.getName(); }

	@Override
	public List<String> getMixinConfigs() {
		return Arrays.asList("mixins." + ModTagsGenerated.MODID + ".json");
	}
}
