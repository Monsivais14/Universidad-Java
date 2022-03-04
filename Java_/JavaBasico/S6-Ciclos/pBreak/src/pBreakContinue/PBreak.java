package pBreakContinue;

public class PBreak {

    public static void main(String[] args) {

        for (int contador = 0; contador <= 10; contador++) {

            if (contador % 2 == 0) {
                System.out.println("contador = " + contador);
                break;//rompe el ciclo que se esta ejecutando
            }

            for (int contador2 = 0; contador2 <= 10; contador2++) {

                if (contador2 % 2 == 0) {
                    continue;//deja de hacer lo que esta haciendo y salta a la siguiente iteracion
                }
                System.out.println("contador2 = " + contador2);
            }

        }
    }
}
