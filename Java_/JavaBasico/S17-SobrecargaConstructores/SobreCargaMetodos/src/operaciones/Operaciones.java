
package operaciones;

public class Operaciones {
    
    /*
    Es similar que con las clases pero la diferencia la hace la cantidad de 
    argumentos como en los constructores 
    
    la idea es que aunque se llamen igual tengan algo que lo cambie o diferencie 
    de el otro metodo, asi como un parametro double y un int
    
    (int , int)
    (int , double)
    (double, int)
    (double , double)
    
    aunque se llamen igual lo que cambia es el tipo de parametros solicitados 
    */
    public static int sumar(int a, int b, int c,int d){
        return a+b+c+d;
    }
    
    public static int sumar(int a,int b,int c){
        return a+b+c;
    }
    
    public static int sumar(int a, int b){
        return a+b;
    }
    
}
