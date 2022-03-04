package caractertesespeciales;

public class CaractertesEspeciales {

    public static void main(String[] args) {

        String nombre = "Carlos";

        System.out.println("Nueva linea: \n" + nombre);// '\n' es un salto de linea en impresion 
        System.out.println("Tabulador: \t " + nombre);// '\t' es un tabulador en una impresion
        System.out.println("Retoceso:  \b\b" + nombre);// elimina un caracter atras del \b asi como utilizar mas y eliminar mas caracteres
        System.out.println("Comilla simple: \'" + nombre + "\'");// se puede itilizar con el caracter especial o sin el(puede ser necesario)
        System.out.println("COmilla doble: \"" + nombre + "\"");// permite utilizar comilla doble sin intervenir en la concatenacion de comillas dobles

    }
}