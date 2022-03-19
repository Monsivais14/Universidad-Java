
package domain;

public class Rectangulo extends FiguraGeometrica {

    public Rectangulo(String tipoFigura) {
        super(tipoFigura);
    }

    @Override //implementacion del metodo por primera vez
    public void dibujar() {
        System.out.println("Impresion de "+this.getClass().getSimpleName());
    }

}
