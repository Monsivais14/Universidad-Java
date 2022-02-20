package operadoresCondicionales;

public class Condicionales {
    
    public static void main(String[] args) {
        
        //condicional "and" &&
        var a = 11;
        var valorMinimo = -1;
        var valorMaximo = 10;
        
        var resultado = a >= 0 && a <= 10;// el && es para unir si ambas son iguales dara un true
        
        if(resultado){
            System.out.println("Dentro de rango");
        }else{
            System.out.println("Fuera de rango");
        }
        
        // condicional "or" ||
        var vacaciones = false;
        var diaDescanso = true;
        
        if(vacaciones||diaDescanso){
            System.out.println("Padre puede asistir a el juego");
        }else{
            System.out.println("El padre esta ocupado");
        }
        
    }   
}