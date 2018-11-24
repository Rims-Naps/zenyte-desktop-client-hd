/*
 * Copyright (c) 2018, Ethan <https://github.com/shmeeps>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.prayer;

import java.util.HashMap;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.api.ItemID;

@AllArgsConstructor
@Getter
enum PrayerItems
{
	// Blessings
	PEACEFUL_BLESSING(ItemID.PEACEFUL_BLESSING, 1),
	HOLY_BLESSING(ItemID.HOLY_BLESSING, 1),
	UNHOLY_BLESSING(ItemID.UNHOLY_BLESSING, 1),
	ANCIENT_BLESSING(ItemID.ANCIENT_BLESSING, 1),
	HONOURABLE_BLESSING(ItemID.HONOURABLE_BLESSING, 1),
	WAR_BLESSING(ItemID.WAR_BLESSING, 1),

	// Rings
	EXPLORERS_RING(ItemID.EXPLORERS_RING, 1),
	EXPLORERS_RING_1(ItemID.EXPLORERS_RING_1, 1),
	EXPLORERS_RING_2(ItemID.EXPLORERS_RING_2, 1),
	EXPLORERS_RING_3(ItemID.EXPLORERS_RING_3, 1),
	EXPLORERS_RING_4(ItemID.EXPLORERS_RING_4, 1),
	RING_OF_SUFFERING(ItemID.RING_OF_SUFFERING, 2),
	RING_OF_SUFFERING_R(ItemID.RING_OF_SUFFERING_R, 2),
	RING_OF_SUFFERING_I(ItemID.RING_OF_SUFFERING_I, 4),
	RING_OF_SUFFERING_RI(ItemID.RING_OF_SUFFERING_RI, 4),
	RING_OF_THE_GODS(ItemID.RING_OF_THE_GODS, 4),
	RING_OF_THE_GODS_I(ItemID.RING_OF_THE_GODS_I, 8),

	// Necklaces
	AMULET_OF_POWER(ItemID.AMULET_OF_POWER, 1),
	BEADS_OF_THE_DEAD(ItemID.BEADS_OF_THE_DEAD, 1),
	OCCULT_NECKLACE(ItemID.OCCULT_NECKLACE, 2),
	OCCULT_NECKLACE_OR(ItemID.OCCULT_NECKLACE_OR, 2),
	AMULET_OF_TORTURE(ItemID.AMULET_OF_TORTURE, 2),
	AMULET_OF_TORTURE_OR(ItemID.AMULET_OF_TORTURE_OR, 2),
	NECKLACE_OF_ANGUISH(ItemID.NECKLACE_OF_ANGUISH, 2),
	NECKLACE_OF_ANGUISH_OR(ItemID.NECKLACE_OF_ANGUISH_OR, 2),
	AMULET_OF_GLORY(ItemID.AMULET_OF_GLORY, 3),
	AMULET_OF_GLORY1(ItemID.AMULET_OF_GLORY1, 3),
	AMULET_OF_GLORY2(ItemID.AMULET_OF_GLORY2, 3),
	AMULET_OF_GLORY3(ItemID.AMULET_OF_GLORY3, 3),
	AMULET_OF_GLORY4(ItemID.AMULET_OF_GLORY4, 3),
	AMULET_OF_GLORY5(ItemID.AMULET_OF_GLORY5, 3),
	AMULET_OF_GLORY6(ItemID.AMULET_OF_GLORY6, 3),
	AMULET_OF_GLORY_T(ItemID.AMULET_OF_GLORY_T, 3),
	AMULET_OF_GLORY_T1(ItemID.AMULET_OF_GLORY_T1, 3),
	AMULET_OF_GLORY_T2(ItemID.AMULET_OF_GLORY_T2, 3),
	AMULET_OF_GLORY_T3(ItemID.AMULET_OF_GLORY_T3, 3),
	AMULET_OF_GLORY_T4(ItemID.AMULET_OF_GLORY_T4, 3),
	AMULET_OF_GLORY_T5(ItemID.AMULET_OF_GLORY_T5, 3),
	AMULET_OF_GLORY_T6(ItemID.AMULET_OF_GLORY_T6, 3),
	AMULET_OF_ETERNAL_GLORY(ItemID.AMULET_OF_ETERNAL_GLORY, 3),
	AMULET_OF_GLORY_8283(ItemID.AMULET_OF_GLORY_8283, 3),
	AMULET_OF_GLORY_20586(ItemID.AMULET_OF_GLORY_20586, 3),
	AMULET_OF_GLORY_T_10719(ItemID.AMULET_OF_GLORY_T_10719, 3),
	BERSERKER_NECKLACE(ItemID.BERSERKER_NECKLACE, 3),
	SALVE_AMULET(ItemID.SALVE_AMULET, 3),
	SALVE_AMULET_E(ItemID.SALVE_AMULET_E, 3),
	SALVE_AMULETEI(ItemID.SALVE_AMULETEI, 3),
	SALVE_AMULETI(ItemID.SALVE_AMULETI, 3),
	AMULET_OF_FURY(ItemID.AMULET_OF_FURY, 5),
	AMULET_OF_FURY_OR(ItemID.AMULET_OF_FURY_OR, 5),
	HOLY_SYMBOL(ItemID.HOLY_SYMBOL, 8),
	HOLY_SYMBOL_4682(ItemID.HOLY_SYMBOL_4682, 8),
	UNHOLY_SYMBOL(ItemID.UNHOLY_SYMBOL, 8),
	UNHOLY_SYMBOL_4683(ItemID.UNHOLY_SYMBOL_4683, 8),
	ANCIENT_STOLE(ItemID.ANCIENT_STOLE, 10),
	ARMADYL_STOLE(ItemID.ARMADYL_STOLE, 10),
	BANDOS_STOLE(ItemID.BANDOS_STOLE, 10),
	GUTHIX_STOLE(ItemID.GUTHIX_STOLE, 10),
	SARADOMIN_STOLE(ItemID.SARADOMIN_STOLE, 10),
	ZAMORAK_STOLE(ItemID.ZAMORAK_STOLE, 10),
	DRAGONBONE_NECKLACE(ItemID.DRAGONBONE_NECKLACE, 12),

	// Helmet
	ARMADYL_HELMET(ItemID.ARMADYL_HELMET, 1),
	ANCIENT_COIF(ItemID.ANCIENT_COIF, 1),
	ARMADYL_COIF(ItemID.ARMADYL_COIF, 1),
	BANDOS_COIF(ItemID.BANDOS_COIF, 1),
	GUTHIX_COIF(ItemID.GUTHIX_COIF, 1),
	SARADOMIN_COIF(ItemID.SARADOMIN_COIF, 1),
	ZAMORAK_COIF(ItemID.ZAMORAK_COIF, 1),
	WHITE_FULL_HELM(ItemID.WHITE_FULL_HELM, 1),
	WHITE_MED_HELM(ItemID.WHITE_MED_HELM, 1),
	ANCIENT_FULL_HELM(ItemID.ANCIENT_FULL_HELM, 1),
	ARMADYL_FULL_HELM(ItemID.ARMADYL_FULL_HELM, 1),
	BANDOS_FULL_HELM(ItemID.BANDOS_FULL_HELM, 1),
	GUTHIX_FULL_HELM(ItemID.GUTHIX_FULL_HELM, 1),
	SARADOMIN_FULL_HELM(ItemID.SARADOMIN_FULL_HELM, 1),
	ZAMORAK_FULL_HELM(ItemID.ZAMORAK_FULL_HELM, 1),
	HELM_OF_NEITIZNOT(ItemID.HELM_OF_NEITIZNOT, 3),
	INITIATE_SALLET(ItemID.INITIATE_SALLET, 3),
	VERACS_HELM(ItemID.VERACS_HELM, 3),
	VERACS_HELM_0(ItemID.VERACS_HELM_0, 3),
	VERACS_HELM_25(ItemID.VERACS_HELM_25, 3),
	VERACS_HELM_50(ItemID.VERACS_HELM_50, 3),
	VERACS_HELM_75(ItemID.VERACS_HELM_75, 3),
	VERACS_HELM_100(ItemID.VERACS_HELM_100, 3),
	GUTHIX_HALO(ItemID.GUTHIX_HALO, 3),
	SARADOMIN_HALO(ItemID.SARADOMIN_HALO, 3),
	ZAMORAK_HALO(ItemID.ZAMORAK_HALO, 3),
	PROSELYTE_SALLET(ItemID.PROSELYTE_SALLET, 4),
	PROSELYTE_SALLET_20563(ItemID.PROSELYTE_SALLET_20563, 4),
	ANCIENT_MITRE(ItemID.ANCIENT_MITRE, 5),
	ARMADYL_MITRE(ItemID.ARMADYL_MITRE, 5),
	BANDOS_MITRE(ItemID.BANDOS_MITRE, 5),
	GUTHIX_MITRE(ItemID.GUTHIX_MITRE, 5),
	SARADOMIN_MITRE(ItemID.SARADOMIN_MITRE, 5),
	ZAMORAK_MITRE(ItemID.ZAMORAK_MITRE, 5),
	JUSTICIAR_FACEGUARD(ItemID.JUSTICIAR_FACEGUARD, 2),

	// Body
	ARMADYL_CHESTPLATE(ItemID.ARMADYL_CHESTPLATE, 1),
	BANDOS_CHESTPLATE(ItemID.BANDOS_CHESTPLATE, 1),
	ANCIENT_DHIDE(ItemID.ANCIENT_DHIDE, 1),
	ARMADYL_DHIDE(ItemID.ARMADYL_DHIDE, 1),
	BANDOS_DHIDE(ItemID.BANDOS_DHIDE, 1),
	GUTHIX_DRAGONHIDE(ItemID.GUTHIX_DRAGONHIDE, 1),
	GUTHIX_DRAGONHIDE_10794(ItemID.GUTHIX_DRAGONHIDE_10794, 1),
	SARADOMIN_DHIDE(ItemID.SARADOMIN_DHIDE, 1),
	SARADOMIN_DHIDE_10792(ItemID.SARADOMIN_DHIDE_10792, 1),
	ZAMORAK_DHIDE(ItemID.ZAMORAK_DHIDE, 1),
	ZAMORAK_DHIDE_10790(ItemID.ZAMORAK_DHIDE_10790, 1),
	WHITE_PLATEBODY(ItemID.WHITE_PLATEBODY, 1),
	WHITE_PLATEBODY_10618(ItemID.WHITE_PLATEBODY_10618, 1),
	WHITE_CHAINBODY(ItemID.WHITE_CHAINBODY, 1),
	ANCIENT_PLATEBODY(ItemID.ANCIENT_PLATEBODY, 1),
	ARMADYL_PLATEBODY(ItemID.ARMADYL_PLATEBODY, 1),
	BANDOS_PLATEBODY(ItemID.BANDOS_PLATEBODY, 1),
	GUTHIX_PLATEBODY(ItemID.GUTHIX_PLATEBODY, 1),
	GUTHIX_PLATEBODY_10780(ItemID.GUTHIX_PLATEBODY_10780, 1),
	SARADOMIN_PLATEBODY(ItemID.SARADOMIN_PLATEBODY, 1),
	ZAMORAK_PLATEBODY(ItemID.ZAMORAK_PLATEBODY, 1),
	ZAMORAK_PLATEBODY_10776(ItemID.ZAMORAK_PLATEBODY_10776, 1),
	ZAMORAK_ROBE_1035(ItemID.ZAMORAK_MONK_TOP, 3),
	ELITE_VOID_TOP(ItemID.ELITE_VOID_TOP, 3),
	ELITE_VOID_TOP_BROKEN(ItemID.ELITE_VOID_TOP_BROKEN, 3),
	PRIEST_GOWN(ItemID.PRIEST_GOWN, 3),
	DRUIDS_ROBE_TOP(ItemID.DRUIDS_ROBE_TOP, 4),
	VERACS_BRASSARD(ItemID.VERACS_BRASSARD, 5),
	VERACS_BRASSARD_0(ItemID.VERACS_BRASSARD_0, 5),
	VERACS_BRASSARD_25(ItemID.VERACS_BRASSARD_25, 5),
	VERACS_BRASSARD_50(ItemID.VERACS_BRASSARD_50, 5),
	VERACS_BRASSARD_75(ItemID.VERACS_BRASSARD_75, 5),
	VERACS_BRASSARD_100(ItemID.VERACS_BRASSARD_100, 5),
	SHADE_ROBE_TOP(ItemID.SHADE_ROBE_TOP, 5),
	MONKS_ROBE_TOP(ItemID.MONKS_ROBE_TOP, 6),
	MONKS_ROBE_TOP_G(ItemID.MONKS_ROBE_TOP_G, 6),
	INITIATE_HAUBERK(ItemID.INITIATE_HAUBERK, 6),
	INITIATE_HAUBERK_10619(ItemID.INITIATE_HAUBERK_10619, 6),
	ANCIENT_ROBE_TOP(ItemID.ANCIENT_ROBE_TOP, 6),
	ARMADYL_ROBE_TOP(ItemID.ARMADYL_ROBE_TOP, 6),
	BANDOS_ROBE_TOP(ItemID.BANDOS_ROBE_TOP, 6),
	GUTHIX_ROBE_TOP(ItemID.GUTHIX_ROBE_TOP, 6),
	SARADOMIN_ROBE_TOP(ItemID.SARADOMIN_ROBE_TOP, 6),
	ZAMORAK_ROBE_TOP(ItemID.ZAMORAK_ROBE_TOP, 6),
	PROSELYTE_HAUBERK(ItemID.PROSELYTE_HAUBERK, 8),
	PROSELYTE_HAUBERK_10620(ItemID.PROSELYTE_HAUBERK_10620, 8),
	PROSELYTE_HAUBERK_20564(ItemID.PROSELYTE_HAUBERK_20564, 8),
	JUSTICIAR_CHESTGUARD(ItemID.JUSTICIAR_CHESTGUARD, 4),

	// Legs
	ARMADYL_CHAINSKIRT(ItemID.ARMADYL_CHAINSKIRT, 1),
	BANDOS_TASSETS(ItemID.BANDOS_TASSETS, 1),
	ANCIENT_CHAPS(ItemID.ANCIENT_CHAPS, 1),
	ARMADYL_CHAPS(ItemID.ARMADYL_CHAPS, 1),
	BANDOS_CHAPS(ItemID.BANDOS_CHAPS, 1),
	GUTHIX_CHAPS(ItemID.GUTHIX_CHAPS, 1),
	SARADOMIN_CHAPS(ItemID.SARADOMIN_CHAPS, 1),
	ZAMORAK_CHAPS(ItemID.ZAMORAK_CHAPS, 1),
	WHITE_PLATELEGS(ItemID.WHITE_PLATELEGS, 1),
	WHITE_PLATESKIRT(ItemID.WHITE_PLATESKIRT, 1),
	ANCIENT_PLATELEGS(ItemID.ANCIENT_PLATELEGS, 1),
	ANCIENT_PLATESKIRT(ItemID.ANCIENT_PLATESKIRT, 1),
	ARMADYL_PLATELEGS(ItemID.ARMADYL_PLATELEGS, 1),
	ARMADYL_PLATESKIRT(ItemID.ARMADYL_PLATESKIRT, 1),
	BANDOS_PLATELEGS(ItemID.BANDOS_PLATELEGS, 1),
	BANDOS_PLATESKIRT(ItemID.BANDOS_PLATESKIRT, 1),
	GUTHIX_PLATELEGS(ItemID.GUTHIX_PLATELEGS, 1),
	GUTHIX_PLATESKIRT(ItemID.GUTHIX_PLATESKIRT, 1),
	SARADOMIN_PLATELEGS(ItemID.SARADOMIN_PLATELEGS, 1),
	SARADOMIN_PLATESKIRT(ItemID.SARADOMIN_PLATESKIRT, 1),
	ZAMORAK_PLATELEGS(ItemID.ZAMORAK_PLATELEGS, 1),
	ZAMORAK_PLATESKIRT(ItemID.ZAMORAK_PLATESKIRT, 1),
	ZAMORAK_ROBE(ItemID.ZAMORAK_MONK_BOTTOM, 3),
	ELITE_VOID_ROBE(ItemID.ELITE_VOID_ROBE, 3),
	ELITE_VOID_ROBE_BROKEN(ItemID.ELITE_VOID_ROBE_BROKEN, 3),
	PRIEST_GOWN_428(ItemID.PRIEST_GOWN_428, 3),
	DRUIDS_ROBE(ItemID.DRUIDS_ROBE, 4),
	SHADE_ROBE(ItemID.SHADE_ROBE, 4),
	VERACS_PLATESKIRT(ItemID.VERACS_PLATESKIRT, 4),
	VERACS_PLATESKIRT_0(ItemID.VERACS_PLATESKIRT_0, 4),
	VERACS_PLATESKIRT_25(ItemID.VERACS_PLATESKIRT_25, 4),
	VERACS_PLATESKIRT_50(ItemID.VERACS_PLATESKIRT_50, 4),
	VERACS_PLATESKIRT_75(ItemID.VERACS_PLATESKIRT_75, 4),
	VERACS_PLATESKIRT_100(ItemID.VERACS_PLATESKIRT_100, 4),
	MONKS_ROBE(ItemID.MONKS_ROBE, 5),
	MONKS_ROBE_G(ItemID.MONKS_ROBE_G, 5),
	INITIATE_CUISSE(ItemID.INITIATE_CUISSE, 5),
	ANCIENT_ROBE_LEGS(ItemID.ANCIENT_ROBE_LEGS, 5),
	ARMADYL_ROBE_LEGS(ItemID.ARMADYL_ROBE_LEGS, 5),
	BANDOS_ROBE_LEGS(ItemID.BANDOS_ROBE_LEGS, 5),
	GUTHIX_ROBE_LEGS(ItemID.GUTHIX_ROBE_LEGS, 5),
	SARADOMIN_ROBE_LEGS(ItemID.SARADOMIN_ROBE_LEGS, 5),
	ZAMORAK_ROBE_LEGS(ItemID.ZAMORAK_ROBE_LEGS, 5),
	PROSELYTE_CUISSE(ItemID.PROSELYTE_CUISSE, 6),
	PROSELYTE_CUISSE_20565(ItemID.PROSELYTE_CUISSE_20565, 6),
	PROSELYTE_TASSET(ItemID.PROSELYTE_TASSET, 6),
	JUSTICIAR_LEGGUARDS(ItemID.JUSTICIAR_LEGGUARDS, 4),

	// Boots
	BANDOS_BOOTS(ItemID.BANDOS_BOOTS, 1),
	WHITE_BOOTS(ItemID.WHITE_BOOTS, 1),
	ANCIENT_DHIDE_BOOTS(ItemID.ANCIENT_DHIDE_BOOTS, 1),
	ARMADYL_DHIDE_BOOTS(ItemID.ARMADYL_DHIDE_BOOTS, 1),
	BANDOS_DHIDE_BOOTS(ItemID.BANDOS_DHIDE_BOOTS, 1),
	GUTHIX_DHIDE_BOOTS(ItemID.GUTHIX_DHIDE_BOOTS, 1),
	SARADOMIN_DHIDE_BOOTS(ItemID.SARADOMIN_DHIDE_BOOTS, 1),
	ZAMORAK_DHIDE_BOOTS(ItemID.ZAMORAK_DHIDE_BOOTS, 1),
	GUARDIAN_BOOTS(ItemID.GUARDIAN_BOOTS, 2),
	HOLY_SANDALS(ItemID.HOLY_SANDALS, 3),

	// Gloves
	ANCIENT_BRACERS(ItemID.ANCIENT_BRACERS, 1),
	ARMADYL_BRACERS(ItemID.ARMADYL_BRACERS, 1),
	BANDOS_BRACERS(ItemID.BANDOS_BRACERS, 1),
	GUTHIX_BRACERS(ItemID.GUTHIX_BRACERS, 1),
	SARADOMIN_BRACERS(ItemID.SARADOMIN_BRACERS, 1),
	ZAMORAK_BRACERS(ItemID.ZAMORAK_BRACERS, 1),
	WHITE_GLOVES(ItemID.WHITE_GLOVES, 1),
	TORMENTED_BRACELET(ItemID.TORMENTED_BRACELET, 2),
	HOLY_WRAPS(ItemID.HOLY_WRAPS, 3),

	// Capes
	MYTHICAL_CAPE(ItemID.MYTHICAL_CAPE, 1),
	MYTHICAL_CAPE_22114(ItemID.MYTHICAL_CAPE_22114, 1),
	FIRE_CAPE(ItemID.FIRE_CAPE, 2),
	FIRE_CAPE_10566(ItemID.FIRE_CAPE_10566, 2),
	FIRE_CAPE_10637(ItemID.FIRE_CAPE_10637, 2),
	FIRE_CAPE_BROKEN(ItemID.FIRE_CAPE_BROKEN, 2),
	INFERNAL_CAPE(ItemID.INFERNAL_CAPE, 2),
	INFERNAL_CAPE_21297(ItemID.INFERNAL_CAPE_21297, 2),
	INFERNAL_CAPE_BROKEN(ItemID.INFERNAL_CAPE_BROKEN, 2),
	ARDOUGNE_CLOAK_1(ItemID.ARDOUGNE_CLOAK_1, 2),
	ANCIENT_CLOAK(ItemID.ANCIENT_CLOAK, 3),
	ARMADYL_CLOAK(ItemID.ARMADYL_CLOAK, 3),
	BANDOS_CLOAK(ItemID.BANDOS_CLOAK, 3),
	GUTHIX_CLOAK(ItemID.GUTHIX_CLOAK, 3),
	SARADOMIN_CLOAK(ItemID.SARADOMIN_CLOAK, 3),
	ZAMORAK_CLOAK(ItemID.ZAMORAK_CLOAK, 3),
	ATTACK_CAPET(ItemID.ATTACK_CAPET, 4),
	STRENGTH_CAPET(ItemID.STRENGTH_CAPET, 4),
	DEFENCE_CAPET(ItemID.DEFENCE_CAPET, 4),
	RANGING_CAPET(ItemID.RANGING_CAPET, 4),
	PRAYER_CAPET(ItemID.PRAYER_CAPET, 4),
	MAGIC_CAPET(ItemID.MAGIC_CAPET, 4),
	RUNECRAFT_CAPET(ItemID.RUNECRAFT_CAPET, 4),
	CONSTRUCT_CAPET(ItemID.CONSTRUCT_CAPET, 4),
	HITPOINTS_CAPET(ItemID.HITPOINTS_CAPET, 4),
	AGILITY_CAPET(ItemID.AGILITY_CAPET, 4),
	HERBLORE_CAPET(ItemID.HERBLORE_CAPET, 4),
	THIEVING_CAPET(ItemID.THIEVING_CAPET, 4),
	CRAFTING_CAPET(ItemID.CRAFTING_CAPET, 4),
	FLETCHING_CAPET(ItemID.FLETCHING_CAPET, 4),
	SLAYER_CAPET(ItemID.SLAYER_CAPET, 4),
	HUNTER_CAPET(ItemID.HUNTER_CAPET, 4),
	MINING_CAPET(ItemID.MINING_CAPET, 4),
	SMITHING_CAPET(ItemID.SMITHING_CAPET, 4),
	FISHING_CAPET(ItemID.FISHING_CAPET, 4),
	COOKING_CAPET(ItemID.COOKING_CAPET, 4),
	FIREMAKING_CAPET(ItemID.FIREMAKING_CAPET, 4),
	WOODCUT_CAPET(ItemID.WOODCUT_CAPET, 4),
	FARMING_CAPET(ItemID.FARMING_CAPET, 4),
	QUEST_POINT_CAPE_T(ItemID.QUEST_POINT_CAPE_T, 4),
	MUSIC_CAPET(ItemID.MUSIC_CAPET, 4),
	ACHIEVEMENT_DIARY_CAPE(ItemID.ACHIEVEMENT_DIARY_CAPE, 4),
	ACHIEVEMENT_DIARY_CAPE_T(ItemID.ACHIEVEMENT_DIARY_CAPE_T, 4),
	MAX_CAPE(ItemID.MAX_CAPE, 4),
	MAX_CAPE_13282(ItemID.MAX_CAPE_13282, 4),
	MAX_CAPE_13342(ItemID.MAX_CAPE_13342, 4),
	ACCUMULATOR_MAX_CAPE(ItemID.ACCUMULATOR_MAX_CAPE, 4),
	ARDOUGNE_MAX_CAPE(ItemID.ARDOUGNE_MAX_CAPE, 4),
	ASSEMBLER_MAX_CAPE(ItemID.ASSEMBLER_MAX_CAPE, 4),
	ASSEMBLER_MAX_CAPE_BROKEN(ItemID.ASSEMBLER_MAX_CAPE_BROKEN, 4),
	INFERNAL_MAX_CAPE(ItemID.INFERNAL_MAX_CAPE, 4),
	INFERNAL_MAX_CAPE_21285(ItemID.INFERNAL_MAX_CAPE_21285, 4),
	INFERNAL_MAX_CAPE_BROKEN(ItemID.INFERNAL_MAX_CAPE_BROKEN, 4),
	FIRE_MAX_CAPE(ItemID.FIRE_MAX_CAPE, 4),
	FIRE_MAX_CAPE_21186(ItemID.FIRE_MAX_CAPE_21186, 4),
	FIRE_MAX_CAPE_BROKEN(ItemID.FIRE_MAX_CAPE_BROKEN, 4),
	GUTHIX_MAX_CAPE(ItemID.GUTHIX_MAX_CAPE, 4),
	IMBUED_GUTHIX_MAX_CAPE(ItemID.IMBUED_GUTHIX_MAX_CAPE, 4),
	SARADOMIN_MAX_CAPE(ItemID.SARADOMIN_MAX_CAPE, 4),
	IMBUED_SARADOMIN_MAX_CAPE(ItemID.IMBUED_SARADOMIN_MAX_CAPE, 4),
	ZAMORAK_MAX_CAPE(ItemID.ZAMORAK_MAX_CAPE, 4),
	IMBUED_ZAMORAK_MAX_CAPE(ItemID.IMBUED_ZAMORAK_MAX_CAPE, 4),
	ARDOUGNE_CLOAK_2(ItemID.ARDOUGNE_CLOAK_2, 4),
	ARDOUGNE_CLOAK_3(ItemID.ARDOUGNE_CLOAK_3, 5),
	_3RD_AGE_CLOAK(ItemID._3RD_AGE_CLOAK, 5),
	ARDOUGNE_CLOAK_4(ItemID.ARDOUGNE_CLOAK_4, 6),

	// Weapons
	ARMADYL_CROSSBOW(ItemID.ARMADYL_CROSSBOW, 1),
	BRONZE_MACE(ItemID.BRONZE_MACE, 1),
	IRON_MACE(ItemID.IRON_MACE, 1),
	WHITE_DAGGER(ItemID.WHITE_DAGGER, 1),
	WHITE_SCIMITAR(ItemID.WHITE_SCIMITAR, 1),
	WHITE_CLAWS(ItemID.WHITE_CLAWS, 1),
	WHITE_SWORD(ItemID.WHITE_SWORD, 1),
	WHITE_LONGSWORD(ItemID.WHITE_LONGSWORD, 1),
	WHITE_BATTLEAXE(ItemID.WHITE_BATTLEAXE, 1),
	WHITE_WARHAMMER(ItemID.WHITE_WARHAMMER, 1),
	WHITE_2H_SWORD(ItemID.WHITE_2H_SWORD, 1),
	WHITE_HALBERD(ItemID.WHITE_HALBERD, 1),
	WHITE_MAGIC_STAFF(ItemID.WHITE_MAGIC_STAFF, 1),
	SARADOMIN_SWORD(ItemID.SARADOMIN_SWORD, 2),
	SARADOMINS_BLESSED_SWORD(ItemID.SARADOMINS_BLESSED_SWORD, 2),
	STEEL_MACE(ItemID.STEEL_MACE, 2),
	BLACK_MACE(ItemID.BLACK_MACE, 2),
	ZAMORAKIAN_SPEAR(ItemID.ZAMORAKIAN_SPEAR, 2),
	ZAMORAKIAN_HASTA(ItemID.ZAMORAKIAN_HASTA, 2),
	ADAMANT_MACE(ItemID.ADAMANT_MACE, 3),
	ANCIENT_MACE(ItemID.ANCIENT_MACE, 3),
	MITHRIL_MACE(ItemID.MITHRIL_MACE, 3),
	WHITE_MACE(ItemID.WHITE_MACE, 3),
	LUNAR_STAFF(ItemID.LUNAR_STAFF, 3),
	RUNE_MACE(ItemID.RUNE_MACE, 4),
	ROLLING_PIN(ItemID.ROLLING_PIN, 4),
	TWISTED_BOW(ItemID.TWISTED_BOW, 4),
	DRAGON_MACE(ItemID.DRAGON_MACE, 5),
	WOLFBANE(ItemID.WOLFBANE, 5),
	SILVER_SICKLEB(ItemID.SILVER_SICKLE_B, 5),
	TOKTZMEJTAL(ItemID.TOKTZMEJTAL, 5),
	ANCIENT_CROZIER(ItemID.ANCIENT_CROZIER, 6),
	ARMADYL_CROZIER(ItemID.ARMADYL_CROZIER, 6),
	BANDOS_CROZIER(ItemID.BANDOS_CROZIER, 6),
	GUTHIX_CROZIER(ItemID.GUTHIX_CROZIER, 6),
	SARADOMIN_CROZIER(ItemID.SARADOMIN_CROZIER, 6),
	ZAMORAK_CROZIER(ItemID.ZAMORAK_CROZIER, 6),
	VERACS_FLAIL(ItemID.VERACS_FLAIL, 6),
	VERACS_FLAIL_0(ItemID.VERACS_FLAIL_0, 6),
	VERACS_FLAIL_25(ItemID.VERACS_FLAIL_25, 6),
	VERACS_FLAIL_50(ItemID.VERACS_FLAIL_50, 6),
	VERACS_FLAIL_75(ItemID.VERACS_FLAIL_75, 6),
	VERACS_FLAIL_100(ItemID.VERACS_FLAIL_100, 6),
	VOID_KNIGHT_MACE(ItemID.VOID_KNIGHT_MACE, 6),
	VOID_KNIGHT_MACE_BROKEN(ItemID.VOID_KNIGHT_MACE_BROKEN, 6),
	BANDOS_GODSWORD(ItemID.BANDOS_GODSWORD, 8),
	BANDOS_GODSWORD_OR(ItemID.BANDOS_GODSWORD_OR, 8),
	BANDOS_GODSWORD_20782(ItemID.BANDOS_GODSWORD_20782, 8),
	BANDOS_GODSWORD_21060(ItemID.BANDOS_GODSWORD_21060, 8),
	ARMADYL_GODSWORD(ItemID.ARMADYL_GODSWORD, 8),
	ARMADYL_GODSWORD_OR(ItemID.ARMADYL_GODSWORD_OR, 8),
	ARMADYL_GODSWORD_20593(ItemID.ARMADYL_GODSWORD_20593, 8),
	SARADOMIN_GODSWORD(ItemID.SARADOMIN_GODSWORD, 8),
	SARADOMIN_GODSWORD_OR(ItemID.SARADOMIN_GODSWORD_OR, 8),
	ZAMORAK_GODSWORD(ItemID.ZAMORAK_GODSWORD, 8),
	ZAMORAK_GODSWORD_OR(ItemID.ZAMORAK_GODSWORD_OR, 8),

	// Shields
	WHITE_KITESHIELD(ItemID.WHITE_KITESHIELD, 1),
	WHITE_SQ_SHIELD(ItemID.WHITE_SQ_SHIELD, 1),
	SPIRIT_SHIELD(ItemID.SPIRIT_SHIELD, 1),
	FALADOR_SHIELD_1(ItemID.FALADOR_SHIELD_1, 1),
	KHAREDSTS_MEMOIRS(ItemID.KHAREDSTS_MEMOIRS, 1),
	BLESSED_SPIRIT_SHIELD(ItemID.BLESSED_SPIRIT_SHIELD, 3),
	ARCANE_SPIRIT_SHIELD(ItemID.ARCANE_SPIRIT_SHIELD, 3),
	SPECTRAL_SPIRIT_SHIELD(ItemID.SPECTRAL_SPIRIT_SHIELD, 3),
	ELYSIAN_SPIRIT_SHIELD(ItemID.ELYSIAN_SPIRIT_SHIELD, 3),
	ELYSIAN_SPIRIT_SHIELD_19559(ItemID.ELYSIAN_SPIRIT_SHIELD_19559, 3),
	FALADOR_SHIELD_2(ItemID.FALADOR_SHIELD_2, 3),
	FALADOR_SHIELD_3(ItemID.FALADOR_SHIELD_3, 4),
	BROODOO_SHIELD(ItemID.BROODOO_SHIELD, 5),
	BROODOO_SHIELD_6257(ItemID.BROODOO_SHIELD_6257, 5),
	BROODOO_SHIELD_6279(ItemID.BROODOO_SHIELD_6279, 5),
	BROODOO_SHIELD_1(ItemID.BROODOO_SHIELD_1, 5),
	BROODOO_SHIELD_1_6255(ItemID.BROODOO_SHIELD_1_6255, 5),
	BROODOO_SHIELD_1_6277(ItemID.BROODOO_SHIELD_1_6277, 5),
	BROODOO_SHIELD_2(ItemID.BROODOO_SHIELD_2, 5),
	BROODOO_SHIELD_2_6253(ItemID.BROODOO_SHIELD_2_6253, 5),
	BROODOO_SHIELD_2_6275(ItemID.BROODOO_SHIELD_2_6275, 5),
	BROODOO_SHIELD_3(ItemID.BROODOO_SHIELD_3, 5),
	BROODOO_SHIELD_3_6251(ItemID.BROODOO_SHIELD_3_6251, 5),
	BROODOO_SHIELD_3_6273(ItemID.BROODOO_SHIELD_3_6273, 5),
	BROODOO_SHIELD_4(ItemID.BROODOO_SHIELD_4, 5),
	BROODOO_SHIELD_4_6249(ItemID.BROODOO_SHIELD_4_6249, 5),
	BROODOO_SHIELD_4_6271(ItemID.BROODOO_SHIELD_4_6271, 5),
	BROODOO_SHIELD_5(ItemID.BROODOO_SHIELD_5, 5),
	BROODOO_SHIELD_5_6247(ItemID.BROODOO_SHIELD_5_6247, 5),
	BROODOO_SHIELD_5_6269(ItemID.BROODOO_SHIELD_5_6269, 5),
	BROODOO_SHIELD_6(ItemID.BROODOO_SHIELD_6, 5),
	BROODOO_SHIELD_6_6245(ItemID.BROODOO_SHIELD_6_6245, 5),
	BROODOO_SHIELD_6_6267(ItemID.BROODOO_SHIELD_6_6267, 5),
	BROODOO_SHIELD_7(ItemID.BROODOO_SHIELD_7, 5),
	BROODOO_SHIELD_7_6243(ItemID.BROODOO_SHIELD_7_6243, 5),
	BROODOO_SHIELD_7_6265(ItemID.BROODOO_SHIELD_7_6265, 5),
	BROODOO_SHIELD_8(ItemID.BROODOO_SHIELD_8, 5),
	BROODOO_SHIELD_8_6241(ItemID.BROODOO_SHIELD_8_6241, 5),
	BROODOO_SHIELD_8_6263(ItemID.BROODOO_SHIELD_8_6263, 5),
	BROODOO_SHIELD_9(ItemID.BROODOO_SHIELD_9, 5),
	BROODOO_SHIELD_9_6239(ItemID.BROODOO_SHIELD_9_6239, 5),
	BROODOO_SHIELD_9_6261(ItemID.BROODOO_SHIELD_9_6261, 5),
	BROODOO_SHIELD_10(ItemID.BROODOO_SHIELD_10, 5),
	BROODOO_SHIELD_10_6237(ItemID.BROODOO_SHIELD_10_6237, 5),
	BROODOO_SHIELD_10_6259(ItemID.BROODOO_SHIELD_10_6259, 5),
	BOOK_OF_DARKNESS(ItemID.BOOK_OF_DARKNESS, 5),
	DAMAGED_BOOK_12611(ItemID.DAMAGED_BOOK_12611, 5),
	BOOK_OF_BALANCE(ItemID.BOOK_OF_BALANCE, 5),
	DAMAGED_BOOK_3843(ItemID.DAMAGED_BOOK_3843, 5),
	BOOK_OF_LAW(ItemID.BOOK_OF_LAW, 5),
	DAMAGED_BOOK_12609(ItemID.DAMAGED_BOOK_12609, 5),
	BOOK_OF_WAR(ItemID.BOOK_OF_WAR, 5),
	DAMAGED_BOOK_12607(ItemID.DAMAGED_BOOK_12607, 5),
	HOLY_BOOK(ItemID.HOLY_BOOK, 5),
	DAMAGED_BOOK(ItemID.DAMAGED_BOOK, 5),
	UNHOLY_BOOK(ItemID.UNHOLY_BOOK, 5),
	DAMAGED_BOOK_3841(ItemID.DAMAGED_BOOK_3841, 5),
	FALADOR_SHIELD_4(ItemID.FALADOR_SHIELD_4, 5);

	private static final Map<Integer, Integer> prayerBonuses = new HashMap<>();

	private final int itemId;
	private final int prayerBonus;

	static
	{
		for (PrayerItems item : values())
		{
			prayerBonuses.put(item.getItemId(), item.getPrayerBonus());
		}
	}

	static int getItemPrayerBonus(int itemId)
	{
		Integer value = prayerBonuses.get(itemId);
		return value == null ? 0 : value;
	}
}
