
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class SQLUsuario {
    public boolean RegistrarUsuario(Usuario usuario){
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        
        try{
            Connection conexion = con.getConnection();         
            ps = conexion.prepareStatement("insert into usuario (nombreUsuario, contraseña,nombre, correo,idTipo_Usuario) values(?,?,?,?,?)");
            ps.setString(1, usuario.getNombreUsuario());
            ps.setString(2, usuario.getContraseña());
            ps.setString(3, usuario.getNombre());
            ps.setString(4,usuario.getCorreo());
            ps.setInt(5,usuario.getIdTipo_usuario());
            
            ps.executeUpdate();
            
            return true;
        }catch(Exception ex){
            System.err.println("Error "+ ex);
            return false;
        }
    
    
    }
    
    public int verificarUsuario(String usuario){
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        
        try{
            Connection conexion = con.getConnection();         
            ps = conexion.prepareStatement("select count(id) from usuario where nombreUsuario=?");
            ps.setString(1,usuario);
            rs = ps.executeQuery();
            
            if(rs.next()){
                return rs.getInt(1);
            }
            
            return 1;
            
        }catch(Exception ex){
            return 1;
        }
    
    
    }

    public boolean comprobarEmail(String correo){
        Pattern pattern = Pattern
				.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
						+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(correo);
        
        return matcher.find();
    }

     
    public boolean iniciarSesion(Usuario usuario){
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        
        try{
            Connection conexion = con.getConnection();         
            ps = conexion.prepareStatement("select id, nombreUsuario,contraseña, nombre,idTipo_usuario from usuario where nombreUsuario=? ");
            ps.setString(1,usuario.getNombreUsuario());
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                if(usuario.getContraseña().equals(rs.getString("contraseña"))){
                    usuario.setId(rs.getInt("id"));
                    usuario.setNombre(rs.getString("nombre"));
                    usuario.setIdTipo_usuario(rs.getInt("idTipo_usuario"));
                    
                    return true;
                
                }else{
                    return false;
                }
            }
            
            return false;
            
        }catch(Exception ex){
            return false;
        }
    }

}
