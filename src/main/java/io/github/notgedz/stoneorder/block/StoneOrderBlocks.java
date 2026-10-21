package io.github.notgedz.stoneorder.block;

import net.danygames2014.nyalib.block.SlabBlockTemplate;
import net.danygames2014.nyalib.block.StairsBlockTemplate;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.modificationstation.stationapi.api.event.recipe.RecipeRegisterEvent;
import net.modificationstation.stationapi.api.event.registry.BlockRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.EntrypointManager;
import net.modificationstation.stationapi.api.recipe.CraftingRegistry;
import net.modificationstation.stationapi.api.template.block.TemplateBlock;
import net.modificationstation.stationapi.api.util.Identifier;
import net.modificationstation.stationapi.api.util.Namespace;
import java.lang.invoke.MethodHandles;

public  class StoneOrderBlocks{
static {
    EntrypointManager.registerLookup(MethodHandles.lookup());
}

@SuppressWarnings("UnstableApiUsage")
public static final Namespace NAMESPACE = Namespace.resolve();
public static Block[] blocks;
public static Block stoneBrickStairs;
public static Block stoneBrickSlab;
public static Block stoneBricks;
public static Block mossyStoneBrickStairs;
public static Block mossyStoneBrickSlab;
public static Block mossyStoneBricks;
public static Block mossyCobblestoneStairs;
public static Block mossyCobblestoneSlab;
public static Block sandstoneBrickSlab;
public static Block sandstoneBrickStairs;
public static Block sandstoneBricks;
public static Block brickStairs ;
public static Block brickSlab;
public static Block snowBrickSlab;
public static Block snowBrickStairs;
public static Block snowBricks;
public static Block mossyBrickStairs;
public static Block mossyBrickSlab;
public static Block mossyBricks;
@EventListener
public void registerBlock(BlockRegistryEvent event) {
//stone bricks
    stoneBrickStairs = new StairsBlockTemplate
            (NAMESPACE.id("stone_brick_stairs"),
                    Block.STONE, Identifier.of("stoneorder:block/stone_bricks"))
            .setTranslationKey(NAMESPACE, "stone_brick_stairs")
            .setSoundGroup(Block.STONE_SOUND_GROUP)
            .setResistance(10.0F)
            .setHardness(1.0F);

    stoneBrickSlab = new SlabBlockTemplate
            (NAMESPACE.id("stone_brick_slab"),
                    Block.STONE, Identifier.of("stoneorder:block/stone_bricks"))
            .setTranslationKey(NAMESPACE, "stone_brick_slab")
            .setSoundGroup(Block.STONE_SOUND_GROUP)
            .setResistance(10.0F)
            .setHardness(1.0F);
    stoneBricks = new TemplateBlock(NAMESPACE.id("stone_bricks"), Material.STONE)
            .setHardness(1.0F)
            .setResistance(10.0F)
            .setSoundGroup(Block.STONE_SOUND_GROUP)
            .setTranslationKey(NAMESPACE.id("stone_bricks"));

    //sandstone bricks

    sandstoneBrickStairs = new StairsBlockTemplate
            (NAMESPACE.id("sandstone_brick_stairs"),
                    Block.STONE, Identifier.of("stoneorder:block/sandstone_bricks"))
            .setTranslationKey(NAMESPACE, "sandstone_brick_stairs")
            .setSoundGroup(Block.STONE_SOUND_GROUP)
            .setResistance(10.0F)
            .setHardness(1.0F);

    sandstoneBrickSlab = new SlabBlockTemplate
            (NAMESPACE.id("sandstone_brick_slab"),
                    Block.STONE, Identifier.of("stoneorder:block/sandstone_bricks"))
            .setTranslationKey(NAMESPACE, "sandstone_brick_slab")
            .setSoundGroup(Block.STONE_SOUND_GROUP)
            .setResistance(10.0F)
            .setHardness(1.0F);
    sandstoneBricks = new TemplateBlock(NAMESPACE.id("sandstone_bricks"), Material.STONE)
            .setHardness(1.0F)
            .setResistance(10.0F)
            .setSoundGroup(Block.STONE_SOUND_GROUP)
            .setTranslationKey(NAMESPACE.id("sandstone_bricks"));
//snow

    snowBrickStairs = new StairsBlockTemplate(
            NAMESPACE.id("snow_brick_stairs"),
            Block.SNOW_BLOCK,
            Identifier.of("stoneorder:block/snow_bricks"))
            .setTranslationKey(NAMESPACE, "snow_brick_stairs")
            .setSoundGroup(Block.SNOW.soundGroup)
            .setResistance(10.0F)
            .setHardness(1.0F);

    snowBrickSlab = new SlabBlockTemplate(
            NAMESPACE.id("snow_brick_slab"),
            Block.SNOW_BLOCK,
            Identifier.of("stoneorder:block/snow_bricks"))
            .setTranslationKey(NAMESPACE, "snow_brick_slab")
            .setSoundGroup(Block.SNOW.soundGroup)
            .setResistance(10.0F)
            .setHardness(1.0F);

    snowBricks = new TemplateBlock(
            NAMESPACE.id("snow_bricks"),
            Material.SNOW_BLOCK)
            .setHardness(1.0F)
            .setResistance(10.0F)
            .setSoundGroup(Block.SNOW.soundGroup)
            .setTranslationKey(NAMESPACE.id("snow_bricks"));

    //mossy stone

    mossyStoneBrickStairs = new StairsBlockTemplate(
            NAMESPACE.id("mossy_stone_brick_stairs"),
            Block.STONE,
            Identifier.of("stoneorder:block/mossy_stone_bricks")
    )
            .setTranslationKey(NAMESPACE, "mossy_stone_brick_stairs")
            .setSoundGroup(Block.STONE_SOUND_GROUP)
            .setResistance(10.0F)
            .setHardness(1.0F);


    mossyStoneBrickSlab = new SlabBlockTemplate(
            NAMESPACE.id("mossy_stone_brick_slab"),
            Block.STONE,
            Identifier.of("stoneorder:block/mossy_stone_bricks")
    )
            .setTranslationKey(NAMESPACE, "mossy_stone_brick_slab")
            .setSoundGroup(Block.STONE_SOUND_GROUP)
            .setResistance(10.0F)
            .setHardness(1.0F);
    mossyStoneBricks = new TemplateBlock(NAMESPACE.id("mossy_stone_bricks"), Material.STONE)
            .setHardness(1.0F)
            .setResistance(10.0F)
            .setSoundGroup(Block.STONE_SOUND_GROUP)
            .setTranslationKey(NAMESPACE.id("mossy_stone_bricks"));

    //mossy bricks

    mossyBrickStairs = new StairsBlockTemplate(
            NAMESPACE.id("mossy_brick_stairs"),
            Block.STONE,
            Identifier.of("stoneorder:block/mossy_bricks")
    )
            .setTranslationKey(NAMESPACE, "mossy_brick_stairs")
            .setSoundGroup(Block.STONE_SOUND_GROUP)
            .setResistance(10.0F)
            .setHardness(0.5F);


    mossyBrickSlab = new SlabBlockTemplate(
            NAMESPACE.id("mossy_brick_slab"),
            Block.STONE,
            Identifier.of("stoneorder:block/mossy_bricks")
    )
            .setTranslationKey(NAMESPACE, "mossy_brick_slab")
            .setSoundGroup(Block.STONE_SOUND_GROUP)
            .setResistance(10.0F)
            .setHardness(1.0F);
    mossyBricks = new TemplateBlock(NAMESPACE.id("mossy_bricks"), Material.STONE)
            .setHardness(1.0F)
            .setResistance(10.0F)
            .setSoundGroup(Block.STONE_SOUND_GROUP)
            .setTranslationKey(NAMESPACE.id("mossy_bricks"));

   //mossy cobble
    mossyCobblestoneStairs = new StairsBlockTemplate(
            NAMESPACE.id("mossy_cobblestone_stairs"),
            Block.STONE,
            Identifier.of("minecraft:block/mossy_cobblestone")
    )
            .setTranslationKey(NAMESPACE, "mossy_cobblestone_stairs")
            .setSoundGroup(Block.STONE_SOUND_GROUP)
            .setResistance(10.0F)
            .setHardness(1.0F);


    mossyCobblestoneSlab = new SlabBlockTemplate(
            NAMESPACE.id("mossy_cobblestone_slab"),
            Block.STONE,
            Identifier.of("minecraft:block/mossy_cobblestone")
    )
            .setTranslationKey(NAMESPACE, "mossy_cobblestone_slab")
            .setSoundGroup(Block.STONE_SOUND_GROUP)
            .setResistance(10.0F)
            .setHardness(1.0F);

    //regular bricks
    brickStairs = new StairsBlockTemplate(
            NAMESPACE.id("brick_stairs"),
            Block.STONE,
            Identifier.of("minecraft:block/bricks")
    )
            .setTranslationKey(NAMESPACE, "brick_stairs")
            .setSoundGroup(Block.STONE_SOUND_GROUP)
            .setResistance(10.0F)
            .setHardness(1.0F);


    brickSlab = new SlabBlockTemplate(
            NAMESPACE.id("brick_slab"),
            Block.STONE,
            Identifier.of("minecraft:block/bricks")
    )
            .setTranslationKey(NAMESPACE, "brick_slab")
            .setSoundGroup(Block.STONE_SOUND_GROUP)
            .setResistance(10.0F)
            .setHardness(1.0F);

    //registering for creative
    blocks = new Block[]
            { stoneBricks,stoneBrickSlab,stoneBrickStairs,
                    brickStairs,brickSlab,mossyCobblestoneSlab,mossyCobblestoneStairs,
                    mossyBrickSlab,mossyBricks,mossyBrickStairs,
                    mossyStoneBricks,mossyStoneBrickSlab,mossyStoneBrickStairs,
                    sandstoneBricks,sandstoneBrickSlab,sandstoneBrickStairs,
                    snowBricks,snowBrickSlab,snowBrickStairs
            };

}
    @EventListener
    private static void recipeListener(RecipeRegisterEvent event) {
        if (event.recipeId.equals(
                RecipeRegisterEvent.Vanilla.CRAFTING_SHAPED.type())) {

            //stone bricks
            CraftingRegistry.addShapedRecipe(
                    new ItemStack(StoneOrderBlocks.stoneBrickStairs, 6),
                    "s  ",
                    "ss ",
                    "sss",
                    's', StoneOrderBlocks.stoneBricks
            );
            CraftingRegistry.addShapedRecipe(
                    new ItemStack(StoneOrderBlocks.stoneBrickStairs, 6),
                    "  s",
                    " ss",
                    "sss",
                    's', StoneOrderBlocks.stoneBricks
            );
            CraftingRegistry.addShapedRecipe(
                    new ItemStack(StoneOrderBlocks.stoneBricks, 4),
                    "ss",
                    "ss",
                    's', Block.STONE
            );

            //sandstone bricks
            CraftingRegistry.addShapedRecipe(
                    new ItemStack(StoneOrderBlocks.sandstoneBrickStairs, 6),
                    "s  ",
                    "ss ",
                    "sss",
                    's', StoneOrderBlocks.sandstoneBricks
            );
            CraftingRegistry.addShapedRecipe(
                    new ItemStack(StoneOrderBlocks.sandstoneBrickStairs, 6),
                    "  s",
                    " ss",
                    "sss",
                    's', StoneOrderBlocks.sandstoneBricks
            );
            CraftingRegistry.addShapedRecipe(
                    new ItemStack(StoneOrderBlocks.sandstoneBricks, 4),
                    "ss",
                    "ss",
                    's', Block.SANDSTONE
            );
            //snow bricks
            CraftingRegistry.addShapedRecipe(
                    new ItemStack(StoneOrderBlocks.snowBrickStairs, 6),
                    "s  ",
                    "ss ",
                    "sss",
                    's', StoneOrderBlocks.snowBricks
            );
            CraftingRegistry.addShapedRecipe(
                    new ItemStack(StoneOrderBlocks.snowBrickStairs, 6),
                    "  s",
                    " ss",
                    "sss",
                    's', StoneOrderBlocks.snowBricks
            );
            CraftingRegistry.addShapedRecipe(
                    new ItemStack(StoneOrderBlocks.snowBricks, 4),
                    "ss",
                    "ss",
                    's', Block.SNOW
            );


            //mossy stone bricks
            CraftingRegistry.addShapedRecipe(
                    new ItemStack(StoneOrderBlocks.mossyStoneBrickStairs, 6),
                    "s  ",
                    "ss ",
                    "sss",
                    's', StoneOrderBlocks.mossyStoneBricks
            );
            CraftingRegistry.addShapedRecipe(
                    new ItemStack(StoneOrderBlocks.mossyStoneBrickStairs, 6),
                    "  s",
                    " ss",
                    "sss",
                    's', StoneOrderBlocks.mossyStoneBricks
            );

            CraftingRegistry.addShapedRecipe(
                    new ItemStack(StoneOrderBlocks.mossyStoneBrickSlab, 6),
                    "sss",
                    's', StoneOrderBlocks.mossyStoneBricks
            );
            //brick
            CraftingRegistry.addShapedRecipe(
                    new ItemStack(StoneOrderBlocks.brickStairs, 6),
                    "s  ",
                    "ss ",
                    "sss",
                    's', Block.BRICKS
            );
            CraftingRegistry.addShapedRecipe(
                    new ItemStack(StoneOrderBlocks.brickStairs, 6),
                    "  s",
                    " ss",
                    "sss",
                    's', Block.BRICKS
            );

            CraftingRegistry.addShapedRecipe(
                    new ItemStack(StoneOrderBlocks.brickSlab, 6),
                    "sss",
                    's', Block.BRICKS
            );
            //mossy brick
            CraftingRegistry.addShapedRecipe(
                    new ItemStack(StoneOrderBlocks.mossyBrickStairs, 6),
                    "s  ",
                    "ss ",
                    "sss",
                    's', StoneOrderBlocks.mossyBricks
            );
            CraftingRegistry.addShapedRecipe(
                    new ItemStack(StoneOrderBlocks.mossyBrickStairs, 6),
                    "  s",
                    " ss",
                    "sss",
                    's', StoneOrderBlocks.mossyBricks
            );

            CraftingRegistry.addShapedRecipe(
                    new ItemStack(StoneOrderBlocks.mossyBrickSlab, 6),
                    "sss",
                    's', StoneOrderBlocks.mossyBricks
            );
            //mossy cobble
            CraftingRegistry.addShapedRecipe(
                    new ItemStack(StoneOrderBlocks.mossyCobblestoneStairs, 6),
                    "s  ",
                    "ss ",
                    "sss",
                    's', Block.MOSSY_COBBLESTONE
            );
            CraftingRegistry.addShapedRecipe(
                    new ItemStack(StoneOrderBlocks.mossyCobblestoneStairs, 6),
                    "  s",
                    " ss",
                    "sss",
                    's', Block.MOSSY_COBBLESTONE
            );

            CraftingRegistry.addShapedRecipe(
                    new ItemStack(StoneOrderBlocks.mossyCobblestoneSlab, 6),
                    "sss",
                    's', Block.MOSSY_COBBLESTONE
            );

        }
}
}
