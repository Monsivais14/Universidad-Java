
package datos;

import domain.PersonaDTO;
import java.util.List;

public interface PersonaDao {
    
    public List<PersonaDTO> select() throws Exception;
    
    public int insert(PersonaDTO persona)throws  Exception;
    
    public int update(PersonaDTO persona) throws Exception;
    
    public int delete(PersonaDTO persona) throws Exception;
    
}
