
package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Conexion;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel {


    public static void main(String[] args) {
        //crearExcel();
        //cargarExcel_a_BD();
        cargarBD_a_Excel();
        
    }
    
    public static void crearExcel(){
        Workbook libro = new XSSFWorkbook();
        Sheet hoja = libro.createSheet("Hola Java");
        try{
            FileOutputStream archivo = new FileOutputStream("Excel.xlsx");
            libro.write(archivo);
            archivo.close();
        }catch(Exception ex){
            System.err.println("Error "+ ex);
        }
    }
    
    public static void cargarExcel_a_BD(){
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        
        try{
            Connection conexion = con.getConnection();
            FileInputStream archivo = new FileInputStream(new File("C:\\home\\shinee\\Documentos\\Productos.xlsx"));
            XSSFWorkbook librolectura = new XSSFWorkbook(archivo);
            XSSFSheet hojaLectura = librolectura.getSheetAt(0);
            
            int numFilas = hojaLectura.getLastRowNum();
            
            System.out.println(numFilas);
            
            for (int i = 1; i < 10; i++) {
                Row fila = hojaLectura.getRow(i);
                
                ps = conexion.prepareStatement("insert into producto (codigo, nombre, precio, cantidad) values (?,?,?,?)");
                ps.setString(1, fila.getCell(0).getStringCellValue());
                ps.setString(2, fila.getCell(1).getStringCellValue());
                ps.setDouble(3, fila.getCell(2).getNumericCellValue());
                ps.setInt(4,(int) fila.getCell(3).getNumericCellValue());
                
                ps.executeUpdate();
            }
            
            conexion.close();
            
            
        
        }catch(Exception ex){
            System.err.println("Error "+ ex);
        }
    }
    
    public static void cargarBD_a_Excel(){
        Workbook libro = new XSSFWorkbook();
        Sheet hoja = libro.createSheet("Reporte productos");
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        
        
        String[] cabeceras = new String[]{"Código","Nombre","Precio","Cantidad"};
        
        Row filaCabeceras = hoja.createRow(0);
        
        for (int i = 0; i < cabeceras.length; i++) {
            Cell celda = filaCabeceras.createCell(i);
            celda.setCellValue(cabeceras[i]);       
 
        }
        
        int numFila = 1;
        
        
        try{
            Connection conexion = con.getConnection();
            ps = conexion.prepareStatement("select codigo, nombre, precio, cantidad from producto");
            rs = ps.executeQuery();
            
            int numCol = rs.getMetaData().getColumnCount();
            
            while(rs.next()){
                Row filaDatos = hoja.createRow(numFila);
                
                for (int i = 0; i <numCol; i++) {
                    Cell celda = filaDatos.createCell(i);
                    
                    if(i == 0  || i == 1){
                        celda.setCellValue(rs.getString(i + 1));    
                    }else{
                        celda.setCellValue(rs.getDouble(i + 1));
                    }
                }
                
                numFila++;
                
            
            }
            FileOutputStream archivo = new FileOutputStream("ReporteProductos.xlsx");
            libro.write(archivo);
            archivo.close();
            
        }catch(Exception ex){
            System.err.println("Error "+ ex);
        }
        
    
    
    }
    
}
