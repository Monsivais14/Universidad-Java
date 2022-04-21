
import domain.PersonaBean;


public class TestJavaBeans {

    public static void main(String[] args) {
        
        PersonaBean persona = new PersonaBean();
        persona.setNombre("Juan");
        persona.setApellido("Rodriguez");
        
        System.out.println(persona);
        System.out.println(persona.getClass().getSimpleName()+":"+persona.getApellido()+persona.getNombre());
    }
}
