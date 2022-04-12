
package com.users.test;

import com.users.datos.UserDAO;
import com.users.domain.User;
import java.util.List;

public class TestUser {
    
    public static void main(String[] args) {
        
        UserDAO user = new UserDAO();
        
        //user.insert(new User("user", "user"));
        //user.delete(4);
        
        List list =  user.list();
        
         for (Object object : list) {
             System.out.println(object);
        }
        
    }
    
}
