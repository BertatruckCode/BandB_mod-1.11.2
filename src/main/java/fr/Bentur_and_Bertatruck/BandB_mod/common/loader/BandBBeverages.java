package fr.Bentur_and_Bertatruck.BandB_mod.common.loader;

import fr.Bentur_and_Bertatruck.BandB_mod.common.item.ItemBottle;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BandBBeverages {
	
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

	
	public static void register(){
		//items bottle
			//alcohol
		itemBottle1664 = new ItemBottle("itemBottle1664");
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
		ModelLoader.setCustomModelResourceLocation(itemBottle1664, 0, new ModelResourceLocation("bandb_mod:beverage\\bottle\\itembottle1664.json", "inventory"));
		/*
		ModelLoader.setCustomModelResourceLocation(itemBottleAlsaceRiesling, 0, new ModelResourceLocation("bandb_mod:itemBottleAlsaceRiesling", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleAmaretto, 0, new ModelResourceLocation("bandb_mod:itemBottleAmaretto", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleAngosturaBitter, 0, new ModelResourceLocation("bandb_mod:itemBottleAngosturaBitter", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleBaileys, 0, new ModelResourceLocation("bandb_mod:itemBottleBaileys", "inventory"));
	*/}
}
