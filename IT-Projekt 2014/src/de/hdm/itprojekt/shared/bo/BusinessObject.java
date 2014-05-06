package de.hdm.itprojekt.shared.bo;

import java.io.Serializable;
import java.sql.Timestamp;


	public abstract class BusinessObject implements Serializable {
	
	
	private Timestamp erstellungszeitpunkt = new Timestamp(System.currentTimeMillis());
	
	
	public Timestamp getErstellungszeitpunkt(){
		return erstellungszeitpunkt;
	}
	
	public String toString(){
		
	}
	
	public boolean equals(){
		
	}
	
	public int hash(){
		
	}
}
