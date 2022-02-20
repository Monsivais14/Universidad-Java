package operadoresIgualdadRelacionales;

public class AsignacionIgualdadRelacioneales {

    public static void main(String[] args) {

        /*
        Operadores de Igualdad
         */
        var a = 3;
        var b = 2;

        //== determina si dos elementos son iguales
        var c = (a == b);//retorna un boolean 
        System.out.println("c = " + c);

        //!= diferente a 
        var d = a != b;//a es diferente a b y retorna boolean
        System.out.println("d = " + d);

        var cadena = "Hello";
        var cadena2 = "Bye";
        var e = cadena == cadena2;//compara la referencia de la memoria del objeto
        System.out.println("e = " + e);

        var f = cadena.equals(cadena2);//si una cadena es igual al otra pero en contenido
        System.out.println("f = " + f);

        /*
        Operadores Relacionales
         */
        var g = a > b;//si a es mayor a b
        System.out.println("g = " + g);// mayor >
        g = a >= b;//es mayor o igual
        System.out.println("g = " + g);

        if (a % 2 == 0) {//if utiliza boolean para hacer sus condicionales
            System.out.println("Es numero par");
        } else {
            System.out.println("Es numero impar");
        }

        var edad = 10;
        var adulto = 18;

        if (edad >= adulto) {
            System.out.println("Es un adulto");
        } else {
            System.out.println("Es un menor de edad");
        }
        
    }
}