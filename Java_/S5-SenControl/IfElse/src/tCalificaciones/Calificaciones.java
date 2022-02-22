
package tCalificaciones;

import java.util.Scanner;

public class Calificaciones {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingresa la nota del alumno (0-10)");
        float nota = in.nextFloat();
        
        System.out.println("Nota: ");
        
        if(nota>=9&&nota<=10){
            if(nota==10){
                System.out.println("A++");
            }else{
                System.out.println("A");
            }
        }else if(nota>=8&&nota<9){
            System.out.println("B");
        }else if(nota>=7&&nota<8){
            System.out.println("C");
        }else if(nota>=6&&nota<7){
            System.out.println("D");
        }else if(nota>=0&&nota<6){
            System.out.println("F");
        }else{
            System.out.println("Valor desconocido");
        }
        
    }
    
}