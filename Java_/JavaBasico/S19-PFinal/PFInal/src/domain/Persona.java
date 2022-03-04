package domain;

final public class Persona {
    
    
    private String nombre;
    
    
    
    //constante, no puede ser modificada y no necesita tener un objeto, debe de ir en mayusculas
    public final static long CONSTANTE = 4525;

    final public void imprimir() {
        System.out.println("Imprimir...");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
