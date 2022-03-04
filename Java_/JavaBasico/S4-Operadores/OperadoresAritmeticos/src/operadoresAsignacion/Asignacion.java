
package operadoresAsignacion;

public class Asignacion {
    
    public static void main(String[] args) {
        
        int a=3,b=2;
        int c = a + 5 - b;
        System.out.println("c = " + c);
        
        a+=2;//a = a + 1; se incrementa en el valor asignado
        System.out.println("a = " + a);
        
        a-=2;
        System.out.println("a = " + a);
        
        a*=2;
        System.out.println("a = " + a);
        
        a/=2;
        System.out.println("a = " + a);
        
        a%=2;
        System.out.println("a = " + a);
        
    }
    
}