
package model.Usuarios;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UsuariosDAO extends Conexion{
    public boolean login(String user, String pass) {
        usuarios usuario = new usuarios();
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConexion();

        String sql = "SELECT u.id, u.usuario, u.password, u.nombre, u.id_tipo, t.nombre FROM usuarios AS u INNER JOIN tipo_usuario AS t ON u.id_tipo=t.id WHERE usuario = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, user);
            rs = ps.executeQuery();

            if (rs.next()) {
                if (pass.equals(rs.getString(3))) {

                    String sqlUpdate = "UPDATE usuarios SET last_session = ? WHERE id=?";

                    ps = con.prepareStatement(sqlUpdate);
                    ps.setTimestamp(1, new java.sql.Timestamp(new java.util.Date().getTime()));
                    ps.setInt(2, rs.getInt(1));
                    ps.execute();

                    usuario.setId(rs.getInt(1));
                    usuario.setNombre(rs.getString(4));
                    usuario.setId_tipo(rs.getInt(5));
                    usuario.setNombre_tipo(rs.getString(6));
                    System.out.println("se realizo la consulta usuario");
                    return true;
                } else {
                    return false;
                }
            }

            return false;
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
}
