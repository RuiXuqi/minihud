package minihud.core;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

import javax.annotation.Nullable;
import java.util.Map;

@IFMLLoadingPlugin.Name("EarlyMixin")
@IFMLLoadingPlugin.MCVersion("1.12.2")
public class MiniHudCore implements IFMLLoadingPlugin
{

    @Nullable
    @Override
    public String[] getASMTransformerClass()
    {
        return null;
    }

    @Nullable
    @Override
    public String getModContainerClass()
    {
        return null;
    }

    @Nullable
    @Override
    public String getSetupClass()
    {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data)
    {
    }

    @Nullable
    @Override
    public String getAccessTransformerClass()
    {
        return null;
    }
}
