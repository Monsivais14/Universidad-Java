
package estacionSwitch;

import java.util.Scanner;

public class EstacionSwitch {
    
    public static void main(String[] args) {
        
        var mes = 0;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digita el umero del mes");
        mes = in.nextInt();
        
        var estacion = "Estacion desconocida";
        
        switch(mes){
            
            case 1 : case 2: case 12: 
                estacion = "Estacion Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Estacion Primavera";
            case 6: case 7: case 8:
                estacion = "Estacion Verano";
                break;
            case 9: case 10: case 11:
                estacion = "Estacion Otonno";
                break;
        }
        
        System.out.println("estacion = " + estacion);
        
    }
}