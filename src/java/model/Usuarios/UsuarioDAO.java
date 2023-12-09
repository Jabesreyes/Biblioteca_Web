package model.Usuarios;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public Usuario validar(String user, String pass) {
        Usuario usr = new Usuario();
        String sql = "SELECT * FROM usuarios WHERE usuario = ? AND password = ?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();

            while (rs.next()) {
                usr.setId(rs.getInt("id"));
                usr.setUsuario(rs.getString("usuario"));
                usr.setPassword(rs.getString("password"));
                usr.setNombre(rs.getString("nombre"));
                usr.setCorreo(rs.getString("correo"));
                usr.setLast_session(rs.getString("last_session"));
                usr.setId_tipo(rs.getInt("id_tipo"));
                usr.setDoc_prestados(rs.getInt("doc_prestados"));
                usr.setLimite(rs.getInt("limite"));
                usr.setMora(rs.getInt("mora"));
            }

        } catch (Exception e) {

        }
        return usr;
    }

    public boolean Ingresar(String usuario, String password, String nombre, String correo, String permisos) {
        String sql = "INSERT INTO usuarios (usuario, password, nombre, correo, last_session, id_tipo, doc_prestados, limite, mora) VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, password);
            ps.setString(3, nombre);
            ps.setString(4, correo);
            ps.setString(5, "0000-00-00 00:00:00");
            ps.setString(6, permisos);
            ps.setString(7, "0");
            ps.setString(8, "0");
            ps.setString(9, "0");

            ps.execute();
            System.out.println("Se inserto el usuario");
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
        return true;
    }

    public boolean actualizarPassword(String usuario, String nuevaPassword) {
        String sql = "UPDATE usuarios SET password = ? WHERE usuario = ?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, nuevaPassword);
            ps.setString(2, usuario);
            ps.executeUpdate();
            System.out.println("Se actualizó la contraseña del usuario");
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }

    public boolean actualizarMora(String id_tipo, String mora) {
        String sql = "UPDATE tipo_usuario SET mora = ? WHERE nombre = ?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, mora);
            ps.setString(2, id_tipo);
            ps.executeUpdate();
            System.out.println("Se actualizó la mora del tipo de usuario");
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
    public boolean actualizarLimite(String id_tipo, String limite) {
    String sql = "UPDATE usuarios SET limite = ? WHERE id_tipo = ?";
    try {
        con = cn.Conexion();
        ps = con.prepareStatement(sql);
        ps.setString(1, limite);
        ps.setString(2, id_tipo);
        ps.executeUpdate();
        System.out.println("Se actualizó el límite de préstamos del tipo de usuario");
        return true;
    } catch (Exception e) {
        System.out.println(e.toString());
        return false;
    }
}


}
