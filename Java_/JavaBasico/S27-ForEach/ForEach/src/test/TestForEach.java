
package test;

import domain.Persona;

public class TestForEach {
    
    /*
    For each es un for pero mejorado
    */
    
    public static void main(String[] args) {
        
        int edades[] = {1,2,3,4,5};
        
        for (int edad : edades) {
            /*
            la variable edad almacena el valor del arreglo y asi se ira recorriendo
            hasta que termine sin un contador ni recorriendo el arreglo
            y todo de forma automatica
            */
            System.out.println(edad);
        }
        
        Persona personas[] = {new Persona("Pedro"),new Persona("Andres"), new Persona("Matias")};
        
        for (Persona persona : personas) {
            /*
            por personas ser un arreglo funciona igual que en tipos primitivos
            */
            System.out.println(persona);
        }
        
    }
    
}
