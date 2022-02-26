package test;

import domain.Persona;

public class ArreglosObject {

    public static void main(String[] args) {

        //arreglo de objetos
        Persona personas[] = new Persona[2];

        //mientars no se inicialicen se quedan en valor null apuntando a nada
        //inicializacion del objeto persona con su constructor 
        personas[0] = new Persona("Pedro");
        personas[1] = new Persona("Juan");

        for (int i = 0; i < personas.length; i++) {
            System.out.println("Persona("+i+"):"+personas[i].toString());
        }
        
        //sintaxis resumida
        //introduces los valores que almacenara de manera que se esta inicializando
        //sin necesidad de indicar el numero de variables u objetos a almacenar
        String frutas[] = {"Array","Simplificado"};
     
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Frutas("+i+") : "+frutas[i]);
        }
        
    }
}
