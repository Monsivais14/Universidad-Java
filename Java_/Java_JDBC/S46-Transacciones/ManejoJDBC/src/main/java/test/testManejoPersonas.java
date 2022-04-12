package test;

import datos.Conexion;
import datos.PersonaDAO;
import domain.Persona;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class testManejoPersonas {

    public static void main(String[] args) throws SQLException{

         Connection conexion = Conexion.getConnection();
        
        try {
            
            if(conexion.getAutoCommit()==true){//si la conexion esta en autocommit
                conexion.setAutoCommit(false);//la volvemos false (para hacerlo manualmente)
            }
            
            //conexion a bd con conexion transaccional (con commits manuales)
            PersonaDAO personaDAO = new PersonaDAO(conexion);
            
            //error al actualizar por haber mas de 45 caracteres en el varchar (error consciente para que entre el rollback)
            personaDAO.actualizar(new Persona(1, "Juan" ," qwertyuiopasdfghjkl;qwertyuiopqwertyuiopqwertyuiopqwertyuiopqwertyuiop ", "jGoz@gmail.com" , "3457854667"));
            
            personaDAO.insertar(new Persona("Karla","Ivone","qwertyuiopasdfghjkl;qwertyuiopqwertyuiopqwertyuiopqwertyuiopqwertyuiop",""));
            
            personaDAO.eliminar(7);
            
            conexion.commit();//commit de manera manual
            
        } catch (SQLException ex) {
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
