package test;

import execpciones.Aritmetica;
import execpciones.OperacionExcepcion;

public class testExcepciones {

    public static void main(String[] args) {

        int resultado = 0;

        try {
            
            resultado = Aritmetica.division(1, 0);
            
        } catch (OperacionExcepcion e) {
            
            System.out.println("Error:"+e.getMessage());
            e.printStackTrace(System.err);
            
        }catch(Exception error){
            
            System.out.println("Error de tipo Exception");
            
        }
        finally{
            
            System.out.println("se reviso la division");
            
        }
        
        System.out.println("resultado = " + resultado);
        
    }

}
