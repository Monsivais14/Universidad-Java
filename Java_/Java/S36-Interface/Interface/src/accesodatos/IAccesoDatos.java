
package accesodatos;

public interface IAccesoDatos {
    
    /*
    Una interfaz es similar a una clase abstracta, todos sus metodos son 
    abstractos (se define mas no se implementa comportamiento del metodo) y 
    sus atributos son constantes y se implementa a una clase, esta mas 
    relacionada por relacion de comportamientos que a una herencia 
    para crear clases hijas.
    
    Tambien es posible crear variables(genericas) de interface mas no objetos
    */
    
    int MAX_REGISTROS = 10; //CONSTANTE
    
    //metodos abstracto definido mas no implementado
    void insertar(); 
    
    void listar();
    
    void actualizar();
    
    void eliminar();
    
}
