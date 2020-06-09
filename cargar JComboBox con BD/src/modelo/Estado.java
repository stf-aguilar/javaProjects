
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;


public class Estado {
    private int idEstado;
    private String nombreEstado;

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }
    
    @Override
    public String toString(){
        return this.nombreEstado; 
    }
    
    
    public Vector<Estado> mostrarEstados(Integer idPais){
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        Vector<Estado> vectorEstados = new Vector<Estado>();
        Estado estado = null;
        
        try{
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            
            ps = conexion.prepareStatement("select * from estados where idPais="+idPais);
            rs = ps.executeQuery();
            
            estado = new Estado();
            estado.setIdEstado(0);
            estado.setNombreEstado("seleccione estado");
            vectorEstados.add(estado);
            
            while(rs.next()){
                estado = new Estado();
                estado.setIdEstado(rs.getInt("idestado"));
                estado.setNombreEstado(rs.getString("nombreEstado"));
                vectorEstados.add(estado);
            }
            
            rs.close();
            
        }catch(Exception ex){
            System.err.println("Error "+ ex);
        
        }
        
        return vectorEstados;
    
    }
}