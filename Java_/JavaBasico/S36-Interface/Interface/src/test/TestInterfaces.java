
package test;

import accesodatos.*;

public class TestInterfaces {
    
    public static void main(String[] args) {
        
        /*
        variable de tipo implement, es posible utilizando una clase que 
        utilice la implementacion de esa interfaz, mas no se puede crear
        un objeto de ese tipo interface
        */
        
        IAccesoDatos bd = new ImplementacionMYSQL();
        
        System.out.print("MYSQL_STATUS:");
        bd.insertar();
        System.out.print("MYSQL_STATUS:");
        bd.actualizar();
        
        bd = new ImplementacionOracle();
        
        System.out.print("ORACLE_STATUS:");
        bd.insertar();
        System.out.print("ORACLE_STATUS:");
        bd.actualizar();
    }
    
}
