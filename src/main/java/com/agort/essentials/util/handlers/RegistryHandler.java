package com.agort.essentials.util.handlers;

import com.agort.essentials.init.ModItems;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;

@EventBusSubscriber
public class RegistryHandler {

	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
}
