
package com.gm.mundopc.perifericos;

/**
 *
 * @author mpop
 */
public class DispositivoEntrada {
    
    protected String tipoEntrada;//hace referencia a su tipo de conexion
    protected String marca;
    protected double precio;

    public DispositivoEntrada(String tipoEntrada,String marca,double precio) {
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[DispositivoEntrada{tipoEntrada=").append(tipoEntrada);
        sb.append(", marca=").append(marca);
        sb.append("}]");
        return sb.toString();
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}