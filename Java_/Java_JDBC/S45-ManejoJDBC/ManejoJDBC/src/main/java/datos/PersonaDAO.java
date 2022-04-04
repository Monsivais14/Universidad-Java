package datos;

//DATA ACCESS OBJECT de Persona (manejo de datos de una persona).
import static datos.Conexion.getConnection;
import static datos.Conexion.close;
import domain.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO implements DAO {

    private static final String SQL_SELECT = "SELECT id_persona,nombre,apellido,email,telefono FROM persona"; //obtiene el contenido de la bd de persona
    private static final String SQL_INSERT = "INSERT INTO persona(nombre,apellido,email,telefono)  VALUES(?,?,?,?)";//ingresa un registro en la bd de persona(con parametros)
    private static final String SQL_UPDATE = "UPDATE persona SET nombre=?,apellido=?,email=?,telefono=? WHERE id_persona=?;";

    @Override
    public List<Persona> seleccionar() {

        /*
        retorna una lista con todos los objetos de tipo Persona disponibles
        en base de datos
         */
        Connection cn = null;
        PreparedStatement stmn = null;
        ResultSet rs = null;
        Persona persona = null;
        List<Persona> personas = new ArrayList();

        try {

            cn = getConnection();//conexion a base de datos (Conexion static)
            stmn = cn.prepareStatement(SQL_SELECT);//envia la instruccion a base de datos
            rs = stmn.executeQuery();//ejecuta la consulta dentro de base de datos 

            while (rs.next()) {//mientras encuentre algo en bd seguira ejecutandose

                //obtencion de atributos
                int idPersona = rs.getInt("id_persona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");

                persona = new Persona(idPersona, nombre, apellido, email, telefono);//creacion de nuevo objeto persona apartir de los atributos obtenidos

                personas.add(persona);//agrega el objeto persona dentro del List

            }

        } catch (SQLException esql) {
            esql.printStackTrace(System.err);
        } finally {
            try {
                //cierre de conexiones
                Conexion.close(rs);
                Conexion.close(stmn);
                Conexion.close(cn);
            } catch (SQLException es) {
                es.printStackTrace(System.err);
            }
        }
        return personas;//retorna el List
    }

    @Override
    public int insertar(Persona persona) {

        /*
        Recibe un objeto de Tipo Persona e ingresa la infomacion del objeto dentro de la bd
         */
        //objetos a utilizar
        Connection con = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            con = Conexion.getConnection();//hace conexion a bd
            stmt = con.prepareStatement(SQL_INSERT);//accion a ejecutar ya definida estaticamente

            /*
            Ingreso de parametros de SQL_INSERT (?,?,?,?)
            estructura : (1,value)
                                     (indice , valor);
             */
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());

            registros = stmt.executeUpdate(); //actualiza el estado de la bd (tambien valido con insert)
            //retorna un valor entero de los registros afectados

        } catch (SQLException ex) {
            ex.printStackTrace(System.err);
        } finally {
            try {
                Conexion.close(con);//cierre de conexiones
                Conexion.close(stmt);
            } catch (SQLException ex) {
                ex.printStackTrace(System.err);
            }
        }
        return registros;//retorna el valor de los registros afectados en el insert
    }

    @Override
    public int actualizar(Persona persona) {
        /*
        Actualiza la informacion de una persona (completa)
         */

        List<Persona> personas = this.seleccionar();

        for (int i = 0; i < personas.size(); i++) {
            
            if (personas.get(i).getIdPersona() == persona.getIdPersona()) {//si exite el id del objeto se realizara el update

                Connection con = null;
                PreparedStatement stmt = null;
                int registros = 0;

                try {
                    con = Conexion.getConnection();//hace conexion a bd
                    stmt = con.prepareStatement(SQL_UPDATE);//accion a ejecutar ya definida estaticamente

                    /*
                    Update en bd
                    stmnt = (indice,valor) 
                    UPDATE persona SET nombre=?',apellido=?,email=?,telefono=? WHERE id_persona=?;"
                     */
                    stmt.setString(1, persona.getNombre());
                    stmt.setString(2, persona.getApellido());
                    stmt.setString(3, persona.getEmail());
                    stmt.setString(4, persona.getTelefono());
                    
                    stmt.setInt(5, persona.getIdPersona());

                    registros = stmt.executeUpdate(); //actualiza el estado de la bd 
                    //retorna un valor entero de los registros afectados

                } catch (SQLException ex) {
                    ex.printStackTrace(System.err);
                } finally {
                    try {
                        Conexion.close(con);//cierre de conexiones
                        Conexion.close(stmt);
                        System.out.println("Actualizacion exitosa.");
                    } catch (SQLException ex) {
                        ex.printStackTrace(System.err);
                    }
                }
                return registros;//retorna el valor de los registros afectados en el insert
            }else if(i==personas.size()-1){
                System.err.println("Error: Persona no encontrada.");
            }

        }
        
        return 0;
    }

    @Override
    public void eliminar(Persona persona) {
        /*
        Elimina un registro de bd apartir de su contenido (completo)
         */
    }

    @Override
    public void eliminar(int idPersona) {
        /*
        Elimina un registro en bd apartir de su id
         */
    }

}
