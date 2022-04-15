package com.users.test;

import com.users.datos.ConectionDB;
import com.users.datos.DAO;
import com.users.datos.UserDAO;
import com.users.domain.User;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestUser {

    public static void main(String[] args) throws SQLException {

        /*
        Se refiere a una sola conexion en bd
        */
        
        Connection con = ConectionDB.getConnection();

        try {

            con.setAutoCommit(false);

            DAO user = new UserDAO(con);//objeto de conexion con datos

            //user.delete(9);
            
           // user.insert(new User("adfadfdsfadsgsgsaadsfdfdsafsdfsdafasdfsdfsdafjhdsjhfglasdjhfgdshljafgkjdsahfgkdshfgskdjahfgkdjshfgdsafdfadsf", "User"));
            
            List list = user.list();

            for (Object object : list) {
                System.out.println("user:" + object.toString());
            }

            con.commit();//commit de conexion en bd

        } catch (SQLException ex) {
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
