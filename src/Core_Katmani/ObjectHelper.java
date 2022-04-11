package Core_Katmani;

import interfaces.CoreInterfaces;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class ObjectHelper extends CoreFields implements CoreInterfaces {
    
    static {
        try {
            Class.forName("org.postgresql.Driver"); // spl e bağlanma linkimiz 
        } catch (ClassNotFoundException e) {
           e.printStackTrace ();    
        }
        
    }
    
    
    public Connection getConnection() {
        Connection connection  = null ;
        
        try{
        connection = DriverManager.getConnection(getUrl(),getUserName(),getPassword());
        }catch(Exception e){
               e.printStackTrace (); 
        }
    return connection;
    }
    
}
