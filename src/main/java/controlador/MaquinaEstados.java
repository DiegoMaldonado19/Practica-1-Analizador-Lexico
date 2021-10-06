package controlador;

/**
 * Clase que contiene todos los estados de nuestra matriz de transiciones
 * @author ACER
 */
public class MaquinaEstados {
    /**
     * Objeto de la clase que contiene todos los metodos de comparacion
     */
    private MetodoComparacion metodoComparacion;
    
    /**
     * Estado Inicial
     * @param caracter caracter perteneciente a nuestro lexema
     * @return 
     */
    public boolean estado0(char caracter){
       
        boolean isLetra = false;
        boolean isOperador = false;
        boolean isPuntuacion = false;
        boolean isAgrupacion = false;
        boolean isDigito = false;
        boolean isEspacio = false;
        
        if((isLetra = this.metodoComparacion.isLetra(caracter))==true){
            return isLetra;
        }
        else if((this.metodoComparacion.isOperador(caracter))==true){
            return isOperador;
        }
        else if((this.metodoComparacion.isPuntuacion(caracter))==true){
            return isPuntuacion;
        }
        else if((this.metodoComparacion.isAgrupacion(caracter))==true){
            return isAgrupacion;
        }
        else if((this.metodoComparacion.isDigito(caracter))==true){
            return isDigito;
        }
        
        return isEspacio;
    }
    
    /**
     * Estado S1 que funciona para un identificador, es un estado de aceptacion
     * @param caracter caracter de nuestro lexema
     * @return 
     */
    public boolean estado1(char caracter){
       
        boolean isLetra = false;
        boolean isDigito = false;
        boolean isEspacio = false;
        
        if((isLetra = this.metodoComparacion.isLetra(caracter))==true){
            return isLetra;
        }
        else if((this.metodoComparacion.isDigito(caracter))==true){
            return isDigito;
        }
        
        return isEspacio;
    }
    
    /**
     * Estado S2 que funciona para identificar si viene un digito, es un estado de aceptacion
     * @param caracter caracter que tiene nuestro lexema
     * @return 
     */
    public boolean estado2(char caracter){
        
        boolean isDigito = false;
        boolean isEspacio = false;
        
        if((isDigito = this.metodoComparacion.isLetra(caracter))==true){
            return isDigito;
        }
        
        return isEspacio;
    }
    
    /**
     * Estado S3 que funciona para saber si viene un punto, es parte del analisis para un decimal
     * No es un estado de aceptacion
     * @param caracter caracter de nuestro lexema
     * @return 
     */
    public boolean estado3(char caracter){
        boolean isPunto = false;
        
        if((this.metodoComparacion.isPuntuacion(caracter))==true){
            return isPunto;
        }
        
        return isPunto;
    }
    
    /**
     * Estado S4 que funciona para saber si viene un decimal, es un estado de aceptacion
     * @param caracter caracter que viene en nuestro lexema
     * @return 
     */
    public boolean estado4(char caracter){
        boolean isDigito = false;
        
        if((this.metodoComparacion.isDigito(caracter))==true){
            return isDigito;
        }
        
        return isDigito;
    }
    
    /**
     * Estado S5 que analiza si es un caracter de puntuacion, es un estado de aceptacion
     * @param caracter  caracter que viene en nuestro lexema
     * @return 
     */
    public boolean estado5(char caracter){
        boolean isPuntuacion = false;
        
        if((this.metodoComparacion.isPuntuacion(caracter))==true){
            return isPuntuacion;
        }
        
        return isPuntuacion;
    }
    
    /**
     * Estado S6 que analiza si vien un caracter operador, es un estado de aceptacion
     * @param caracter  caracter que viene en nuestro lexema
     * @return 
     */
    public boolean estado6(char caracter){
        boolean isOperador = false;
        
        if((this.metodoComparacion.isOperador(caracter))==true){
            return isOperador;
        }
        
        return isOperador;
    }
    
    /**
     * Estado S7 que analiza si viene un caracter de agrupacion, es un estado de aceptacion
     * @param caracter  caracter que viene en nuestro lexema
     * @return 
     */
    public boolean estado7(char caracter){
        boolean isAgrupacion = false;
        
        if((this.metodoComparacion.isAgrupacion(caracter))==true){
            return isAgrupacion;
        }
        
        return isAgrupacion;
    }
    
}
