
package operadoresUniarios;

public class OperadoresUniarios {
   
    public static void main(String[] args) {
        
        var a = 3;
        var b = -a;//invierte el signo de la variable por asignar 
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        var c = true; //boolean
        var d = !c;//negacion invierte el tipo booleano (solo boolean)
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        //incremento
        //pre incremento, simbolo antes de la variable
        var e = 3; 
        var f = ++e;//primero se incrementa y depues se usa
        System.out.println("e = " + e);//ambas son 4
        System.out.println("f = " + f);
        
        //post incremento
        var g = 5;
        var h = g++;//primero se utiliza y depues se incrementa
        System.out.println("g = " + g);//se incrementa +1
        System.out.println("h = " + h);//se asigno el valor antes de incrementarse
        
        //el decremento es similar a las pasadas pero con decremento
        var i = 2;
        var j = --i;//primero se decrementa y despues se utiliza (pre)
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        var k = 4;
        var l = k--;
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        
    }
}
