package test;

import domain.Cliente;
import domain.Empleado;

public class Test {
    
    public static void main(String[] args) {
        
                                          //nombre,sueldo,genero,edad,direccion
       // Empleado empleado1 = new Empleado("Juan", 5000, 'h', 33,"Almadena #1235 col.Presentes");
                                          //vip,nombre,genero,edad,direccion
        Cliente cliente1 = new Cliente(true, "Carlos",'h',24,"Cardenal #1653 col.Palmeras");
        
        //System.out.println("empleado1 = " + empleado1);
        System.out.println("cliente1 = " + cliente1);
    }
    
}