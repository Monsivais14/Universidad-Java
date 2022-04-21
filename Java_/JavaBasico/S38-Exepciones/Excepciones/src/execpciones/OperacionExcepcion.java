
package execpciones;

public class OperacionExcepcion extends RuntimeException{
    
    /*
    Exepcion personalizada extendiendo de Excepcion
    */
    
    public OperacionExcepcion(String mensaje){
        super(mensaje);
    }
    
}
