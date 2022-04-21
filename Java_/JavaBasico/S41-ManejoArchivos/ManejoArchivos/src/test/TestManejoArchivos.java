
package test;

public class TestManejoArchivos {
    
    public static void main(String[] args) {
        
        var nombreArchivo = "miArchivo";
        
        //manejoarchivos.ManejoArchivos.crearArchivos(nombreArchivo);//creacion de archivo
        //manejoarchivos.ManejoArchivos.escribirArchivo(nombreArchivo, "Hola desde Java!");//Escibre una cadena
        manejoarchivos.ManejoArchivos.anexarArchivo(nombreArchivo, "Adios desde Java!"); //anexa otra cadena 
        manejoarchivos.ManejoArchivos.leerArchivo(nombreArchivo);
        
    }
    
}