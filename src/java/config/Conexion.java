
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
    private final String base = "usuarios";
    private final String user = "root";
    private final String password = "";
    private final String url = "jdbc:mysql://localhost:3306/"+ base;
    private Connection con = null;
    public Connection getConexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url+"?serverTimezone=UTC", user, password);
            
            System.out.println("Se realizo la conexion");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    }
}
