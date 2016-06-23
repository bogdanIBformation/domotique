package com.company.domotique.appareils;

public class AppareilSecurise extends AppareilTermostate {

	private boolean isSecuriteEnclenchee= false;//TRUE veut dire: Bon pour utilisation; FALSE veut dire: ARRET


	public AppareilSecurise(String p_marque, String p_modele, int p_puissanceMaxWatts, int incPuissance,
			int valeurTermostatMax) {
		super(p_marque, p_modele, p_puissanceMaxWatts, incPuissance, valeurTermostatMax);
		// TODO Auto-generated constructor stub
	}

	public void demarrer() {
		if (isSecuriteEnclenchee) {
			super.demarrer();
		}
	}

	public void desenclencherSecurite (){
		isSecuriteEnclenchee = false;//FALSE veut dire: ARRET
	}
	
	public void enclencherSecurite (){
		isSecuriteEnclenchee = true;//TRUE veut dire: Bon pour utilisation;
	}
	
	public boolean isSecuriteEnclenchee() {
		return isSecuriteEnclenchee;
	}


	public void setSecuriteEnclenchee(boolean isSecuriteEnclenchee) {
		this.isSecuriteEnclenchee = isSecuriteEnclenchee;
	}


	

	@Override
	public String toString() {
		return "AppareilSecurise [isSecuriteEnclenchee=" + isSecuriteEnclenchee + ", toString()=" + super.toString()
		+ "]";
	} 



}
