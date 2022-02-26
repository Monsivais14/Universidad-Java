
package com.gm.mundopc.perifericos;

/**
 *
 * @author mpop
 */
public class DispositivoEntrada {
    
    private String tipoEntrada;
    private String marca;

    public DispositivoEntrada(String tipoEntrada,String marca) {
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
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
    
    
    
    
}
