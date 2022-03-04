package operadorTernario;

public class Ternario {

    public static void main(String[] args) {

        //Ternario
        //si es true va despues de ? 
        //y si es false va despues de :
        String resultado = (3 > 2) ? "verdadero" : "falso";//tipo String
        System.out.println("resultado = " + resultado);
        
        var numero = 8;
        resultado = (numero%2==0) ? "Par" :"Impar";
        System.out.println("resultado = " + resultado);
    }
}