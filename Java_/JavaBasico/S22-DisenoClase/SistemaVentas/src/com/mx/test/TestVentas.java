
package com.mx.test;

import com.mx.ventas.Orden;
import com.mx.ventas.Producto;

public class TestVentas {
    
    public static void main(String[] args) {
        
        Orden o1 = new Orden();
        Orden o2 = new Orden();
        
        o1.agregarProducto(new Producto("Coca",20));
        o1.agregarProducto(new Producto("Coca",20));
        o1.agregarProducto(new Producto("Coca",20));
        o1.agregarProducto(new Producto("Coca",20));
        o1.agregarProducto(new Producto("Coca",20));
        o1.agregarProducto(new Producto("Coca",20));
        o1.agregarProducto(new Producto("Coca",20));
        o1.agregarProducto(new Producto("Coca",20));
        o1.agregarProducto(new Producto("Coca",20));
        o1.agregarProducto(new Producto("Coca",20));//10
        o1.agregarProducto(new Producto("Coca",20));
        o1.agregarProducto(new Producto("Coca",20));
        o1.mostrarOrden();
        System.out.println("////");
        
        o2.agregarProducto(new Producto("Coca",60));
        o2.mostrarOrden();
    }
    
}
