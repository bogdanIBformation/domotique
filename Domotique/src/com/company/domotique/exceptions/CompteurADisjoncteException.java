package com.company.domotique.exceptions;

import com.company.domotique.maison.Compteur;

public class CompteurADisjoncteException extends Exception{

	Compteur compteurEnCause;
	int puissanceDisponible; // par le compteur avant de disjoncter
	// puissance demandée correspond en fait à la demande permise (calcul entre ce que demande un appareil et ce qui reste de dispo chez un compteur.
	
	public Compteur getCompteurEnCause() {
		return compteurEnCause;
	}
	public int getPuissanceDemandee() {
		return puissanceDisponible;
	}
	public CompteurADisjoncteException(Compteur p_compteurEnCause, int p_puissanceDemandee) {
		super();
		compteurEnCause = p_compteurEnCause;
		puissanceDisponible = p_puissanceDemandee;
	}

	
	
	
}
