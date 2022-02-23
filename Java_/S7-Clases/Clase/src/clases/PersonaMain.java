
package clases;

public class PersonaMain {
    
    public static void main(String[] args) {
        //instancia de clase(objeto)
        Persona persona1; //esta es solo una variable local definida dentro de main
        
        persona1 = new Persona();//pero cuando se le inicializa como objeto al
        // momento de mandar a llamar el constructor de la clase hace que se
        // reserve memoria para un objeto nuevo asignado en una memoria aparte 
        // reservado a la variable que puede accerder a ese objeto y sus metodos
        // y atributos
        
        persona1.nombre = "Pedro"; //modificaciones del objeto persona1 mediante su variable
        persona1.apellido = "Chacon";
        persona1.desplegarInformacion();
        
        Persona persona2 = new Persona();
        persona2.desplegarInformacion();//imprime null por que no tiene un valor asignado 
        persona2.nombre = "Carlos";
        persona2.apellido = "Ruiz";//asignacion de valores a atributos de persona2
        persona2.desplegarInformacion();//impresion ya con atributos con valores
        
        System.out.println("persona1 = " + persona1);//direcciones de memoria
        System.out.println("persona2 = " + persona2);
        
        
    }
    
}