package com.company.domotique.ihm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import com.company.domotique.appareils.AppareilTermostate;


public class PanneauThermostat extends PanneauAppareil implements ActionListener{

	private JLabel lblThermostat;
	private JButton btnAugmenterThermostat;
	private JButton btnDiminuerThermostat;

	private int thermostatCourant ;

	//les boutons doivent etre capable d'ecouter les clics de souris.
	// l'ajout de Actionlistner permet cet action. entre parenthese on lui donne la classe qui implemente cette methode.
	// la classe en cause (celle qu'on a passe en parametre) doit avoir une description de l'action à realiser notamment ActionPerformed.
	// comme on l'a ici (public void action performed), c'est le this. sinon on aurait eu a creer une classe qui  la contient.
	
	public PanneauThermostat(AppareilTermostate pAppThermo, PanneauCompteur pPanoC){
		super(pAppThermo, pPanoC);
		
		thermostatCourant= pAppThermo.getValeurTermostat();
		
		btnDiminuerThermostat = new JButton("-");
		add(btnDiminuerThermostat);
		btnDiminuerThermostat.addActionListener(this);

		lblThermostat = new JLabel(String.valueOf(thermostatCourant));	
		add(lblThermostat);

		btnAugmenterThermostat = new JButton("+");		
		add(btnAugmenterThermostat);
		btnAugmenterThermostat.addActionListener(this);
	}





	public void actionPerformed(ActionEvent evt){
	// On laisse traiter les actions demarrer et arreter au parent
	    super.actionPerformed(evt);

		AppareilTermostate cetAppareil=(AppareilTermostate)appareil;

		Object src = evt.getSource();
		if (src == btnDemarrer) {
			cetAppareil.demarrer();
		}
		else if (src == btnArreter) {
			cetAppareil.arreter();
		}
		else if(src == btnAugmenterThermostat){
			cetAppareil.incrementerTermostat();
			afficherThermostat();
		}
		else if (src == btnDiminuerThermostat){
			cetAppareil.decrementerTermostat();
			afficherThermostat();
			
			
		}//btnDiminuerThermostat
	}//actionPerformed(ActionEvent evt)

	
	
	
	private void afficherThermostat(){
		AppareilTermostate  cetAppareil=(AppareilTermostate)appareil;
		//String s=new Integer(cetAppareil.getValeurTermostat()).toString(); FAIT LA MEME CHOSE QUE LES DEUX PHRASE SUIVANTE
		thermostatCourant = cetAppareil.getValeurTermostat();//mise à jour de la valeur du thermostat ici.
		String s = String.valueOf(thermostatCourant);//conversion de la valeur int en valeur chaine de caracteres.
		if (s.length()<2) s="0"+s;
		
		//TOTO setter s comme label IHM
		lblThermostat.setText(s);	
	}
	
	//En cas de disjonctage, permet d initialiser les elements du pano
	public void initPano() {
		super.initPano();
		btnAugmenterThermostat.setEnabled(false);
		btnDiminuerThermostat.setEnabled(false);
		lblThermostat.setText("0");	
	}
}//PanneauAppareil