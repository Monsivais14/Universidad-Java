
package paquete1;

class Clase1 {
    
    //al ser default solo es accesible del mismo paquete
    
    public String atributoPublico = "valor de atributo publico";
    
    protected String atributoProtected = "valor de atributo protected";
    
    Clase1(String string){
        System.out.println("Constructor publico");
    }
    
    protected Clase1(){
        System.out.println("Constructor protected");
    }
    
    public void metodoPublico(){
        System.out.println("Metodo publico");
    }
    
    protected void metodoProtected(){
        System.out.println("Metodo protected");
    }
    
}
