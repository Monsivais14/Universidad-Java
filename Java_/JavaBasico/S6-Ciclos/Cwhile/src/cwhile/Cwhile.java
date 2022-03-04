
package cwhile;

public class Cwhile {

    public static void main(String[] args) {
        
        var contador = 0;
        
        while (contador<3) {
            //si la condicion contador es menor a 3 es true seguira el ciclo hasta que de false
            System.out.println("contador = " + contador);
            contador++;
        }
        //se puede observer el estado del booleano con un watch al momento de hacer debug
    }
    
}
