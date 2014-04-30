package de.hdm.itprojekt.shared.reportGenerator;


import java.util.Vector;

public class Reihe {

private Vector<Zeile> reihe = new Vector<Zeile>();

public void hinzufuegenZeile( Zeile z){
	
}
public void loeschenZeile( Zeile z){
	
}
public Vector<Zeile> getZeile(){
	return reihe;
}
public int anzahlZeilen(){
	return reihe.length;
}
public Zeile getZeileAt(int i){
	//return???
}

}
