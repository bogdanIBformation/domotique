package com.company.domotique.application;

import com.company.domotique.appareils.AppareilElectrique;
import com.company.domotique.appareils.AppareilSecurise;
import com.company.domotique.appareils.AppareilTermostate;
import com.company.domotique.appareils.Bordereau;
import com.company.domotique.appareils.SortByCroissant;
import com.company.domotique.maison.Compteur;

public class Lanceur_Collection {

	public static void main(String[] args) {

		Bordereau bordereau = new Bordereau();//ArrayList<String> maListe = new ArrayList<String>(10);

		AppareilElectrique ordinateur= new AppareilElectrique("DELL","GX100",500);
		int valeurThermostatMax = 12;
		AppareilTermostate chauffage= new AppareilTermostate("atlantic", "7XB12", 1320, 110, valeurThermostatMax);
		AppareilSecurise microOndes= new AppareilSecurise("Thomsom", "8X65", 1500, 110, valeurThermostatMax);
		AppareilElectrique lampe= new AppareilElectrique("Zxzxzx","QS100",400);
		AppareilElectrique lampe1= new AppareilElectrique("Zxzxzx","QS400",400);
		AppareilElectrique lampe2= new AppareilElectrique("Zxzxzx","QS400",400);
		
		System.out.println("---------TRANSITION----------------");
		//demarrage appareils:
		ordinateur.demarrer();
		chauffage.demarrer();
		chauffage.setValeurTermostat(valeurThermostatMax);
		//System.err.println("puissance instantanee: "+chauffage.getPuissanceInstantanee());
		microOndes.enclencherSecurite();//set isSecuriteEnclanche à TRUE; Bon pour demarrage.
		microOndes.setValeurTermostat(valeurThermostatMax);
		microOndes.demarrer();
		
		Compteur unCompteur = new Compteur("EDF", "Linky", 2000);
//	unCompteur.brancher(ordinateur);
//		unCompteur.brancher(chauffage);
//	unCompteur.brancher(microOndes);
//	unCompteur.brancher(lampe);
//	unCompteur.brancher(lampe1);
//	unCompteur.brancher(lampe2);
//	unCompteur.brancher(lampe2);
//	
	
		
		
		
		
		
		
		
		
		
		
		
		
//		if (chauffage instanceof AppareilElectrique) {
//			System.out.println("chauffage est un appareil securisee");
//			
//		}else{ 
//			System.out.println("chauffage c'est de la m****");
//			
//		}
//		System.out.println("**********************test");		
//		
//		
		
		
//		bordereau.add(microOndes);
//		bordereau.add(chauffage);
//		bordereau.add(ordinateur);
//		bordereau.add(lampe);
//		bordereau.add(lampe1);
//		bordereau.add(lampe2);
//		
//
//		bordereau.afficher();
//
//		//		SortByCroissant laComparaison = new SortByCroissant();
//		//		int result = laComparaison.compare(chauffage, ordinateur);
//		//		System.out.println("Resultat comparaison: "+result);
//		System.out.println("*********************");
//		
//		bordereau.trierCroissant();		
//		bordereau.afficher();











	}

}
