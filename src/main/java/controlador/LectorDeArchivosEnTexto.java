package controlador;

import java.io.*;
import javax.swing.JTextArea;

/**
 * Clase encargada de cargar los datos de cualquier archivo de texto al TextArea
 * @author ACER
 */
public class LectorDeArchivosEnTexto {
    
    /**
     * Metodo para cargar datos del archivo
     * @param archivo   archivo a cargar
     * @param areaTexto area de texto proveniente del frame para añadir el texto
     * @throws FileNotFoundException    excepcion para saber si el archivo no se encuentra
     * @throws IOException  excepciones de la clase io
     */
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
