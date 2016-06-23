package com.company.domotique.appareils;

/**
 * @author Hanan
 * @version TP Domotique, Classe AppareilTermostate
 */

public class AppareilTermostate extends AppareilElectrique{



	private int puissanceInstantanee =0;
	private int incPuissance =20;
	private int valeurTermostat=0;
	private int valeurTermostatMax=0;

/**
 *
 * @param p_marque : La marque 
 * @param p_modele : Le modèle
 * @param p_puissanceMaxWatts: La puissance maximale en watts.
 * @param incPuissance: Increment de puissance (sera utilisé pour le calcul de la consommation) 
 * @param valeurTermostatMax: Valeur maximale du thermostat.
 * @return un objet "appareil thermostaté".
 * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/lang/reflect/Constructor.html"> Constructor documentation </a>
 * 
 */
	public AppareilTermostate(String p_marque, String p_modele, int p_puissanceMaxWatts, int incPuissance, 
			int valeurTermostatMax) {
		super( p_marque, p_modele, p_puissanceMaxWatts);
		this.incPuissance = incPuissance;
		this.valeurTermostatMax = valeurTermostatMax;

	}

	public int getValeurTermostat() {
		return valeurTermostat;
	}


	public void setValeurTermostat(int valeurTermostat) {
		this.valeurTermostat = valeurTermostat;
	}


	public int getConsommation(){
		//this.puissanceInstantanee = incPuissance*valeurTermostat;
		//return this.puissanceInstantanee;
		System.err.println("AppareilTermostate getConsommation puissanceInstantannee:"+getPuissanceInstantanee());
		return getPuissanceInstantanee();   
	}



	public int getValeurTermostatMax() {
		return valeurTermostatMax;
	}


	public void setValeurTermostatMax(int valeurTermostatMax) {
		this.valeurTermostatMax = valeurTermostatMax;
	}

	public int getPuissanceInstantanee() {
		this.puissanceInstantanee = incPuissance*valeurTermostat;
		return puissanceInstantanee;
	}


	public void setPuissanceInstantanee(int puissanceInstantanee) {
		this.puissanceInstantanee = puissanceInstantanee;
	}


	public int getIncPuissance() {
		return incPuissance;
	}


	public void setIncPuissance(int incPuissance) {
		this.incPuissance = incPuissance;
	}

	public void incrementerTermostat() {		
		if ( valeurTermostat != valeurTermostatMax) {
			valeurTermostat++;
			//this.puissanceInstantanee = valeurTermostat * incPuissance;
			this.puissanceInstantanee = getConsommation();
		}
	}
	
	public void decrementerTermostat() {		
		if ( valeurTermostat != 0) {
			valeurTermostat--;
			//this.puissanceInstantanee = valeurTermostat * incPuissance;
			this.puissanceInstantanee = getConsommation();
		}
	}

	@Override
	public String toString() {
		return "AppareilTermostate [puissanceInstantanee=" + getPuissanceInstantanee() + ", incPuissance=" + incPuissance
				+ ", valeurTermostat=" + valeurTermostat + ", valeurTermostatMax=" + valeurTermostatMax
				+ ", toString()=" + super.toString() + "]";
	}

}




