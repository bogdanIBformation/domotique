package com.company.domotique.application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.company.domotique.appareils.AppareilElectrique;
import com.company.domotique.appareils.AppareilTermostate;

public class Lanceur {
	
		public static void main(String [] args){
		
		
		
			
			
		System.out.println("Bonjour");
		AppareilElectrique ordinateur= new AppareilElectrique("DELL","GX100",500);
		AppareilTermostate chauffage= new AppareilTermostate("Atlantic", "7XB12", 1320, 110, 9);
		//AppareilTermostate unChauffage = new AppareilTermostate("Atlantic", "7XB12", 1320, 110, 12);
		

		// affichage de l'objet chauffage (methode toString appelee par defaut)
		//Verification de l'instanciation
		System.out.println(ordinateur);
		System.out.println(chauffage);
		//System.out.println(unChauffage);
		
		System.out.println("Marque :" + ordinateur.getMarque()
					 	+ ", Modele : " + ordinateur.getModele());
		System.out.println("Marque :" + chauffage.getMarque() 
						+ ", Modele : " + chauffage.getModele()
					    + ", Thermostat : " + chauffage.getValeurTermostat());

		
		//Mise en marche chauffage, reglage thermostat
		chauffage.demarrer();
		chauffage.setValeurTermostat(6);
		
		System.out.println("Chauffage en marche? :" + chauffage.getIsEnMarche() 
						+ ", Thermostat : " + chauffage.getValeurTermostat());
		
		
		//Tentative d'incrementation du thermostat superieure à son thermostat maxi (12)
		System.out.println("la consommation instantanée termostat");
		//for (int i=0; i<12; i++) {
			System.out.println("AVANT incrementerThermostat:"+chauffage.toString());
			chauffage.incrementerTermostat();
			System.out.println("APRES incrementerThermostat:"+chauffage.toString());
		//}
		

		// mise en marche de l'ordinateur
		ordinateur.demarrer();

		//etc...................................


	System.out.println("Au revoir!");

		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection connexion = DriverManager.getConnection("jdbc:odbc:DSNDomotique");
			Statement laRequete =connexion.createStatement();
			ResultSet leResultat =laRequete.executeQuery("Select * FROM APPAREIL_ELECTRIQUE_TBL");
			afficherTable(leResultat);
			int leResultat1 = laRequete.executeUpdate("UPDATE APPAREIL_ELECTRIQUE_TBL SET puissanceMaxWatt=150 WHERE code=3");
			leResultat =laRequete.executeQuery("Select * FROM APPAREIL_ELECTRIQUE_TBL");
			System.out.println("---------------------------");
			afficherTable(leResultat);
			connexion.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		}

		private static void afficherTable(ResultSet leResultat) throws SQLException {
			while (leResultat.next()) {
				System.out.print("  "+ leResultat.getString("marque"));
				System.out.print("  "+ leResultat.getString("modele"));
				System.out.println("  "+ leResultat.getInt("puissanceMaxwatt"));
			}
		}		
		
}
