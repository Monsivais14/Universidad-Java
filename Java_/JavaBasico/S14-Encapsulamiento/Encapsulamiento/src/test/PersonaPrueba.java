
package test;

import dominio.*;
//usar '*' no carga todas las clases, sino hasta que se llegue a utilizar la 
// clase requerida para no utilizar mas memoria 

public class PersonaPrueba {
    
    public static void main(String[] args) {
        
        Persona p1 = new Persona("Juan", 5000, false);
        
        p1.setNombre("Pedro");
        p1.setSueldo(2000);
        p1.setEliminado(true);
        
        System.out.println(p1.toString());
        System.out.println(p1);//al tener un metodo toString ya no imprime el 
        //indicador de variable sino el metodo toString
        
//        System.out.println("Persona1 Nombre = " + p1.getNombre());
//        System.out.println("Persona1 Sueldo = " + p1.getSueldo());
//        System.out.println("Persona1 Status = "+p1.isEliminado());
        
    }
    
}
