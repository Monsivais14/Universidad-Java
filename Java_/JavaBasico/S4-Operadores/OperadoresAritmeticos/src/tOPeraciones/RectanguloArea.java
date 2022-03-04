package tOPeraciones;

import java.util.Scanner;

public class RectanguloArea {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int alto, ancho;

        System.out.println("Digita el alto: ");
        alto = in.nextInt();
        System.out.println("Digita el ancho: ");
        ancho = in.nextInt();

        int Area = alto * ancho;
        System.out.println("Area = " + Area);

        int perimetro = (alto + ancho) * 2;
        System.out.println("perimetro = " + perimetro);
    }

}
