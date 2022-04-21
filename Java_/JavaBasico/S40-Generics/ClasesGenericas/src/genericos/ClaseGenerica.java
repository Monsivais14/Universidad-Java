
package genericos;

public class ClaseGenerica <T>{
    
    /*
    Una clase generica dependiendo de su letra en los diamantes significa
    el paramrtro que recibira y la utilizacion que le dara; como en este caso que
    recibe un objeto y con el unico metodo imprime de que clase es ese objeto
    */
    
    T objeto; //T - tipo Generico de objeto
    
    public ClaseGenerica(T objeto){
        this.objeto = objeto;
    }
    
    public void obtenerTipo(){
        System.out.println("El tipo de T es:"+this.objeto.getClass().getSimpleName());
    }
    
}
