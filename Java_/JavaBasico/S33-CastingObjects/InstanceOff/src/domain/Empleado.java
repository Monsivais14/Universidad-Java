
package domain;

//clase padre

public class Empleado {
    
    protected String nombre;
    protected double sueldo;
    
    public Empleado(String nombre, double sueldo){
        
        this.nombre = nombre;
        this.sueldo = sueldo;
        
    }
    
    //simulacion de toString
    public String obtenerDetalles(){
        return "[Nombre: "+this.nombre+", Sueldo: "+this.sueldo+"]";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{nombre=").append(nombre);
        sb.append(", sueldo=").append(sueldo);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
