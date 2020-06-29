package modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Conexion {
    public static final String URL = "jdbc:mysql://localhost:3306/persona?autoReconnect=true&useSSL=false";
    public static final String usuario = "root";
    public static final String contraseña = "password";
    
    
    public Connection getConnection(){
        Connection conexion = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(URL, usuario,contraseña);
            
        }catch(Exception ex){
            System.err.println("Error "+ex);
        }
        return conexion;
    
    }
    
    
}
