
package com.peliculas.negocio;

import com.peliculas.datos.AccesoDatos;
import com.peliculas.datos.AccesoDatosImpl;
import com.peliculas.domain.Pelicula;
import java.util.List;


public class CatalogoPeliculasImpl implements CatalogoPeliculas{
    
    /*
    Intermediario entre datos e interfaz de usuario
    
    datos:AccesoDatos : Es la conexion directa a el archivo de almacenamiento
                        donde tiene los metodos necesarios para manipularla
                        y haciendo la conexion con catalogo para hacer 
                        que la conexion de la base de datos(aarchivo en este caso)
                        no sea directa, ademas de permitir una posible implementacion
                        de nuevas bases de datos solo implementando AccesoDatos.
    */
    
    //es de Interface y apunta a un AccesoDatos que lo implementa asi dando compatibilidad
    AccesoDatos datos = new AccesoDatosImpl();
    
    public CatalogoPeliculasImpl(){
    }
    
    @Override
    public void agregarPeliculas(String nombrePelicula, String nombreArchivo) {
        //hace coneccion con AccesoDatosImpl en el metodo que agrega una pelicula en el archivo
        datos.escribir(new Pelicula(nombrePelicula), nombreArchivo, datos.existe(nombreArchivo));
    }

    @Override
    public void listarPeliculas(String nombreArchivo) {
        //lista todas las peliculas existentes haciendo conexion con AccesoDatosImpl
        
        datos.listar(nombreArchivo).forEach((element) -> { //impresion de list
            System.out.println(element);
        });
        
    }

    @Override
    public void buscarPeliculas(String nombreArchivo, String buscar) {
        //busca una pelicula haciendo coneccion con AccesoDatosImpl
        
        datos.buscar(nombreArchivo, buscar);
        
    }

    @Override
    public String iniciarArchivo(String nombreArchivo) {
        //se conecta con AccesoDatos crear para crear el archivo
        datos.crear(nombreArchivo);//crea el archivo 
        return "Archivo inicializado con exito.";
    }
    
}
