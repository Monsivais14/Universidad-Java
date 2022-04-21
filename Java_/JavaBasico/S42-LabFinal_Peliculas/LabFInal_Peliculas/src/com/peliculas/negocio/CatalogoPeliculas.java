
package com.peliculas.negocio;

public interface CatalogoPeliculas {
    
    public void agregarPeliculas(String nombrePelicula,String nombreArchivo);
    
    public void listarPeliculas(String nombreArchivo);
    
    public void buscarPeliculas(String nombreArchivo,String buscar);
    
    public String iniciarArchivo(String nombreArchivo);
    
}
