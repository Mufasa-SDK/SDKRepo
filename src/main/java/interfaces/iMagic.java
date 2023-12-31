package interfaces;

/**
 * Interface defining interactions with various magic spellbooks in a game.
 * This interface includes methods for tapping (activating) various spells
 * across standard, ancient, lunar, and Arceuus spellbooks.
 */
public interface iMagic {

    // STANDARD spells
    void tapArdougneTeleportSpell();
    void tapBindSpell();
    void tapBonestoBananasSpell();
    void tapBonestoPeachesSpell();
    void tapCamelotTeleportSpell();
    void tapChargeSpell();
    void tapChargeAirOrbSpell();
    void tapChargeEarthOrbSpell();
    void tapChargeFireOrbSpell();
    void tapChargeWaterOrbSpell();
    void tapClawsofGuthixSpell();
    void tapConfuseSpell();
    void tapCrumbleUndeadSpell();
    void tapCurseSpell();
    void tapEarthBlastSpell();
    void tapEarthBoltSpell();
    void tapEarthStrikeSpell();
    void tapEarthSurgeSpell();
    void tapEarthWaveSpell();
    void tapEnchantCrossbowBoltSpell();
    void tapEnfeebleSpell();
    void tapEntangleSpell();
    void tapFaladorTeleportSpell();
    void tapFireBlastSpell();
    void tapFireBoltSpell();
    void tapFireStrikeSpell();
    void tapFireSurgeSpell();
    void tapFireWaveSpell();
    void tapFlamesofZamorakSpell();
    void tapHighLevelAlchemySpell();
    void tapIbanBlastSpell();
    void tapKourendCastleTeleportSpell();
    void tapLowLevelAlchemySpell();
    void tapLumbridgeHomeTeleportSpell();
    void tapLumbridgeTeleportSpell();
    void tapLvl1EnchantSpell();
    void tapLvl2EnchantSpell();
    void tapLvl3EnchantSpell();
    void tapLvl4EnchantSpell();
    void tapLvl5EnchantSpell();
    void tapLvl6EnchantSpell();
    void tapLvl7EnchantSpell();
    void tapMagicDartSpell();
    void tapSaradominStrikeSpell();
    void tapSnareSpell();
    void tapStunSpell();
    void tapSuperheatItemSpell();
    void tapTeleBlockSpell();
    void tapTelekineticGrabSpell();
    void tapTeleotherCamelotSpell();
    void tapTeleotherFaladorSpell();
    void tapTeleotherLumbridgeSpell();
    void tapTeleporttoHouseSpell();
    void tapStandardTeleporttoTargetSpell();
    void tapTrollheimTeleportSpell();
    void tapVarrockTeleportSpell();
    void tapVulnerabilitySpell();
    void tapWatchtowerTeleportSpell();
    void tapWaterBlastSpell();
    void tapWaterBoltSpell();
    void tapWaterStrikeSpell();
    void tapWaterSurgeSpell();
    void tapWaterWaveSpell();
    void tapWeakenSpell();
    void tapWindBlastSpell();
    void tapWindBoltSpell();
    void tapWindStrikeSpell();
    void tapWindSurgeSpell();
    void tapWindWaveSpell();

    // ANCIENT spellbook
    void tapAnnakarlTeleportSpell();
    void tapBloodBarrageSpell();
    void tapBloodBlitzSpell();
    void tapBloodBurstSpell();
    void tapBloodRushSpell();
    void tapCarrallangerTeleportSpell();
    void tapDareeyakTeleportSpell();
    void tapEdgevilleHomeTeleportSpell();
    void tapGhorrockTeleportSpell();
    void tapIceBarrageSpell();
    void tapIceBlitzSpell();
    void tapIceBurstSpell();
    void tapIceRushSpell();
    void tapKharyrllTeleportSpell();
    void tapLassarTeleportSpell();
    void tapPaddewwaTeleportSpell();
    void tapSenntistenTeleportSpell();
    void tapShadowBarrageSpell();
    void tapShadowBlitzSpell();
    void tapShadowBurstSpell();
    void tapShadowRushSpell();
    void tapSmokeBarrageSpell();
    void tapSmokeBlitzSpell();
    void tapSmokeBurstSpell();
    void tapSmokeRushSpell();
    void tapAncientTeleporttoTargetSpell();

    // LUNAR spellbook
    void tapBakePieSpell();
    void tapBarbarianTeleportSpell();
    void tapBoostPotionShareSpell();
    void tapCatherbyTeleportSpell();
    void tapCureGroupSpell();
    void tapCureMeSpell();
    void tapCureOtherSpell();
    void tapCurePlantSpell();
    void tapDreamSpell();
    void tapEnergyTransferSpell();
    void tapFertileSoilSpell();
    void tapFishingGuildTeleportSpell();
    void tapGeomancySpell();
    void tapHealGroupSpell();
    void tapHealOtherSpell();
    void tapHumidifySpell();
    void tapHunterKitSpell();
    void tapIcePlateauTeleportSpell();
    void tapKhazardTeleportSpell();
    void tapLunarHomeTeleportSpell();
    void tapMagicImbueSpell();
    void tapMonsterExamineSpell();
    void tapMoonclanTeleportSpell();
    void tapNPCContactSpell();
    void tapOuraniaTeleportSpell();
    void tapPlankMakeSpell();
    void tapRechargeDragonstoneSpell();
    void tapSpellbookSwapSpell();
    void tapSpinFlaxSpell();
    void tapStatRestorePotShareSpell();
    void tapStatSpySpell();
    void tapStringJewellerySpell();
    void tapSuperglassMakeSpell();
    void tapTanLeatherSpell();
    void tapTeleGroupBarbarianSpell();
    void tapTeleGroupCatherbySpell();
    void tapTeleGroupFishingGuildSpell();
    void tapTeleGroupIcePlateauSpell();
    void tapTeleGroupKhazardSpell();
    void tapTeleGroupMoonclanSpell();
    void tapTeleGroupWaterbirthSpell();
    void tapVengeanceSpell();
    void tapVengeanceOtherSpell();
    void tapWaterbirthTeleportSpell();

    // ARCEUUS spellbook
    void tapAdeptReanimationSpell();
    void tapArceuusHomeTeleportSpell();
    void tapArceuusLibraryTeleportSpell();
    void tapBarrowsTeleportSpell();
    void tapBasicReanimationSpell();
    void tapBattlefrontTeleportSpell();
    void tapCemeteryTeleportSpell();
    void tapDarkDemonbaneSpell();
    void tapDarkLureSpell();
    void tapDeathChargeSpell();
    void tapDegrimeSpell();
    void tapDemonicOfferingSpell();
    void tapDraynorManorTeleportSpell();
    void tapExpertReanimationSpell();
    void tapFenkenstrainsCastleTeleportSpell();
    void tapGhostlyGraspSpell();
    void tapGreaterCorruptionSpell();
    void tapHarmonyIslandTeleportSpell();
    void tapInferiorDemonbaneSpell();
    void tapLesserCorruptionSpell();
    void tapMarkofDarknessSpell();
    void tapMasterReanimationSpell();
    void tapMindAltarTeleportSpell();
    void tapRespawnTeleportSpell();
    void tapResurrectCropsSpell();
    void tapResurrectGreaterGhostSpell();
    void tapResurrectGreaterSkeletonSpell();
    void tapResurrectGreaterZombieSpell();
    void tapResurrectLesserGhostSpell();
    void tapResurrectLesserSkeletonSpell();
    void tapResurrectLesserZombieSpell();
    void tapResurrectSuperiorGhostSpell();
    void tapResurrectSuperiorSkeletonSpell();
    void tapResurrectSuperiorZombieSpell();
    void tapSalveGraveyardTeleportSpell();
    void tapShadowVeilSpell();
    void tapSinisterOfferingSpell();
    void tapSkeletalGraspSpell();
    void tapSuperiorDemonbaneSpell();
    void tapUndeadGraspSpell();
    void tapVileVigourSpell();
    void tapWardofArceuusSpell();
    void tapWestArdougneTeleportSpell();

}
