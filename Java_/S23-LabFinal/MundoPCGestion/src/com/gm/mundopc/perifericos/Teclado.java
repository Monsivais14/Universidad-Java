
package com.gm.mundopc.perifericos;

/**
 *
 * @author mpop
 */
public class Teclado extends DispositivoEntrada{
    
    private int idTeclado;
    private static int contadorTeclados;
    
    public Teclado(String tipoEntrada, String marca,double precio) {
        super(tipoEntrada, marca,precio);
        idTeclado = ++Teclado.contadorTeclados;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[Teclado{idTeclado=").append(idTeclado);
        sb.append(", ").append(super.toString());
        sb.append("}]");
        return sb.toString();
    }
    
    @Override
    public double getPrecio(){
        return super.getPrecio();
    }
    
    public void setPrecio(double precio){
        super.setPrecio(precio);
    }
    
    public int getIdTeclado() {
        return idTeclado;
    }
    
    public static int getContadorTeclados() {
        return contadorTeclados;
    }
    
}
