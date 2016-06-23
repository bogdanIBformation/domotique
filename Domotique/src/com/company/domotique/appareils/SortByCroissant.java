package com.company.domotique.appareils;

import java.util.Comparator;

public class SortByCroissant implements Comparator<AppareilElectrique> {

	@Override
	public int compare(AppareilElectrique o1, AppareilElectrique o2) {
		// int res = 0;

		String marque = o1.getMarque();
		String marque2 = o2.getMarque();

		String modele = o1.getModele();
		String modele2 = o2.getModele();

		int power = o1.getPuissanceMaxWatts();
		int power2 = o2.getPuissanceMaxWatts();

		if (marque.compareTo(marque2) == 0) {
			if (modele.compareTo(modele2) == 0) {
				if (power == power2) {
					return 0;
				} else {
					if (power > power2) {
						return 1;
					} else {
						return -1;
					}
				}
			} else {
				return modele.compareTo(modele2);
			}
		} else {
			// marque < ou > que marque 2.Stop
			return marque.compareTo(marque2);
		}
	}

}
