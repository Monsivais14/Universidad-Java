package operaciones;

public class PruebaAritmetica {

    public static void main(String[] args) {

        Aritmetica aritmetica = new Aritmetica();
        System.out.println("arimetica a: "+aritmetica.a);//si el constructor esta vacio su valor default al ser int es 0
        System.out.println("arimetica b: "+aritmetica.b);//pero si es constructor necesita parametros y los inicializa 
        //el valor de su atributo cambia
        
        Aritmetica aritmetica1 = new Aritmetica(5,5);
        System.out.println("arimetica a: "+aritmetica1.a);//objeto aritmetica con constructor
        System.out.println("arimetica b: "+aritmetica1.b);//y atributos inicializados pasados como parametros en constructor
                                                         
//        Aritmetica aritmetica = new Aritmetica();//objeto de clase
//
//        aritmetica.a = 10; //valor de atributos del objeto 
//        aritmetica.b = 5;
//
//        aritmetica.sumar(); //metodo void que imprimira la suma 
//
//        int resultado = aritmetica.sumarRetorno(); //variable que guarda el resultado con retorno
//        System.out.println("resultado = " + resultado);
//        
//        resultado = aritmetica.sumarConArgumentos(5,8);//metodo que envia parametros
//        System.out.println("resultado = " + resultado);
    }
}
