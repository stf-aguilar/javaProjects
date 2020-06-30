
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class SQLUsuario {
    public boolean RegistrarUsuario(Usuario usuario){
        Conexion con = new Conexion();
        Connection conexion = con.getConnection();
        PreparedStatement ps = null;
        
        try{
        
        }catch(Exception ex){
            System.err.println("Error "+ ex);
        }
    
    
    }
}
