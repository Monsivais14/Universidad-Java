
package datos;

import domain.Persona;
import java.util.List;

public interface DAO {
    
    public List<Persona> seleccionar();
    
    public int insertar(Persona persona);
    
    public int actualizar(Persona persona);
    
    public void eliminar(Persona persona);
    
    public void eliminar(int idPersona);
}
