
package test;

/**
 *
 * @author mpop
 */
public class ArgumentosTest {

    
    public static void main(String[] args) {
        
        /*
        un argumetno variables es cuando queremos pasar un argumento atravez de un metodo
        y no sabemos ocn exactitud cuantos seran
        */
        
        //utilizacion de metodo con argumentos variables
        imprimirNumeros(2,3,5,6,7,8,94,6);
        System.out.println("///"); 
        imprimirNumeros(1,2);
        /*
        por eso es un metodo con argumentos variables, no se define la cantidad de
        metodos que va a recibir pero lo hara depues en un array con la cantidad 
        indefinida enviada
        */
        System.out.println("///");
        variosParametros("Juan", 1,2,4,5);
        
    }
    
    public static void imprimirNumeros(int... numeros){
        /*
        lo que diferencia a los argumentos variables de un array es que no se 
        con exactitud cuantos parametros pasaremos y ya una vez pasados se vuelve un array,
        mientras que al enviar un array directamente  ya tenemos definida la cantidad de 
        variables enviadas
        */
        for (int i = 0; i < numeros.length; i++) {
            //numeros length es atributo de un arreglo, arreglo numeros
            System.out.println("numeros("+i+") = "+numeros[i]);//impresion
        }
    }
    
    public static void variosParametros(String nombre,int... numeros){
        System.out.println("nombre="+nombre);
        imprimirNumeros(numeros);
    }
    
}
