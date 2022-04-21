package test;

import datos.Conexion;
import datos.PersonaDao;
import datos.PersonaDaoJDBC;
import domain.PersonaDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class testManejoPersonasJDBC {

    public static void main(String[] args) throws SQLException{

         Connection conexion = Conexion.getConnection();
        
        try {
            
            if(conexion.getAutoCommit()==true){//si la conexion esta en autocommit
                conexion.setAutoCommit(false);//la volvemos false (para hacerlo manualmente)
            }
            
            /*
            objeto personajdbc: contiene los metodos dao para una conexion JDBC para el manejo de una base de datos
            y se le pasa como parametro un Conecction para utilizar la conexion transaccional (sin autoCommit) con su 
            debido rollBack 
            */
            PersonaDao personajdbc = new PersonaDaoJDBC(conexion);
            
            List<PersonaDTO> personas = personajdbc.select();
            
            for(PersonaDTO persona : personas){//cada objeto persona de DTO y recorriendo personas de la lista personas
                System.out.println("Persona DTOL: "+persona);
            }
            
            conexion.commit();//commit de manera manual
            
        } catch (Exception ex) {
            ex.printStackTrace(System.err);
            System.out.println("Entramos al rollback");
            try{
            conexion.rollback();
//si hay un error entra el catch y dentro de este esta el rollback que evitara guardar los cambios echos antes del error 
            }catch(SQLException ext){
                ext.printStackTrace(System.err);
            }
        }

    }

}
