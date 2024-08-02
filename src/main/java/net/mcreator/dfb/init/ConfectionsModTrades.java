
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.dfb.init;

import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ConfectionsModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == ConfectionsModVillagerProfessions.CONFECTIONER.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.SUGAR),

					new ItemStack(ConfectionsModItems.RAW_COCOA_POWDER.get(), 2), 10, 5, 0.05f));
		}
		if (event.getType() == ConfectionsModVillagerProfessions.CONFECTIONER.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.SUGAR, 2),

					new ItemStack(ConfectionsModItems.COCOA_POWDER.get()), 10, 5, 0.05f));
		}
		if (event.getType() == ConfectionsModVillagerProfessions.CONFECTIONER.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.SUGAR), new ItemStack(ConfectionsModItems.MILK_BOTTLE.get()), new ItemStack(ConfectionsModItems.CHOCOLATE_MILK.get()), 10, 10, 0.05f));
		}
		if (event.getType() == ConfectionsModVillagerProfessions.CONFECTIONER.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.SUGAR), new ItemStack(ConfectionsModItems.COCOA_POWDER.get()), new ItemStack(ConfectionsModItems.CHOCOLATE_SYRUP.get()), 10, 10, 0.05f));
		}
		if (event.getType() == ConfectionsModVillagerProfessions.CONFECTIONER.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.COCOA_BEANS), new ItemStack(ConfectionsModItems.CHERRY.get()), new ItemStack(ConfectionsModItems.CHOCOLATE_DIPPED_CHERRIES.get(), 2), 10, 15, 0.05f));
		}
	}
}
