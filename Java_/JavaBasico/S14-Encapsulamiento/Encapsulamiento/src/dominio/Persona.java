
package dominio; //clases de dominio

public class Persona {
    
    //atributos privados
    private String nombre;
    private double sueldo;
    private boolean eliminado;
    
    public Persona(String nombre,double sueldo, boolean eliminado){
        
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
        
    }
    
    //toString
    @Override
    public String toString(){
        return "Persona [ Nombre: "+this.getNombre()+" "+
                ", Sueldo: "+this.getSueldo()+" "+
                ", Eliminado: "+this.isEliminado()+" ]";
    }
    
    //getters and setters
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEliminado() {// es eliminado? 
        return eliminado;
    }

    public void setEliminado(boolean eliminado){
        this.eliminado = eliminado;
    }
}