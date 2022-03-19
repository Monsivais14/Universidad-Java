
package domain;

public class Escritor extends Empleado{
    
    final TipoEscritura tipoEscritura;
    
    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura){
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }
    
    public String getTipoEscritura(){
        return this.tipoEscritura.getDescripcion();
    }
    
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles()+", tipoEscritura : "+tipoEscritura.getDescripcion();
    }
    
}
