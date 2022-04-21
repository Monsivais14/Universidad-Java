
package domain;

//clase de entidad
public class PersonaDTO {
    
    //atributos que representan las columnas en base de datos
    private int idPersona;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    public PersonaDTO() {
    }

    public PersonaDTO(int idPersona) {
        /*sirve por que los demas atributos que no son el id pueden ser null y 
        solamente puede llegar a contener el id o para crear un objeto persona
        y eliminarlo solamente usando su id*/
        this.idPersona = idPersona;
    }

    public PersonaDTO(String nombre, String apellido, String email, String telefono) {
        /*
        sirve para crear un objeto PersonaDTO nuevo y asi poder regustrarlo en la 
        base de datos; el objeto no contiene id porque en base de datos se
        autoincrementa
        */
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    public PersonaDTO(int idPersona, String nombre, String apellido, String email, String telefono) {
        /*
        constructor para obtener un objeto PersonaDTO en base de datos
        y almacenar todos sus atributos
        */
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{idPersona=").append(idPersona);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", email=").append(email);
        sb.append(", telefono=").append(telefono);
        sb.append('}');
        return sb.toString();
    }
    
}
