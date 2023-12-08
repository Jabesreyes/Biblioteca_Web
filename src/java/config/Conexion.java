
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jabes
 */
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
    
    public void closeConnection() {
    try {
        if (con != null) {
            con.close();
            System.out.println("Se cerró la conexión");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Error al cerrar la conexión");
    }
}
}
