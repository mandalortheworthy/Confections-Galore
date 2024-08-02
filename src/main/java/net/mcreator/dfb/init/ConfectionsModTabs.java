
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dfb.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.dfb.ConfectionsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ConfectionsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ConfectionsMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(ConfectionsModItems.RAW_COCOA_POWDER.get());
			tabData.accept(ConfectionsModItems.MILK_BOTTLE.get());
			tabData.accept(ConfectionsModItems.CHERRY.get());
			tabData.accept(ConfectionsModItems.CHOCOLATE_DIPPED_CHERRIES.get());
		}
	}
}
