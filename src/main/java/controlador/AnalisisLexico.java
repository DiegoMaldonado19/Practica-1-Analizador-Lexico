package controlador;

import javax.swing.JTextArea;

/**
 *
 * @author ACER
 */
public class AnalisisLexico {
    
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
