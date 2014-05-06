package de.hdm.itprojekt.shared.bo;


/**
 * Realisierung der Beitragsklasse
 * </br>
 * Ein Beitrag wird durch einen Text dargestellt, welcher geliked und kommentiert werden kann
 * </br>
 * Like und Kommentar sind Fremdschl�ssel
 * @author Schwab
 */
public class Beitrag extends BusinessObject {

	/**
	 * serialVersionUID wird ben�tigt um eine Art Version festzulegen um bei einer Deserialisierung den Wert der Variable zu vergleichen
	 * </br>weitere Informationen zu Serializable siehe <a href="http://www.zdnet.de/39154667/wissenswertes-zur-serialisierung-von-java-objekten/">Link</a>
	 */
	private static final long serialVersionUID = 1L;

	
	/**
	 * Beitragstext als String
	 */
	private String beitragstext = "";
	
	
	/**
	 * Fremdschl�sselbeziehung der Likes
	 */
	private int likeID = 0;
	
	
	/**
	 * Fremdschl�sselbeziehung zu Kommentaren
	 */
	private int kommentarID = 0;

	
	/**
	 * Auslesen des Beitragstextes 
	 * @return text
	 */
	public String getBeitragstext() {
		return beitragstext;
	}

	
	/**
	 * Beitragstext setzen
	 * @param text
	 */
	public void setBeitragstext(String text) {
		this.beitragstext = text;
	}

	
	/**
	 * Auslesen des Fremdschl�ssels der Likes
	 * @return likeID
	 */
	public int getLikeID() {
		return likeID;
	}

	
	/**
	 * Setzen des Fremdschl�ssels der Likes
	 * @param likeID
	 */
	public void setLikeID(int likeID) {
		this.likeID = likeID;
	}

	
	/**
	 * Auslesen des Fremdschl�ssels der Kommentare
	 * @return kommentarID
	 */
	public int getKommentarID() {
		return kommentarID;
	}

	
	/**
	 * Setzen des Fremdschl�ssels der Kommentare
	 * @param kommentarID
	 */
	public void setKommentarID(int kommentarID) {
		this.kommentarID = kommentarID;
	}
	
	
	/**
	 * Textuelle Repr�sentation der relevanten Inhalte eines Beitrages
	 */
	public String toString(){
		return this.getBeitragstext(); // Notwendigkeit �berpr�fen (Martin Schwab)
	}
}
