package com.company.domotique.appareils.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.company.domotique.appareils.AppareilSecurise;

public class AppareilSecuriseTest {
	

	@Test
	public void testDemarrer() {
		AppareilSecurise microOndes= new AppareilSecurise("Atlantic", "7XB12", 1320, 110, 12);
		
		boolean testAvantDemarrage = microOndes.getIsEnMarche();
		assertFalse(testAvantDemarrage);
		assertFalse(microOndes.isSecuriteEnclenchee());
		microOndes.enclencherSecurite();
		microOndes.demarrer();
		boolean testApresDemarrage = microOndes.getIsEnMarche();
		assertTrue(testApresDemarrage);
		assertTrue(microOndes.isSecuriteEnclenchee());
		
		AppareilSecurise microOndes2= new AppareilSecurise("Atlantic", "7XB12", 1320, 110, 12);
		testAvantDemarrage = microOndes2.getIsEnMarche();
		assertFalse(testAvantDemarrage);
		assertFalse(microOndes2.isSecuriteEnclenchee());
		microOndes2.desenclencherSecurite();
		microOndes2.demarrer();
		testApresDemarrage = microOndes2.getIsEnMarche();
		assertFalse(testApresDemarrage);
		assertFalse(microOndes2.isSecuriteEnclenchee());
		
	}
	

	//@Test
	public void testDesenclencherSecurite() {
		AppareilSecurise microOndes= new AppareilSecurise("Atlantic", "7XB12", 1320, 110, 12);
		assertFalse(microOndes.isSecuriteEnclenchee());
	}

	//@Test
	public void testEnclencherSecurite() {
		fail("Not yet implemented");
	}

	//@Test
	public void testIsSecuriteEnclenchee() {
		fail("Not yet implemented");
	}

	//@Test
	public void testSetSecuriteEnclenchee() {
		fail("Not yet implemented");
	}

}
