package model.Materiales;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrestamosDAO {

    Connection conexion;

    public PrestamosDAO() {
        Conexion con = new Conexion();
        conexion = con.Conexion();
    }

    public boolean insertarPrestamo(String codigo, String usuario, String fecha, String tipo) {
        PreparedStatement ps;

        try {
            ps = conexion.prepareStatement("INSERT INTO prestamos (CodigoIdentificacion, Usuario, IniciaPrestamo) VALUES (?, ?, ?)");
            ps.setString(1, codigo);
            ps.setString(2, usuario);
            ps.setString(3, fecha);
            ps.execute();

            ps = conexion.prepareStatement("UPDATE " + tipo + " SET UnidadesPrestados = UnidadesPrestados+1 WHERE CodigoIdentificacion=?");
            ps.setString(1, codigo);
            ps.executeUpdate();

            ps = conexion.prepareStatement("UPDATE " + tipo + " SET UnidadesDisponibles=UnidadesDisponibles-1 WHERE CodigoIdentificacion=?");
            ps.setString(1, codigo);
            ps.executeUpdate();

            ps = conexion.prepareStatement("UPDATE usuarios SET doc_prestados=doc_prestados+1 WHERE usuario=?");
            ps.setString(1, usuario);
            ps.executeUpdate();
            System.out.println("Se inserto el prestamo");
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            e.printStackTrace();
            System.out.println("no se inserto el prestamo");
            return false;
        }
    }

    public boolean finalizaPrestamo(String finaliza, String codigo, String user, String inicia, String material) {
        PreparedStatement ps;
        try {
            ps = conexion.prepareStatement("UPDATE prestamos SET FinalizaPrestamo = ? WHERE CodigoIdentificacion=?  AND usuario =? AND IniciaPrestamo=? AND ID=21");
            ps.setString(1, finaliza);
            ps.setString(2, codigo);
            ps.setString(3, user);
            ps.setString(4, inicia);
            ps.executeUpdate();
            
            ps = conexion.prepareStatement("UPDATE usuarios SET doc_prestados =doc_prestados-1 WHERE  usuario =?");
            ps.setString(1, user);
            ps.executeUpdate();
            
            ps = conexion.prepareStatement("UPDATE "+material+" SET UnidadesDisponibles=UnidadesDisponibles+1, UnidadesPrestados=UnidadesPrestados-1 WHERE CodigoIdentificacion = ?");
            ps.setString(1, codigo);
            ps.executeUpdate();
            System.out.println("Se Finalizo El prestamo");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.toString());
            System.out.println("no se pudo finalizar");
            return false;
        }
    }
}
