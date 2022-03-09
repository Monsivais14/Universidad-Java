
package paquete2;

public class Clase1 {
   
    private static String atributoprivado = "este atributo es privado";
    private String atributoprivado2 = " es privado";
    
    private Clase1(String string){
        atributoprivado = string;
        System.out.println(atributoprivado+atributoprivado2);
    }
    
    public Clase1(){
        this(Clase1.atributoprivado);
    }
    
    public static String getAtributoprivado() {
        return atributoprivado;
    }

    public static void setAtributoprivado(String aAtributoprivado) {
        atributoprivado = aAtributoprivado;
    }
    
}
