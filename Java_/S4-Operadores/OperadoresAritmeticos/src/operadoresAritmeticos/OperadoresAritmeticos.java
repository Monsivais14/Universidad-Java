package operadoresAritmeticos;

public class OperadoresAritmeticos {

    public static void main(String[] args) {

        int a = 6, b = 2;
        var resultado = a + b;//al ser dos tipos enteros no se realiza una concatenacion sino una suma
        System.out.println("resultado suma = " + resultado);

        resultado = a - b;//al igual que la suma la retsa funciona igual
        System.out.println("resultado resta = " + resultado);

        resultado = a * b;//la multiplicacion
        System.out.println("resultado multiplicacion = " + resultado);

        var resultado2 = (double) a / b; //al utilizar tipo flotante el var cambia automaticamente a flotante
        System.out.println("resultado division = " + resultado2);

        resultado = a % b; //el modulo asigna el residuo de una division
        System.out.println("resultado = " + resultado);

        if (a % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }

    }

}
