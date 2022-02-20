
package conversiontipos;

import java.util.Scanner;

public class TIendaLibros {
    
    public static void main(String[] args) {
        
        String nombre;
        int id;
        double precio;
        boolean envioGratuito;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Proporciona el nombre del libro: ");
        nombre = in.nextLine();
        
        System.out.print("Proporciona el id del libro: ");
        id = in.nextInt();

        System.out.print("Proporciona el precio del libro: ");
        precio = in.nextDouble();
        
        System.out.print("Proporciona el envio gratuito: ");
        envioGratuito = in.nextBoolean();
        
        //print
        System.out.println(nombre+" - "+String.valueOf(id));
        System.out.println("Precio: $"+precio);
        System.out.println("Envio gratuido: "+envioGratuito);
    }
}