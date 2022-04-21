package test;

import enumeraciones.Continentes;
import enumeraciones.Dias;

public class TestEnumeraciones {

    public static void main(String[] args) {

        //indicarDiaSemana(Dias.MARTES);
        
        System.out.println("Continente no.4: "+Continentes.AMERICA);
        System.out.println("Numero de paises en el continente no.4: "+Continentes.AMERICA.getPaises());
        
    }

    public static void indicarDiaSemana(Dias dias) {

        switch (dias) {
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto de la semana");
                break;
            case SABADO:
                System.out.println("Sexto de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo de la semana");
                break;
        }

    }

}
