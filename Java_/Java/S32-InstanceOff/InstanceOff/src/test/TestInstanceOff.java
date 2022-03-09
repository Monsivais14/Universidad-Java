/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Empleado;
import domain.Gerente;

public class TestInstanceOff {
    
    public static void main(String[] args) {
        
        Empleado empleado = new Empleado("Juan",5000);
        determinarTipo(empleado);
        empleado = new Gerente("Juan",5000,"Frutas");
        determinarTipo(empleado);
        
    }
    
    public static void determinarTipo(Empleado empleado){
        
        /*
        instanceOff pregunta el tipo del objeto al cual apunta en tiempo de
        ejecucion, 
        -una cosa es el tipo de variable y otra es el tipo de 
        objeto a el que apunta
        
        un instanceof no pregunta de que tipo es la variable sino 
        hacia donde esta apuntando
        */
        
        if (empleado instanceof Gerente) {
            //si esta apuntando a un objeto de tipo Gerente
            System.out.println("Es de tipo Gerente");
            /*
            se puede identificar de que tipo es para realizar un cambio de tipo
            como de aqui que el aprametro recibido es de empleado pero apunta 
            una gerente asi que se cambia el tipo de la variable a Gerente 
            para asi tener acceso a los atributos de un gerente
            */
            //System.out.println(((Gerente) empleado).getDepartamento());
            Gerente gerente =(Gerente)empleado;//como no se usa new no cambia de
            //apuntador heap solo el tipo de la variable
            System.out.println(gerente.getDepartamento());
            System.out.println(gerente);
        }else if(empleado instanceof Empleado){
            //si esta apuntando a un tipo Empleado
            System.out.println("Es de tipo Empleado");
            System.out.println(empleado);
            /*
            no se puede cambiar un tipo empleado a un tipo gerente ya apunta a 
            un objeto de tipo padre y no tiene los atributos de una clase hija
            */
            //Gerente gerente =(Gerente)empleado;    
            //System.out.println(gerente.getDepartamento());
        }else if(empleado instanceof Object){
            System.out.println("Es tipo Object");
            /*
            una clase object solo tiene acceso a los metodos ya definidos de 
            una clase object como el toString
            */
        }
        
        /*
        hay que ligar en else if ya que determina el caso mas generico
        como el que todos los objetos tambien heredan de object po lo tanto
        todos hacen true en Object
        */
        System.out.print("\n");
    }
    
}
