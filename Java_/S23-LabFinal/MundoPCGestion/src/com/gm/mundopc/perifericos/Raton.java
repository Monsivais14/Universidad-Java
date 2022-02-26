
package com.gm.mundopc.perifericos;

/**
 *
 * @author mpop
 */
public class Raton extends DispositivoEntrada{
    
    private int idRaton;
    private static int contadorRatones;
    
    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        idRaton = ++Raton.contadorRatones;
    }
    
    
    
}
