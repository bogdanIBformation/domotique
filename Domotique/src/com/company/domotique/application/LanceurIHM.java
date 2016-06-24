package com.company.domotique.application;
import java.util.ArrayList;

import com.company.domotique.appareils.AppareilElectrique;
import com.company.domotique.appareils.AppareilTermostate;
import com.company.domotique.exceptions.CompteurADisjoncteException;
import com.company.domotique.ihm.CadreGeneral;
import com.company.domotique.maison.Compteur;

public class LanceurIHM {

		
	public static void main(String[] args) {
	
		ArrayList alAppElec = new ArrayList();
		ArrayList alAppThermos = new ArrayList();
		
		int valeurThermostatMax =12;
		AppareilElectrique unOrdinateur = new AppareilElectrique("DELL","GX100",500);
		AppareilElectrique unOrdinateur1 = new AppareilElectrique("DELL","GX100",300);
		AppareilTermostate unMicroOnde = new AppareilTermostate("atlantic", "7XB12", 1320, 110, valeurThermostatMax);
		Compteur unCompteurEDF = new Compteur("EDF", "Linky", 2000);

		
		//unCompteurEDF.connecter(unOrdinateur);
		unOrdinateur.demarrer();
		unOrdinateur1.demarrer();
		try {
			unCompteurEDF.brancher(unOrdinateur); //demande 500   permise 2000
			unCompteurEDF.brancher(unOrdinateur);	//demande 500   permise 1500
			unCompteurEDF.brancher(unOrdinateur);
			unCompteurEDF.brancher(unOrdinateur1);
			unCompteurEDF.brancher(unOrdinateur);
			
		} catch (CompteurADisjoncteException e) {
			System.out.println("le compteur " + e.getCompteurEnCause().getMarque()+ " a disjoncte pour la puissance n "+ e.getPuissanceDemandee());
			//e.printStackTrace();
		}
		
		
		
		
		
//		unMicroOnde.setValeurTermostat(valeurThermostatMax);
//		unMicroOnde.demarrer();
//		unCompteurEDF.brancher(unMicroOnde);
			
		CadreGeneral monInterface = new CadreGeneral(unOrdinateur, unMicroOnde, unCompteurEDF);		
	}
}
