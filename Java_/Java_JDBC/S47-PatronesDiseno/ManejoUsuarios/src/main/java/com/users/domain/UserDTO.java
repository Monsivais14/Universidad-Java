
package com.users.domain;

/**
 *
 * @author mpop
 */
public class UserDTO {
    
    //atributos de un objeto usuario
    private Integer idUsuario;
    private String name;
    private String password;
    
    public UserDTO(){
        
    }
   
     //constructor para obtener registro 
    public UserDTO(Integer idUsuario,String name,String password){
        this.idUsuario = idUsuario;
        this.name = name;
        this.password = password;
    }
    
    //constructor para crear nuevo objeto para hacer registro
    public UserDTO(String name,String password){
        this.name=name;
        this.password=password;
    } 

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("User{idUsuario=").append(idUsuario);
        sb.append(", name=").append(name);
        sb.append(", password=").append(password);
        sb.append('}');
        return sb.toString();
    }
    
}