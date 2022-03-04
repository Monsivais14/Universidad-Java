
package com.gm.mundopc;

import com.gm.mundopc.perifericos.Monitor;
import com.gm.mundopc.perifericos.Raton;
import com.gm.mundopc.perifericos.Teclado;

/**
 *
 * @author mpop
 */
public class Computadora {
    
    //atributos
    private int idComputadora;
    private static int contadorComputadoras;
    private String nombre;
    private double precio;
    
    //objetos necesarios
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    
    private Computadora(){
        this.idComputadora = ++Computadora.contadorComputadoras;
    }
    
    public Computadora(String nombre,double precio,Monitor monitor,Teclado teclado, Raton raton){
        
        this();
        
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
        
        this.precio = precio+monitor.getPrecio()+teclado.getPrecio()+raton.getPrecio();
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Computadora{idComputadora=").append(this.idComputadora);
        sb.append(", nombre=").append(this.nombre);
        sb.append(", precio=").append(this.precio);
        sb.append(", monitor=").append(this.monitor);
        sb.append(", teclado=").append(this.teclado);
        sb.append(", raton=").append(this.raton);
        sb.append('}');
        return sb.toString();
    }
    
    public double getPrecio(){
        return this.precio;
    }

    public static int getContadorComputadoras() {
        return contadorComputadoras;
    }
    
    public int getIdComputadora() {
        return idComputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }
    
    
    
}