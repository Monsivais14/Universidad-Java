
package com.gm.mundopc.perifericos;

/**
 *
 * @author mpop
 */
public class Monitor {
   
    private int idMonitor;
    private String marca;
    private double tamano;
    private double precio;
    private static int contadorMonitores;
    
    private Monitor(){
        idMonitor = ++Monitor.contadorMonitores;
    }
    
    public Monitor(String marca,double tamano,double precio){
        this();
        this.marca = marca;
        this.tamano = tamano;
        this.precio = precio;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static int getContadorMonitores() {
        return contadorMonitores;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[Monitor{idMonitor=").append(idMonitor);
        sb.append(", marca=").append(marca);
        sb.append(", tamano=").append(tamano);
        sb.append("}]");
        return sb.toString();
    }
    
}