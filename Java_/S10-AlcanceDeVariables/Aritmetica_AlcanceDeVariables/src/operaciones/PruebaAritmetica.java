package operaciones;

public class PruebaAritmetica {

    /*
    Una variable local se almacena dentro de una mamoria Stack 
    mientras un objeto se almacenan en memoria heap siendo referenciados por
    la variable stack apuntando a el objeto en memoria heap
     */
    public static void main(String[] args) {

        //variables locales
        int a = 10;
        int b = 5;//una variable local solo se puede utilziar dentro del metodo o clase donde se definio

        metodo();//como el metodo main es static solo puede llamar a otros metodos static

        Aritmetica aritmetica = new Aritmetica();
        System.out.println("arimetica a: " + aritmetica.a);//si el constructor esta vacio su valor default al ser int es 0
        System.out.println("arimetica b: " + aritmetica.b);//pero si es constructor necesita parametros y los inicializa 
        //el valor de su atributo cambia
        
        Aritmetica aritmetica1 = new Aritmetica(a, b);
        System.out.println("arimetica a: " + aritmetica1.a);//objeto aritmetica con constructor
        System.out.println("arimetica b: " + aritmetica1.b);//y atributos inicializados pasados como parametros en constructor

        //aritmetica = null;
        //System.gc();//recolector de basura (objetos no referenciados por ninguna variable)
        
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

    public static void metodo() {
        System.out.println("otro metodo"); //la variable 'a' es local del metodo main asi que no se puede utilizar
    }

}
