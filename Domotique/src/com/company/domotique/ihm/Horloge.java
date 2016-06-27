package com.company.domotique.ihm;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
//import java.time.LocalTime; en commentaire suite au passage du jdk8 au jdk7.
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class Horloge extends JPanel implements Runnable {
	private JLabel	labCpt = new JLabel("Il est :   ");
	private Thread myThread;

	public Horloge() {
		add(labCpt);
		myThread = new Thread(this);
		myThread.start(); // TODO demarrer le thread 
	}

	public void run() {

		while (true) {
			try{
				// suspendre le thread pendant 1 seconde
					//Thread.sleep((long)(Math.random()*1000));
					 Thread.sleep((long)(1000));
				
				// Recuperer l'heure courante a partir du GregorianCalendar; i++;
				// setter le label avec lheure : HOUR.MINUT.SECND
				// TODO instancier le  calendrier
					  
				// maj l'IHM
				// ("HOUR: " + uncalendar.get(Calendar.HOUR));"MINUTE: " + uncalendar.get(Calendar.MINUTE));"SECOND: " + uncalendar.get(Calendar.SECOND));
//Notre solution GregorianCalendar. implique de definir ids et pdt.					  
						String[] ids = TimeZone.getAvailableIDs(2 * 60 * 60 * 1000);
					SimpleTimeZone pdt = new SimpleTimeZone(2 * 60 * 60 * 1000, ids[0]);
					Calendar unCalendar = new GregorianCalendar(pdt);
					 labCpt.setText("Il est  "+ unCalendar.get(Calendar.HOUR)+" : "+ unCalendar.get(Calendar.MINUTE)+" : " + unCalendar.get(Calendar.SECOND));
//Solution Soriya				
//					DateFormat dateFormat= new SimpleDateFormat("HH:mm:ss");
//					Date date = new Date ();
//					String time = dateFormat.format(date);
//					labCpt.setText("Il est : " +time);
// Solution Oceane: pas top à l'affichage;					
	//				LocalTime chouFleur = LocalTime.now ();
	//				labCpt.setText("Il est : " +chouFleur.getHour()+" : "+chouFleur.getMinute()+" : "+ chouFleur.getSecond());
					
			}// fin du try
			catch (InterruptedException e){
				e.toString();
			} //fin du catch
		} // fin du while 
	}

} // class Horloge