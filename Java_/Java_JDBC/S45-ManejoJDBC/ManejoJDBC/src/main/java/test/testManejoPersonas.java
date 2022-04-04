
package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class testManejoPersonas {
    
    public static void main(String[] args) {
        
        PersonaDAO personaDao = new PersonaDAO();
        
        //personaDao.insertar(new Persona("Juan","Murieta","juaMun@Hotmail.com","8474567534")); //insertando objeto persona en bd
        
        List<Persona> personas =  personaDao.seleccionar(); //objeto de tipo List obtieniendo list de la bd
        
        for(Persona persona:personas){//impresion de list
            System.out.println("personas = " + persona);
        }
        
        personaDao.actualizar(new Persona(7,"Jose","Murieta","juanMun@Hotmail.com","8474567534"));
        
    }
    
}
