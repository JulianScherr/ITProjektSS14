package de.hdm.itprojekt.shared.bo;

/**
 * Realisierung der Pinnwandklasse
 * </br>
 * Eine Pinnwand enth�lt nur eine Referenz zu den Beitr�gen
 * @author Schwab
 *
 */
public class Pinnwand extends BusinessObject {

	/**
	 * serialVersionUID wird ben�tigt um eine Art Version festzulegen um bei einer Deserialisierung den Wert der Variable zu vergleichen
	 * </br>weitere Informationen zu Serializable siehe <a href="http://www.zdnet.de/39154667/wissenswertes-zur-serialisierung-von-java-objekten/">Link</a>
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Fremdschl�sselbeziehung zu Beitr�gen
	 */
	private int beitragID = 0;

	
	/**
	 * Auslesen des Fremdschl�ssels der Beitr�ge
	 * @return beitragID
	 */
	public int getBeitragID() {
		return beitragID;
	}

	/**
	 * Setzen des Fremdschl�ssels der Beitr�ge
	 * @param beitragID
	 */
	public void setBeitragID(int beitragID) {
		this.beitragID = beitragID;
	}
	
}
