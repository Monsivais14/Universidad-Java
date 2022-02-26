
package domain;

public class Persona {
    
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{nombre=").append(nombre);
        sb.append('}').append("{").append(super.toString());
        sb.append("}");
        //el toString de la clase padre imprimie el apuntador de memoria del objeto
        // y si ese objeto exiende de otra clase lo hace de la misma manera
        //pero si el obejto es padre muestra el apuntador de memoria al
        //estar mostrando el toString de la clase Object
        return sb.toString();
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
