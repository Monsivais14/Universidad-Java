package test;

import domain.Empleado;

public class TestObject {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Juan", 5000);
        Empleado empleado2 = new Empleado("Juan", 5000);

        /*
        El "==" hace referencia a el apuntador heap a memoria stack de la variable
        y compara ambos apuntadores de los objetos, en este caso ambos 
        apuntadores dan hacia diferentes objetos
         */
        if (empleado1 == empleado2) {
            System.out.println("Tienen la misma referencia en memoria");
        } else if (empleado1 != empleado2) {
            System.out.println("Tienen diferente referencia");
        }

        /*
        Mientras que equals hace validaciones para identificar si dos objetos 
        son del mismo tipo y contienen el mismo contenido siendo dos 
        objetos diferentes
         */
        if (empleado1.equals(empleado2)) {
            System.out.println("Los objetos son iguales en contenido");
        } else if (!empleado1.equals(empleado2)) {
            System.out.println("Los objetos son diferentes en contenido");
        }

        /*
        HashCode genera un numero casi unico con el contenido del objeto creado
        apartir de su contenido dando un valor unico, asi si el valor Hash es el
        mismo significa que el contenido es el mismo ya que regresa el mismo 
        resultado apartir de la operacion de los mismos atributos
         */
        if (empleado1.hashCode() == empleado2.hashCode()) {
            System.out.println("Son objetos del mismo tipo");
        } else if (empleado1.hashCode() != empleado2.hashCode()) {
            System.out.println("Son objetos de difetente tipo");
        }
    }

}
