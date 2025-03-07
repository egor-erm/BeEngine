package org.distril.beengine.material;

import lombok.Getter;
import org.distril.beengine.material.block.Block;
import org.distril.beengine.material.block.BlockState;
import org.distril.beengine.material.item.Item;
import org.distril.beengine.material.item.ItemPalette;
import org.distril.beengine.server.Server;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Getter
public enum Material {

	STRIPPED_BAMBOO_BLOCK(-528),
	BAMBOO_BLOCK(-527),
	CHISELED_BOOKSHELF(-526),
	BAMBOO_MOSAIC_DOUBLE_SLAB(-525),
	BAMBOO_MOSAIC_SLAB(-524),
	BAMBOO_MOSAIC_STAIRS(-523),
	BAMBOO_HANGING_SIGN(-522),
	BAMBOO_DOUBLE_SLAB(-521),
	BAMBOO_TRAPDOOR(-520),
	BAMBOO_WALL_SIGN(-519),
	BAMBOO_STANDING_SIGN(-518),
	BAMBOO_DOOR(-517),
	BAMBOO_FENCE_GATE(-516),
	BAMBOO_FENCE(-515),
	BAMBOO_PRESSURE_PLATE(-514),
	BAMBOO_SLAB(-513),
	BAMBOO_STAIRS(-512),
	BAMBOO_BUTTON(-511),
	BAMBOO_PLANKS(-510),
	BAMBOO_MOSAIC(-509),
	MANGROVE_HANGING_SIGN(-508),
	WARPED_HANGING_SIGN(-507),
	CRIMSON_HANGING_SIGN(-506),
	DARK_OAK_HANGING_SIGN(-505),
	ACACIA_HANGING_SIGN(-504),
	JUNGLE_HANGING_SIGN(-503),
	BIRCH_HANGING_SIGN(-502),
	SPRUCE_HANGING_SIGN(-501),
	OAK_HANGING_SIGN(-500),
	MANGROVE_DOUBLE_SLAB(-499),
	STRIPPED_MANGROVE_WOOD(-498),
	MANGROVE_WOOD(-497),
	MANGROVE_TRAPDOOR(-496),
	MANGROVE_WALL_SIGN(-495),
	MANGROVE_STANDING_SIGN(-494),
	ITEMMANGROVE_DOOR(-493),
	MANGROVE_FENCE_GATE(-492),
	MANGROVE_FENCE(-491),
	MANGROVE_PRESSURE_PLATE(-490),
	MANGROVE_SLAB(-489),
	MANGROVE_STAIRS(-488),
	MANGROVE_BUTTON(-487),
	MANGROVE_PLANKS(-486),
	STRIPPED_MANGROVE_LOG(-485),
	MANGROVE_LOG(-484),
	MUDDY_MANGROVE_ROOTS(-483),
	MANGROVE_ROOTS(-482),
	MUD_BRICK_WALL(-481),
	MUD_BRICK_STAIRS(-480),
	MUD_BRICK_DOUBLE_SLAB(-479),
	MUD_BRICK_SLAB(-478),
	PACKED_MUD(-477),
	MUD_BRICKS(-475),
	MANGROVE_PROPAGULE(-474),
	MUD(-473),
	MANGROVE_LEAVES(-472),
	OCHRE_FROGLIGHT(-471),
	VERDANT_FROGLIGHT(-470),
	PEARLESCENT_FROGLIGHT(-469),
	FROG_SPAWN(-468),
	REINFORCED_DEEPSLATE(-466),
	CLIENT_REQUEST_PLACEHOLDER_BLOCK(-465),
	SCULK_SHRIEKER(-461),
	SCULK_CATALYST(-460),
	SCULK_VEIN(-459),
	SCULK(-458),
	INFESTED_DEEPSLATE(-454),
	RAW_GOLD_BLOCK(-453),
	RAW_COPPER_BLOCK(-452),
	RAW_IRON_BLOCK(-451),
	WAXED_OXIDIZED_DOUBLE_CUT_COPPER_SLAB(-450),
	WAXED_OXIDIZED_CUT_COPPER_SLAB(-449),
	WAXED_OXIDIZED_CUT_COPPER_STAIRS(-448),
	WAXED_OXIDIZED_CUT_COPPER(-447),
	WAXED_OXIDIZED_COPPER(-446),
	BLACK_CANDLE_CAKE(-445),
	RED_CANDLE_CAKE(-444),
	GREEN_CANDLE_CAKE(-443),
	BROWN_CANDLE_CAKE(-442),
	BLUE_CANDLE_CAKE(-441),
	PURPLE_CANDLE_CAKE(-440),
	CYAN_CANDLE_CAKE(-439),
	LIGHT_GRAY_CANDLE_CAKE(-438),
	GRAY_CANDLE_CAKE(-437),
	PINK_CANDLE_CAKE(-436),
	LIME_CANDLE_CAKE(-435),
	YELLOW_CANDLE_CAKE(-434),
	LIGHT_BLUE_CANDLE_CAKE(-433),
	MAGENTA_CANDLE_CAKE(-432),
	ORANGE_CANDLE_CAKE(-431),
	WHITE_CANDLE_CAKE(-430),
	CANDLE_CAKE(-429),
	BLACK_CANDLE(-428),
	RED_CANDLE(-427),
	GREEN_CANDLE(-426),
	BROWN_CANDLE(-425),
	BLUE_CANDLE(-424),
	PURPLE_CANDLE(-423),
	CYAN_CANDLE(-422),
	LIGHT_GRAY_CANDLE(-421),
	GRAY_CANDLE(-420),
	PINK_CANDLE(-419),
	LIME_CANDLE(-418),
	YELLOW_CANDLE(-417),
	LIGHT_BLUE_CANDLE(-416),
	MAGENTA_CANDLE(-415),
	ORANGE_CANDLE(-414),
	WHITE_CANDLE(-413),
	CANDLE(-412),
	GLOW_LICHEN(-411),
	CRACKED_DEEPSLATE_BRICKS(-410),
	CRACKED_DEEPSLATE_TILES(-409),
	DEEPSLATE_COPPER_ORE(-408),
	DEEPSLATE_EMERALD_ORE(-407),
	DEEPSLATE_COAL_ORE(-406),
	DEEPSLATE_DIAMOND_ORE(-405),
	LIT_DEEPSLATE_REDSTONE_ORE(-404),
	DEEPSLATE_REDSTONE_ORE(-403),
	DEEPSLATE_GOLD_ORE(-402),
	DEEPSLATE_IRON_ORE(-401),
	DEEPSLATE_LAPIS_ORE(-400),
	DEEPSLATE_BRICK_DOUBLE_SLAB(-399),
	DEEPSLATE_TILE_DOUBLE_SLAB(-398),
	POLISHED_DEEPSLATE_DOUBLE_SLAB(-397),
	COBBLED_DEEPSLATE_DOUBLE_SLAB(-396),
	CHISELED_DEEPSLATE(-395),
	DEEPSLATE_BRICK_WALL(-394),
	DEEPSLATE_BRICK_STAIRS(-393),
	DEEPSLATE_BRICK_SLAB(-392),
	DEEPSLATE_BRICKS(-391),
	DEEPSLATE_TILE_WALL(-390),
	DEEPSLATE_TILE_STAIRS(-389),
	DEEPSLATE_TILE_SLAB(-388),
	DEEPSLATE_TILES(-387),
	POLISHED_DEEPSLATE_WALL(-386),
	POLISHED_DEEPSLATE_STAIRS(-385),
	POLISHED_DEEPSLATE_SLAB(-384),
	POLISHED_DEEPSLATE(-383),
	COBBLED_DEEPSLATE_WALL(-382),
	COBBLED_DEEPSLATE_STAIRS(-381),
	COBBLED_DEEPSLATE_SLAB(-380),
	COBBLED_DEEPSLATE(-379),
	DEEPSLATE(-378),
	SMOOTH_BASALT(-377),
	CAVE_VINES_HEAD_WITH_BERRIES(-376),
	CAVE_VINES_BODY_WITH_BERRIES(-375),
	WAXED_WEATHERED_DOUBLE_CUT_COPPER_SLAB(-374),
	WAXED_EXPOSED_DOUBLE_CUT_COPPER_SLAB(-373),
	WAXED_DOUBLE_CUT_COPPER_SLAB(-372),
	OXIDIZED_DOUBLE_CUT_COPPER_SLAB(-371),
	WEATHERED_DOUBLE_CUT_COPPER_SLAB(-370),
	EXPOSED_DOUBLE_CUT_COPPER_SLAB(-369),
	DOUBLE_CUT_COPPER_SLAB(-368),
	WAXED_WEATHERED_CUT_COPPER_SLAB(-367),
	WAXED_EXPOSED_CUT_COPPER_SLAB(-366),
	WAXED_CUT_COPPER_SLAB(-365),
	OXIDIZED_CUT_COPPER_SLAB(-364),
	WEATHERED_CUT_COPPER_SLAB(-363),
	EXPOSED_CUT_COPPER_SLAB(-362),
	CUT_COPPER_SLAB(-361),
	WAXED_WEATHERED_CUT_COPPER_STAIRS(-360),
	WAXED_EXPOSED_CUT_COPPER_STAIRS(-359),
	WAXED_CUT_COPPER_STAIRS(-358),
	OXIDIZED_CUT_COPPER_STAIRS(-357),
	WEATHERED_CUT_COPPER_STAIRS(-356),
	EXPOSED_CUT_COPPER_STAIRS(-355),
	CUT_COPPER_STAIRS(-354),
	WAXED_WEATHERED_CUT_COPPER(-353),
	WAXED_EXPOSED_CUT_COPPER(-352),
	WAXED_CUT_COPPER(-351),
	OXIDIZED_CUT_COPPER(-350),
	WEATHERED_CUT_COPPER(-349),
	EXPOSED_CUT_COPPER(-348),
	CUT_COPPER(-347),
	WAXED_WEATHERED_COPPER(-346),
	WAXED_EXPOSED_COPPER(-345),
	WAXED_COPPER(-344),
	OXIDIZED_COPPER(-343),
	WEATHERED_COPPER(-342),
	EXPOSED_COPPER(-341),
	COPPER_BLOCK(-340),
	ITEMGLOW_FRAME(-339),
	FLOWERING_AZALEA(-338),
	AZALEA(-337),
	SMALL_DRIPLEAF_BLOCK(-336),
	MOSS_CARPET(-335),
	TINTED_GLASS(-334),
	TUFF(-333),
	SMALL_AMETHYST_BUD(-332),
	MEDIUM_AMETHYST_BUD(-331),
	LARGE_AMETHYST_BUD(-330),
	AMETHYST_CLUSTER(-329),
	BUDDING_AMETHYST(-328),
	AMETHYST_BLOCK(-327),
	CALCITE(-326),
	AZALEA_LEAVES_FLOWERED(-325),
	AZALEA_LEAVES(-324),
	BIG_DRIPLEAF(-323),
	CAVE_VINES(-322),
	SPORE_BLOSSOM(-321),
	MOSS_BLOCK(-320),
	HANGING_ROOTS(-319),
	DIRT_WITH_ROOTS(-318),
	DRIPSTONE_BLOCK(-317),
	LIGHTNING_ROD(-312),
	COPPER_ORE(-311),
	POINTED_DRIPSTONE(-308),
	SCULK_SENSOR(-307),
	POWDER_SNOW(-306),
	UNKNOWN(-305),
	QUARTZ_BRICKS(-304),
	CRACKED_NETHER_BRICKS(-303),
	CHISELED_NETHER_BRICKS(-302),
	STRIPPED_WARPED_HYPHAE(-301),
	STRIPPED_CRIMSON_HYPHAE(-300),
	CRIMSON_HYPHAE(-299),
	WARPED_HYPHAE(-298),
	POLISHED_BLACKSTONE_WALL(-297),
	POLISHED_BLACKSTONE_BUTTON(-296),
	POLISHED_BLACKSTONE_PRESSURE_PLATE(-295),
	POLISHED_BLACKSTONE_DOUBLE_SLAB(-294),
	POLISHED_BLACKSTONE_SLAB(-293),
	POLISHED_BLACKSTONE_STAIRS(-292),
	POLISHED_BLACKSTONE(-291),
	ITEMSOUL_CAMPFIRE(-290),
	CRYING_OBSIDIAN(-289),
	NETHER_GOLD_ORE(-288),
	TWISTING_VINES(-287),
	ITEMCHAIN(-286),
	POLISHED_BLACKSTONE_BRICK_DOUBLE_SLAB(-285),
	POLISHED_BLACKSTONE_BRICK_SLAB(-284),
	BLACKSTONE_DOUBLE_SLAB(-283),
	BLACKSTONE_SLAB(-282),
	GILDED_BLACKSTONE(-281),
	CRACKED_POLISHED_BLACKSTONE_BRICKS(-280),
	CHISELED_POLISHED_BLACKSTONE(-279),
	POLISHED_BLACKSTONE_BRICK_WALL(-278),
	BLACKSTONE_WALL(-277),
	BLACKSTONE_STAIRS(-276),
	POLISHED_BLACKSTONE_BRICK_STAIRS(-275),
	POLISHED_BLACKSTONE_BRICKS(-274),
	BLACKSTONE(-273),
	RESPAWN_ANCHOR(-272),
	ANCIENT_DEBRIS(-271),
	NETHERITE_BLOCK(-270),
	SOUL_LANTERN(-269),
	SOUL_TORCH(-268),
	WARPED_DOUBLE_SLAB(-267),
	CRIMSON_DOUBLE_SLAB(-266),
	WARPED_SLAB(-265),
	CRIMSON_SLAB(-264),
	WARPED_PRESSURE_PLATE(-263),
	CRIMSON_PRESSURE_PLATE(-262),
	WARPED_BUTTON(-261),
	CRIMSON_BUTTON(-260),
	WARPED_FENCE_GATE(-259),
	CRIMSON_FENCE_GATE(-258),
	WARPED_FENCE(-257),
	CRIMSON_FENCE(-256),
	WARPED_STAIRS(-255),
	CRIMSON_STAIRS(-254),
	WARPED_WALL_SIGN(-253),
	CRIMSON_WALL_SIGN(-252),
	WARPED_STANDING_SIGN(-251),
	CRIMSON_STANDING_SIGN(-250),
	WARPED_TRAPDOOR(-247),
	CRIMSON_TRAPDOOR(-246),
	ITEMWARPED_DOOR(-245),
	ITEMCRIMSON_DOOR(-244),
	WARPED_PLANKS(-243),
	CRIMSON_PLANKS(-242),
	STRIPPED_WARPED_STEM(-241),
	STRIPPED_CRIMSON_STEM(-240),
	TARGET(-239),
	ITEMNETHER_SPROUTS(-238),
	SOUL_FIRE(-237),
	SOUL_SOIL(-236),
	POLISHED_BASALT(-235),
	BASALT(-234),
	WARPED_NYLIUM(-233),
	CRIMSON_NYLIUM(-232),
	WEEPING_VINES(-231),
	SHROOMLIGHT(-230),
	WARPED_FUNGUS(-229),
	CRIMSON_FUNGUS(-228),
	WARPED_WART_BLOCK(-227),
	WARPED_STEM(-226),
	CRIMSON_STEM(-225),
	WARPED_ROOTS(-224),
	CRIMSON_ROOTS(-223),
	LODESTONE(-222),
	HONEYCOMB_BLOCK(-221),
	HONEY_BLOCK(-220),
	BEEHIVE(-219),
	BEE_NEST(-218),
	STICKY_PISTON_ARM_COLLISION(-217),
	WITHER_ROSE(-216),
	LIGHT_BLOCK(-215),
	LIT_BLAST_FURNACE(-214),
	COMPOSTER(-213),
	WOOD(-212),
	JIGSAW(-211),
	LAVA_CAULDRON(-210),
	ITEMCAMPFIRE(-209),
	LANTERN(-208),
	SWEET_BERRY_BUSH(-207),
	BELL(-206),
	LOOM(-204),
	BARREL(-203),
	SMITHING_TABLE(-202),
	FLETCHING_TABLE(-201),
	CARTOGRAPHY_TABLE(-200),
	LIT_SMOKER(-199),
	SMOKER(-198),
	STONECUTTER_BLOCK(-197),
	BLAST_FURNACE(-196),
	GRINDSTONE(-195),
	LECTERN(-194),
	DARKOAK_WALL_SIGN(-193),
	DARKOAK_STANDING_SIGN(-192),
	ACACIA_WALL_SIGN(-191),
	ACACIA_STANDING_SIGN(-190),
	JUNGLE_WALL_SIGN(-189),
	JUNGLE_STANDING_SIGN(-188),
	BIRCH_WALL_SIGN(-187),
	BIRCH_STANDING_SIGN(-186),
	SMOOTH_QUARTZ_STAIRS(-185),
	RED_NETHER_BRICK_STAIRS(-184),
	SMOOTH_STONE(-183),
	SPRUCE_WALL_SIGN(-182),
	SPRUCE_STANDING_SIGN(-181),
	NORMAL_STONE_STAIRS(-180),
	MOSSY_COBBLESTONE_STAIRS(-179),
	END_BRICK_STAIRS(-178),
	SMOOTH_SANDSTONE_STAIRS(-177),
	SMOOTH_RED_SANDSTONE_STAIRS(-176),
	MOSSY_STONE_BRICK_STAIRS(-175),
	POLISHED_ANDESITE_STAIRS(-174),
	POLISHED_DIORITE_STAIRS(-173),
	POLISHED_GRANITE_STAIRS(-172),
	ANDESITE_STAIRS(-171),
	DIORITE_STAIRS(-170),
	GRANITE_STAIRS(-169),
	DOUBLE_STONE_BLOCK_SLAB4(-168),
	DOUBLE_STONE_BLOCK_SLAB3(-167),
	STONE_BLOCK_SLAB4(-166),
	SCAFFOLDING(-165),
	BAMBOO_SAPLING(-164),
	BAMBOO(-163),
	STONE_BLOCK_SLAB3(-162),
	BARRIER(-161),
	BUBBLE_COLUMN(-160),
	TURTLE_EGG(-159),
	AIR(-158),
	CONDUIT(-157),
	SEA_PICKLE(-156),
	CARVED_PUMPKIN(-155),
	SPRUCE_PRESSURE_PLATE(-154),
	JUNGLE_PRESSURE_PLATE(-153),
	DARK_OAK_PRESSURE_PLATE(-152),
	BIRCH_PRESSURE_PLATE(-151),
	ACACIA_PRESSURE_PLATE(-150),
	SPRUCE_TRAPDOOR(-149),
	JUNGLE_TRAPDOOR(-148),
	DARK_OAK_TRAPDOOR(-147),
	BIRCH_TRAPDOOR(-146),
	ACACIA_TRAPDOOR(-145),
	SPRUCE_BUTTON(-144),
	JUNGLE_BUTTON(-143),
	DARK_OAK_BUTTON(-142),
	BIRCH_BUTTON(-141),
	ACACIA_BUTTON(-140),
	DRIED_KELP_BLOCK(-139),
	ITEMKELP(-138),
	CORAL_FAN_HANG3(-137),
	CORAL_FAN_HANG2(-136),
	CORAL_FAN_HANG(-135),
	CORAL_FAN_DEAD(-134),
	CORAL_FAN(-133),
	CORAL_BLOCK(-132),
	CORAL(-131),
	SEAGRASS(-130),
	ELEMENT_118(-129),
	ELEMENT_117(-128),
	ELEMENT_116(-127),
	ELEMENT_115(-126),
	ELEMENT_114(-125),
	ELEMENT_113(-124),
	ELEMENT_112(-123),
	ELEMENT_111(-122),
	ELEMENT_110(-121),
	ELEMENT_109(-120),
	ELEMENT_108(-119),
	ELEMENT_107(-118),
	ELEMENT_106(-117),
	ELEMENT_105(-116),
	ELEMENT_104(-115),
	ELEMENT_103(-114),
	ELEMENT_102(-113),
	ELEMENT_101(-112),
	ELEMENT_100(-111),
	ELEMENT_99(-110),
	ELEMENT_98(-109),
	ELEMENT_97(-108),
	ELEMENT_96(-107),
	ELEMENT_95(-106),
	ELEMENT_94(-105),
	ELEMENT_93(-104),
	ELEMENT_92(-103),
	ELEMENT_91(-102),
	ELEMENT_90(-101),
	ELEMENT_89(-100),
	ELEMENT_88(-99),
	ELEMENT_87(-98),
	ELEMENT_86(-97),
	ELEMENT_85(-96),
	ELEMENT_84(-95),
	ELEMENT_83(-94),
	ELEMENT_82(-93),
	ELEMENT_81(-92),
	ELEMENT_80(-91),
	ELEMENT_79(-90),
	ELEMENT_78(-89),
	ELEMENT_77(-88),
	ELEMENT_76(-87),
	ELEMENT_75(-86),
	ELEMENT_74(-85),
	ELEMENT_73(-84),
	ELEMENT_72(-83),
	ELEMENT_71(-82),
	ELEMENT_70(-81),
	ELEMENT_69(-80),
	ELEMENT_68(-79),
	ELEMENT_67(-78),
	ELEMENT_66(-77),
	ELEMENT_65(-76),
	ELEMENT_64(-75),
	ELEMENT_63(-74),
	ELEMENT_62(-73),
	ELEMENT_61(-72),
	ELEMENT_60(-71),
	ELEMENT_59(-70),
	ELEMENT_58(-69),
	ELEMENT_57(-68),
	ELEMENT_56(-67),
	ELEMENT_55(-66),
	ELEMENT_54(-65),
	ELEMENT_53(-64),
	ELEMENT_52(-63),
	ELEMENT_51(-62),
	ELEMENT_50(-61),
	ELEMENT_49(-60),
	ELEMENT_48(-59),
	ELEMENT_47(-58),
	ELEMENT_46(-57),
	ELEMENT_45(-56),
	ELEMENT_44(-55),
	ELEMENT_43(-54),
	ELEMENT_42(-53),
	ELEMENT_41(-52),
	ELEMENT_40(-51),
	ELEMENT_39(-50),
	ELEMENT_38(-49),
	ELEMENT_37(-48),
	ELEMENT_36(-47),
	ELEMENT_35(-46),
	ELEMENT_34(-45),
	ELEMENT_33(-44),
	ELEMENT_32(-43),
	ELEMENT_31(-42),
	ELEMENT_30(-41),
	ELEMENT_29(-40),
	ELEMENT_28(-39),
	ELEMENT_27(-38),
	ELEMENT_26(-37),
	ELEMENT_25(-36),
	ELEMENT_24(-35),
	ELEMENT_23(-34),
	ELEMENT_22(-33),
	ELEMENT_21(-32),
	ELEMENT_20(-31),
	ELEMENT_19(-30),
	ELEMENT_18(-29),
	ELEMENT_17(-28),
	ELEMENT_16(-27),
	ELEMENT_15(-26),
	ELEMENT_14(-25),
	ELEMENT_13(-24),
	ELEMENT_12(-23),
	ELEMENT_11(-22),
	ELEMENT_10(-21),
	ELEMENT_9(-20),
	ELEMENT_8(-19),
	ELEMENT_7(-18),
	ELEMENT_6(-17),
	ELEMENT_5(-16),
	ELEMENT_4(-15),
	ELEMENT_3(-14),
	ELEMENT_2(-13),
	ELEMENT_1(-12),
	BLUE_ICE(-11),
	STRIPPED_OAK_LOG(-10),
	STRIPPED_DARK_OAK_LOG(-9),
	STRIPPED_ACACIA_LOG(-8),
	STRIPPED_JUNGLE_LOG(-7),
	STRIPPED_BIRCH_LOG(-6),
	STRIPPED_SPRUCE_LOG(-5),
	PRISMARINE_BRICKS_STAIRS(-4),
	DARK_PRISMARINE_STAIRS(-3),
	PRISMARINE_STAIRS(-2),
	STONE(1),
	GRASS(2),
	DIRT(3),
	COBBLESTONE(4),
	PLANKS(5),
	SAPLING(6),
	BEDROCK(7),
	FLOWING_WATER(8),
	WATER(9),
	FLOWING_LAVA(10),
	LAVA(11),
	SAND(12),
	GRAVEL(13),
	GOLD_ORE(14),
	IRON_ORE(15),
	COAL_ORE(16),
	LOG(17),
	LEAVES(18),
	SPONGE(19),
	GLASS(20),
	LAPIS_ORE(21),
	LAPIS_BLOCK(22),
	DISPENSER(23),
	SANDSTONE(24),
	NOTEBLOCK(25),
	ITEMBED(26),
	GOLDEN_RAIL(27),
	DETECTOR_RAIL(28),
	STICKY_PISTON(29),
	WEB(30),
	TALLGRASS(31),
	DEADBUSH(32),
	PISTON(33),
	PISTON_ARM_COLLISION(34),
	WOOL(35),
	ELEMENT_0(36),
	YELLOW_FLOWER(37),
	RED_FLOWER(38),
	BROWN_MUSHROOM(39),
	RED_MUSHROOM(40),
	GOLD_BLOCK(41),
	IRON_BLOCK(42),
	DOUBLE_STONE_BLOCK_SLAB(43),
	STONE_BLOCK_SLAB(44),
	BRICK_BLOCK(45),
	TNT(46),
	BOOKSHELF(47),
	MOSSY_COBBLESTONE(48),
	OBSIDIAN(49),
	TORCH(50),
	FIRE(51),
	MOB_SPAWNER(52),
	OAK_STAIRS(53),
	CHEST(54),
	REDSTONE_WIRE(55),
	DIAMOND_ORE(56),
	DIAMOND_BLOCK(57),
	CRAFTING_TABLE(58),
	ITEMWHEAT(59),
	FARMLAND(60),
	FURNACE(61),
	LIT_FURNACE(62),
	STANDING_SIGN(63),
	ITEMWOODEN_DOOR(64),
	LADDER(65),
	RAIL(66),
	STONE_STAIRS(67),
	WALL_SIGN(68),
	LEVER(69),
	STONE_PRESSURE_PLATE(70),
	ITEMIRON_DOOR(71),
	WOODEN_PRESSURE_PLATE(72),
	REDSTONE_ORE(73),
	LIT_REDSTONE_ORE(74),
	UNLIT_REDSTONE_TORCH(75),
	REDSTONE_TORCH(76),
	STONE_BUTTON(77),
	SNOW_LAYER(78),
	ICE(79),
	SNOW(80),
	CACTUS(81),
	CLAY(82),
	ITEMREEDS(83),
	JUKEBOX(84),
	FENCE(85),
	PUMPKIN(86),
	NETHERRACK(87),
	SOUL_SAND(88),
	GLOWSTONE(89),
	PORTAL(90),
	LIT_PUMPKIN(91),
	ITEMCAKE(92),
	UNPOWERED_REPEATER(93),
	POWERED_REPEATER(94),
	INVISIBLE_BEDROCK(95),
	TRAPDOOR(96),
	MONSTER_EGG(97),
	STONEBRICK(98),
	BROWN_MUSHROOM_BLOCK(99),
	RED_MUSHROOM_BLOCK(100),
	IRON_BARS(101),
	GLASS_PANE(102),
	MELON_BLOCK(103),
	PUMPKIN_STEM(104),
	MELON_STEM(105),
	VINE(106),
	FENCE_GATE(107),
	BRICK_STAIRS(108),
	STONE_BRICK_STAIRS(109),
	MYCELIUM(110),
	WATERLILY(111),
	NETHER_BRICK(112),
	NETHER_BRICK_FENCE(113),
	NETHER_BRICK_STAIRS(114),
	ITEMNETHER_WART(115),
	ENCHANTING_TABLE(116),
	ITEMBREWING_STAND(117),
	ITEMCAULDRON(118),
	END_PORTAL(119),
	END_PORTAL_FRAME(120),
	END_STONE(121),
	DRAGON_EGG(122),
	REDSTONE_LAMP(123),
	LIT_REDSTONE_LAMP(124),
	DROPPER(125),
	ACTIVATOR_RAIL(126),
	COCOA(127),
	SANDSTONE_STAIRS(128),
	EMERALD_ORE(129),
	ENDER_CHEST(130),
	TRIPWIRE_HOOK(131),
	TRIP_WIRE(132),
	EMERALD_BLOCK(133),
	SPRUCE_STAIRS(134),
	BIRCH_STAIRS(135),
	JUNGLE_STAIRS(136),
	COMMAND_BLOCK(137),
	BEACON(138),
	COBBLESTONE_WALL(139),
	ITEMFLOWER_POT(140),
	CARROTS(141),
	POTATOES(142),
	WOODEN_BUTTON(143),
	ITEMSKULL(144),
	ANVIL(145),
	TRAPPED_CHEST(146),
	LIGHT_WEIGHTED_PRESSURE_PLATE(147),
	HEAVY_WEIGHTED_PRESSURE_PLATE(148),
	UNPOWERED_COMPARATOR(149),
	POWERED_COMPARATOR(150),
	DAYLIGHT_DETECTOR(151),
	REDSTONE_BLOCK(152),
	QUARTZ_ORE(153),
	ITEMHOPPER(154),
	QUARTZ_BLOCK(155),
	QUARTZ_STAIRS(156),
	DOUBLE_WOODEN_SLAB(157),
	WOODEN_SLAB(158),
	STAINED_HARDENED_CLAY(159),
	STAINED_GLASS_PANE(160),
	LEAVES2(161),
	LOG2(162),
	ACACIA_STAIRS(163),
	DARK_OAK_STAIRS(164),
	SLIME(165),
	IRON_TRAPDOOR(167),
	PRISMARINE(168),
	SEA_LANTERN(169),
	HAY_BLOCK(170),
	CARPET(171),
	HARDENED_CLAY(172),
	COAL_BLOCK(173),
	PACKED_ICE(174),
	DOUBLE_PLANT(175),
	STANDING_BANNER(176),
	WALL_BANNER(177),
	DAYLIGHT_DETECTOR_INVERTED(178),
	RED_SANDSTONE(179),
	RED_SANDSTONE_STAIRS(180),
	DOUBLE_STONE_BLOCK_SLAB2(181),
	STONE_BLOCK_SLAB2(182),
	SPRUCE_FENCE_GATE(183),
	BIRCH_FENCE_GATE(184),
	JUNGLE_FENCE_GATE(185),
	DARK_OAK_FENCE_GATE(186),
	ACACIA_FENCE_GATE(187),
	REPEATING_COMMAND_BLOCK(188),
	CHAIN_COMMAND_BLOCK(189),
	HARD_GLASS_PANE(190),
	HARD_STAINED_GLASS_PANE(191),
	CHEMICAL_HEAT(192),
	ITEMSPRUCE_DOOR(193),
	ITEMBIRCH_DOOR(194),
	ITEMJUNGLE_DOOR(195),
	ITEMACACIA_DOOR(196),
	ITEMDARK_OAK_DOOR(197),
	GRASS_PATH(198),
	ITEMFRAME(199),
	CHORUS_FLOWER(200),
	PURPUR_BLOCK(201),
	COLORED_TORCH_RG(202),
	PURPUR_STAIRS(203),
	COLORED_TORCH_BP(204),
	UNDYED_SHULKER_BOX(205),
	END_BRICKS(206),
	FROSTED_ICE(207),
	END_ROD(208),
	END_GATEWAY(209),
	ALLOW(210),
	DENY(211),
	BORDER_BLOCK(212),
	MAGMA(213),
	NETHER_WART_BLOCK(214),
	RED_NETHER_BRICK(215),
	BONE_BLOCK(216),
	STRUCTURE_VOID(217),
	SHULKER_BOX(218),
	PURPLE_GLAZED_TERRACOTTA(219),
	WHITE_GLAZED_TERRACOTTA(220),
	ORANGE_GLAZED_TERRACOTTA(221),
	MAGENTA_GLAZED_TERRACOTTA(222),
	LIGHT_BLUE_GLAZED_TERRACOTTA(223),
	YELLOW_GLAZED_TERRACOTTA(224),
	LIME_GLAZED_TERRACOTTA(225),
	PINK_GLAZED_TERRACOTTA(226),
	GRAY_GLAZED_TERRACOTTA(227),
	SILVER_GLAZED_TERRACOTTA(228),
	CYAN_GLAZED_TERRACOTTA(229),
	BLUE_GLAZED_TERRACOTTA(231),
	BROWN_GLAZED_TERRACOTTA(232),
	GREEN_GLAZED_TERRACOTTA(233),
	RED_GLAZED_TERRACOTTA(234),
	BLACK_GLAZED_TERRACOTTA(235),
	CONCRETE(236),
	CONCRETE_POWDER(237),
	CHEMISTRY_TABLE(238),
	UNDERWATER_TORCH(239),
	CHORUS_PLANT(240),
	STAINED_GLASS(241),
	ITEMCAMERA(242),
	PODZOL(243),
	ITEMBEETROOT(244),
	STONECUTTER(245),
	GLOWINGOBSIDIAN(246),
	NETHERREACTOR(247),
	INFO_UPDATE(248),
	INFO_UPDATE2(249),
	MOVING_BLOCK(250),
	OBSERVER(251),
	STRUCTURE_BLOCK(252),
	HARD_GLASS(253),
	HARD_STAINED_GLASS(254),
	RESERVED6(255),
	APPLE(257),
	GOLDEN_APPLE(258),
	ENCHANTED_GOLDEN_APPLE(259),
	MUSHROOM_STEW(260),
	BREAD(261),
	PORKCHOP(262),
	COOKED_PORKCHOP(263),
	COD(264),
	SALMON(265),
	TROPICAL_FISH(266),
	PUFFERFISH(267),
	COOKED_COD(268),
	COOKED_SALMON(269),
	DRIED_KELP(270),
	COOKIE(271),
	MELON_SLICE(272),
	BEEF(273),
	COOKED_BEEF(274),
	CHICKEN(275),
	COOKED_CHICKEN(276),
	ROTTEN_FLESH(277),
	SPIDER_EYE(278),
	CARROT(279),
	POTATO(280),
	BAKED_POTATO(281),
	POISONOUS_POTATO(282),
	GOLDEN_CARROT(283),
	PUMPKIN_PIE(284),
	BEETROOT(285),
	BEETROOT_SOUP(286),
	SWEET_BERRIES(287),
	RABBIT(288),
	COOKED_RABBIT(289),
	RABBIT_STEW(290),
	WHEAT_SEEDS(291),
	PUMPKIN_SEEDS(292),
	MELON_SEEDS(293),
	NETHER_WART(294),
	BEETROOT_SEEDS(295),
	IRON_SHOVEL(296),
	IRON_PICKAXE(297),
	IRON_AXE(298),
	FLINT_AND_STEEL(299),
	BOW(300),
	ARROW(301),
	COAL(302),
	CHARCOAL(303),
	DIAMOND(304),
	IRON_INGOT(305),
	GOLD_INGOT(306),
	IRON_SWORD(307),
	WOODEN_SWORD(308),
	WOODEN_SHOVEL(309),
	WOODEN_PICKAXE(310),
	WOODEN_AXE(311),
	STONE_SWORD(312),
	STONE_SHOVEL(313),
	STONE_PICKAXE(314),
	STONE_AXE(315),
	DIAMOND_SWORD(316),
	DIAMOND_SHOVEL(317),
	DIAMOND_PICKAXE(318),
	DIAMOND_AXE(319),
	STICK(320),
	BOWL(321),
	GOLDEN_SWORD(322),
	GOLDEN_SHOVEL(323),
	GOLDEN_PICKAXE(324),
	GOLDEN_AXE(325),
	STRING(326),
	FEATHER(327),
	GUNPOWDER(328),
	WOODEN_HOE(329),
	STONE_HOE(330),
	IRON_HOE(331),
	DIAMOND_HOE(332),
	GOLDEN_HOE(333),
	WHEAT(334),
	LEATHER_HELMET(335),
	LEATHER_CHESTPLATE(336),
	LEATHER_LEGGINGS(337),
	LEATHER_BOOTS(338),
	CHAINMAIL_HELMET(339),
	CHAINMAIL_CHESTPLATE(340),
	CHAINMAIL_LEGGINGS(341),
	CHAINMAIL_BOOTS(342),
	IRON_HELMET(343),
	IRON_CHESTPLATE(344),
	IRON_LEGGINGS(345),
	IRON_BOOTS(346),
	DIAMOND_HELMET(347),
	DIAMOND_CHESTPLATE(348),
	DIAMOND_LEGGINGS(349),
	DIAMOND_BOOTS(350),
	GOLDEN_HELMET(351),
	GOLDEN_CHESTPLATE(352),
	GOLDEN_LEGGINGS(353),
	GOLDEN_BOOTS(354),
	SHIELD(355),
	FLINT(356),
	PAINTING(357),
	OAK_SIGN(358),
	WOODEN_DOOR(359),
	BUCKET(360),
	MILK_BUCKET(361),
	WATER_BUCKET(362),
	LAVA_BUCKET(363),
	COD_BUCKET(364),
	SALMON_BUCKET(365),
	TROPICAL_FISH_BUCKET(366),
	PUFFERFISH_BUCKET(367),
	POWDER_SNOW_BUCKET(368),
	AXOLOTL_BUCKET(369),
	MINECART(370),
	SADDLE(371),
	IRON_DOOR(372),
	REDSTONE(373),
	SNOWBALL(374),
	OAK_BOAT(375),
	BIRCH_BOAT(376),
	JUNGLE_BOAT(377),
	SPRUCE_BOAT(378),
	ACACIA_BOAT(379),
	DARK_OAK_BOAT(380),
	LEATHER(381),
	KELP(382),
	BRICK(383),
	CLAY_BALL(384),
	SUGAR_CANE(385),
	PAPER(386),
	BOOK(387),
	SLIME_BALL(388),
	CHEST_MINECART(389),
	EGG(390),
	COMPASS(391),
	FISHING_ROD(392),
	CLOCK(393),
	GLOWSTONE_DUST(394),
	BLACK_DYE(395),
	RED_DYE(396),
	GREEN_DYE(397),
	BROWN_DYE(398),
	BLUE_DYE(399),
	PURPLE_DYE(400),
	CYAN_DYE(401),
	LIGHT_GRAY_DYE(402),
	GRAY_DYE(403),
	PINK_DYE(404),
	LIME_DYE(405),
	YELLOW_DYE(406),
	LIGHT_BLUE_DYE(407),
	MAGENTA_DYE(408),
	ORANGE_DYE(409),
	WHITE_DYE(410),
	BONE_MEAL(411),
	COCOA_BEANS(412),
	INK_SAC(413),
	LAPIS_LAZULI(414),
	BONE(415),
	SUGAR(416),
	CAKE(417),
	BED(418),
	REPEATER(419),
	FILLED_MAP(420),
	SHEARS(421),
	ENDER_PEARL(422),
	BLAZE_ROD(423),
	GHAST_TEAR(424),
	GOLD_NUGGET(425),
	POTION(426),
	GLASS_BOTTLE(427),
	FERMENTED_SPIDER_EYE(428),
	BLAZE_POWDER(429),
	MAGMA_CREAM(430),
	BREWING_STAND(431),
	CAULDRON(432),
	ENDER_EYE(433),
	GLISTERING_MELON_SLICE(434),
	CHICKEN_SPAWN_EGG(435),
	COW_SPAWN_EGG(436),
	PIG_SPAWN_EGG(437),
	SHEEP_SPAWN_EGG(438),
	WOLF_SPAWN_EGG(439),
	MOOSHROOM_SPAWN_EGG(440),
	CREEPER_SPAWN_EGG(441),
	ENDERMAN_SPAWN_EGG(442),
	SILVERFISH_SPAWN_EGG(443),
	SKELETON_SPAWN_EGG(444),
	SLIME_SPAWN_EGG(445),
	SPIDER_SPAWN_EGG(446),
	ZOMBIE_SPAWN_EGG(447),
	ZOMBIE_PIGMAN_SPAWN_EGG(448),
	VILLAGER_SPAWN_EGG(449),
	SQUID_SPAWN_EGG(450),
	OCELOT_SPAWN_EGG(451),
	WITCH_SPAWN_EGG(452),
	BAT_SPAWN_EGG(453),
	GHAST_SPAWN_EGG(454),
	MAGMA_CUBE_SPAWN_EGG(455),
	BLAZE_SPAWN_EGG(456),
	CAVE_SPIDER_SPAWN_EGG(457),
	HORSE_SPAWN_EGG(458),
	RABBIT_SPAWN_EGG(459),
	ENDERMITE_SPAWN_EGG(460),
	GUARDIAN_SPAWN_EGG(461),
	STRAY_SPAWN_EGG(462),
	HUSK_SPAWN_EGG(463),
	WITHER_SKELETON_SPAWN_EGG(464),
	DONKEY_SPAWN_EGG(465),
	MULE_SPAWN_EGG(466),
	SKELETON_HORSE_SPAWN_EGG(467),
	ZOMBIE_HORSE_SPAWN_EGG(468),
	SHULKER_SPAWN_EGG(469),
	NPC_SPAWN_EGG(470),
	ELDER_GUARDIAN_SPAWN_EGG(471),
	POLAR_BEAR_SPAWN_EGG(472),
	LLAMA_SPAWN_EGG(473),
	VINDICATOR_SPAWN_EGG(474),
	EVOKER_SPAWN_EGG(475),
	VEX_SPAWN_EGG(476),
	ZOMBIE_VILLAGER_SPAWN_EGG(477),
	PARROT_SPAWN_EGG(478),
	TROPICAL_FISH_SPAWN_EGG(479),
	COD_SPAWN_EGG(480),
	PUFFERFISH_SPAWN_EGG(481),
	SALMON_SPAWN_EGG(482),
	DROWNED_SPAWN_EGG(483),
	DOLPHIN_SPAWN_EGG(484),
	TURTLE_SPAWN_EGG(485),
	PHANTOM_SPAWN_EGG(486),
	AGENT_SPAWN_EGG(487),
	CAT_SPAWN_EGG(488),
	PANDA_SPAWN_EGG(489),
	FOX_SPAWN_EGG(490),
	PILLAGER_SPAWN_EGG(491),
	WANDERING_TRADER_SPAWN_EGG(492),
	RAVAGER_SPAWN_EGG(493),
	BEE_SPAWN_EGG(494),
	STRIDER_SPAWN_EGG(495),
	HOGLIN_SPAWN_EGG(496),
	PIGLIN_SPAWN_EGG(497),
	ZOGLIN_SPAWN_EGG(498),
	PIGLIN_BRUTE_SPAWN_EGG(499),
	SNIFFER_SPAWN_EGG(500),
	AXOLOTL_SPAWN_EGG(501),
	GOAT_SPAWN_EGG(502),
	GLOW_SQUID_SPAWN_EGG(503),
	IRON_GOLEM_SPAWN_EGG(504),
	SNOW_GOLEM_SPAWN_EGG(505),
	ENDER_DRAGON_SPAWN_EGG(506),
	WITHER_SPAWN_EGG(507),
	GLOW_INK_SAC(508),
	COPPER_INGOT(509),
	RAW_IRON(510),
	RAW_GOLD(511),
	RAW_COPPER(512),
	EXPERIENCE_BOTTLE(513),
	FIRE_CHARGE(514),
	WRITABLE_BOOK(515),
	WRITTEN_BOOK(516),
	EMERALD(517),
	FRAME(518),
	FLOWER_POT(519),
	EMPTY_MAP(520),
	SKULL(521),
	CARROT_ON_A_STICK(522),
	NETHER_STAR(523),
	FIREWORK_ROCKET(524),
	FIREWORK_STAR(525),
	ENCHANTED_BOOK(526),
	COMPARATOR(527),
	NETHERBRICK(528),
	QUARTZ(529),
	TNT_MINECART(530),
	HOPPER_MINECART(531),
	HOPPER(532),
	RABBIT_FOOT(533),
	RABBIT_HIDE(534),
	LEATHER_HORSE_ARMOR(535),
	IRON_HORSE_ARMOR(536),
	GOLDEN_HORSE_ARMOR(537),
	DIAMOND_HORSE_ARMOR(538),
	MUSIC_DISC_13(539),
	MUSIC_DISC_CAT(540),
	MUSIC_DISC_BLOCKS(541),
	MUSIC_DISC_CHIRP(542),
	MUSIC_DISC_FAR(543),
	MUSIC_DISC_MALL(544),
	MUSIC_DISC_MELLOHI(545),
	MUSIC_DISC_STAL(546),
	MUSIC_DISC_STRAD(547),
	MUSIC_DISC_WARD(548),
	MUSIC_DISC_11(549),
	MUSIC_DISC_WAIT(550),
	TRIDENT(551),
	LEAD(552),
	NAME_TAG(553),
	PRISMARINE_CRYSTALS(554),
	MUTTON(555),
	COOKED_MUTTON(556),
	ARMOR_STAND(557),
	SPRUCE_DOOR(558),
	BIRCH_DOOR(559),
	JUNGLE_DOOR(560),
	ACACIA_DOOR(561),
	DARK_OAK_DOOR(562),
	CHORUS_FRUIT(563),
	POPPED_CHORUS_FRUIT(564),
	DRAGON_BREATH(565),
	SPLASH_POTION(566),
	LINGERING_POTION(567),
	COMMAND_BLOCK_MINECART(568),
	ELYTRA(569),
	PRISMARINE_SHARD(570),
	SHULKER_SHELL(571),
	BANNER(572),
	TOTEM_OF_UNDYING(573),
	IRON_NUGGET(574),
	NAUTILUS_SHELL(575),
	HEART_OF_THE_SEA(576),
	SCUTE(577),
	TURTLE_HELMET(578),
	PHANTOM_MEMBRANE(579),
	CROSSBOW(580),
	SPRUCE_SIGN(581),
	BIRCH_SIGN(582),
	JUNGLE_SIGN(583),
	ACACIA_SIGN(584),
	DARK_OAK_SIGN(585),
	FLOWER_BANNER_PATTERN(586),
	CREEPER_BANNER_PATTERN(587),
	SKULL_BANNER_PATTERN(588),
	MOJANG_BANNER_PATTERN(589),
	FIELD_MASONED_BANNER_PATTERN(590),
	BORDURE_INDENTED_BANNER_PATTERN(591),
	PIGLIN_BANNER_PATTERN(592),
	GLOBE_BANNER_PATTERN(593),
	CAMPFIRE(594),
	SUSPICIOUS_STEW(595),
	HONEYCOMB(596),
	HONEY_BOTTLE(597),
	CAMERA(598),
	COMPOUND(599),
	ICE_BOMB(600),
	BLEACH(601),
	RAPID_FERTILIZER(602),
	BALLOON(603),
	MEDICINE(604),
	SPARKLER(605),
	GLOW_STICK(606),
	LODESTONE_COMPASS(607),
	NETHERITE_INGOT(608),
	NETHERITE_SWORD(609),
	NETHERITE_SHOVEL(610),
	NETHERITE_PICKAXE(611),
	NETHERITE_AXE(612),
	NETHERITE_HOE(613),
	NETHERITE_HELMET(614),
	NETHERITE_CHESTPLATE(615),
	NETHERITE_LEGGINGS(616),
	NETHERITE_BOOTS(617),
	NETHERITE_SCRAP(618),
	CRIMSON_SIGN(619),
	WARPED_SIGN(620),
	CRIMSON_DOOR(621),
	WARPED_DOOR(622),
	WARPED_FUNGUS_ON_A_STICK(623),
	CHAIN(624),
	MUSIC_DISC_PIGSTEP(625),
	NETHER_SPROUTS(626),
	SOUL_CAMPFIRE(627),
	GLOW_FRAME(628),
	AMETHYST_SHARD(629),
	SPYGLASS(630),
	MUSIC_DISC_OTHERSIDE(631),
	GOAT_HORN(632),
	FROG_SPAWN_EGG(633),
	TADPOLE_SPAWN_EGG(634),
	TADPOLE_BUCKET(635),
	ALLAY_SPAWN_EGG(636),
	WARDEN_SPAWN_EGG(637),
	MANGROVE_DOOR(638),
	MANGROVE_SIGN(639),
	MANGROVE_BOAT(640),
	MUSIC_DISC_5(641),
	DISC_FRAGMENT_5(642),
	OAK_CHEST_BOAT(643),
	BIRCH_CHEST_BOAT(644),
	JUNGLE_CHEST_BOAT(645),
	SPRUCE_CHEST_BOAT(646),
	ACACIA_CHEST_BOAT(647),
	DARK_OAK_CHEST_BOAT(648),
	MANGROVE_CHEST_BOAT(649),
	CHEST_BOAT(650),
	RECOVERY_COMPASS(651),
	ECHO_SHARD(652),
	TRADER_LLAMA_SPAWN_EGG(653),
	BAMBOO_SIGN(654),
	BAMBOO_RAFT(655),
	BAMBOO_CHEST_RAFT(656),
	CAMEL_SPAWN_EGG(657),
	BOAT(658),
	DYE(659),
	BANNER_PATTERN(660),
	SPAWN_EGG(661),
	END_CRYSTAL(662),
	GLOW_BERRIES(663);

	private static final Map<Integer, Material> BY_RUNTIME_ID = new HashMap<>();
	private static final Map<String, Material> BY_IDENTIFIER = new HashMap<>();

	static {
		Arrays.stream(Material.values()).forEach(type -> {
			BY_RUNTIME_ID.putIfAbsent(type.getItemRuntimeId(), type);
			BY_IDENTIFIER.putIfAbsent(type.getIdentifier(), type);
		});
	}

	private final String identifier;
	private final int itemRuntimeId;

	Material(int itemRuntimeId) {
		this.identifier = ItemPalette.getIdentifier(itemRuntimeId);
		this.itemRuntimeId = itemRuntimeId;
	}

	public static Material fromItemRuntimeId(int itemRuntimeId) {
		return BY_RUNTIME_ID.get(itemRuntimeId);
	}

	public static Material fromIdentifier(String identifier) {
		if (!identifier.startsWith("minecraft:")) {
			identifier = "minecraft:" + identifier;
		}

		return BY_IDENTIFIER.get(identifier);
	}

	public <T extends Item> T getItem() {
		return Server.getInstance().getItemRegistry().from(this);
	}

	public <T extends Block> T getBlock() {
		return Server.getInstance().getBlockRegistry().from(this);
	}

	public <T extends Block> T getBlock(BlockState state) {
		return Server.getInstance().getBlockRegistry().from(this, state);
	}
}
