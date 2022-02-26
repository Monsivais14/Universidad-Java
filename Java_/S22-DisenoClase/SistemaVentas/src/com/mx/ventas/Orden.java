package com.mx.ventas;

import com.mx.ventas.Producto;

/*
Orden como tal es la encargada de el manejo de todos los productos
 */
public class Orden {

    //atributos
    private final int idOrden; //identificador de una orden
    private final Producto productos[]; //por asi decirlo "el cesto" de productos
    private boolean cestaLlena;
    private static int contadorOrdenes; //contador estatico de ordenes
    private final static int MAX_PRODUCTOS = 10; //capacidad maxima de productos en una orden

    //constructor de orden
    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto) {
        /*
        Aqui se anadira el producto al array unidimencional 
         */

        //determinar si el campo esta vacio para usar ese campo de cesta
        for (int i = 0; i < productos.length; i++) {

            if (productos[i] == null) {
                productos[i] = producto;//guarda el producto en la cesta
                break;//cuando encuentre el espacio el ciclo acaba
            }if (i == 9) {//verifica si aun hay espacio
                if (productos[i] != null) {
                    cestaLlena = true;
                }
            }
        }
    }

    public double calcularTotal() {
        /*
        retornara el total a pagar de todos los productos guardados
         */

        double total = 0;

        for (int i = 0; i < productos.length; i++) {

            if (productos[i] != null) {
                total += productos[i].getPrecio();
            } else {
                total += 0;
            }

        }

        return total;
    }

    public void mostrarOrden() {
        /*
        mostrara en orden la lista de productos
         */

        System.out.println(this.toString());

        for (int i = 0; i < productos.length; i++) {
            if (this.productos[i] != null) {
                //determina si el producto esta registrado, un producto no 
                //registrado es = null asi que apartir de ahi determina si esta
                //registrado o no
                System.out.println(this.productos[i].toString());//impresion del producto
            } else {
                System.out.println("...");
            }
        }
        if (cestaLlena) {
            System.out.println("Cesta llena, no se pueden agregar mas productos!");
        }
        System.out.println("Total: "+this.calcularTotal());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Orden{idOrden=").append(idOrden);
        sb.append(", productos=").append(productos);
        sb.append('}');
        return sb.toString();
    }

}
