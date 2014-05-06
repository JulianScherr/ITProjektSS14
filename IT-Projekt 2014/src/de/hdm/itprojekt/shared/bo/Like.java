package de.hdm.itprojekt.shared.bo;


/**
 * Realisierung der Likeklasse
 * </br>
 * Ein Like besteht nur aus einer Referenz zum jeweiligen Nutzer
 * </br>
 * Der Nutzer ist eine Fremdschl�sselbeziehung
 * @author Schwab
 */
public class Like extends BusinessObject {

	/**
	 * serialVersionUID wird ben�tigt um eine Art Version festzulegen um bei einer Deserialisierung den Wert der Variable zu vergleichen
	 * </br>weitere Informationen zu Serializable siehe <a href="http://www.zdnet.de/39154667/wissenswertes-zur-serialisierung-von-java-objekten/">Link</a>
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Fremdschl�sselbeziehung zu Nutzern
	 */
	private int nutzerID = 0;
	
	/**
	 * Auslesen des Fremdschl�ssels der Nutzer
	 * @return nutzerID
	 */
	public int getNutzerID() {
		return nutzerID;
	}

	
	/**
	 * Setzen des Fremdschl�ssels der Nutzer
	 * @param nutzerID
	 */
	public void setNutzerID(int nutzerID) {
		this.nutzerID = nutzerID;
	}
}
