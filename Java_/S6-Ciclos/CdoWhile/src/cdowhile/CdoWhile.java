package cdowhile;

public class CdoWhile {

    public static void main(String[] args) {

        /*
        Primero ejecuta el codigo y despues determina si la condicion es 
        verdadera o falsa pero de igual manera ya se ejecuto minimo
        una vez sin importar el true o false
         */
        var contador = 0;

        do {

            System.out.println("contador = " + contador);
            contador++;

        } while (contador < 0);//aunqoe es false de todas maneras se imprime por do

    }

}