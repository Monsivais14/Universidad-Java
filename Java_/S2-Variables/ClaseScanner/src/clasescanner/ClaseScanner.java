package clasescanner;

import java.util.Scanner;

public class ClaseScanner {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Escribe tu nombre:");
        var usuario = in.nextLine();
        System.out.println("usuario = " + usuario);

        System.out.println("Escribe el titulo");
        var titulo = in.nextLine();
        System.out.println("titulo = " + titulo + " " + usuario);
        
        /*
        //libro tarea
        System.out.println("Escribe el titulo del libro: ");
        String tituloLibro = in.nextLine();
        
        System.out.println("Escribe el autor del libro: ");
        String autorLibro = in.nextLine();
        
        System.out.println("El titulo del libro es "+tituloLibro+" del autor "+autorLibro);
        */
    }
}