
package conversiontipos;

import java.util.Scanner;

public class ConversionTipos {

    public static void main(String[] args) {
        
        //convertir tipo String a int
        var edad = Integer.parseInt("20"); // el parseInt hace que el String "20" se haga 20 entero
        System.out.println("edad = " + (edad+1));//20 que ahora es int hace que sea posible sumarlo
        
        var varPi = Double.parseDouble("3.1416");
        System.out.println("varPi = " + varPi);
        
        
        //pedir valor
        var in = new Scanner(System.in);
        //System.out.println("Digita tu edad");
        //edad = Integer.parseInt(in.nextLine()); //String a int
        //System.out.println("Edad = " + edad);
        
        //int a String 
        var edadString = String.valueOf(10);
        System.out.println("edadString = " + edadString);
        
        //String a char
        var caracter = "hola".charAt(0);//retorna el caracter numero 0, o sea el primero
        System.out.println("caracter = " + caracter);
        
        System.out.println("proporciona un caracter");
        caracter = in.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
    }
}