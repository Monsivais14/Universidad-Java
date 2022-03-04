package contactenacioncadenas;

public class ContactenacionCadenas {

    public static void main(String[] args) {
        
        //cadenas
        var usuario = "Pedro";
        var titulo = "Ingeniero";

        //variable de concatenacion
        var concatenacion = titulo + " " + usuario;
        System.out.println("concatenacion = " + concatenacion);
        
        var i = 3;
        var j = 4;
        
        System.out.println(i+j+usuario);//al intantar concatenar numeros se realiza una suma de numeros
        
        System.out.println(usuario+i+j);//si primero encuentra una cadena todo lo demas lo determina como una cadena(contaxto cadena)
        
        System.out.println(usuario+(i+j));//al utilizar parentesis se realiza primero la operacion y depues la cadena para saltar el contexto cadena
    }

}
