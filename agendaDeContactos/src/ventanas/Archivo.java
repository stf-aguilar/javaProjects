
package ventanas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivo {
    File archivo;
    
    public void crearArchivo() throws IOException{
        archivo = new File("agendaContactos.txt");
       
      if(archivo.createNewFile()){
          //archivo creado
      }
    }
    
    public void escribirTexto(Persona persona) throws IOException{
     FileWriter escribir = new FileWriter(archivo, true); 
     escribir.write(persona.getNombre()+ "%"+persona.getCorreo()+"%"+persona.getCelular()+"\r\n");  
     escribir.close();
    }
    
}
