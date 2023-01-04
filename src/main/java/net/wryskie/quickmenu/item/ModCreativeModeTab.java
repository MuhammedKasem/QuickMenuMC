package net.wryskie.quickmenu.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab QUICKMENU_TAB = new CreativeModeTab("menutab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.Zircon.get());
        }
    };
}
