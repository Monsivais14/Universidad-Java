package domain;

public class Persona {

    private int idPersona;//identificador autoincrementable
    private String nombre;
    private static int contadorPersonas;//atributo asociado con la clase y no con los objetos
    //al ser estatico no se utiliza this, sino el nombre de la clase donde esta relacionada
    
    public Persona(String nombre){
        
        this.nombre = nombre;
        
        //incrementar el contador por cada objeto nuevo
        Persona.contadorPersonas++;
        /*l ser static esta accediendo directamente a 
        el atributo estatico de la clase*/
        
        //asignar el valor unico a la id del objeto persona;
        this.idPersona = contadorPersonas;//asignacion del id del nuevo ya autoincrementado
    }

    @Override//indica que sobre escribe el metodo toString
    public String toString() {
        return "Persona{" + "idPersona= " + idPersona + ", nombre= " + nombre + '}';
    }
    
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int contadorPersonas) {
        Persona.contadorPersonas = contadorPersonas;
    }
}
