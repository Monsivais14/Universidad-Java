package returnNull;

import clases.Persona;

public class PasoPorReferencia {

    public static void main(String[] args) {

        //Persona p1 = new Persona();

        //p1.nombre = "Juan";
        //p1.apellido = "Lucio";

        //System.out.println("Nombre p1 = " + p1.nombre);
        Persona p1 = null;
        
        p1 = cambiarValor(p1);//p1 es una variable que almacena el valor de la referencia

        //System.out.println("Nombre = " + p1.nombre);//aqui cambia el nombre del objeto
        //persona por que dentro del metodo se le dio el apuntador al mismo objeto
        //y se le cambio el nombre y cambio su atributo nombre del objeto asi
        //que como la variable "p1" apunta al mismo objeto obtiene el nuevo nombre
        //modificado por el Metodo (paso por valor por referencia o solamente por referencia)

    }

//    public static Persona cambiarValor(Persona persona) {
//
//        persona.nombre = "Ya no me llamo Juan";
//        
//        //este tipo de metodosde tipo Object retornan un Object del mismo tipo
//        // y para que asi mismo se obtenga el Object con la modificacion
//        // y asi realiza una referencia desde un metodo, en todo momento es la 
//        // misma referencia
//        return persona;
//    }
    
    public static Persona cambiarValor(Persona persona) {

        if(persona == null){
            //si el objeto no esta apuntando a ningun objeto valido
            System.err.println("Valor de persona invalido : null");
            return persona;
        }
        
        persona.nombre = "Ya no me llamo Juan";
        return persona;
        //si hay algo abajo del return hara que esas lineas ya no sean validas y no se ejecutaran
    }
}
