package com.company.domotique.appareils;

import java.util.Comparator;

import com.company.domotique.inter.ConsommateurDeCourant;


public class AppareilElectrique extends Appareil implements ConsommateurDeCourant{

	protected int puissanceMaxWatts=0;
	protected boolean isEnMarche=false;


	//Constructeur
	public AppareilElectrique(String pMarque,String pModele, int pPuissance){
		super(pMarque, pModele);
		puissanceMaxWatts=pPuissance;
		isEnMarche=false; 
	}// constructeur



	public void setPuissanceMaxWatts(int pPuissance) {
		puissanceMaxWatts = pPuissance;
	} // set
	
	
	public int getPuissanceMaxWatts() {
		return puissanceMaxWatts;
	} // get


	public void setIsEnMarche(boolean pOnOff) {//was "setIsEnMarche"
			isEnMarche = pOnOff ;
	} // set
	
	public boolean getIsEnMarche() {//was "getIsEnMarche"
			return isEnMarche;
	} // get


	/**
		 met l'appareil en marche
	*/
    public void demarrer() {
	   isEnMarche=true;
    }//demarrer

   /**
    arrete l'appareil
   */
   public void arreter() {
   	      isEnMarche=false;
   }//arreter

	/**
	  retourne la consommation de l'appareil
	*/
	public int  getConsommation(){
		  if (isEnMarche)
		  		return puissanceMaxWatts;
		  else
		  		return 0;
	}//getConsommation



	@Override
	public String toString() {
		return "AppareilElectrique [puissanceMaxWatts=" + puissanceMaxWatts + ", isEnMarche=" + isEnMarche + ", toString()=" + super.toString() + "]";
	}

	
}
