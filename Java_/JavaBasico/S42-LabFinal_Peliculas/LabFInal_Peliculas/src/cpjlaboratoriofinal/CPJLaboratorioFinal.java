package cpjlaboratoriofinal;

import com.peliculas.excepciones.LecturaDatosEx;
import com.peliculas.negocio.CatalogoPeliculas;
import com.peliculas.negocio.CatalogoPeliculasImpl;

public class CPJLaboratorioFinal {

    public static void main(String[] args) {

        java.util.Scanner in = new java.util.Scanner(System.in);//objeto Scanner

        int opcion;
        String nombreArchivo = "Peliculas";
        CatalogoPeliculas catalogo = new CatalogoPeliculasImpl();

        do {

            System.out.println("Elige una opcion:");
            System.out.println("1.-Iniciar catalogo peliculas");
            System.out.println("2.-Agregar pelicula");
            System.out.println("3.-Listar peliculas");
            System.out.println("4.-Buscar peliculas");
            System.out.println("0.-Salir");

            opcion = Integer.parseInt(in.nextLine());

            //opciones
            if (opcion == 1) {//inicializar o crear archivo
                
                System.out.println(catalogo.iniciarArchivo(nombreArchivo));//da el nombre ala rchivo y lo crea

            } else if (opcion == 2) {//agregar una pelicula

                System.out.println("Ingresa el nombre de la pelicula");

                if (nombreArchivo == null) {
                    throw new LecturaDatosEx("Debes de iniciar un catalogo de peliculas "
                            + "antes de agregar una pelicula");
                } else {
                    catalogo.agregarPeliculas(in.nextLine(), nombreArchivo);
                }

            } else if (opcion == 3) {//listar peliculas

                if (nombreArchivo == null) {
                    throw new LecturaDatosEx("Debes de iniciar un catalogo de peliculas "
                            + "antes de listar las peliculas");
                }

                System.out.println("Lista de peliculas:");
                catalogo.listarPeliculas(nombreArchivo);

            } else if (opcion == 4) {//buscar

                if (nombreArchivo == null) {
                    throw new LecturaDatosEx("Debes de iniciar un catalogo de peliculas "
                            + "antes de buscar una pelicula");
                }

                System.out.println("Ingresa el nombre de la pelicula:");
                catalogo.buscarPeliculas(nombreArchivo, in.nextLine());

            }
            System.out.println("/////");

        } while (opcion != 0);//si opcion es diferente a 0 se repetira el bucle

    }

}
