package de.integrata.hkw07;
import de.integrata.hkw07.ofen.*;

/**
 * Diese Startklasse dient dem Test des Ofen-Modells,
 * 
 * Um das Simulationsprogramm JMain von unterschiedlichen Ofen-
 * Implementierungen zu entkoppeln wurde eine einheitliche Steuerung 
 * der OfenController eingef�hrt. Der OfenController erzeugt den Ofen,
 * erm�glicht die dynamische Generierung von Brennelemnten und befeuert
 * den Ofen.
 * 
 * @version 1.4 krg 15.8.2004 (hkw03)  von start auf zufallsverbrennen umgest.
 */
public class JMain {

	/**
	 * Starte Simulation
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Projekt Heizkraftwerk Version 04");
		OfenControllerImpl oc = new ConfigurableOfenController();
		oc.zufallsVerbrennen();
	}
}