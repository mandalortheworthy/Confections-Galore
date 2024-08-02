
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dfb.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.bus.api.IEventBus;

import net.minecraft.world.item.Item;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.dfb.item.RawCocoaPowderItem;
import net.mcreator.dfb.item.MilkBottleItem;
import net.mcreator.dfb.item.CocoaPowderItem;
import net.mcreator.dfb.item.ChocolateSyrupItem;
import net.mcreator.dfb.item.ChocolateMilkItem;
import net.mcreator.dfb.item.ChocolateDippedCherriesItem;
import net.mcreator.dfb.item.CherryItem;
import net.mcreator.dfb.ConfectionsMod;

public class ConfectionsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(BuiltInRegistries.ITEM, ConfectionsMod.MODID);
	public static final DeferredHolder<Item, Item> RAW_COCOA_POWDER = REGISTRY.register("raw_cocoa_powder", () -> new RawCocoaPowderItem());
	public static final DeferredHolder<Item, Item> COCOA_POWDER = REGISTRY.register("cocoa_powder", () -> new CocoaPowderItem());
	public static final DeferredHolder<Item, Item> CHOCOLATE_MILK = REGISTRY.register("chocolate_milk", () -> new ChocolateMilkItem());
	public static final DeferredHolder<Item, Item> MILK_BOTTLE = REGISTRY.register("milk_bottle", () -> new MilkBottleItem());
	public static final DeferredHolder<Item, Item> CHERRY = REGISTRY.register("cherry", () -> new CherryItem());
	public static final DeferredHolder<Item, Item> CHOCOLATE_DIPPED_CHERRIES = REGISTRY.register("chocolate_dipped_cherries", () -> new ChocolateDippedCherriesItem());
	public static final DeferredHolder<Item, Item> CHOCOLATE_SYRUP = REGISTRY.register("chocolate_syrup", () -> new ChocolateSyrupItem());

	// Start of user code block custom items
	// End of user code block custom items
	public static void register(IEventBus bus) {
		REGISTRY.register(bus);
	}
}
