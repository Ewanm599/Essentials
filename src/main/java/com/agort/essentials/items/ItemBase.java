package com.agort.essentials.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.agort.essentials.Main;
import com.agort.essentials.init.ModItems;
import com.agort.essentials.util.IHasModel;

public class ItemBase extends Item implements IHasModel{

	public ItemBase(String name){
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

	
}
