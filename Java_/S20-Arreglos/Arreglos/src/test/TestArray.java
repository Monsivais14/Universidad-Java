package test;

public class TestArray {

    public static void main(String[] args) {

        //forma de definir un arreglo 
        final int edades[] = new int[3];//los arreglos son objetos
        //necesitan una cantidad de elementos no modificable(no dinamicamente)

        //System.out.println("edades = " + edades);sin inicializar muestra el 
        //apuntador de memoria de a variable (por ser objeto)
        //para acceder a un elemento del array hay que utilizar el nombre de la variable mas el apuntador en corchetes
        edades[0] = 10; //inician desde el numero 0 y su rango maximo es (el indicado al crearlo -1)
        //System.out.println("edades[0] = " + edades[0]);

        //edades[3]=1; inidicer fuera de rango (no hay indice 3 en el arreglo, no definido)
        for (int i = 0; i < edades.length; i++) {//i<3,
            edades[i] = (int) (Math.random() * 10);
            System.out.println("edades[" + i + "] = " + edades[i]);
        }

    }

}
