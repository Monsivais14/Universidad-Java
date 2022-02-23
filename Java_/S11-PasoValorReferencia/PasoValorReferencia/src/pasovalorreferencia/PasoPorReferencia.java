package pasovalorreferencia;

import clases.Persona;

public class PasoPorReferencia {

    public static void main(String[] args) {

        Persona p1 = new Persona();

        p1.nombre = "Juan";
        p1.apellido = "Lucio";

        System.out.println("Nombre p1 = " + p1.nombre);

        cambiarValor(p1);//p1 es una variable que almacena el valor de la referencia

        System.out.println("Nombre = " + p1.nombre);//aqui cambia el nombre del objeto
        //persona por que dentro del metodo se le dio el apuntador al mismo objeto
        //y se le cambio el nombre y cambio su atributo nombre del objeto asi
        //que como la variable "p1" apunta al mismo objeto obtiene el nuevo nombre
        //modificado por el Metodo (paso por valor por referencia o solamente por referencia)

    }

    public static void cambiarValor(Persona persona) {//tipo de la clase y argumento
        //por lo tanto cuando se envia como argumento el argumento recivido es
        //la referencia del objeto asi que ambos apuntan(hacen referencia) al mismo objeto

        persona.nombre = "Ya no me llamo Juan";

    }
}
