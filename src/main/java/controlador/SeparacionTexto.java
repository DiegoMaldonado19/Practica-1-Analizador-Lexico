package controlador;

import javax.swing.JTextArea;

/**
 *
 * @author ACER
 */
public class SeparacionTexto {
    private char[] lexema;
    
    public char[] crearLexema(JTextArea areaTexto){
        this.lexema = areaTexto.getText().toCharArray();
        return this.lexema;
    }    
}
