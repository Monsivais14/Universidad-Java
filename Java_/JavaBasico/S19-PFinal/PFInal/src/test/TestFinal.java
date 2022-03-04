package test;

import domain.Persona;

public class TestFinal {

    public static void main(String[] args) {

        final int n1 = 10; //con final una vez asignado su valor no podra ser modificado 
        //n1 = 16;
        System.out.println("n1 = " + n1);
        //
        System.out.println(domain.Persona.CONSTANTE);

        final Persona p1 = new Persona();
        //p1 = new Persona();
        p1.setNombre("Juan");
        System.out.println(p1.getNombre());

        Persona p2 = new Persona();
        p2 = new Persona();//cambio de referencia a otor objeto
        /*
        Final en objetos hace referencia a que no se puede cambiar el apuntador
        que tiene la variable hacia otro objeto en memoria heap, solo modificar
        sus atributos del mismo
         */

    }
}
