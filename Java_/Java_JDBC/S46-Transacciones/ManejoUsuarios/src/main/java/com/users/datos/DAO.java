
package com.users.datos;

import com.users.domain.User;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author mpop
 */
public interface DAO {
    
    public List<User> list() throws SQLException;
    
    public void insert(User user) throws SQLException;
    
    public void update(User user) throws SQLException;
    
    public void delete(User user)throws SQLException;
    
    public void delete(Integer idUser)throws SQLException;
    
}
