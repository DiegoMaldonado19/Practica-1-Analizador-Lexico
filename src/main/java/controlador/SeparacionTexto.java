package controlador;

import javax.swing.JTextArea;

/**
 * Clase que se encarga de tomar el texto del JTextArea
 * @author ACER
 */
public class SeparacionTexto {
    /**
     * Arreglo de caracteres que almacena los caracteres en el JTextArea
     */
    private char[] lexema;
    
    /**
     * Metodo para tomar los caracteres del JTextArea
     * @param areaTexto area de texto que almacena los caracteres
     * @return 
     */
    public char[] crearLexema(JTextArea areaTexto){
        this.lexema = areaTexto.getText().toCharArray();
        return this.lexema;
    }    
}
