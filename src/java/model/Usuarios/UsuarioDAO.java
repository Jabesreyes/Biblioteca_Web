
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

        public Usuario Validar(String usuario, String password){
            Usuario usr = new Usuario();
            System.out.println("Usuario y Contraseña Recibidos" + usuario + password);
            String sql = "SELECT * FROM usuarios WHERE usuario=?";
            try{
                Connection con = cn.Conexion();
                ps = con.prepareStatement(sql);
                ps.setString(1, usuario);
                rs = ps.executeQuery();
                while (rs.next()){
                    System.out.println("Usuario encontrado en la base de datos");

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

            }catch(Exception e){
                System.out.println("error al conectarse " + e.getMessage());

            }
            return usr;
        }
    }
