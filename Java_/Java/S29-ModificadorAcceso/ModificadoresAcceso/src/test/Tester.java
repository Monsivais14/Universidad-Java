
package test;

//import paquete1.Clase1;
import paquete1.ClaseHija;
import paquete2.Clase1;

public class Tester {
    
    public static void main(String[] args) {
        
//        Clase1 c1 = new Clase1("Publico");
//        
//        System.out.println(c1.atributoPublico);
//        c1.metodoPublico();
        
        System.out.println("///");
        
        ClaseHija c2 = new ClaseHija();
        System.out.println(c2);
        
        System.out.println("///");
        
        Clase1 c3 = new Clase1();
        System.out.println("c3 = " + c3);
        
        /*
        public es el tipo de acceso mas libre ya que es accesible dentro de todo
        el proyecto
        
        protected es similar a private pero con la cualidad que sus clases hijas
        tambien tengan acceso a sus atributos, metodos y constructores definidos
        pero no hay clases protected ya que solo sirve para heredar
        
        defaul o package es el tipo de modificador de acceso donde solamente se
        tiene acceso a los atributos, metodos y clases que esten dentro del
        mismo paquete que la clase que los define
        
        private es el modificador de acceso donde encapsula completamente un 
        atributo o metodo, no es posible en clase, sus atirbutos no pueden
        ser modificados fuera de la clase, solamente es posible acceder a ellos
        por los metodos setter and getter que son publicos, protected o de paquete 
        dependiendo del tipo de uso que se le dara al atributo
        */
        
    }
    
}
