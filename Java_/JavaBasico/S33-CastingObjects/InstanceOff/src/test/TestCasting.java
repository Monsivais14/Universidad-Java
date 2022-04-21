
package test;

import domain.*;

public class TestCasting {
    
    public static void main(String[] args) {
        
        Empleado empleado;
        
        empleado = new Escritor("Juan",10000,TipoEscritura.MODERNO);
        System.out.println(empleado.obtenerDetalles());//polimorfismo por override
        
        /*
        las variables de tipo empleado al ser Padre de Editor,Gerente y escritor 
        pueden apuntar hacia un objeto hijo pero solamente pueden usar los metodos
        que tengan en comun ambas clases, para solucionar eso existe el Downcasting
        */
        
        //downCasting
        /*
        Se esta haciendo que la variable empleado de tipo Empleado que esta aputando
        hacia un objeto de tipo hijo que es valido, pero al querer usar un metodo
        get del objeto hijo se crea un problema por que como el objeto es de tipo
        padre y el apuntador en hijo no se puede hacer, pero haciendo un casteo 
        del objeto de tipo Padre a el objeto de tipo Hijo es posible 
        apuntar directamente a el hijo utilizando al misma variable, tambien se 
        puede castear y almacenar en una variable de la siguiente manera:
        
        Escritor escritor = (Escritor)empleado;
        
        lo que hace es crear un nuevo objeto de tipo escritor que apunte
        a el tipo padre pero casteado a tipo Hijo
        */
        Escritor escritor = (Escritor)empleado;
        System.out.println(escritor.getTipoEscritura());
        System.out.println(((Escritor)empleado).getTipoEscritura());
        
        
        //upCasting
        /*
        Sirve para hacer a una clase hija a tipo padre, no hay necesidad de castear
        el tipo de variable ya que son completamente compatibles
        */
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());
        
    }
    
}
