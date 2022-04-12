package test;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class testMysqlJDBC {

    public static void main(String[] args) {

        try {
            String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true"; //url de conexion a bd
            //Class.forName("com.mysql.jdbc.Driver"); //con aplicaciones web
            Connection conexion = DriverManager.getConnection(url, "root", "root");//conexion a bd (url,user,password)
            Statement instruccion = conexion.createStatement();//permite ejecutar instrucciones en bd

            var sql = "SELECT id_persona,nombre,apellido,email,telefono FROM persona";//instruccion a bd

            ResultSet resultado = instruccion.executeQuery(sql);//ejecuta la sentencia a base de datos

            while (resultado.next()) {//si aun quedan elementos disponibles

                System.out.print("{"
                        + "idPersona=" + resultado.getInt("id_persona"));
                        System.out.print(",nombre="+resultado.getString("nombre"));
                        System.out.print(",apellido="+resultado.getString("apellido"));
                        System.out.print(",email="+resultado.getString("email"));
                        System.out.print(",telefono="+resultado.getString("telefono")+"}\n");
            }
            
            resultado.close();
            instruccion.close();
            conexion.close();

        } catch (SQLException ex) {
            ex.printStackTrace(System.err);
            Logger.getLogger(testMysqlJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
