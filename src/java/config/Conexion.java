
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    Connection con;
    String base = "usuarios";
    String user = "root";
    String password = "";
    String url = "jdbc:mysql://localhost:3306/"+ base;
    
    public Connection Conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);            
            System.out.println("Se realizo la conexion");            
        } catch (Exception e) {           
            System.out.println("ERROR CON LA CONEXION");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);            
        }       
        return con;
    }  
}

