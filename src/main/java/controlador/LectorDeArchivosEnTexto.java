package controlador;

import java.io.*;
import javax.swing.JTextArea;

/**
 *
 * @author ACER
 */
public class LectorDeArchivosEnTexto {
    
    public void cargarDatos (File archivo, JTextArea areaTexto) throws FileNotFoundException, IOException{
        
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
   
        String linea;
    
        while((linea = br.readLine()) != null){
            areaTexto.append("\n"+linea);
        }
        fr.close();
    }   
}
