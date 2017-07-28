package fr.Bentur_and_Bertatruck.BandB_mod.common.loader;

import fr.Bentur_and_Bertatruck.BandB_mod.common.item.ItemBeverageAlcohol;
import fr.Bentur_and_Bertatruck.BandB_mod.common.item.ItemBottle;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BandBBeverages {
	
	//items beverage
		//Alcohol
	public static Item itemBeverage1664, itemBeverageAlsaceRiesling, itemBeverageAmaretto, itemBeverageAngosturaBitter, itemBeverageBaileys;
	public static Item itemBeverageBenedictine, itemBeverageBitter, itemBeverageBlueCuracao, itemBeverageBordeauxChateauLary, itemBeverageBordeauxChateauTourVerite;
	public static Item itemBeverageBourgogneAligote, itemBeverageBritt, itemBeverageBrownRum, itemBeverageCalvados, itemBeverageCampari;
	public static Item itemBeverageCapCorse, itemBeverageChampagneMumm, itemBeverageChartreuseJaune, itemBeverageChartreuseVerte, itemBeverageChouchen;
	public static Item itemBeverageCiderKerne, itemBeverageCognac, itemBeverageCuracaoOrange, itemBeverageCuracaoTripleSec, itemBeverageDesperados;
	public static Item itemBeverageDrambuie, itemBeverageDubonnetRouge, itemBeverageDuvel, itemBeverageEnate, itemBeverageFernetBranca;
	public static Item itemBeverageGet27, itemBeverageGin, itemBeverageGrandMarnier, itemBeverageGrimbergen, itemBeverageGuinness;
	public static Item itemBeverageHeineken, itemBeverageLambig, itemBeverageLeffe, itemBeveragePastis51, itemBeveragePetrus;
	public static Item itemBeveragePisco, itemBeveragePommeau, itemBeveragePontarlier, itemBeverageRedMartini, itemBeverageRedPort;
	public static Item itemBeverageSanMiguel, itemBeverageSkoll, itemBeverageSmirnoff, itemBeverageSouthernComfort, itemBeverageTabasco;
	public static Item itemBeverageTequila, itemBeverageVodka, itemBeverageWhiskey, itemBeverageWhiteMartini, itemBeverageWhitePort;
	public static Item itemBeverageWhiteRum, itemBeverageWorcestershireSauce, itemBeverageXII, itemBeverageXeres;	
		//sweet
	public static Item itemBeverageBenturCola, itemBeverageFleurOranger, itemBeverageLimonade, itemBeveragePerrier, itemBeverageSchweppesAgrum;
	public static Item itemBeverageSchweppesDarkSide, itemBeverageSchweppesGingerAle, itemBeverageSchweppesLemon, itemBeverageSchweppesMango, itemBeverageSchweppesPamplemousse;
	public static Item itemBeverageSchweppesPassion, itemBeverageSchweppesPech, itemBeverageSchweppesPomme, itemBeverageSchweppesRaisin, itemBeverageSchweppesRicqles;
	public static Item itemBeverageSchweppesTonic;	
	
	/** To do **/
	public static Item itemBeverageVinegar;
	/** end To do **/
	
		//Brandy
	public static Item itemBananaBrandy, itemBrandyApple, itemBrandyApricot, itemBrandyBlackberry, itemBrandyBlackcurrant;
	public static Item itemBrandyBlueberry, itemBrandyCherry, itemBrandyClementine, itemBrandyCoconut, itemBrandyCranberry;
	public static Item itemBrandyCurrant, itemBrandyGoyava, itemBrandyGrapefruit, itemBrandyKiwi, itemBrandyLemon;
	public static Item itemBrandyLime, itemBrandyLychee, itemBrandyMango, itemBrandyMirabelle, itemBrandyOrange;
	public static Item itemBrandyPeach, itemBrandyPear, itemBrandyPineapple, itemBrandyPlum, itemBrandyRaspberry;
	public static Item itemBrandyStrawsberry, itemBrandyTangerine;	
	
		//Liqueur
	public static Item itemLiqueurApple, itemLiqueurApricot, itemLiqueurBanana, itemLiqueurBlackberry, itemLiqueurBlackcurrant;
	public static Item itemLiqueurBlueberry, itemLiqueurCacao, itemLiqueurCherry, itemLiqueurCherryPlum, itemLiqueurClementine;
	public static Item itemLiqueurCoco, itemLiqueurCoffee, itemLiqueurCranberry, itemLiqueurFig, itemLiqueurGrape;
	public static Item itemLiqueurGrapefruit, itemLiqueurGuava, itemLiqueurHoney, itemLiqueurKiwi, itemLiqueurLemon;
	public static Item itemLiqueurLime, itemLiqueurLychee, itemLiqueurMango, itemLiqueurMelon, itemLiqueurMint;
	public static Item itemLiqueurOrange, itemLiqueurPassionFruit, itemLiqueurPeach, itemLiqueurPineapple, itemLiqueurPlantain;
	public static Item itemLiqueurPlum, itemLiqueurPomegranate, itemLiqueurQuince, itemLiqueurRaspberry, itemLiqueurStrawberry;
	public static Item itemLiqueurTangerine, itemLiqueurWhitePeach;	
	
		//Juice
	public static Item itemJuiceApricot, itemJuiceBanana, itemJuiceBlackCurrant, itemJuiceBlackberry, itemJuiceBloodOrange;
	public static Item itemJuiceBlueberry, itemJuiceCarrot, itemJuiceCherry, itemJuiceCherryPlum, itemJuiceClementine;
	public static Item itemJuiceCocoMilk, itemJuiceCranberry, itemJuiceCucumber, itemJuiceCurrant, itemJuiceFig;
	public static Item itemJuiceGrapefruit, itemJuiceGrapefruitPink, itemJuiceGuava, itemJuiceKiwi;
	public static Item itemJuiceLemon, itemJuiceLime, itemJuiceLychee, itemJuiceMango, itemJuiceMelon;
	public static Item itemJuiceMirabelle, itemJuiceMorelloCherry, itemJuiceMultifruit, itemJuiceOrange, itemJuicePapaya;
	public static Item itemJuicePassionFruit, itemJuicePassionfruit, itemJuicePeach, itemJuicePear, itemJuicePineappleCayenneLisse;
	public static Item itemJuicePineappleVictoria, itemJuicePlantainBanana, itemJuicePlum, itemJuicePomegranate, itemJuicePotato;
	public static Item itemJuicePricklyPear, itemJuiceQuince, itemJuiceRaspberry, itemJuiceRhubarb, itemJuiceStrawberry;
	public static Item itemJuiceTangerine, itemJuiceTomato, itemJuiceWatermelon, itemJuiceWhitePeach, itemJuiceWildStrawberry;
	
		//Apple Juice
	public static Item itemJuiceAppleAntares, itemJuiceAppleAriane, itemJuiceAppleBelchardChancelier, itemJuiceAppleBelleDeBoskoop, itemJuiceAppleBraeburn;
	public static Item itemJuiceAppleDuLimousin, itemJuiceAppleElstar, itemJuiceAppleFuji, itemJuiceAppleGala, itemJuiceAppleGolden;
	public static Item itemJuiceAppleGrannySmith, itemJuiceAppleHoneycrunch, itemJuiceAppleJazz, itemJuiceAppleJonagoldJonagored, itemJuiceAppleLesRouges;
	public static Item itemJuiceApplePinkLady, itemJuiceAppleReineDesReinettes, itemJuiceAppleReinetteGriseDuCanada, itemJuiceAppleTentation;	
	
		//Grape Juice
	public static Item itemGrapeAbouriouJuice, itemGrapeAleaticuJuice, itemGrapeAligoteJuice, itemGrapeAltesseJuice, itemGrapeAramonJuice;
	public static Item itemGrapeArboisJuice, itemGrapeArrufiacJuice, itemGrapeAubinVertJuice, itemGrapeBarbarossaJuice, itemGrapeBergeronJuice;
	public static Item itemGrapeBianconeJuice, itemGrapeBiancuGentileJuice, itemGrapeBourboulencJuice, itemGrapeBraquetJuice, itemGrapeCabernetFrancJuice;
	public static Item itemGrapeCabernetSauvignonJuice, itemGrapeCamareseJuice, itemGrapeCarcaghjoluBiancuJuice, itemGrapeCarcaghjoluNeruJuice, itemGrapeCarignanJuice;
	public static Item itemGrapeCesarJuice, itemGrapeChardonnayJuice, itemGrapeCheninJuice, itemGrapeCinsaultJuice, itemGrapeClairetteJuice;
	public static Item itemGrapeColombardJuice, itemGrapeCotJuice, itemGrapeCounoiseJuice, itemGrapeCourbuJuice, itemGrapeCudivertaJuice;
	public static Item itemGrapeDurasJuice, itemGrapeFerServadouJuice, itemGrapeFolleBlancheJuice, itemGrapeGamayJuice, itemGrapeGewurztraminerJuice;
	public static Item itemGrapeGrenacheBlancJuice, itemGrapeGrenacheJuice, itemGrapeGrolleauJuice, itemGrapeGrosMensengJuice, itemGrapeJacquereJuice;
	public static Item itemGrapeLenDeLElJuice, itemGrapeListanJuice, itemGrapeMaccabeuJuice, itemGrapeMalbecJuice, itemGrapeMalvoisieJuice;
	public static Item itemGrapeMarsanneJuice, itemGrapeMarselanJuice, itemGrapeMauzacJuice, itemGrapeMelonDeBourgogneJuice, itemGrapeMelonJuice;
	public static Item itemGrapeMerlotJuice, itemGrapeMoletteJuice, itemGrapeMollardJuice, itemGrapeMondeuseBlancheJuice, itemGrapeMondeuseJuice;
	public static Item itemGrapeMourvedreJuice, itemGrapeMuscadelleJuice, itemGrapeMuscardinJuice, itemGrapeMuscatBlancAPetitsGrainsJuice, itemGrapeMuscatDAlexandrieJuice;
	public static Item itemGrapeNegretteJuice, itemGrapeNielluccioJuice, itemGrapePagaDebitiJuice, itemGrapePetitCourbuJuice, itemGrapePetitMensengJuice;
	public static Item itemGrapePetitVerdotJuice, itemGrapePineauDAunisJuice, itemGrapePinotBlancJuice, itemGrapePinotMeunierJuice, itemGrapePinotNoirJuice;
	public static Item itemGrapePiquepoulJuice, itemGrapePoulsardJuice, itemGrapeRieslingJuice, itemGrapeRomorantinJuice, itemGrapeRossulaBiancaJuice;
	public static Item itemGrapeSacyJuice, itemGrapeSauvignonJuice, itemGrapeSavagninJuice, itemGrapeSemillonJuice, itemGrapeSylvanerJuice;
	public static Item itemGrapeSyrahJuice, itemGrapeTannatJuice, itemGrapeTeoulierJuice, itemGrapeTerretNoirJuice, itemGrapeTibourenJuice;
	public static Item itemGrapeTressalierJuice, itemGrapeUgniBlancJuice, itemGrapeVaccareseJuice, itemGrapeVermentinuJuice, itemGrapeViognierJuice;
	
		//Syrup MONIN
	public static Item itemLogoMonin, itemSyrupAlmond, itemSyrupAmaretto, itemSyrupAnise, itemSyrupApple;
	public static Item itemSyrupApplePie, itemSyrupApricot, itemSyrupBasil, itemSyrupBitter, itemSyrupBlackForest;
	public static Item itemSyrupBlackberry, itemSyrupBlackcurrant, itemSyrupBloodOrange, itemSyrupBlueCuracao, itemSyrupBlueberry;
	public static Item itemSyrupBubbleGum, itemSyrupCaipirinha, itemSyrupCandyStrawberry, itemSyrupCaramel, itemSyrupCardamom;
	public static Item itemSyrupChaiTea, itemSyrupCherry, itemSyrupCherryPlum, itemSyrupChestnut, itemSyrupChocolate;
	public static Item itemSyrupChocolateCookie, itemSyrupChocolateMint, itemSyrupCinnamon, itemSyrupCoconut, itemSyrupCoffee;
	public static Item itemSyrupCottonCandy, itemSyrupCranberry, itemSyrupCremeBrulee, itemSyrupCucumber, itemSyrupElderFlower;
	public static Item itemSyrupFig, itemSyrupFrostedMint, itemSyrupGin, itemSyrupGinger, itemSyrupGingerBread;
	public static Item itemSyrupGlascoLemon, itemSyrupGrapefruit, itemSyrupGreenApple, itemSyrupGreenBanana, itemSyrupGreenMint;
	public static Item itemSyrupGrenadine, itemSyrupGuava, itemSyrupGum, itemSyrupHazelnut, itemSyrupHibiscus;
	public static Item itemSyrupHoney, itemSyrupIrish, itemSyrupJasmine, itemSyrupKiwi, itemSyrupLavender;
	public static Item itemSyrupLemonGrass, itemSyrupLemonPie, itemSyrupLemonTea, itemSyrupLime, itemSyrupLimeJuiceCordialMixer;
	public static Item itemSyrupLychee, itemSyrupMacadamiaNut, itemSyrupMacaron, itemSyrupMango, itemSyrupMapleSpice;
	public static Item itemSyrupMatchaGreenTea, itemSyrupMelon, itemSyrupMojitoMint, itemSyrupMorelloCherry, itemSyrupOrange;
	public static Item itemSyrupPassionFruit, itemSyrupPeach, itemSyrupPeachTea, itemSyrupPear, itemSyrupPinacolada;
	public static Item itemSyrupPineapple, itemSyrupPinkGrapefruit, itemSyrupPistachio, itemSyrupPomegranate, itemSyrupPraline;
	public static Item itemSyrupPureCaneSugar, itemSyrupRantchoLemon, itemSyrupRaspberry, itemSyrupRaspberryTea, itemSyrupRoastedHazelnut;
	public static Item itemSyrupRose, itemSyrupRosmary, itemSyrupRumFlavour, itemSyrupSaltedCaramel, itemSyrupSangria;
	public static Item itemSyrupSpeculoos, itemSyrupSpicy, itemSyrupSpicyMango, itemSyrupStrawberry, itemSyrupTangerine;
	public static Item itemSyrupTarragon, itemSyrupTequilaFlavour, itemSyrupTiramisu, itemSyrupToffeeNut, itemSyrupTonkaBean;
	public static Item itemSyrupTripleSecCuracao, itemSyrupVanilla, itemSyrupViolet, itemSyrupWatermelon, itemSyrupWhiteChocolate;
	public static Item itemSyrupWhitePeach, itemSyrupWildStrawberry, itemSyrupYellowBanana;
	//items bottle
		//alcohol
	public static Item itemBottle1664, itemBottleAlsaceRiesling, itemBottleAmaretto, itemBottleAngosturaBitter, itemBottleBaileys;
	public static Item itemBottleBenedictine, itemBottleBitter, itemBottleBlueCaracao, itemBottleBordeauxChateauLary, itemBottleBordeauxChateauTourVerite;
	public static Item itemBottleBourgogneAligote, itemBottleBrandy, itemBottleBritt, itemBottleCalvados, itemBottleCampari;
	public static Item itemBottleCapCorse, itemBottleChampagneMumm, itemBottleChartreuseJaune, itemBottleChartreuseVerte, itemBottleChouchen;
	public static Item itemBottleCiderKerne, itemBottleCognac, itemBottleCuracaoOrange, itemBottleCuracaoTripleSec, itemBottleDesperados;
	public static Item itemBottleDrambuie, itemBottleDubonnetRouge, itemBottleDuvel, itemBottleEnate, itemBottleFernetBranca;
	public static Item itemBottleGet27, itemBottleGin, itemBottleGrandMarnier, itemBottleGrimbergen, itemBottleGuinness;
	public static Item itemBottleHeineken, itemBottleHoney, itemBottleLambig, itemBottleLeffe, itemBottleLiqueur;
	public static Item itemBottlePastis51, itemBottlePetrus, itemBottlePisco, itemBottlePommeau, itemBottlePontarlier;
	public static Item itemBottleRedMartini, itemBottleRedPort, itemBottleRum, itemBottleSanMiguel, itemBottleSkoll;
	public static Item itemBottleSmirnoff, itemBottleSouthernComfort, itemBottleTabasco, itemBottleTequila, itemBottleVinegar;
	public static Item itemBottleVodka, itemBottleWhiskey, itemBottleWhiteMartini, itemBottleWhitePort, itemBottleWorcestershireSauce;
	public static Item itemBottleXII, itemBottleXeres;	
	
		//sweet
	public static Item itemBottleBenturCola, itemBottleFleurOranger, itemBottleKetchup, itemBottleLimonade, itemBottlePerrier;
	public static Item itemBottleSchweppesAgrum, itemBottleSchweppesDarkSide, itemBottleSchweppesGingerAle, itemBottleSchweppesLemon, itemBottleSchweppesMango;
	public static Item itemBottleSchweppesPamplemousse, itemBottleSchweppesPassion, itemBottleSchweppesPech, itemBottleSchweppesPomme, itemBottleSchweppesRaisin;
	public static Item itemBottleSchweppesRicqles, itemBottleSchweppesTonic, itemPint;
	
		//alcohol WO labels
	public static Item itemBottle1664WOLabel, itemBottleAlsaceRieslingWOLabel, itemBottleAmarettoWOLabel, itemBottleAngosturaBitterWOLabel, itemBottleBaileysWOLabel;
	public static Item itemBottleBenedictineWOLabel, itemBottleBitterWOLabel, itemBottleBlueCuracaoWOLabel, itemBottleBordeauxLaryWOLabel, itemBottleBordeauxTourWOLabel;
	public static Item itemBottleBourgogneAligoteWOLabel, itemBottleBrandyWOLabel, itemBottleBrittWOLabel, itemBottleCalvadosWOLabel, itemBottleCampariWOLabel;
	public static Item itemBottleCapCorseWOLabel, itemBottleChampagneMummWOLabel, itemBottleChartreuseJauneWOLabel, itemBottleChartreuseVerteWOLabel, itemBottleChouchenWOLabel;
	public static Item itemBottleCiderKerneWOLabel, itemBottleCognacWOLabel, itemBottleCuracaoOrangeWOLabel, itemBottleCuracaoTripleSecWOLabel, itemBottleDesperadosWOLabel;
	public static Item itemBottleDrambuieWOLabel, itemBottleDubonnetRougeWOLabel, itemBottleDuvelWOLabel, itemBottleEnateWOLabel, itemBottleFernetBrancaWOLabel;
	public static Item itemBottleGet27WOLabel, itemBottleGinWOLabel, itemBottleGrandMarnierWOLabel, itemBottleGrimberWOLabel, itemBottleGuinnessWOLabel;
	public static Item itemBottleHeinekenWOLabel, itemBottleLambigWOLabel, itemBottleLeffeWOLabel, itemBottleLiqueurWOLabel, itemBottlePastis51WOLabel;
	public static Item itemBottlePetrusWOLabel, itemBottlePiscoWOLabel, itemBottlePommeauWOLabel, itemBottlePontarlierWOLabel, itemBottleRedMartiniWOLabel;
	public static Item itemBottleRedPortWOLabel, itemBottleRumWOLabel, itemBottleSanMiguelWOLabel, itemBottleSkollWOLabel, itemBottleSmirnoffWOLabel;
	public static Item itemBottleSouthernComfortWOLabel, itemBottleTabascoWOLabel, itemBottleTequilaWOLabel, itemBottleVodkaWOLabel, itemBottleWhiskeyWOLabel;
	public static Item itemBottleWhiteMartiniWOLabel, itemBottleWhitePortWOLabel, itemBottleWorcestershireSauceWOLabel, itemBottleXIIWOLabel, itemBottleXeresWOLabel;
	
		//sweet WO labels
	public static Item itemBenturColaWOLabel, itemBottleFleurOrangerWOLabel, itemBottleHoneyWOLabel, itemBottleLimonadeWOLabel, itemBottleSchweppesAgrumWOLabel;
	public static Item itemBottleSchweppesDarkSideWOLabel, itemBottleSchweppesGingerAleWOLabel, itemBottleSchweppesLemonWOLabel, itemBottleSchweppesMangoWOLabel, itemBottleSchweppesPamplemousseWOLabel;
	public static Item itemBottleSchweppesPassionWOLabel, itemBottleSchweppesPechWOLabel, itemBottleSchweppesPommeWOLabel, itemBottleSchweppesRicqlesWOLabel, itemBottleScweppesTonicWOLabel;
	public static Item itemBottleVinegarWOLabel, itemPerrierWOLabel, itemSchweppesRaisinWOLabel, itemSyrupMoninWOLabel;
	
		//labels
	// labels		
	public static Item itemBottle1664Label, itemBottleAlsaceRieslingLabel, itemBottleAmarettoLabel, itemBottleAngosturaBitterLabel, itemBottleBaileysLabel;
	public static Item itemBottleBenedictineLabel, itemBottleBenturColaLabel, itemBottleBitterLabel, itemBottleBlueCuracaoLabel, itemBottleBordeauxLaryLabel;
	public static Item itemBottleBordeauxTourLabel, itemBottleBourgogneAligoteLabel, itemBottleBrandyLabel, itemBottleBrittLabel, itemBottleCalvadosLabel;
	public static Item itemBottleCampariLabel, itemBottleCapCorseLabel, itemBottleChampagneMummLabel, itemBottleChartreuseJauneLabel, itemBottleChartreuseVerteLabel;
	public static Item itemBottleChouchenLabel, itemBottleCiderLabel, itemBottleCognacLabel, itemBottleCuracaoOrangeLabel, itemBottleCuracaoTripleSecLabel;
	public static Item itemBottleDesperadosLabel, itemBottleDrambuieLabel, itemBottleDubonnetRougeLabel, itemBottleDuvelLabel, itemBottleEnateLabel;
	public static Item itemBottleFernetBrancaLabel, itemBottleFleurOrangerLabel, itemBottleGet27Label, itemBottleGinLabel, itemBottleGrandMarnierLabel;
	public static Item itemBottleGrimbergenLabel, itemBottleGuinnessLabel, itemBottleHeinekenLabel, itemBottleHoneyLabel, itemBottleLambigLabel;
	public static Item itemBottleLeffeLabel, itemBottleLimonadeLabel, itemBottleLiquorLabel, itemBottlePastis51Label, itemBottlePerrierLabel;
	public static Item itemBottlePetrusLabel, itemBottlePiscoLabel, itemBottlePommeauLabel, itemBottlePontarlierLabel, itemBottleRedMartiniLabel;
	public static Item itemBottleRedPortLabel, itemBottleRumLabel, itemBottleSanMiguelLabel, itemBottleSchweppesAgrumLabel, itemBottleSchweppesDarkSideLabel;
	public static Item itemBottleSchweppesGingerAleLabel, itemBottleSchweppesLemonLabel, itemBottleSchweppesMangoLabel, itemBottleSchweppesPamplemousseLabel, itemBottleSchweppesPassionLabel;
	public static Item itemBottleSchweppesPechLabel, itemBottleSchweppesPommeLabel, itemBottleSchweppesRaisinLabel, itemBottleSchweppesRicqlesLabel, itemBottleSchweppesTonicLabel;
	public static Item itemBottleSiropMoninLabel, itemBottleSkollLabel, itemBottleSmirnoffLabel, itemBottleSouthernComfortLabel, itemBottleTabascoLabel;
	public static Item itemBottleTequilaLabel, itemBottleVinegarLabel, itemBottleVodkaLabel, itemBottleWhiskeyLabel, itemBottleWhiteMartiniLabel;
	public static Item itemBottleWhitePortLabel, itemBottleWorcestershireSauceLabel, itemBottleXIILabel, itemBottleXeresLabel;
	
	//Coffee and tea
	public static Item itemCoffeeArabicasGround, itemCoffeeBlueMountainGround, itemCoffeeBourbonPointuGround, itemCoffeeCatturaGround, itemCoffeeHarrarGround;
	public static Item itemCoffeeHuehuetenangoGround, itemCoffeeJavaGround, itemCoffeeKenyaAAGround, itemCoffeeKonaGround, itemCoffeeKontirWildForestGround;
	public static Item itemCoffeeKopiLuwakGround, itemCoffeeKupeAlamidGround, itemCoffeeMokaGround, itemCoffeeMundoNovoGround, itemCoffeeMuragogypeGround;
	public static Item itemCoffeePeaberryGround, itemCoffeeTarrazuGround, itemCoffeeTorajaKalossiGround, itemCoffeeYirgacheffeGround, itemDriedTeaLeaves;
	
	public static Item itemCapsuleArpeggio, itemCapsuleArpeggioEmpty, itemCapsuleBukeelaKaEthiopia, itemCapsuleBukeelaKaEthiopiaEmpty, itemCapsuleCapriccio;
	public static Item itemCapsuleCapriccioEmpty, itemCapsuleCosi, itemCapsuleCosiEmpty, itemCapsuleDecaffeinato, itemCapsuleDecaffeinatoEmpty;
	public static Item itemCapsuleDecaffeinatoIntenso, itemCapsuleDecaffeinatoIntensoEmpty, itemCapsuleDecaffeinatoLungo, itemCapsuleDecaffeinatoLungoEmpty, itemCapsuleDharkan;
	public static Item itemCapsuleDharkanEmpty, itemCapsuleDulsaoDoBrasil, itemCapsuleDulsaoDoBrasilEmpty, itemCapsuleFortissioLungo, itemCapsuleFortissioLungoEmpty;
	public static Item itemCapsuleIndriyaFromIndia, itemCapsuleIndriyaFromIndiaEmpty, itemCapsuleKazaar, itemCapsuleKazaarEmpty, itemCapsuleLinizioLungo;
	public static Item itemCapsuleLinizioLungoEmpty, itemCapsuleLivanto, itemCapsuleLivantoEmpty, itemCapsuleRistretto, itemCapsuleRistrettoEmpty;
	public static Item itemCapsuleRoma, itemCapsuleRomaEmpty, itemCapsuleRosabayaDeColombia, itemCapsuleRosabayaDeColombiaEmpty, itemCapsuleVivaltoLungo;
	public static Item itemCapsuleVivaltoLungoEmpty, itemCapsuleVolluto, itemCapsuleVollutoEmpty;
			
	public static Item itemTeaBagCaramel, itemTeaBagChai, itemTeaBagEarlGrey, itemTeaBagEmpty, itemTeaBagLemon;
	public static Item itemTeaBagMatchaGreen, itemTeaBagPeach, itemTeaBagRaspberry, itemTeaBagRedFruit;
		
	public static Item itemCupArpeggio, itemCupBukeelaKaEthiopia, itemCupCapriccio, itemCupCoffeeEmpty, itemCupCosi;
	public static Item itemCupDecaffeinato, itemCupDecaffeinatoIntenso, itemCupDecaffeinatoLungo, itemCupDharkan, itemCupDulsaoDoBrasil;
	public static Item itemCupFortissioLungo, itemCupIndriyaFromIndia, itemCupKazaar, itemCupLinizioLungo, itemCupLivanto;
	public static Item itemCupRistretto, itemCupRoma, itemCupRosabayaDeColombia, itemCupTeaCaramel, itemCupTeaChai;
	public static Item itemCupTeaEarlGrey, itemCupTeaLemon, itemCupTeaMatchaGreen, itemCupTeaPeach, itemCupTeaRaspberry;
	public static Item itemCupTeaRedFruit, itemCupVivaltoLungo, itemCupVolluto, itemTeapot;

	
	public static void register(){
		//items bottle
			//alcohol
		itemBottle1664 = new ItemBottle("itemBottle1664");
		itemBeverage1664 = new ItemBeverageAlcohol("itemBeverage1664");

		
		/*
		itemBottleAlsaceRiesling = new ItemBottle("itemBottleAlsaceRiesling");
		itemBottleAmaretto = new ItemBottle("itemBottleAmaretto");
		itemBottleAngosturaBitter = new ItemBottle("itemBottleAngosturaBitter");
		itemBottleBaileys = new ItemBottle("itemBottleBaileys");
		*/
	}
		
	public static void registerRender(){
		//items bottle
			//alcohol
		ModelLoader.setCustomModelResourceLocation(itemBottle1664, 0, new ModelResourceLocation("bandb_mod:itembottle1664", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverage1664, 0, new ModelResourceLocation("bandb_mod:itembeverage1664", "inventory"));

		/*
		ModelLoader.setCustomModelResourceLocation(itemBottleAlsaceRiesling, 0, new ModelResourceLocation("bandb_mod:itemBottleAlsaceRiesling", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleAmaretto, 0, new ModelResourceLocation("bandb_mod:itemBottleAmaretto", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleAngosturaBitter, 0, new ModelResourceLocation("bandb_mod:itemBottleAngosturaBitter", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleBaileys, 0, new ModelResourceLocation("bandb_mod:itemBottleBaileys", "inventory"));
	*/}
}
