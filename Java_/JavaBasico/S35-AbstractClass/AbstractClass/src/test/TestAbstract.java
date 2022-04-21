
package test;

import domain.*;

public class TestAbstract {
    
    public static void main(String[] args) {
        
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        
        System.out.println("Figura:"+figura.getFiguraGeometrica());
        figura.dibujar();//polimorfismo por menor jerarquia
        
    }
    
}
