/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Gerente;

public class TestSobreEscritura {
    
    public static void main(String[] args) {
        
        Gerente gen =  new Gerente("Pedro",1000,"Sistemas");
        
        System.out.println("Gerente : "+gen.obtenerDetalles());
        
    }
    
}
