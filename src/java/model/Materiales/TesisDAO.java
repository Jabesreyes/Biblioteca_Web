
package model.Materiales;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TesisDAO {
    Connection conexion;

    public TesisDAO() {
        Conexion con = new Conexion();
        conexion = con.Conexion();
    }
    
    public List<Tesis> listarTesis() {
        PreparedStatement ps;
        ResultSet rs;

        List<Tesis> lista = new ArrayList<>();
        try {
            ps = conexion.prepareStatement("SELECT * FROM tesis");
            rs = ps.executeQuery();

            while (rs.next()) {
                String codigoidentificacion = rs.getString("CodigoIdentificacion");
                String titulo = rs.getString("Titulo");
                String autor = rs.getString("Autor");
                String facultad = rs.getString("Facultad");
                String fechapublicacion = rs.getString("FechaPublicacion");
                String ubicacion = rs.getString("Ubicacion");
                int unidades = rs.getInt("Unidades");
                int unidadesprestados = rs.getInt("UnidadesPrestados");
                int unidadesdisponibles = rs.getInt("UnidadesDisponibles");

                Tesis tesis = new Tesis(codigoidentificacion, titulo, autor, facultad, fechapublicacion,ubicacion, unidades, unidadesprestados, unidadesdisponibles);

                lista.add(tesis);
            }

            return lista;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
    }
    
    public boolean insertar(Tesis tesis) {
        PreparedStatement ps;

        try {
            ps = conexion.prepareStatement("INSERT INTO tesis (Titulo, Autor, Facultad, FechaPublicacion, Ubicacion, Unidades, UnidadesDisponibles) VALUES (?, ?, ?, ?, ?, ?, ?-1)");
            ps.setString(1, tesis.getTitulo());
            ps.setString(2, tesis.getAutor());
            ps.setString(3, tesis.getFacultad());
            ps.setString(4, tesis.getFechapublicacion());
            ps.setString(5, tesis.getUbicacion());
            ps.setInt(6, tesis.getUnidades());
            ps.setInt(7, tesis.getUnidades());

            ps.execute();

            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
}
