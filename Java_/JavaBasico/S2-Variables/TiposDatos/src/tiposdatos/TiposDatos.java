package tiposdatos;

public class TiposDatos {

    public static void main(String[] args) {
        //tipo de variable || identificador || valor o contenido
        int variableEntera = 10;
        System.out.println(variableEntera);

        variableEntera = 5;
        System.out.println(variableEntera);

        String as = "Cadena";
        System.out.println(as);

        as = "Cadena2";
        System.out.println(as);

        //(Apartir de Java 10)
        //existe el var - Inferencia de tipos en Java
        var variableEntera2 = 10;
        System.out.println(variableEntera2);
        
        var variableCadena2 = "Cadena Var";
        System.out.println("variableCadena2 = " +variableCadena2);//concatenacion
        
        //nombres de variables permitidos
        var variable=1;
        var _variable=2;
        var $variable=3;
        //no se recomienda utilizar acentos o caracteres especiales no permitidos como # al iniciar el nombre de una variable
        
    }
}