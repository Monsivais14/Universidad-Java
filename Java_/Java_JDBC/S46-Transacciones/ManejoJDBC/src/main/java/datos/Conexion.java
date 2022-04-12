
package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class Conexion {
    
    /*
    Clase encargada de conexion a base de datos y el manejo de la misma
    */
    
    //constante URL de conexion a base de datos mysql
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    //variables de usuario con acceso a la base de datos 
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "root";
    
    
    public static Connection getConnection() throws SQLException{
        /*
        Obtiene la conexion a la base de datos retornando un Connextion que 
        sera asignado a una variable del mismo tipo
        */
        return DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD);
    }
    
    /*
    metodos sobrecargados close para cerrar su conexion en bd
    */
    
    public static void close(ResultSet rs) throws SQLException{
        rs.close();
    }
    
    public static void close(Statement smtn) throws SQLException{
        smtn.close();
    }
    
    public static void close(PreparedStatement smtn) throws SQLException{
        smtn.close();
    }
    
    public static void close(Connection cn) throws SQLException{
        cn.close();
    }
    
}
