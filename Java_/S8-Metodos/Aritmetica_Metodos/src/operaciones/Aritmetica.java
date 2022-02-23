package operaciones;

public class Aritmetica {

    int a;
    int b;

    //modificador de acceso || retornara o no informacion || nombre || argumentos
    //el metodo al ser void no retorna ningun valor
    public void sumar() {//este metodo realiza una suma
        //cuerpo de metodo
        int resultado = this.a + this.b;//variable local de metodo resultado
        System.out.println("resultado = " + resultado);
    }

    //este metodo si retorna un valor 
    public int sumarRetorno() {
        int resultado = this.a + this.b; //variable local de metodo
        return resultado; //valor a retornar 
    }

    public int sumarConArgumentos(int a, int b) {//metodo que recibe argumentos
        this.a = a;//moidifica el valor a los atributos de la clase
        this.b = b;//this apunta a el atributo de la clase, y no solo eso sino a las variables y metodos de la clase actual
        //return a+b; //retorna directamente la suma
        return this.sumarRetorno(); //reutilizacion del metodo por la modificacion de los atributos modificados
    }

}
