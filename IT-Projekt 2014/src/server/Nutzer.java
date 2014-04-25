package server;

public class Nutzer extends BusinessObject {
private String vorname = "";
private String nachname ="";
private String nickname = "";
private int nutzerID = 0; 

public String getVorname() {
	return vorname;
}

public String getNachname() {
	return nachname;
}
public String getnickname(){
	return nickname;
}
public int getNutzerID(){
	return nutzerID;
}


}
