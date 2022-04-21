
package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

public abstract class Conexion {
    
    /*
    Clase encargada de conexion a base de datos y el manejo de la misma
    */
    
    //constante URL de conexion a base de datos mysql
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    //variables de usuario con acceso a la base de datos 
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "root";
    
    /*
    Metodo encargado de la inicializacion del  pool  de conexiones
    */
    public static DataSource getDataSource(){
        BasicDataSource ds = new BasicDataSource();
        ds.setUrl(JDBC_URL);//proporciona el usl al Bds 
        ds.setUsername(JDBC_USER);
        ds.setPassword(JDBC_PASSWORD);
        //tamanno inicial del  pool de conexiones
        ds.setInitialSize(2);
        return ds;
    }
    
    public static Connection getConnection() throws SQLException{
        /*
        Obtiene la conexion a la base de datos retornando un Connextion que 
        sera asignado a una variable del mismo tipo
        */
        return getDataSource().getConnection();//haciendo conexion con el pool de conexiones
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
