
package model.Materiales;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ObrasDAO {
    Connection conexion;

    public ObrasDAO() {
        Conexion con = new Conexion();
        conexion = con.Conexion();
    }
    
    public List<Obras> listarObras() {
        PreparedStatement ps;
        ResultSet rs;

        List<Obras> lista = new ArrayList<>();
        try {
            ps = conexion.prepareStatement("SELECT * FROM obras");
            rs = ps.executeQuery();

            while (rs.next()) {
                String codigoidentificacion = rs.getString("CodigoIdentificacion");
                String titulo = rs.getString("Titulo");
                String autor = rs.getString("Autor");
                int paginas = rs.getInt("Paginas");
                String genero = rs.getString("Genero");
                String fechapublicacion = rs.getString("FechaPublicacion");
                String ubicacion = rs.getString("Ubicacion");
                int unidades = rs.getInt("Unidades");
                int unidadesprestados = rs.getInt("UnidadesPrestados");
                int unidadesdisponibles = rs.getInt("UnidadesDisponibles");

                Obras obras = new Obras(codigoidentificacion, titulo, autor, paginas,  genero, fechapublicacion, ubicacion, unidades, unidadesprestados, unidadesdisponibles);

                lista.add(obras);
            }

            return lista;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
    }
    
    public boolean insertar(Obras obras) {
        PreparedStatement ps;

        try {
            ps = conexion.prepareStatement("INSERT INTO obras (Titulo, Autor, Paginas, Genero, FechaPublicacion, Ubicacion, Unidades, UnidadesDisponibles) VALUES (?, ?, ?, ?, ?, ?, ?, ?-1)");
            ps.setString(1, obras.getTitulo());
            ps.setString(2, obras.getAutor());
            ps.setInt(3, obras.getPaginas());
            ps.setString(4, obras.getGenero());
            ps.setString(5, obras.getFechapublicacion());
            ps.setString(6, obras.getUbicacion());
            ps.setInt(7, obras.getUnidades());
            ps.setInt(8, obras.getUnidades());

            ps.execute();

            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
}
