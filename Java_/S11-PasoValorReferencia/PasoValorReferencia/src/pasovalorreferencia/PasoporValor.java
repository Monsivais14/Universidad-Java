
package pasovalorreferencia;

public class PasoporValor {
    
    public static void main(String[] args) {
        
        int a = 10;
        System.out.println("a = " + a);
        
        //los tipos primitivos pasan una copia de su valor a los metodos
        cambioPorValor(a);//pasa como parametro una copia del valor 'a'
        System.out.println("a nuevo valor = " + a);
        //a siguie siendo 10 por que no se modifica, y args es 15 pero solamente 
        //fue una copia de a y no tienen referencia
    }
    
    //es static por que para usarlo en el main necesita ser static
    public static void cambioPorValor(int arg1){
        //al ser una copia del valor del parametro a no es posible cambiar el 
        // valor de la variable local int 'a'
        System.out.println("arg1 = " + arg1);
        arg1 = 15;
    }
    
}
