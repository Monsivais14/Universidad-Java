package com.peliculas.datos;

import com.peliculas.domain.Pelicula;
import com.peliculas.excepciones.AccesoDatosEx;
import com.peliculas.excepciones.EscrituraDatosEx;
import com.peliculas.excepciones.LecturaDatosEx;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AccesoDatosImpl implements AccesoDatos {

    @Override
    public boolean existe(String nombreArchivo) {
        //verifica si el archivo existe 

        File file = new File(nombreArchivo);
        
        return file.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreArchivo) {
        //entrega una lista de todas las peliculas en el archivo

        List<Pelicula> list = new ArrayList(); //creacion de list 

        try {

            File file = new File(nombreArchivo);

            var entrada = new BufferedReader(new FileReader(file)); //lector en archivo
            String nombrePelicula = entrada.readLine(); //recoge el nombre de la pelicula apartir de lo que lea
            while (nombrePelicula != null) {//mientras el nombre de la pelicula no este en blanco sigue habiendo lineas por leer

                list.add(new Pelicula(nombrePelicula));//anade la pelicula al list
                nombrePelicula = entrada.readLine();//lee la siguiente linea
            }

        } catch (LecturaDatosEx ex) {
            throw new LecturaDatosEx("Error al leer el archivo, no existente");
        } catch (FileNotFoundException ex) {
            throw new LecturaDatosEx("Error al realizar lectura.");
        } catch (IOException ex) {
            throw new LecturaDatosEx("Error al realizar lectura.");
        }

        return list;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) {
        //escribe una pelicula en el archivo antes escrito

        if (anexar) {

            File file = new File(nombreArchivo);

            try {
                PrintWriter salida = new PrintWriter(new FileWriter(file, anexar));

                salida.println(pelicula.getNombre());//escribe el nombre de la pelicula en documento
                salida.close();

                System.out.println("Se ha guardado la pelicula con exito");

            } catch (IOException ex) {
                throw new EscrituraDatosEx("Error al leer datos.");
            }

        }else{
            throw new EscrituraDatosEx("Archivo no creado");
        }

    }

    @Override
    public void buscar(String nombreArchivo, String buscar) {
        //busca una pelicula 

        try {

            File file = new File(nombreArchivo);

            BufferedReader entrada = new BufferedReader(new FileReader(file)); //lector en archivo

            String nombrePelicula = entrada.readLine(); //recoge el nombre de la pelicula apartir de lo que lea

            boolean esta = false;

            while (nombrePelicula != null) {//mientras el nombre de la pelicula no este en blanco sigue habiendo lineas por leer

                if (nombrePelicula.equalsIgnoreCase(buscar)) {//cuando encuentre el nombre de la pelicula en el archivo

                    esta = true;

                } else {

                    nombrePelicula = entrada.readLine();//lee la siguiente linea
                }

                if (esta) {

                    System.out.println("La pelicula " + buscar + " esta dentro del catalogo");

                    break;//para el ciclo while

                } else if (!esta) {

                    System.out.println("La pelicula " + buscar + " no existe dentro del catalogo");

                    break;//para el ciclo while
                }

            }

        } catch (LecturaDatosEx e) {
            throw new LecturaDatosEx("Error al buscar el archivo");
        } catch (FileNotFoundException ex) {
            throw new LecturaDatosEx("Error al buscar el archivo");
        } catch (IOException ex) {
            throw new LecturaDatosEx("Error al leer el archivo");
        }

    }

    @Override
    public void crear(String nombreArchivo) {
        //crea el acrhivo en disco y se conecta con el catalogo

        if (this.existe(nombreArchivo)) {
            File file = new File(nombreArchivo);
            System.out.println("El archivo ya existe, se limpiara el contenido del mismo");
            try {
                PrintWriter fileOut = new PrintWriter(file);
                fileOut.close();//creacion del archivo
            } catch (FileNotFoundException e) {
                System.out.print("Error al escribir, solo ingresa el nombre del archivo o de algun archivo valido.");
                throw new EscrituraDatosEx("Error de escritura.");
            } catch (Exception ex) {
                System.out.println("Ha ocurrido un error: " + ex.getMessage());
            } finally {
                System.out.println("Archivo creado");
            }

        } else {
            File file = new File(nombreArchivo);
            try {
                PrintWriter fileOut = new PrintWriter(file);
                fileOut.close();//creacion del archivo
            } catch (FileNotFoundException e) {
                System.out.print("Error al escribir, solo ingresa el nombre del archivo o de algun archivo valido.");
                throw new EscrituraDatosEx("Error de escritura.");
            } catch (Exception ex) {
                System.out.println("Ha ocurrido un error: " + ex.getMessage());
            } finally {
                System.out.println("Archivo creado");
            }
        }

    }

    @Override
    public void borrar(String nombreArchivo) {
        //borra el archivo (no habilitado)

        File file = new File(nombreArchivo);

        if (file.exists()) {

            file.delete();

        } else {

            System.err.println("Archivo " + nombreArchivo + " no existente, imposible eliminar");

        }

    }

}
