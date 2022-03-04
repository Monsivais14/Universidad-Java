
package com.mx.ventas;

/*
Esta clase es la encargada de crear un producto e inicializarlo

la clase producto como tal es solo un objeto dentro de una orden

*/
public class Producto {
    
    //atributos de un producto
    private int idProducto;//identificador de un producto
    private String nombre; // nombre del producto
    private double precio; //precio del producto
    private static int contadorProductos;// contador de productos ya registrados
    
    private Producto(){
        //da un id a un producto
        idProducto = ++Producto.contadorProductos;
    }
    
    public Producto(String nombre, double precio){
        this();//llama al constructor vacio de Producto
        this.nombre = nombre; //inicializa ambas variables
        this.precio = precio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{idProducto=").append(idProducto);
        sb.append(", nombre=").append(nombre);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
    
    public static int getContadorProductos() {
        return contadorProductos;
    }
    
    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }   
}
