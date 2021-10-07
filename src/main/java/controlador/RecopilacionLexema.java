package controlador;

import java.util.ArrayList;
import javax.swing.JTextArea;
import modelo.Token;

/**
 * Clase pensada para la creacion de los Tokens en general
 * @author ACER
 */
public class RecopilacionLexema {
    
    public ArrayList<Token> creacionToken (JTextArea areaTexto){
        ArrayList<Token> lexemas = new ArrayList<>();
        
        String[] lineas = separarLineas(areaTexto);
        String[] caracter = new String[lineas.length];
        for(int i=0; i<lineas.length; i++){
            caracter[i] = String.valueOf(lineas[i].charAt(0));
        }
        
        
        
        
        return lexemas;
        
    }
    
    private String[] separarLineas(JTextArea areaTexto){
        String[] lineas = areaTexto.getText().split("\n");
        
        return lineas;
    }
   
}
