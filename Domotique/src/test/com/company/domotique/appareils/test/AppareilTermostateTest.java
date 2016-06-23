package com.company.domotique.appareils.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.company.domotique.appareils.AppareilTermostate;

public class AppareilTermostateTest {

	@Test
	public void testIncrementerTermostat() {
		//fail("Not yet implemented");
		AppareilTermostate unChauffage = new AppareilTermostate("Atlantic", "7XB12", 1320, 110, 12);
		unChauffage.demarrer();
		
		int valeurTermostat=9;
		unChauffage.setValeurTermostat(9);
		unChauffage.incrementerTermostat();
		int nouvelleValeurTermostat =  unChauffage.getValeurTermostat();
		
		assertEquals(valeurTermostat +1, nouvelleValeurTermostat);
	}
	
	
	
	@Test
	public void testIncrementerTermostatWhenThermostatMax() {
		//fail("Not yet implemented");
		AppareilTermostate unChauffage = new AppareilTermostate("Atlantic", "7XB12", 1320, 110, 12);
		unChauffage.demarrer();
		
		int valeurTermostat=12;
		unChauffage.setValeurTermostat(valeurTermostat);
		unChauffage.incrementerTermostat();
		int nouvelleValeurTermostat =  unChauffage.getValeurTermostat();
		
		assertEquals(valeurTermostat , nouvelleValeurTermostat);
		
	}
	
	}

