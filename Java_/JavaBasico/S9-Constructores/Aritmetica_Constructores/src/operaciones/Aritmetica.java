package operaciones;

public class Aritmetica {

    int a;
    int b;

    //constructor vacio
    public Aritmetica(){
        //vacio
        //funciona para crear objetos sin necesidad de pasar parametros
        //System.out.println("Ejecutando constructor vacio...");
        //System.out.println("a = " + a); //imprime el valor vacio del atributo de clase
    }
    
    //sobre carga de constructores
    //segundo constructor con argumentos para realizar una inicializacion de atributos
    public Aritmetica(int a,int b){
        this.a = a;//inicializacion de atributos
        this.b = b;
        System.out.println("Ejecutando constructor con argumentos...");
    }
    
    //modificador de acceso || retornara o no informacion || nombre || argumentos
    
    //el metodo al ser void no retorna ningun valor
    public void sumar() {//este metodo realiza una suma
        //cuerpo de metodo
        int resultado = a+b;//variable local de metodo resultado
        System.out.println("resultado = " + resultado);
    }
    
    //este metodo si retorna un valor 
    public int sumarRetorno(){
        int resultado = a + b; //variable local de metodo
        return resultado; //valor a retornar 
    }
    
    public int sumarConArgumentos(int arg1, int arg2){//metodo que recibe argumentos
        this.a = arg1;//moidifica el valor a los atributos de la clase
        this.b = arg2;//this apunta a el 
        //return a+b; //retorna directamente la suma
        return sumarRetorno(); //reutilizacion del metodo por la modificacion de los atributos modificados
    }
    
}