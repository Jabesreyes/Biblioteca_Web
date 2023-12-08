/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Materiales;

import model.Materiales.Libros;
import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jabes
 */
public class LibrosDAO {

    Connection conexion;

    public LibrosDAO() {
        Conexion con = new Conexion();
        conexion = con.Conexion();
    }

    public List<Libros> listarLibros() {
        PreparedStatement ps;
        ResultSet rs;

        List<Libros> lista = new ArrayList<>();
        try {
            ps = conexion.prepareStatement("SELECT * FROM libros");
            rs = ps.executeQuery();

            while (rs.next()) {
                String codigoidentificacion = rs.getString("CodigoIdentificacion");
                String titulo = rs.getString("Titulo");
                String autor = rs.getString("Autor");
                int paginas = rs.getInt("Paginas");
                String editorial = rs.getString("Editorial");
                String isbn = rs.getString("ISBN");
                String fechapublicacion = rs.getString("FechaPublicacion");
                String ubicacion = rs.getString("Ubicacion");
                int unidades = rs.getInt("Unidades");
                int unidadesprestados = rs.getInt("UnidadesPrestados");
                int unidadesdisponibles = rs.getInt("UnidadesDisponibles");

                Libros libro = new Libros(codigoidentificacion, titulo, autor, paginas, editorial, isbn, fechapublicacion,ubicacion, unidades, unidadesprestados, unidadesdisponibles);

                lista.add(libro);
            }

            return lista;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
    }

    public Libros mostrarLibros(int _id) {
        PreparedStatement ps;
        ResultSet rs;

        Libros libro = null;
        try {
            ps = conexion.prepareStatement("SELECT * FROM libros WHERE CodigoIdentificacion=?");
            ps.setInt(1, _id);
            rs = ps.executeQuery();

            while (rs.next()) {
                String codigoidentificacion = rs.getString("CodigoIdentificacion");
                String titulo = rs.getString("Titulo");
                String autor = rs.getString("Autor");
                int paginas = rs.getInt("Paginas");
                String editorial = rs.getString("Editorial");
                String isbn = rs.getString("ISBN");
                String fechapublicacion = rs.getString("FechaPublicacion");
                String ubicacion = rs.getString("Ubicacion");
                int unidades = rs.getInt("Unidades");
                int unidadesprestados = rs.getInt("UnidadesPrestados");
                int unidadesdisponibles = rs.getInt("UnidadesDisponibles");

                libro  = new Libros(codigoidentificacion, titulo, autor, paginas, editorial, isbn, fechapublicacion,ubicacion, unidades, unidadesprestados, unidadesdisponibles);
            }

            return libro;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
    }
    
    public boolean insertar(Libros libro) {
        PreparedStatement ps;

        try {
            ps = conexion.prepareStatement("INSERT INTO libros (Titulo, Autor, Paginas, Editorial, ISBN, FechaPublicacion, Ubicacion, Unidades,UnidadesDisponibles) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?-1)");
            ps.setString(1, libro.getTitulo());
            ps.setString(2, libro.getAutor());
            ps.setInt(3, libro.getPaginas());
            ps.setString(4, libro.getEditorial());
            ps.setString(5, libro.getIsbn());
            ps.setString(6, libro.getFechapublicacion());
            ps.setString(7, libro.getUbicacion());
            ps.setInt(8, libro.getUnidades());
            ps.setInt(9, libro.getUnidades());

            ps.execute();

            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
    public boolean actualizar(Libros libro) {
        PreparedStatement ps;

        try {
            ps = conexion.prepareStatement("UPDATE libros Titulo=?, Autor=?, Paginas=?, Editorial=?, ISBN=?, FechaPublicacion=?, Ubicacion=?, Unidades=?,UnidadesDisponibles=?-1 WHERE CodigoIdentificacion=?");
            ps.setString(1, libro.getTitulo());
            ps.setString(2, libro.getAutor());
            ps.setInt(3, libro.getPaginas());
            ps.setString(4, libro.getEditorial());
            ps.setString(5, libro.getIsbn());
            ps.setString(6, libro.getFechapublicacion());
            ps.setString(7, libro.getUbicacion());
            ps.setInt(8, libro.getUnidades());
            ps.setInt(9, libro.getUnidades());
            ps.setString(10, libro.getCodigoidentificacion());

            ps.execute();

            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
    public boolean eliminar(int _id) {
        PreparedStatement ps;

        try {
            ps = conexion.prepareStatement("DELETE FROM libros WHERE CodigoIdentificacion=?");
            
            ps.setInt(1, _id);

            ps.execute();

            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
}
