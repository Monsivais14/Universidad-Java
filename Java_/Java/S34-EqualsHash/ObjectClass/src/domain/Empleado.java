
package domain;

//clase padre

import java.util.Objects;


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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.nombre);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.sueldo) ^ (Double.doubleToLongBits(this.sueldo) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {//referencia
            return true;
        }
        if (obj == null) {//si el objeto esta vacio
            return false;
        }
        if (getClass() != obj.getClass()) { //tipo de clase
            return false;
        }
        final Empleado other = (Empleado) obj; //hace un cast de obj a clase Hija y compara atributos
        if (Double.doubleToLongBits(this.sueldo) != Double.doubleToLongBits(other.sueldo)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
    
    
}
