package controlador;

/**
 * Clase que contiene todas las comparaciones necesarias para hacer el analisis lexico
 * Todos los metodos retornan valores booleanos 
 * @author ACER
 */
public class MetodoComparacion {
    
    
    /**
     * Metodo que analiza si el caracter en cuestion es una letra
     * @param caracter caracter del lexema
     * @return 
     */
    public boolean isLetra(char caracter){
        boolean isLetra = false;
        
        if(caracter=='A' || caracter=='B' || caracter=='C' || caracter=='D' || caracter=='E'
                       || caracter=='F' || caracter=='G' || caracter=='H' || caracter=='I' || caracter=='J'
                       || caracter=='K' || caracter=='L' || caracter=='M' || caracter=='N' || caracter=='Ñ'
                       || caracter=='O' || caracter=='P' || caracter=='Q' || caracter=='R' || caracter=='S'
                       || caracter=='T' || caracter=='U' || caracter=='V' || caracter=='W' || caracter=='X'
                       || caracter=='Y' || caracter=='Z' || caracter=='a' || caracter=='b' || caracter=='c' 
                       || caracter=='d' || caracter=='e' || caracter=='f' || caracter=='g' || caracter=='h' 
                       || caracter=='i' || caracter=='j' || caracter=='k' || caracter=='l' || caracter=='m' 
                       || caracter=='n' || caracter=='ñ' || caracter=='o' || caracter=='p' || caracter=='q' 
                       || caracter=='r' || caracter=='s' || caracter=='t' || caracter=='u' || caracter=='v' 
                       || caracter=='w' || caracter=='x' || caracter=='y' || caracter=='z'){
            isLetra = true;
            
            return isLetra;
        }
        
        return isLetra;
    }
    
    /**
     * Metodo que analiza si nuestro caracter es un numero
     * @param caracter caracter de nuestro lexema
     * @return 
     */
    public boolean isDigito(char caracter){
        boolean isNumero = false;
        
        if(caracter=='0' || caracter=='1'  || caracter=='2'  || caracter=='3'  || caracter=='4'
                        || caracter=='5'  || caracter=='6'  || caracter=='7'  || caracter=='8'  || caracter=='9'){
            isNumero = true; 
            
            return isNumero;
        }
        
        return isNumero;
    }
    
    /**
     * Metodo para analizar si nuestro caracter es un operador
     * @param caracter caracter perteneciente a nuestro lexema
     * @return 
     */
    public boolean isOperador(char caracter){
        boolean isOperador = false;
        
        if(caracter=='+' || caracter=='-' || caracter=='/' || caracter=='%' || caracter=='*'){
            isOperador = true;
            
            return isOperador;
        }
        
        return isOperador;
    }
    
    /**
     * Metodo para analizar si nuestro caracter es un signo de agrupacion
     * @param caracter caracter pertenenciente a nuestra cadena
     * @return 
     */
    public boolean isAgrupacion(char caracter){
        boolean isAgrupacion = false;
        
        if(caracter=='[' || caracter==']' || caracter=='{' || caracter=='}' || caracter=='(' || caracter==')'){
            isAgrupacion = true;
            
            return isAgrupacion;
        }
        
        return isAgrupacion;
    }
    
    /**
     * Metodo para analizar si nuestro caracter es un signo de puntuacion
     * @param caracter  caracter perteneciente a nuestra cadena 
     * @return 
     */
    public boolean isPuntuacion(char caracter){
        boolean isPuntuacion = false;
        
        if(caracter=='.' || caracter==',' || caracter==';' || caracter==':'){
            isPuntuacion = true;
            
            return isPuntuacion;
        }
        
        return isPuntuacion;
    }
}
