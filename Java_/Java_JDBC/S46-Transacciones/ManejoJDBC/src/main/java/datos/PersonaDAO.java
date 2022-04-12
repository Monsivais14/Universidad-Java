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

public class PersonaDAO  {

    //Conexion de tipo transaccional (conexion unica)
    private Connection conexionTransaccional;

    private static final String SQL_SELECT = "SELECT id_persona,nombre,apellido,email,telefono FROM persona"; //obtiene el contenido de la bd de persona
    private static final String SQL_INSERT = "INSERT INTO persona(nombre,apellido,email,telefono)  VALUES(?,?,?,?)";//ingresa un registro en la bd de persona(con parametros)
    private static final String SQL_UPDATE = "UPDATE persona SET nombre=?,apellido=?,email=?,telefono=? WHERE id_persona=?;";
    private static final String SQL_DELETE = "DELETE FROM persona   where id_persona=?";

    /*
    Una transaccion puede hacer diferentes sentencias sobre cualquier tabla de la base pero con una sola  unica 
    conexion para cada movimiento para asi dar el rollback si hay un error en esa conexion
     */
    public PersonaDAO() {
    }

    public PersonaDAO(Connection conexionTransaccional) {
        //este constructor es por si se recibe una conexion externa
        this.conexionTransaccional = conexionTransaccional;
    }

    public List<Persona> seleccionar() throws SQLException{

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
            //si conexionTransaccional no es null entonces toma esa conexion de lo contrario crea una nueva
            cn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
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

        } finally {
            try {
                //cierre de conexiones
                Conexion.close(rs);
                Conexion.close(stmn);
                if (conexionTransaccional == null) {
                    //si la conexion transaccional es null (o sea, se genero una nueva) cerrara la conexion generada y la transaccional aun abierta
                    Conexion.close(cn);
                }//si es diferente de null no se debe de cerrar por ser Transaccional

            } catch (SQLException es) {
                es.printStackTrace(System.err);
            }
        }
        return personas;//retorna el List
    }

    public int insertar(Persona persona) throws SQLException{

        /*
        Recibe un objeto de Tipo Persona e ingresa la infomacion del objeto dentro de la bd
         */
        //objetos a utilizar
        Connection con = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            con = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();//hace conexion a bd
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

        } finally {
            try {
                Conexion.close(stmt);
                if (this.conexionTransaccional == null) {
                    close(con);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.err);
            }
        }
        return registros;//retorna el valor de los registros afectados en el insert
    }


    public int actualizar(Persona persona) throws SQLException{
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
                    con = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();//hace conexion a bd
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

                } finally {
                    try {
                        Conexion.close(stmt);
                        if (this.conexionTransaccional == null) {
                            close(con);
                        }
                        System.out.println("Actualizacion exitosa.");
                    } catch (SQLException ex) {
                        ex.printStackTrace(System.err);
                    }
                }
                return registros;//retorna el valor de los registros afectados en el insert
            } else if (i == personas.size() - 1) {
                System.err.println("Error: Persona no encontrada.");
            }

        }

        return 0;
    }
    
    public void eliminar(Persona persona) throws SQLException{
        /*
        Elimina un registro de bd apartir de su contenido (completo)
         */
        List<Persona> personas = this.seleccionar();
        boolean existe = false;
        //primero se comprueba si el registro existe
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getIdPersona() == persona.getIdPersona()) {
                existe = true;
            }
        }

        Connection con = null;
        PreparedStatement stmt = null;

        if (existe) { //si el registro existe
            try {
                con = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();//conexion a bd
                stmt = con.prepareStatement(SQL_DELETE);//accion delete

                /*
                Ingreso de id del where para realizar el delete
                 */
                stmt.setInt(1, persona.getIdPersona());

                stmt.executeUpdate();//ejecucion de update (tambien valido en delete)

            } finally {
                try {
                    Conexion.close(stmt);
                    if (this.conexionTransaccional == null) {
                        close(con);
                    }
                    System.out.println("Eliminacion exitosa");
                } catch (SQLException ex) {
                    ex.printStackTrace(System.err);
                }
            }

        } else {
            System.err.println("Error:Persona no encontrada.");
        }

    }
    
    public void eliminar(int idPersona) throws SQLException{
        /*
        Elimina un registro en bd apartir de su id
         */
        List<Persona> personas = this.seleccionar();
        boolean existe = false;
        //primero se comprueba si el registro existe
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getIdPersona() == idPersona) {
                existe = true;
            }
        }

        Connection con = null;
        PreparedStatement stmt = null;

        if (existe) { //si el registro existe
            try {
                con = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();//conexion a bd
                stmt = con.prepareStatement(SQL_DELETE);//accion delete

                /*
                Ingreso de id del where para realizar el delete
                 */
                stmt.setInt(1, idPersona);

                stmt.executeUpdate();//ejecucion de update (tambien valido en delete)

            } finally {
                try {
                    Conexion.close(stmt);
                    if (this.conexionTransaccional == null) {
                        close(con);
                    }
                    System.out.println("Eliminacion exitosa");
                } catch (SQLException ex) {
                    ex.printStackTrace(System.err);
                }
            }

        } else {
            System.err.println("Error:Persona no encontrada.");
        }

    }

}
