
package test;

import genericos.ClaseGenerica;

public class TestGenerics {
   
    public static void main(String[] args) {
        
        /*
        entre los diamantes esta el tipo de parametro que recibira y 
        se crea su objeto y se utiliza el debido constructor
        
        al Integer ser un objeto en la ClaseGenerica llega y muestra que 
        pertenece a la clase Integer
        */
        ClaseGenerica<String> genericString = new ClaseGenerica("Cadena");
        genericString.obtenerTipo();
        
        
        ClaseGenerica<Double> genericDouble = new ClaseGenerica(123.456);
        genericDouble.obtenerTipo();
    }
    
}
