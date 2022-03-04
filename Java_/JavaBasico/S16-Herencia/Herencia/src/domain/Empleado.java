package domain;

public class Empleado extends Persona {

    public static int getContadorEmpleado() {
        return contadorEmpleado;
    }

    public static void setContadorEmpleado(int aContadorEmpleado) {
        contadorEmpleado = aContadorEmpleado;
    }
    //al extender hereda directamente de la clase Persona(Padre)

    private final int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado(String nombre, double sueldo) {
        super(nombre);
        this.idEmpleado = ++Empleado.contadorEmpleado;
        this.sueldo = sueldo;
    }
    
    public Empleado( String nombre,double sueldo, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        //las clases hijas no heredan los constructores de la clase padre pero 
        //pueden acceder a ellos con la palabra super
        
        //atributos unicos de la clase hija
        this.idEmpleado = ++Empleado.contadorEmpleado;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        //toString nuevo con la informacion unica de empleado
        sb.append("Empleado{idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append('}');
        //se reutiliza el metodo toString de la clase persona con super
        sb.append(", informacion={").append(super.toString()).append("}");
        
        return sb.toString();
    }
    
    
    
    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
    
}
