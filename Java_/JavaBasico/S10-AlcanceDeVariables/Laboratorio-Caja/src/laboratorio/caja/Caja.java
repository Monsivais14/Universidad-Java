
package laboratorio.caja;

public class Caja {
    
    //atributos
    private float ancho;
    private float alto;
    private float profundo;
    
    //constructor
    public Caja(float ancho, float alto, float profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo =  profundo;
    }
    
    public Caja(){
        //constructor vacio (sin inicializacion)
        System.out.println("Caja sin atributos inicializados...");
    }
    
    //metodo de volumen de caja
    public float volumenCaja(){
        return this.getProfundo()*this.getAncho()*this.getAlto();
    }

    //getters and setters
    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getProfundo() {
        return profundo;
    }

    public void setProfundo(float profundo) {
        this.profundo = profundo;
    }  
    
}