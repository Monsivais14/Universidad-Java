package manejoarchivos;

import java.io.*; //io :input, output 
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManejoArchivos {

    /*
    Manejo y utilizacion  de arhivos:
     */
    
    //metodo de creacion del archivo
    public static void crearArchivos(String nombreArchivo) {

        File archivo = new File(nombreArchivo);
        
        try {//check de FileNoFund
            
            PrintWriter salida = new PrintWriter(archivo); 
            
            salida.close();// creacion de archivo
            
            System.out.println("Se ha creado el archivo");
            
        } catch (FileNotFoundException e) {
            
            e.printStackTrace(System.err);
            
        }
    }
    
    //escribe informacion en el archivo
    public static void escribirArchivo(String nombreArchivo,String contenido){
        
        File archivo = new File(nombreArchivo); //clase File(en este caso para dar nombre a un archivo, recibe String)
        
        try {//check de FileNoFund
            
            PrintWriter salida = new PrintWriter(archivo); //objeto de archivo (Recibe el File con el nombre del archivo)
            
            salida.println(contenido);//impresion de contenido en archivo
            
            salida.close();// creacion de archivo 
            
            System.out.println("Se ha escrito el archivo");
            
        } catch (FileNotFoundException e) {
            
            e.printStackTrace(System.err);
            
        }
        
    }
    
    //metodo que anexa informacion a la ya escrita en un archivo
    public static void anexarArchivo(String nombreArchivo,String contenido){
        
            File archivo = new File(nombreArchivo); //clase File(en este caso para dar nombre a un archivo, recibe String)
        
        try {//check de FileNoFund
            
            PrintWriter salida = new PrintWriter(new FileWriter(archivo,true)); //metodo que anexa informacion
            
            salida.println(contenido);//impresion de contenido en archivo
            
            salida.close();// creacion de archivo 
            
            System.out.println("Se ha anexado informacion a el archivo");
            
        } catch (FileNotFoundException e) {
            
            e.printStackTrace(System.err);
            
        } catch (java.io.IOException ex){
            ex.printStackTrace(System.err);
        }
        
    }
    
    public static void leerArchivo(String nombreArchivo){
        
        File archivo = new File(nombreArchivo);
        
        try{
            
            var entrada = new BufferedReader(new FileReader(archivo)); //permite leer linas del archivo
            
            var lectura = entrada.readLine();
            
            System.out.println("Lectura:{");
            while(lectura != null){//mientras lectura no lea una linea en blanco el bucle seguira leyendo lineas
                
                System.out.println(lectura);
                lectura = entrada.readLine();
            }
            System.out.println("}");
            
        }catch(java.io.FileNotFoundException ex){
            ex.printStackTrace(System.err);
        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
        
    }

}
