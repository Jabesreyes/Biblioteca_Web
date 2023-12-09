
package model.Materiales;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class RevistasDAO {
    Connection conexion;

    public RevistasDAO() {
        Conexion con = new Conexion();
        conexion = con.Conexion();
    }
    
    public List<Revistas> listarRevistas() {
        PreparedStatement ps;
        ResultSet rs;

        List<Revistas> lista = new ArrayList<>();
        try {
            ps = conexion.prepareStatement("SELECT * FROM revistas");
            rs = ps.executeQuery();

            while (rs.next()) {
                String codigoidentificacion = rs.getString("CodigoIdentificacion");
                String titulo = rs.getString("Titulo");
                String editorial = rs.getString("Editorial");
                String periodicidad = rs.getString("Periodicidad");
                String fechapublicacion = rs.getString("FechaPublicacion");
                String ubicacion = rs.getString("Ubicacion");
                int unidades = rs.getInt("Unidades");
                int unidadesprestados = rs.getInt("UnidadesPrestados");
                int unidadesdisponibles = rs.getInt("UnidadesDisponibles");

                Revistas revistas = new Revistas(codigoidentificacion, titulo, editorial, periodicidad, fechapublicacion,ubicacion, unidades, unidadesprestados, unidadesdisponibles);

                lista.add(revistas);
            }

            return lista;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
    }
    
    public boolean insertar(Revistas revistas) {
        PreparedStatement ps;

        try {
            ps = conexion.prepareStatement("INSERT INTO revistas (Titulo, Editorial, Periodicidad, FechaPublicacion, Ubicacion, Unidades, UnidadesDisponibles) VALUES (?, ?, ?, ?, ?, ?, ?-1)");
            ps.setString(1, revistas.getTitulo());
            ps.setString(2, revistas.getEditorial());
            ps.setString(3, revistas.getPeriodicidad());
            ps.setString(4, revistas.getFechapublicacion());
            ps.setString(5, revistas.getUbicacion());
            ps.setInt(6, revistas.getUnidades());
            ps.setInt(7, revistas.getUnidades());

            ps.execute();

            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
}
