package de.hdm.itprojekt.shared.bo;


/**
 * Realisierung der Abonnementklasse
 * </br>
 * Ein Abonnement ist eine Verkn�pfung zwischen einer Pinnwand und einem Nutzer,
 * somit werden hier nur Fremndschl�sselbeziehungen realisiert
 * @author Schwab
 */
public class Abonnement extends BusinessObject {

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
	 * Fremdschl�sselbeziehung zur Pinnwand
	 */
	private int pinnwandID = 0;

	
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

	
	/**
	 * Auslesen des Fremdschl�ssels der Pinnwand
	 * @return pinnwandID
	 */
	public int getPinnwandID() {
		return pinnwandID;
	}

	
	/**
	 * Setzen des Fremdschl�ssels der Pinnwand
	 * @param pinnwandID
	 */
	public void setPinnwandID(int pinnwandID) {
		this.pinnwandID = pinnwandID;
	}
}
