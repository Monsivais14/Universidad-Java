package operaciones;

public class PruebaAritmetica {

    public static void main(String[] args) {

        Aritmetica aritmetica = new Aritmetica();//objeto de clase

        aritmetica.a = 10; //valor de atributos del objeto 
        aritmetica.b = 5;

        aritmetica.sumar(); //metodo void que imprimira la suma 

        int resultado = aritmetica.sumarRetorno(); //variable que guarda el resultado con retorno
        System.out.println("resultado = " + resultado);
        
        resultado = aritmetica.sumarConArgumentos(5,8);//metodo que envia parametros
        System.out.println("resultado = " + resultado);
    }
}
