package net.daniel.testmod.item;

import net.daniel.testmod.TestMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup TESTMOD = FabricItemGroupBuilder.build(
            new Identifier(TestMod.MOD_ID, "testmod"), () -> new ItemStack(ModItems.RUBY));

}

