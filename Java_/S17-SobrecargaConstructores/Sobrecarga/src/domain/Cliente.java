package domain;

import java.util.Date;

public class Cliente extends Persona {

    //atributos de cliente
    private static int contadorIdCliente;
    private final int idCLiente;
    private final Date fechaRegistro;
    private boolean vip;

    public Cliente(boolean vip, String nombre) {
        //"semiconstructor"
        super(nombre); //inicializacion del nombre de la persona con constructor de padre
        this.idCLiente = ++Cliente.contadorIdCliente;
        this.vip = vip;

        //Clase date para guardar la fecha de registro del cliente
        Date date = new Date();
        this.fechaRegistro = date;
    }

    public Cliente(boolean vip, String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);//constructor de clase Persona(padre)
        this.vip = vip;
        
        idCLiente = ++Cliente.contadorIdCliente;
        
        this.fechaRegistro = new Date();
    }

    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCLiente=").append(idCLiente);
        sb.append(", fechaRegistro= [").append(fechaRegistro).append("]");
        sb.append(", vip=").append(vip).append("}");
        sb.append(", informacion= {").append(super.toString()).append("}");
        return sb.toString();
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
}
