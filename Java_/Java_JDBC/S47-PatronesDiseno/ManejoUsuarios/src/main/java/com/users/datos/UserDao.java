
package com.users.datos;

import com.users.domain.UserDTO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author mpop
 */
public interface UserDao {
    
    public List<UserDTO> list() throws Exception;
    
    public void insert(UserDTO user) throws Exception;
    
    public void update(UserDTO user) throws Exception;
    
    public void delete(UserDTO user)throws Exception;
    
    public void delete(Integer idUser)throws Exception;
    
}
