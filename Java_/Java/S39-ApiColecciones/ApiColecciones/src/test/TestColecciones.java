
package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestColecciones {
    
    public static void main(String[] args) {
        
        List lista = new ArrayList();
        
        /*
        Una ArrayList es similar a una array pero con la diferencia de que 
        creece al agregar un nuevo objeto y su crecimiento no es definido
        ademas de que mantiene el orden en el que crece
        */
        
        lista.add("Lunes");
        lista.add("Martes");
        lista.add("Miercoles");
        lista.add("Jueves");
        lista.add("Viernes");
        lista.add("Sabado");
        lista.add("Domingo");
        
        imprimir(lista);
        
        /*
        Una coleccion Set tambien guarda objetos similar a un arrayList con
        la caracteristica de que no los guarda en orden y no es posible duplicar
        elementos, es mas recomendable para cuando se desea tener una lista
        no ordenada y con objetos unicos
        */
        
        Set set = new HashSet();
        
        set.add("Lunes");
        set.add("Martes");
        set.add("Miercoles");
        set.add("Jueves");
        set.add("Viernes");
        set.add("Sabado");
        set.add("Domingo");
        
        imprimir(set);
        
        /*
        Un HaspMap(Map) hereda completamente de la interface Map por lo tanto 
        hace una diferencia con Set y List que heredan el comportamiento de 
        la interface Collection y utiliza diferentes metodos
        */
        
        Map map = new HashMap();
        
        map.put("v1", "Lucas"); // llave ,  valor
        map.put("v2", "Pedro"); // llave , valor 
        map.put("v3", "Juan");
        
        String elemento = (String)map.get("v1");//se obtiene el valor con la llave
        System.out.println("elemento = " + elemento);
        
        imprimir(map.keySet());//un keySet no regresa un orden pero muestra las llaves
        
        imprimir(map.values());//imprime los valoes de cada llave
        
    }
    
    /*
    Imprime una lista usando como parametro collection que es la interface mas 
    generica para las listas en su jerarquia de interfaces
    */
    public static void imprimir(Collection collection){
        
        collection.forEach(element -> {
            System.out.println("element = " + element);
        });
        
        System.out.println("---------");
        
    }
    
}
