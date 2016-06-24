package com.company.domotique.ihm;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;

import com.company.domotique.appareils.AppareilElectrique;
import com.company.domotique.appareils.AppareilTermostate;
import com.company.domotique.maison.Compteur;


public class CadreGeneral extends JFrame {
	
	private AppareilElectrique monAppElec;
	private AppareilTermostate monAppThermos;
	private Compteur monCompteur;
	private Horloge monHorloge;
	
	
	/*
	 * Construit graphiquement un nouveau panneau de commande
	 */

	public CadreGeneral(AppareilElectrique pAppElec, AppareilTermostate pAppThermos, Compteur pCompteur) {
		
		monAppElec = pAppElec;
		monAppThermos = pAppThermos;
		monCompteur = pCompteur;
		monHorloge= new Horloge();
		
		getContentPane().setLayout(new FlowLayout());
		getContentPane().setBackground(new Color(125,204,204));
		
		PanneauCompteur unPanoC=new PanneauCompteur(monCompteur);		
		PanneauAppareil unPanoE=new PanneauAppareil(monAppElec, unPanoC);		
		PanneauThermostat unPanoT=new PanneauThermostat(monAppThermos, unPanoC);
		unPanoC.abonnement(unPanoE, unPanoT);		

		getContentPane().add(unPanoE);
		getContentPane().add(unPanoT);
		getContentPane().add(unPanoC);	
		getContentPane().add(monHorloge);
	
		setSize(550,200);
		setVisible(true);
	}

}
