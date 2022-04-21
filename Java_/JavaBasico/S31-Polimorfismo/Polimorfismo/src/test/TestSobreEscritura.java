/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Empleado;
import domain.Gerente;

public class TestSobreEscritura {
    
    public static void main(String[] args) {
        
        
        Empleado empleado = new Empleado("Juan",3000);
        
//        System.out.println(empleado.obtenerDetalles());
        
        imprimir(empleado);

        Gerente gerente = new Gerente("Pedro",5500,"Contabilidad");
//        System.out.println(gerente.obtenerDetalles());
        imprimir(gerente);

        
        Empleado test = new Empleado("",0);
        test = new Gerente("",12,"");
        
        /*
        Una variable tipo Padre como "test" puede hacer referencia a un objeto 
        tipo Empleado que es padre y tambien puede cambiar su apuntador 
        hacia una clase Hija como Gerente por ser compatibles pero no se puede 
        hacer en viceversa ya que la clase hija tiene cosas que la clase padre 
        no contiene, tambien asi pasa al pasar un parametro, se puede enviar 
        de tipo padre enviando un objeto de tipo Hijo sin problema ya que 
        enviaria a llamar el metodo con super o con @Override si es que lo
        llega a contener asi haciendo polimorfismo
        */
    }
    
    public static void imprimir(Empleado empleado){
        
        String debugTestChecker = empleado.obtenerDetalles();
        System.out.println(empleado.obtenerDetalles());
        
        /*
        La clase Empleado seria la mas generica entre gerente y empleado
        y como gerente hereda de empleado son compatibles y el metodo 
        obtener detalles lo tienen ambas clases pero gerente tiene 
        el mismo metodo pero con polimorfismo al estar haciendo override
        
        al ser clases compatibles no hay necesidad de duplicar el metodo para
        cambiar el tipo de parametro que se enviara y como es el mismo nombre 
        se referencia a el mismo metodo
        */
    }
    
}
