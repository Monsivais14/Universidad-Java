
package estacionIf;

import java.util.Scanner;

public class EstacionIfElse {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        var mes = 4;
        
        System.out.println("Digita el numero del mes");
        mes = in.nextInt();
        
        var estacion = "desconocida";
        
        if(mes == 1 || mes == 2 || mes == 12)
            estacion = "Invierno";
        else if(mes == 3 || mes == 4 || mes == 5)
            estacion = "Primavera";
        else if(mes == 6 || mes == 7 || mes == 8)
            estacion = "Verano";
        else if(mes == 9 || mes == 10 || mes == 11)
            estacion = "Otonno";
        
        System.out.println("estacion = " + estacion);
    }
    
}
