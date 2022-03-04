package tipoprimitivo;

public class TipoPrimitivo {

    public static void main(String[] args) {

        //Existen 2 tipos de tipos primitivos
        // los que almacenan enteros y los que almacenan flotantes
        
        /*
        primitivos de tipo entero
        */
        //int es primitivo de tipo entero
        //tipo de variable || nombre de variable = valor
        byte a;
        short b;
        int c;
        long d;

        byte numeroByte = 10;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Valor minimo de byte = " + Byte.MIN_VALUE);
        System.out.println("Valor maximo de byte = " + Byte.MAX_VALUE);//se puede superar su limite permitido pero pierde precision 

        short numeroShort = 10;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor minimo de short = " + Short.MIN_VALUE);
        System.out.println("Valor maximo de short = " + Short.MAX_VALUE);
        
        int numeroInt = 10;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor minimo de int = " + Integer.MIN_VALUE);
        System.out.println("Valor maximo de int = " + Integer.MAX_VALUE);
        
        long numeroLong = 10L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Valor minimo de long = " + Long.MIN_VALUE);
        System.out.println("Valor maximo de long = " + Long.MAX_VALUE);
        
        /*
        Primitivos de tipo flotante
        */
        //float y double
        
        float numeroFloat = (float) Math.PI; 
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor minimo de float = "+Float.MIN_VALUE);
        System.out.println("Valor maximo de float = "+Float.MAX_EXPONENT);
        
        double numeroDouble = Math.PI;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor minimo de double = "+Double.MIN_VALUE);
        System.out.println("Valor maximo de double = "+Double.MAX_VALUE);
    }
}