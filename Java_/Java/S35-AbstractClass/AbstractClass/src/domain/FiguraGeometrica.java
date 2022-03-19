
package domain;

public abstract class FiguraGeometrica {
    
    /*
    una clase abstracta se caracteriza por tener al menos un metodo abstracto
    (no necesariamente debe de tener uno, tambien se puede usar como "proteccion"
    para que no se puedan crear objetos de la clase abstracta usada como padre)
    el cual no es definido y al heredar de esta clase debe de imprementarse 
    dentro de la clase hija y asi darle el primer uso, de lo contrario 
    tambien la clase hija debe de ser abstarcta para prolongar la implementacion
    del metodo abstracto.
    
    Tambien no se pueden crear objeto de la clase abtracta, solamente heredada
    y utilizando solamente todo desde sus hijas
    */
    
    protected String figuraGeometrica;
    
    //constructor
    protected FiguraGeometrica(String tipoFigura){
        this.figuraGeometrica = tipoFigura;
    }
    
    //metodo abstracto
    public abstract void dibujar();

    public String getFiguraGeometrica() {
        return figuraGeometrica;
    }

    public void setFiguraGeometrica(String figuraGeometrica) {
        this.figuraGeometrica = figuraGeometrica;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FiguraGeometrica{figuraGeometrica=").append(figuraGeometrica);
        sb.append('}');
        return sb.toString();
    }
    
}
