
package domain;

public class Persona {
    
    /*
    Bloques de codigo de inicializacion estatios y no estaticos
    
    > se llaman antes del constructor
    */
    
    private final int idPersona; //identificador de persona
    private static int contadorPersonas;
    
    static{
        /*
        bloque de inicizalicacion estatico que se ejecuta antes del constructor
        y de los no estaticos
        
        igual que los metodos estaticos hay un contexto estatico
        
        se ejecuta solamente la primera vez al ser cargada la clase
        */
        System.out.println("Ejecucion de bloque estatico en Persona.Java");
        ++Persona.contadorPersonas;//incrementacion de contadoir de personas estatico
        //el this.idPersona como es un atributo de un objeto no puede entras 
        //a el bloque de inicializacion estatico gracias al contexto estatico
    }
    
    {
        /*
        bloque de inicializacion no estatico 
        se ejecuta antes del constructor y gracias a estar dentro del contexto 
        dinamico se puede inicializar los atributos de un objeto antes de 
        pasar por un constructor
        
        se ejecuta cada vez que se crea un objeto por ser dinamico
        */
        System.out.println("Ejecucion de bloque dinamico en Persona.Java");
        this.idPersona = Persona.contadorPersonas++;//asignacion de un identificador
        /*
        al ejecutarse al cargar la clase el conatdor de personas aumentara a 1
        y cada que se cree un objeto se hara un posincremento el cual asignara 
        el valor actual a el obejto creado y despues se incrementara
        */
    }
    
    public Persona(){
        /*
        Al momento de que se ejecute el constructor el bloque estatico debio haberse
        ejecutado al cargar la clase en memoria y el dinamico al crear el objeto 
        Persona y depues ya entra este constructor
        */
        System.out.println("Ejecucion de constructor en Persona.Java");
    }
    
    public int getidPersona(){
        return this.idPersona;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{idPersona=").append(idPersona);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}