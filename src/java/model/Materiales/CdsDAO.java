
package model.Materiales;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CdsDAO {
    Connection conexion;

    public CdsDAO() {
        Conexion con = new Conexion();
        conexion = con.Conexion();
    }
    
    public List<Cds> listarCds() {
        PreparedStatement ps;
        ResultSet rs;

        List<Cds> lista = new ArrayList<>();
        try {
            ps = conexion.prepareStatement("SELECT * FROM cds");
            rs = ps.executeQuery();

            while (rs.next()) {
                String codigoidentificacion = rs.getString("CodigoIdentificacion");
                String titulo = rs.getString("Titulo");
                String artista= rs.getString("Artista");
                String genero = rs.getString("Genero");
                String duracion = rs.getString("Duracion");
                int numerocanciones = rs.getInt("NumeroCanciones");
                String ubicacion = rs.getString("Ubicacion");
                int unidades = rs.getInt("Unidades");
                int unidadesprestados = rs.getInt("UnidadesPrestados");
                int unidadesdisponibles = rs.getInt("UnidadesDisponibles");

                Cds cds = new Cds(codigoidentificacion, titulo, artista, genero, duracion, numerocanciones,ubicacion, unidades, unidadesprestados, unidadesdisponibles);

                lista.add(cds);
            }

            return lista;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
    }
    
    public boolean insertar(Cds cds) {
        PreparedStatement ps;

        try {
            ps = conexion.prepareStatement("INSERT INTO cds (Titulo, Artista, Genero, Duracion, NumeroCanciones, Ubicacion, Unidades, UnidadesDisponibles) VALUES (?, ?, ?, ?, ?, ?, ?, ?-1)");
            ps.setString(1, cds.getTitulo());
            ps.setString(2, cds.getArtista());
            ps.setString(3, cds.getGenero());
            ps.setString(4, cds.getDuracion());
            ps.setInt(5, cds.getNumerocanciones());
            ps.setString(6, cds.getUbicacion());
            ps.setInt(7, cds.getUnidades());
            ps.setInt(8, cds.getUnidades());

            ps.execute();

            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
}
