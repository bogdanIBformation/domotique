package com.company.domotique.application;

import com.company.domotique.appareils.AppareilElectrique;
import com.company.domotique.appareils.AppareilTermostate;

public class Lanceur {
	
		public static void main(String [] args){
		
		
			
			
			
		System.out.println("Bonjour");
		AppareilElectrique ordinateur= new AppareilElectrique("DELL","GX100",500);
		AppareilTermostate chauffage= new AppareilTermostate("Atlantic", "7XB12", 1320, 110, 12);
		//AppareilTermostate unChauffage = new AppareilTermostate("Atlantic", "7XB12", 1320, 110, 12);
		

		// affichage de l'objet chauffage (methode toString appelee par defaut)
		//Verification de l'instanciation
		System.out.println(ordinateur);
		System.out.println(chauffage);
		//System.out.println(unChauffage);
		
		System.out.println("Marque :" + ordinateur.getMarque()
					 	+ ", Modele : " + ordinateur.getModele());
		System.out.println("Marque :" + chauffage.getMarque() 
						+ ", Modele : " + chauffage.getModele()
					    + ", Thermostat : " + chauffage.getValeurTermostat());

		
		//Mise en marche chauffage, reglage thermostat
		chauffage.demarrer();
		chauffage.setValeurTermostat(6);
		
		System.out.println("Chauffage en marche? :" + chauffage.getIsEnMarche() 
						+ ", Thermostat : " + chauffage.getValeurTermostat());
		
		
		//Tentative d'incrementation du thermostat superieure à son thermostat maxi (12)
		System.out.println("la consommation instantanée termostat");
		//for (int i=0; i<12; i++) {
			System.out.println("AVANT incrementerThermostat:"+chauffage.toString());
			chauffage.incrementerTermostat();
			System.out.println("APRES incrementerThermostat:"+chauffage.toString());
		//}
		

		// mise en marche de l'ordinateur
		ordinateur.demarrer();

		//etc...................................


	System.out.println("Au revoir!");
				
	}

}
