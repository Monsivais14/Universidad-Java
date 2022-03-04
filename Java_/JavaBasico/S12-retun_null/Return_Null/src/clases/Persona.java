
package clases;

/*
    Una clase es una "plantilla" la cual tiene atributos y metodos reales
    caracteristicos de la plantilla de donde se pueden crear objetos de la 
    misma 
    
        .por asi decirlo una clase es un molde y un objeto es el que tiene los 
         valores ya definidos apartir de la clase.
    
        Diagrama de una clase
            -nombre de la clase
            -Atributos (Caracteristicas asociada de un objeto)
            -Metodos (cosas que puede hacer)

 */
public class Persona {

    //atributos 
    public String nombre;
    public String apellido;

    //constructor
    public Persona(){
        
    }
    
    //metodos
    
    //este metodo imprimira en consola la informacion del objeto
    public void desplegarInformacion() {//se puede usar fuera de esta clase, no retorna nada
        //y no recive argumentos
        System.out.println("Nombre = "+this.nombre);
        System.out.println("Apellido = "+this.apellido);
    }
    
    
}
