package moze_intel.projecte.gameObjs.registries;

import java.util.function.Consumer;
import moze_intel.projecte.PECore;
import moze_intel.projecte.gameObjs.items.rings.Arcana.ArcanaMode;
import moze_intel.projecte.utils.text.PELang;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class PECreativeTabs {

	public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PECore.MODID);

	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> PROJECTE = CREATIVE_TABS.register("projecte", () -> CreativeModeTab.builder()
			.title(PELang.PROJECTE.translate())
			.icon(() -> PEItems.PHILOSOPHERS_STONE.asStack())
			.displayItems((displayParameters, output) -> {
				output.accept(PEItems.PHILOSOPHERS_STONE);
				output.accept(PEItems.REPAIR_TALISMAN);
				output.accept(PEItems.TOME_OF_KNOWLEDGE);
				output.accept(PEItems.TRANSMUTATION_TABLET);
				output.accept(PEBlocks.TRANSMUTATION_TABLE);

				output.accept(PEItems.LOW_COVALENCE_DUST);
				output.accept(PEItems.MEDIUM_COVALENCE_DUST);
				output.accept(PEItems.HIGH_COVALENCE_DUST);

				output.accept(PEItems.ALCHEMICAL_COAL);
				output.accept(PEItems.MOBIUS_FUEL);
				output.accept(PEItems.AETERNALIS_FUEL);
				output.accept(PEItems.DARK_MATTER);
				output.accept(PEItems.RED_MATTER);
				output.accept(PEBlocks.ALCHEMICAL_COAL);
				output.accept(PEBlocks.MOBIUS_FUEL);
				output.accept(PEBlocks.AETERNALIS_FUEL);
				output.accept(PEBlocks.DARK_MATTER);
				output.accept(PEBlocks.RED_MATTER);

				output.accept(PEItems.KLEIN_STAR_EIN);
				output.accept(PEItems.KLEIN_STAR_ZWEI);
				output.accept(PEItems.KLEIN_STAR_DREI);
				output.accept(PEItems.KLEIN_STAR_VIER);
				output.accept(PEItems.KLEIN_STAR_SPHERE);
				output.accept(PEItems.KLEIN_STAR_OMEGA);

				output.accept(PEItems.DARK_MATTER_PICKAXE);
				output.accept(PEItems.DARK_MATTER_AXE);
				output.accept(PEItems.DARK_MATTER_SHOVEL);
				output.accept(PEItems.DARK_MATTER_HOE);
				output.accept(PEItems.DARK_MATTER_SHEARS);
				output.accept(PEItems.DARK_MATTER_HAMMER);
				output.accept(PEItems.DARK_MATTER_SWORD);

				output.accept(PEItems.RED_MATTER_PICKAXE);
				output.accept(PEItems.RED_MATTER_AXE);
				output.accept(PEItems.RED_MATTER_SHOVEL);
				output.accept(PEItems.RED_MATTER_HOE);
				output.accept(PEItems.RED_MATTER_SHEARS);
				output.accept(PEItems.RED_MATTER_HAMMER);
				output.accept(PEItems.RED_MATTER_MORNING_STAR);
				output.accept(PEItems.RED_MATTER_SWORD);
				output.accept(PEItems.RED_MATTER_KATAR);

				addArmor(output::accept);

				output.accept(PEItems.DESTRUCTION_CATALYST);
				output.accept(PEItems.HYPERKINETIC_LENS);
				output.accept(PEItems.CATALYTIC_LENS);

				output.accept(PEItems.IRON_BAND);
				output.accept(PEItems.BLACK_HOLE_BAND);
				output.accept(PEItems.ARCHANGEL_SMITE);
				output.accept(PEItems.HARVEST_GODDESS_BAND);
				output.accept(PEItems.IGNITION_RING);
				output.accept(PEItems.ZERO_RING);
				output.accept(PEItems.SWIFTWOLF_RENDING_GALE);
				output.accept(PEItems.WATCH_OF_FLOWING_TIME);
				output.accept(PEItems.EVERTIDE_AMULET);
				output.accept(PEItems.VOLCANITE_AMULET);
				output.accept(PEItems.GEM_OF_ETERNAL_DENSITY);
				output.accept(PEItems.MERCURIAL_EYE);
				output.accept(PEItems.VOID_RING);

				for (ArcanaMode value : ArcanaMode.values()) {
					ItemStack stack = PEItems.ARCANA_RING.asStack();
					stack.set(PEDataComponentTypes.ARCANA_MODE, value);
					output.accept(stack);
				}

				output.accept(PEItems.BODY_STONE);
				output.accept(PEItems.SOUL_STONE);
				output.accept(PEItems.MIND_STONE);
				output.accept(PEItems.LIFE_STONE);

				output.accept(PEItems.LOW_DIVINING_ROD);
				output.accept(PEItems.MEDIUM_DIVINING_ROD);
				output.accept(PEItems.HIGH_DIVINING_ROD);

				output.accept(PEItems.WHITE_ALCHEMICAL_BAG);
				output.accept(PEItems.ORANGE_ALCHEMICAL_BAG);
				output.accept(PEItems.MAGENTA_ALCHEMICAL_BAG);
				output.accept(PEItems.LIGHT_BLUE_ALCHEMICAL_BAG);
				output.accept(PEItems.YELLOW_ALCHEMICAL_BAG);
				output.accept(PEItems.LIME_ALCHEMICAL_BAG);
				output.accept(PEItems.PINK_ALCHEMICAL_BAG);
				output.accept(PEItems.GRAY_ALCHEMICAL_BAG);
				output.accept(PEItems.LIGHT_GRAY_ALCHEMICAL_BAG);
				output.accept(PEItems.CYAN_ALCHEMICAL_BAG);
				output.accept(PEItems.PURPLE_ALCHEMICAL_BAG);
				output.accept(PEItems.BLUE_ALCHEMICAL_BAG);
				output.accept(PEItems.BROWN_ALCHEMICAL_BAG);
				output.accept(PEItems.GREEN_ALCHEMICAL_BAG);
				output.accept(PEItems.RED_ALCHEMICAL_BAG);
				output.accept(PEItems.BLACK_ALCHEMICAL_BAG);

				output.accept(PEBlocks.ALCHEMICAL_CHEST);
				output.accept(PEBlocks.CONDENSER);
				output.accept(PEBlocks.CONDENSER_MK2);

				output.accept(PEBlocks.COLLECTOR);
				output.accept(PEBlocks.COLLECTOR_MK2);
				output.accept(PEBlocks.COLLECTOR_MK3);
				output.accept(PEBlocks.RELAY);
				output.accept(PEBlocks.RELAY_MK2);
				output.accept(PEBlocks.RELAY_MK3);

				output.accept(PEBlocks.DARK_MATTER_PEDESTAL);
				output.accept(PEBlocks.DARK_MATTER_FURNACE);
				output.accept(PEBlocks.RED_MATTER_FURNACE);
				output.accept(PEBlocks.INTERDICTION_TORCH);
				output.accept(PEBlocks.NOVA_CATALYST);
				output.accept(PEBlocks.NOVA_CATACLYSM);
			}).build()
	);

	private static void addArmor(Consumer<ItemLike> output) {
		output.accept(PEItems.DARK_MATTER_HELMET);
		output.accept(PEItems.DARK_MATTER_CHESTPLATE);
		output.accept(PEItems.DARK_MATTER_LEGGINGS);
		output.accept(PEItems.DARK_MATTER_BOOTS);

		output.accept(PEItems.RED_MATTER_HELMET);
		output.accept(PEItems.RED_MATTER_CHESTPLATE);
		output.accept(PEItems.RED_MATTER_LEGGINGS);
		output.accept(PEItems.RED_MATTER_BOOTS);

		output.accept(PEItems.GEM_HELMET);
		output.accept(PEItems.GEM_CHESTPLATE);
		output.accept(PEItems.GEM_LEGGINGS);
		output.accept(PEItems.GEM_BOOTS);
	}
}