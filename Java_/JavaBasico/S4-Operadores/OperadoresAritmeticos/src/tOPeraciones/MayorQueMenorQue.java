
package tOPeraciones;

import java.util.Scanner;

public class MayorQueMenorQue {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int n1,n2;
        
        System.out.println("Proporciona el numero 1: ");
        n1 = in.nextInt();
        
        System.out.println("Propociona el numero 2: ");
        n2 = in.nextInt();
        
        if(n1>n2){
            System.out.println("el numero "+n1+" es mayor que "+n2);
        }else{
            System.out.println("el numero "+n2+" es mayor que "+n1);
        } 
    }  
}