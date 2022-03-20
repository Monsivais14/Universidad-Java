
package execpciones;

import execpciones.OperacionExcepcion;

public class Aritmetica extends RuntimeException{
    
    public static int division(int numerador,int denominador){
        /*
        se tiene que marcar la exception en en metodo y tambien con throw al 
        momento de crear el objeto y dar el mensaje
        
        cuando se hereda de runtimeException solo es un error en tiempo de 
        ejecucion y da un error "sucio" por asi decirlo, pero sirve mas 
        para tener un codigo mas limpio y es mas factible usarlo en errores
        que es muy probable que no paren o sean errores ocacionados por 
        el programador o algo que no deberia estar pasando
        
        mientras los check de Exception son para errores que ya sabes que pueden 
        pasar y se capturan con su respectivo try/catch al igual que se debe de
        hacer try/catch para obtener el error
        */
        if(denominador == 0){
            throw new OperacionExcepcion("Division entre cero");
        }
        return numerador/denominador;
    }
    
}
