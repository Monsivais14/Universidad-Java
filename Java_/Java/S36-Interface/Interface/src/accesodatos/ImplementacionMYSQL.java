
package accesodatos;

public class ImplementacionMYSQL implements IAccesoDatos{

    /*
    Clase que implementa el comportamiento abstracto de accesoDatos
    */
    
    //implementacion de metodos abstractos
    @Override
    public void insertar() {
        System.out.println("Insertar desde MYSQL");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde MYSQL");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde MYSQL");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde MYSQL");
    }
    
}
