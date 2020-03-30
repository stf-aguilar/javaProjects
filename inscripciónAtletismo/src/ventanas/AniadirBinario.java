
package ventanas;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;


public class AniadirBinario extends ObjectOutputStream{

    public AniadirBinario(OutputStream out) throws IOException {
        super(out);
    }

    public AniadirBinario() throws IOException, SecurityException {
    }
    
    @Override
    public void writeStreamHeader() throws IOException{
        File archivo = new File("registroAtletas.bin");
        
        if(archivo.length()==0){
            super.writeStreamHeader();
        }else{
            reset();
        }
    }
}
