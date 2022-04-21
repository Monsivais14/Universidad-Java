
package test;

public class TestAutoBoxingUnBoxing {
    
    public static void main(String[] args) {
        
        /*
        Clase envolvente de tipos primitivos
        
        int - Ingeter
        long - Long
        float - Float
        double - Double
        boolean - Boolean
        byte - Byte
        char - Character
        short - Short
        
        las clases envolventes son objetos con atributos y metodos
        mientras los atirbutos solamente almacenan y manejan numeros
        */
        
        //autoBoxing 
        //tipo primitovo a un object
        Integer varInt = 10;
        System.out.println("varInt = " + varInt.toString());
        /*
        se puede usar un toString por ser un objeto y un toString regresa
        su valor en forma de cadena lo cual permite hacer concatenaciones
        */
        System.out.println("varInt to double = " + varInt.doubleValue());
        
        int entero2 = varInt;//unboxing 
        /*
        el unboxing hace que recupere el valor del objeto y lo almacene en 
        una variable
        
        tipo objeto a un primitivo
        */
        System.out.println("entero2 = " + entero2);//tipo primitivo
        
    }
    
}
