
package laboratorio.caja;

public class LaboratorioCajaMain {

    public static void main(String[] args) {
        Caja caja = new Caja(3,2,6);//ancho,alto,profundo
        System.out.println("El volumen de la caja es: "+caja.volumenCaja());
    }
    
}
