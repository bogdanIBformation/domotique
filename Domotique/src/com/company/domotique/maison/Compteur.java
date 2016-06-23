package com.company.domotique.maison;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;

import com.company.domotique.appareils.AppareilElectrique;
import com.company.domotique.inter.ConsommateurDeCourant;
import com.company.domotique.inter.ProducteurDeCourant;

public class Compteur extends AppareilElectrique implements ProducteurDeCourant {

	public Compteur(String pMarque, String pModele, int pPuissance) {
		super(pMarque, pModele, pPuissance);
		// TODO Auto-generated constructor stub
	}

	private int puissanceInstantanee = 0;
	private Collection<ConsommateurDeCourant> mesAppareilsBranches = new ArrayList<ConsommateurDeCourant>();

	

	@Override
	public void brancher(ConsommateurDeCourant cc) {

		int puissanceCc = cc.getConsommation();
		if ((puissanceInstantanee + puissanceCc) < puissanceMaxWatts) {
			this.mesAppareilsBranches.add(cc);
			this.puissanceInstantanee+= puissanceCc;
			System.out.println("Compteur brancher puissanceCc = " +puissanceCc+ " puissanceInstantanee = "+puissanceInstantanee+ " puissanceMaxWatts = "+puissanceMaxWatts);
		} else {
			disjoncter(); 
			System.out.println("STOP");
		}
	}
	
	public int getPuissanceInstantanee() {
		return puissanceInstantanee;
	}

	public void disjoncter() {
		for (ConsommateurDeCourant element : mesAppareilsBranches) {			
			if (element instanceof AppareilElectrique) {			// instanceof permet de tester si element peut etre caster en appareil electrique. false ou true.
				System.out.println((AppareilElectrique)element);
				((AppareilElectrique)element).arreter();
			}
		}
	}
	

	@Override
	public String toString() {
		return "Compteur [puissanceInstantanee=" + puissanceInstantanee + "]";
	}
}
