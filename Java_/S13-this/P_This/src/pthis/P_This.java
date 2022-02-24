package pthis;

public class P_This {

    public static void main(String[] args) {
        
        Persona persona = new Persona("Juan","Lucio");
        
        System.out.println("persona = " + persona);
        System.out.println("persona nombre :"+persona.nombre);
        System.out.println("persona apellido: "+persona.apellido);
        
    }

}

//clase dentro del mismo archivo la cual no se puede usar dentro de otro lugar que no sea el paquete 
class Persona{ //clase con encapsulamiuento default
    
    String nombre;
    String apellido;

    public Persona(String nombre,String apellido) {//no se puede utilizar dentro de otro lugar que no sea el pqeuete por ser default 
        super(); //constructor de la clase padre (object)
        //ya que el constructor de la clase padre es el que ejecuta el constructor
        //de la clase padre heredada con super
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("persona en this: "+ this);//this hace referencia a persona 
        
        //this es el objeto que se crea cuando se manda a llamar a su constructor
        
        new Imprimir().imprimir(this);//nuevo objeto de imprimir sin una variable referenciada de su tipo
        //this pasado como parametro seria el objeto persona
        
    }
}

class Imprimir{

    public Imprimir(){
        super();//constructor de clase padre object para reservar memoria
    }
    
    public void imprimir(Persona persona){
        
        System.out.println("Persona desde imprimir: "+persona);//imprime la referencia del objeto pasado como argumento
        System.out.println("impresion del objeto actual (this): "+this);//al estar dentro de clase imprimir this apunta 
        //hacia la referencia del objeto de la clase imprimir
        
    }
    
}