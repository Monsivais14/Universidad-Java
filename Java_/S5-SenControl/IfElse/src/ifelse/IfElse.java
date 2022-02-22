
package ifelse;

public class IfElse {
    
    public static void main(String[] args) {
        
        /*
        else-if se rige por una condicion
        */
        
        var condicion = true;
        
        if(condicion==true){//si condicion es true, aunque no es necesario '=='
            //por que la secuencia if inicia con true
            System.out.println("Condicion verdadera");
        }else{//sino
            System.out.println("Condicion falsa");
        }
        
        var numero = 2;
        var numeroTexto = "Numero desconocido";
        
        if(numero == 1){//si es  numero 1
            numeroTexto = "Numero uno";
        }else if(numero == 2){//sino
            numeroTexto = "Numero dos";
        }else if(numero == 3){//sino
            numeroTexto = "Numero tres";
        }else if(numero == 4){
            numeroTexto = "Numero cuatro";
        }else{//si nunguna fue verdadera
            numeroTexto = "Numero no encontrado";
        }
        
        System.out.println("numeroTexto = " + numeroTexto);
        
    }
    
}
