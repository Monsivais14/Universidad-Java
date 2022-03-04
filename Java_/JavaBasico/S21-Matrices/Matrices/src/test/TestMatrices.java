package test;

import domain.Persona;

public class TestMatrices {

    public static void main(String[] args) {

        //declaracion de matriz bidimencional
        //variable que la almacena || objeto matriz
        int edades[][] = new int[3][2];

        edades[0][0] = 1;
        edades[0][1] = 2;

        edades[1][0] = 3;
        edades[1][1] = 4;

        edades[2][0] = 5;
        edades[2][1] = 6;

        for (int i = 0; i < edades.length; i++) {

            for (int j = 0; j < edades[i].length; j++) {

                System.out.print("[" + edades[i][j] + "]");
            }
            System.out.print("\n");
        }

        System.out.print("\n");
        
        //sintaxis simplificada con matrices 
        String frutas[][] = {{"Naranja", "Limon"}, {"Fresas", "Zarzarmora","Mora"}};
        
        //puede variar los elementos
        //no es necesariamente matrices cuadradas

//        for (int i = 0; i < frutas.length; i++) {
//            for (int j = 0; j < frutas[i].length; j++) {
//                System.out.print("{" + frutas[i][j] + "}");
//            }
//            System.out.print("\n");
//        }
        
        Persona personas[][] = new Persona[2][3];
        
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Pedro");
        personas[0][2] = new Persona("Juan");
        
        personas[1][0] = new Persona("Juan");
        personas[1][1] = new Persona("Pedro");
        personas[1][2] = new Persona("Juan");
        
        
        imprimir(personas);
    }
    
    public static void imprimir(Object obj[][]){
        
        for (int i = 0; i < obj.length; i++) {
            for (int j = 0; j < obj[i].length; j++) {
                System.out.print("[" + obj[i][j] + "] ");
            }
            System.out.print("\n");
        }
        
    }
    
}