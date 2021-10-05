package controlador;

import java.io.*;
import javax.swing.JTextArea;

/**
 *
 * @author ACER
 */
public class LectorDeArchivosEnTexto {
    
    public String[] leerDatos (File archivo, JTextArea areaTexto) throws FileNotFoundException, IOException{
        
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        
        int contador=0;
        String[] arregloLineas = new String[(int)(br.lines().count())];
        String linea;
   
        
        while((linea = br.readLine()) != null){
     
            arregloLineas[contador] = linea;
            contador++;
            System.out.println("entre a while");
            areaTexto.append("\n"+linea);
        }
        fr.close();
        return arregloLineas;
    }   
}
