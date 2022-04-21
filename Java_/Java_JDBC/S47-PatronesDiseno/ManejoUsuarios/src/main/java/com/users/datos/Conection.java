
package com.users.datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author mpop
 */
public class Conection {
    
    private static final String JDBC_USER="root";
    private static final String JDBC_PASSWORD="root";
    private static final String JDBC_URL="jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    
    //este metodo hace una conexion con la base de datos apartir de la url y el usaurio de la base de datos
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD); //retorna un objeto de tipo Connection
    }
    
    /*
    Metodos para cerrar conexiones con base de datos de manera individual 
    */
    
    public static void close(Connection con) throws SQLException{
        con.close();
    }
    
    public static void close(Statement stmt) throws SQLException{
        stmt.close();
    }
    
    public static void close(PreparedStatement stmt) throws SQLException{
        stmt.close();
    }
    
    public static void close(ResultSet rs) throws SQLException{
        rs.close();
    }
    
}
