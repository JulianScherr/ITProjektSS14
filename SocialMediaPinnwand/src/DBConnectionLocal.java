public class DBConnectionLocal { 
    
    public static void main(String[] args) { 
 
        // Diese Eintraege werden zum 
        // Verbindungsaufbau benoetigt. 
        final String hostname = "localhost"; 
        final String port = "3306"; 
        final String dbname = "socialmediapinnwand"; 
        final String user = "root@localhost"; 
        final String password = ""; 
	
        Connection conn = null; 
	
        try { 
	    System.out.println("* Treiber laden"); 
      	    Class.forName("org.gjt.mm.mysql.Driver").newInstance(); 
        } 
        catch (Exception e) { 
            System.err.println("Unable to load driver."); 
            e.printStackTrace(); 
        } 
        try { 
	    System.out.println("* Verbindung aufbauen"); 
	    String url = "jdbc:mysql://"+hostname+":"+port+"/"+dbname; 
	    conn = DriverManager.getConnection(url, user, password); 
	    
	    System.out.println("* Datenbank-Verbindung beenden"); 
	    conn.close(); 
        } 
        catch (SQLException sqle) { 
            System.out.println("SQLException: " + sqle.getMessage()); 
            System.out.println("SQLState: " + sqle.getSQLState()); 
            System.out.println("VendorError: " + sqle.getErrorCode()); 
            sqle.printStackTrace(); 
        } 
		
     } // ende: public static void main() 
    
} // ende: public class SimpleQuery 
