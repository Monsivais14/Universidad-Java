package com.gm.mundopc;

import com.gm.mundopc.Computadora;

/**
 *
 * @author mpop
 */
public class Orden {

    private int idOrden;//identificador de orden
    private Computadora computadoras[];//array de "carrito" de computadoras
    private int contadorComputadoras;//se encarga de llevar la cuenta de las computadoras en lista
    private static int contadorOrdenes;//contador de numero de ordenes hechas
    private final static int MAX_COMPUTADORAS = 3; //numero maximo de computadoras
    private boolean lleno = false;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.contadorComputadoras = 0;
        this.computadoras = new Computadora[MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora) {

        this.contadorComputadoras++;

        if (!lleno) {

            for (int i = 0; i < contadorComputadoras; i++) {

                if (computadoras[contadorComputadoras - 1] == null) {
                    this.computadoras[contadorComputadoras - 1] = computadora;
                }

            }
        }

        if (this.contadorComputadoras == MAX_COMPUTADORAS) {
            lleno = true;
        }

    }

    public void mostrarOrden() {

        double total = 0;

        for (int i = 0; i < contadorComputadoras; i++) {

            if (i == Orden.MAX_COMPUTADORAS) {//determina si es el maximo de computadoras permitido
                System.out.println("total: " + total);
                break;
            }

            System.out.println(computadoras[i]);
            total += computadoras[i].getPrecio();
            System.out.print("\n");

            if (i == contadorComputadoras - 1) {//identifica cuando i esta en la ultima vuelta de ciclo
                System.out.println("total: " + total);
                break;
            }

        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Orden{idOrden=").append(idOrden);
        sb.append(", computadoras=").append(computadoras);
        sb.append('}');
        return sb.toString();
    }

}
