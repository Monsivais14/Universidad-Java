
package com.peliculas.domain;

import java.io.BufferedReader;

public class Pelicula {
    
    /*
    Define una pelicula como un objeto para utilizar las mismas en el sistema
    */
    
    private String nombre;//nombre de la pelicula
    
    public Pelicula(){ //constructor publico vacio
    }
    
    public Pelicula(String nombre){//constructor public con inicializacion
        this.nombre = nombre;
    }

    public Pelicula(BufferedReader entrada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    @Override //Descibe la pelicula en una cadena
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{nombre=").append(nombre);
        sb.append('}');
        return sb.toString();
    }
    
}