
package com.peliculas.datos;

import com.peliculas.domain.Pelicula;
import java.util.List;

public interface AccesoDatos {
    
    /*
    Metodos para acceder, crear y manipular datos en interface para hacer posible
    la implementacion de estos metodos en otra clase
    */
    
    public boolean existe(String nombreArchivo);//define si el archivo existe o no
    
    public List<Pelicula> listar(String pelicula); //crea una lista de todas las peliculas
    
    public void escribir(Pelicula pelicula,String nombreArchivo,boolean anexar);
    
    public void buscar(String nombreArchivo,String buscar);
    
    public void crear(String nombreArchivo);
    
    public void borrar(String nombreArchivo);
}
