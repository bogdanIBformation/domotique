package com.company.domotique.inter;

import com.company.domotique.exceptions.CompteurADisjoncteException;

public interface ProducteurDeCourant {

	
	public void brancher(ConsommateurDeCourant cc) throws CompteurADisjoncteException;
	public void disjoncter ();
	
}
