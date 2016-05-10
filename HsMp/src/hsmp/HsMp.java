/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hsmp;

import java.util.*;
/**
 *
 * @author galaxy
 */
public class HsMp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<Integer, String> colHasMap = new HashMap();
        colHasMap.put(1, "Германия");
        colHasMap.put(2, "Россия");
        colHasMap.put(3, "Франция");
        colHasMap.put(4, "Италия");
        
        // Получение первого элемента
        System.out.println(colHasMap.get(1));
        
        // Получение всего набора ключей
        Set<Integer> keys = colHasMap.keySet();
        System.out.println(keys);
        
        // Получение всего набора значений
        Collection<String> values = colHasMap.values();
        System.out.println(values);
        
        // Получение объекта коллекции по ключу        
        System.out.println(colHasMap.get(3));
        
        for (Map.Entry<Integer, String> item: colHasMap.entrySet()){
            System.out.println(item.getValue());
        }
    }
   
}
