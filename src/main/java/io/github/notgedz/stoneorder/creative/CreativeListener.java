package io.github.notgedz.stoneorder.creative;

import io.github.notgedz.stoneorder.block.StoneOrderBlocks;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import paulevs.bhcreative.api.CreativeTab;
import paulevs.bhcreative.api.SimpleTab;
import paulevs.bhcreative.registry.TabRegistryEvent;

public class CreativeListener {
    public static CreativeTab tabStoneOrder;

    @EventListener
    public void onTabInit(TabRegistryEvent event){
        tabStoneOrder = new SimpleTab(StoneOrderBlocks.NAMESPACE.id("stone_bricks"), StoneOrderBlocks.stoneBricks.asItem());
        event.register(tabStoneOrder);
        for (Block block : StoneOrderBlocks.blocks){
            tabStoneOrder.addItem(new ItemStack(block.asItem(), 1));
        }

    }
}
