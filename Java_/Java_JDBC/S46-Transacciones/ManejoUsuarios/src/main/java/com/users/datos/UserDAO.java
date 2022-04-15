package com.users.datos;

import static com.users.datos.ConectionDB.*;
import com.users.domain.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mpop
 */
public class UserDAO implements DAO {

    private Connection conTransaccional;
    
    private final String SQL_QUERY = "SELECT    *  FROM  test.usuario";
    private final String SQL_INSERT = "INSERT INTO usuario (usuario,password) VALUES(?,?) ";
    private final String SQL_UPDATE = "UPDATE usuario SET  usuario=?,password=? WHERE id_usuario=?";
    private final String SQL_DELETE = "DELETE FROM  usuario WHERE id_usuario=?";
    
    public UserDAO(){
    }
    
    public UserDAO(Connection con){
        //constructor que recibe conexion permitiendo una conexion transaccional en bd
       this.conTransaccional = con;
    }
    
    @Override
    public List<User> list() throws SQLException{

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        List<User> list = new ArrayList<User>();
        User user = null;

        try {

            con = this.conTransaccional!=null?this.conTransaccional:getConnection(); //obtiene conexion con base de datos(import static)
            pst = con.prepareStatement(SQL_QUERY);
            rs = pst.executeQuery();

            while (rs.next()) {//si encuentra un registro (puede ser mas de uno)

                Integer idUsuario = rs.getInt("id_usuario");
                String userName = rs.getString("usuario");
                String password = rs.getString("password");

                user = new User(idUsuario, userName, password);

                list.add(user);//finalmente anade el objeto user dentro del list que sera retornado
            }

        }finally {
            try {
                close(rs);
                close(pst);
                
                if(this.conTransaccional==null){
                    //cierre de conexion en caso de que la conexion no sea transaccional
                    close(con);
                }
                
            } catch (SQLException ex) {
                ex.printStackTrace(System.err);
            }
        }
        return list;
    }

    @Override
    public void insert(User user) throws SQLException {

        Connection cn = null;
        PreparedStatement pst = null;

        try {

            cn = this.conTransaccional!=null?this.conTransaccional:getConnection(); //hace conexion con bd
            pst = cn.prepareStatement(SQL_INSERT);//instruccion SQL

            //da valor a las variables indefinidas '?' en la cadena  SQL_INSERT
            pst.setString(1, user.getName());
            pst.setString(2, user.getPassword());

            pst.executeUpdate();//ejecuta la oden 

        } finally {
            try {
                //cierre de conexiones con bd
                close(pst);
                
                if(this.conTransaccional==null){
                    close(cn);
                }
                
            } catch (SQLException ex) {
                ex.printStackTrace(System.err);
            }
        }
    }

    @Override
    public void update(User user) throws SQLException {

        Connection cn = null;
        PreparedStatement pst = null;

        try {

            cn = this.conTransaccional!=null?this.conTransaccional:getConnection();//conexion a bd
            pst = cn.prepareStatement(SQL_UPDATE);//instruccion a bd

            //da valor a las variables indefinidad en la cadena SQL_UPDATE ('?')
            pst.setString(1, user.getName());
            pst.setString(2, user.getPassword());
            pst.setInt(3, user.getIdUsuario());

            pst.executeUpdate();//ejecuta la orden

        } finally {
            try {
                //cierre de conexiones
                close(pst);
                
                if(this.conTransaccional==null){
                    close(cn);
                }
                
            } catch (SQLException ex) {
                ex.printStackTrace(System.err);
            }
        }

    }

    @Override
    public void delete(User user) throws SQLException {

        Connection cn = null;
        PreparedStatement pst = null;

        try {

            cn = this.conTransaccional!=null?this.conTransaccional:getConnection();//Hace conexion con bd
            pst = cn.prepareStatement(SQL_DELETE);//orden en bd SQL_DELETE

            //pasa el parametro de where en la cadena a ejecutar en bd SQL_DELETE
            pst.setInt(1, user.getIdUsuario());

            pst.executeUpdate();

        } finally {
            try {
                close(pst);
                
                if(this.conTransaccional==null){
                    close(cn);
                }
                
            } catch (SQLException e) {
                e.printStackTrace(System.err);
            }
        }

    }

    @Override
    public void delete(Integer idUser) throws SQLException {

        Connection cn = null;
        PreparedStatement pst = null;

        try {

            cn = this.conTransaccional!=null?this.conTransaccional:getConnection();//conexion a bd
            pst = cn.prepareStatement(SQL_DELETE);//orden a bd

            //da valor al int del where en SQL_DELETE
            pst.setInt(1, idUser);

            pst.executeUpdate();

        }finally {
            try {
                close(pst);
                
                if(this.conTransaccional==null){
                    close(cn);
                }
                
            } catch (SQLException e) {
                e.printStackTrace(System.err);
            }
        }

    }

}
