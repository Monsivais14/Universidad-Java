
package paquete1;

public class ClaseHija extends Clase1{
    
    public ClaseHija(){
        
        super();//constructor protegido desde una clase 
        
        System.out.println(this.atributoProtected);
        this.metodoProtected();
        
    }
    
}
