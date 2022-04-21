package com.users.test;

import com.users.datos.Conection;
import com.users.datos.UserDaoJDBC;
import com.users.domain.UserDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import com.users.datos.UserDao;

public class TestUserJDBC {

    public static void main(String[] args) throws SQLException {

        /*
        Se refiere a una sola conexion en bd
        */
        
        Connection con = Conection.getConnection();

        try {

            con.setAutoCommit(false);

            UserDao user = new UserDaoJDBC(con);//objeto de conexion con datos

            //user.delete(9);
            
          // user.insert(new UserDTO("adfadfdsfadsgsgsaadsfdfdsafsdfsdafasdfsdfsdafjhdsjhfglasdjhfgdshljafgkjdsahfgkdshfgskdjahfgkdjshfgdsafdfadsf", "UserDTO"));
            
            List<UserDTO> users = user.list();

            for (UserDTO userDto : users) {
                System.out.println("Dto:" + userDto);
            }

            con.commit();//commit de conexion en bd

        } catch (Exception ex) {
            ex.printStackTrace(System.err);
            System.out.println("Entramos al rollback");
            try {
                con.rollback();
                /*
                la hacer rollback los cambios que se estaban haciendo durante el proceso al tener un error se evita el commit
                y el recuento de las modificaciones que ya se habian previsto evitando asi corromper la bd y regresar a 
                su estado anterior antes de ser modificada.
                */
            } catch (SQLException ext) {
                ext.printStackTrace(System.err);
            }
        }
    }
}
