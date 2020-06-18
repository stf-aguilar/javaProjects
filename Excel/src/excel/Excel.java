
package excel;

import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel {


    public static void main(String[] args) {
        // TODO code application logic here
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
    
}
