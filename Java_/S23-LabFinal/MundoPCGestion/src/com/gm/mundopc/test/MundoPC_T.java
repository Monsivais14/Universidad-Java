package com.gm.mundopc.test;

import com.gm.mundopc.Computadora;
import com.gm.mundopc.Orden;
import com.gm.mundopc.perifericos.Monitor;
import com.gm.mundopc.perifericos.Raton;
import com.gm.mundopc.perifericos.Teclado;

/**
 *
 * @author mpop
 */
public class MundoPC_T {

    public static void main(String[] args) {

        Orden orden1 = new Orden();

        orden1.agregarComputadora(new Computadora("PC Gamer v3", 6000, new Monitor("Huawei", 23, 4000), new Teclado("USB", "Logitech", 700), new Raton("USB", "Logitech", 500)));
        orden1.agregarComputadora(new Computadora("PC Gamer v3", 6000, new Monitor("Huawei", 23, 4000), new Teclado("USB", "Logitech", 700), new Raton("USB", "Logitech", 500)));
        orden1.agregarComputadora(new Computadora("PC Gamer v3", 6000, new Monitor("Huawei", 23, 4000), new Teclado("USB", "Logitech", 700), new Raton("USB", "Logitech", 500)));
        orden1.agregarComputadora(new Computadora("PC Gamer v3", 6000, new Monitor("Huawei", 23, 4000), new Teclado("USB", "Logitech", 700), new Raton("USB", "Logitech", 500)));
        orden1.mostrarOrden();

    }

}
