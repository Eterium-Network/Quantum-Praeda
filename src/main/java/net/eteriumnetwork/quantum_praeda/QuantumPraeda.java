package net.eteriumnetwork.quantum_praeda;

import com.mojang.logging.LogUtils;
import net.eteriumnetwork.quantum_praeda.init.QPCreativeModeTabs;
import net.eteriumnetwork.quantum_praeda.init.RegistryItem;
import net.eteriumnetwork.quantum_praeda.init.RegistryBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

@Mod(QuantumPraeda.MODID)
public class QuantumPraeda
{
    public static final String MODID = "quantum_praeda";
    public static final Logger LOGGER = LogUtils.getLogger();

    public QuantumPraeda() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(modEventBus);

        RegistryBlock.init(modEventBus);
        RegistryItem.init(modEventBus);
        QPCreativeModeTabs.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::onModConfigEvent);

        modEventBus.addListener(RegistryBlock::addCreative);
        modEventBus.addListener(RegistryItem::addCreative);
    }

    public void commonSetup(final @NotNull FMLCommonSetupEvent event) {
        LOGGER.info("{} IS RUNNING!", MODID.toUpperCase());
        LOGGER.debug(event.description());
    }

    private void onModConfigEvent(final ModConfigEvent event) {
        Config.onLoad(event);
    }
}
