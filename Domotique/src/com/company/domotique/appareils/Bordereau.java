package com.company.domotique.appareils;

import java.util.Collections;
import java.util.Vector;

public class Bordereau extends Vector<AppareilElectrique> {


	public Bordereau() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void afficher(){
		if (this.size() != 0) {
			for (int i = 0; i < this.size(); i++) {
				System.out.println(this.elementAt(i).toString());

			}	
		}
		else{System.err.println("Pas d'elements");}
	}

	public void trierCroissant(){
		Collections.sort(this, new SortByCroissant());
	}



	@Override
	public String toString() {
		return "Bordereau [listeAppareils=" + this + "]";
	}	

}
