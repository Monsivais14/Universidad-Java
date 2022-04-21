
package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestColeccionesGenericas {
    
    public static void main(String[] args) {
        
        List<String> lista = new ArrayList<>();
        
        lista.add("Lunes");
        lista.add("Martes");
        lista.add("Miercoles");
        lista.add("Jueves");
        lista.add("Viernes");
        lista.add("Sabado");
        lista.add("Domingo");
        
        imprimir(lista);
        
        
        Set<String> set = new HashSet<>();
        
        set.add("Lunes");
        set.add("Martes");
        set.add("Miercoles");
        set.add("Jueves");
        set.add("Viernes");
        set.add("Sabado");
        set.add("Domingo");
        
        imprimir(set);
        
        
        Map<String,String> map = new HashMap<>();
        
        map.put("v1", "Lucas"); // llave ,  valor
        map.put("v2", "Pedro"); // llave , valor 
        map.put("v3", "Juan");
        
        String elemento = (String)map.get("v1");//se obtiene el valor con la llave
        System.out.println("elemento = " + elemento);
        
        imprimir(map.keySet());//un keySet no regresa un orden pero muestra las llaves
        
        imprimir(map.values());//imprime los valoes de cada llave
        
    }
    
    /*
    <String> define que solamente recibira como parametro las interfaces de 
    Collection que al ser generico es compatible con list,hashSet y map pero
    solamente puede recibir la lista si trabaja con Strings.
    
    tambien apoya al evitar un cast ya que como solamente recibe Strings 
    puede utilizar los metodos de un String sin realizar un cast antes
    */
    public static void imprimir(Collection<String> collection){
        
        collection.forEach(element -> {
            System.out.println("element = " + element);
        });
        
        System.out.println("---------");
        
    }
    
}
