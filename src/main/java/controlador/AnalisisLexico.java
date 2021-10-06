package controlador;

import javax.swing.JTextArea;

/**
 * Clase que se encarga de realizar el analisis lexico llamando a los metodos de las otras clases
 * @author ACER
 */
public class AnalisisLexico {
    
    /**
     * Metodo que hace el llamado a los metodos para realizar las comparaciones
     * @param texto arreglo de caracteres
     * @param areaTexto TextArea que tiene almacenados todos los caracteres
     */
    public void analisis(char[] texto, JTextArea areaTexto){
        MetodoComparacion comparacion = new MetodoComparacion();
        
        for(int i=0; i<texto.length; i++){
            if((comparacion.isVacio(texto[i])== true)){
                areaTexto.append(texto[i]+" - "+ " es un espacio vacio"+"\n");
            }
            else if((comparacion.isLetra(texto[i])) == true){
                areaTexto.append(texto[i]+" - "+ " es una letra"+"\n");
            }
            else if((comparacion.isDigito(texto[i])) == true){
                 areaTexto.append(texto[i]+" - "+ " es un digito"+"\n");
            }
            else if((comparacion.isOperador(texto[i])) == true){
                 areaTexto.append(texto[i]+" - "+ " es un operador"+"\n");
            }
            else if((comparacion.isPuntuacion(texto[i])) == true){
                 areaTexto.append(texto[i]+" - "+ " es un signo de puntuacion"+"\n");
            }
            else if((comparacion.isAgrupacion(texto[i])) == true){
                 areaTexto.append(texto[i]+" - "+ " es un signo de agrupacion"+"\n");
            }
            
        }
    }
}
