/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author ACER
 */
public class MaquinaEstados {
    private MetodoComparacion metodoComparacion;
    
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
    
   
}
