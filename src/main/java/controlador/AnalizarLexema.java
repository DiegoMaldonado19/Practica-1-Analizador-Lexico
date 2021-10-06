
package controlador;

import javax.swing.JTextArea;

/**
 *
 * @author ACER
 */
public class AnalizarLexema {
    private char[] lexema; 
    
    public void recibirLexema(JTextArea areaTexto){
        this.lexema = areaTexto.getText().toCharArray();
    }
    
    
            
}
