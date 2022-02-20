package otrosprimitivos;

public class OtrosPrimitivos {

    public static void main(String[] args) {

        //tipo booleano
        //un tipo booleano o bandera solo son true o false
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);

        if(varBoolean){ //si es verdadero
            System.out.println("La bandera es verdadera");
        }else {
            System.out.println("La bandera es falsa");
        }
        
        var edad = 34;
        //var esAdulto = edad >= 18; // es tipo booleano si es mayor o menor de edad
        
        if(edad >= 18){
            System.out.println("Eres mayor de edad");
        }else {
            System.out.println("Eres menor de edad");
        }
        
        System.out.println("///");
        
        //tipo char
        char tipoChar = 'a'; //puede almacenar solamente un caracter
        System.out.println("tipoChar = " + tipoChar);

        var varChar = '\u0040';
        System.out.println("varChar = " + varChar);

        var varCharDecimal = (char) 33;//al ser tipo entera la tomara como un numero entero int 
        System.out.println("varCharDecimal = " + varCharDecimal);

        var varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);

        int variableEnteraSimbolo = '!';// char es compatible con int 
        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);

        int letra = 'A';//compatibilidad entre numeros enteros y char
        System.out.println("letra = " + letra);

        System.out.println("///");
        
        
        
        //Debugear el proyecto para verificar el tipo de cada variable
        var numeroEntero = 10;
        System.out.println("numeroEntero = " + numeroEntero);

        var numeroDouble = 10.0;
        System.out.println("numeroDouble = " + numeroDouble);

        var numeroFloat = 10.0f;
        System.out.println("numeroFloat = " + numeroFloat);
    }
}
