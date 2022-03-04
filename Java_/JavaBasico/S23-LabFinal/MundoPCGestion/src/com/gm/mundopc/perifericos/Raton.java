package com.gm.mundopc.perifericos;

/**
 *
 * @author mpop
 */
public class Raton extends DispositivoEntrada {

    private int idRaton;
    private static int contadorRatones;

    public Raton(String tipoEntrada, String marca,double precio) {
        super(tipoEntrada, marca,precio);
        idRaton = ++Raton.contadorRatones;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[Raton{idRaton=").append(idRaton);
        sb.append(", ").append(super.toString());
        sb.append("}]");
        return sb.toString();
    }

    public int getIdRaton(){
        return this.idRaton;
    }
    
    public static int getContadorRatones() {
        return contadorRatones;
    }
    
}
