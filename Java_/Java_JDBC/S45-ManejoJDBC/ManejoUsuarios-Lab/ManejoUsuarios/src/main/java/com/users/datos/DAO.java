
package com.users.datos;

import com.users.domain.User;
import java.util.List;

/**
 *
 * @author mpop
 */
public interface DAO {
    
    public List<User> list();
    
    public void insert(User user);
    
    public void update(User user);
    
    public void delete(User user);
    
    public void delete(Integer idUser);
    
}
