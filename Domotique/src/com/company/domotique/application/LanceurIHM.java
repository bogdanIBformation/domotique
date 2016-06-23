package com.company.domotique.application;
import java.util.ArrayList;

import com.company.domotique.appareils.AppareilElectrique;
import com.company.domotique.appareils.AppareilTermostate;
import com.company.domotique.ihm.CadreGeneral;
import com.company.domotique.maison.Compteur;

public class LanceurIHM {

		
	public static void main(String[] args) {
	
		ArrayList alAppElec = new ArrayList();
		ArrayList alAppThermos = new ArrayList();
		
		int valeurThermostatMax =12;
		AppareilElectrique unOrdinateur = new AppareilElectrique("DELL","GX100",500);
		AppareilTermostate unMicroOnde = new AppareilTermostate("atlantic", "7XB12", 1320, 110, valeurThermostatMax);
		Compteur unCompteurEDF = new Compteur("EDF", "Linky", 2000);

		
		//unCompteurEDF.connecter(unOrdinateur);
		unOrdinateur.demarrer();
		unCompteurEDF.brancher(unOrdinateur);
		unMicroOnde.setValeurTermostat(valeurThermostatMax);
		unMicroOnde.demarrer();
		unCompteurEDF.brancher(unMicroOnde);
			
		CadreGeneral monInterface = new CadreGeneral(unOrdinateur, unMicroOnde, unCompteurEDF);		
	}
}
