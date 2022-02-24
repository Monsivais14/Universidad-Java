
package test;

import domain.Persona;

public class PersonaPrueba {
    
    private int i;//no es estatico, depende de objetos
    
    //el metodo main es static para que el compilador pueda iniciarlo sin 
    //necesidad de hacer un objeto de la clase sino usar el metodo de clase directamente
    public static void main(String[] args) {
        
        Persona p1 = new Persona("Pedro");
        Persona p2 = new Persona("Juan");
        Persona p3 = new Persona("Lucas");
        
        //no se puede mandar a llamar metodos no estaticos dentro de un metodo estatico
        imprimir(p1);
        imprimir(p2);
        imprimir(p3);
        
        //this.i = 10; como i es dinamico y el metodo main estatico no se puede 
        //acceso a ese atributo de objeto
        
        /*
        el idestatico como es int su valor default es 0 y como se incrementa 
        con ++ seria un 0++ pasa a ser 1 y asi se asigna el id al primer 
        objeto y a los demas objetos como el idstatic se asigna a la clase
        tiene un valor propio y no relacionado con los objetos asi que 
        aunque cuadno se creen nuevos objetos se le aumentara ++ y ese valor se
        le asignara a el id del nuevo objeto dentro del constructor 
        */
        
    }
    
    public static void imprimir(Persona persona){
        System.out.println(persona);
    }
    
    /*
    This solo es accesible dentro del contaxto dinamico (carga de objetos)
    mientras el contaxto estatico es la carga de clases,
    
    el contexto estatico no puede acceder al dinamico mientras el dinamico
    si puede acceder al estatico
    */
    
    /*
    Los dinamicos no se pueden utilizar dentro del main por que necesitan 
    de un objeto para ser utilizados 
    
    (no se puede por que el estatico se puede ser utilizado en cualquier momento
    incluso si no hay un objeto creado aun y el estatico esta dispoible en
    todo momento) //conclusion
    
    y los estaticos si son utilizables dentro de los dinamicos por que no 
    necesitan un objeto para ser utilizados, sino estan relacionados 
    directamente con su clase
    */
    
    public int getContador(){//metodo dinamico relacionado a objetos
        PersonaPrueba.imprimir(new Persona("Luis"));//el metodo estatico puede accederse desde los dinamicos
        return this.i;//al ser dinamico se puede acceder desde dinamico
        //se usa this en i por que es dinamico de PruebaPersona
    }
    
}
