package net.kr1lgema.hzmod.item;

import net.kr1lgema.hzmod.HzMod;
import net.kr1lgema.hzmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HzMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> HZ_TAB = CREATIVE_MODE_TABS.register("hztab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.HZCRYSTAL.get()))
                    .title(Component.translatable("creativetab.hztab"))
                    .displayItems((pParameters, pOutput) -> {
                            pOutput.accept(ModItems.HZCRYSTAL.get());
                            pOutput.accept(ModBlocks.HZCRYSTAL_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
