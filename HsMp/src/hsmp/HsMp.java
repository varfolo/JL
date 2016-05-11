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
        //Коллекция HasMap
        Map<Integer, String> colHasMap = new HashMap();
        colHasMap.put(1, "Германия");
        colHasMap.put(43, "Россия");
        colHasMap.put(5, "Франция");
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
        
        System.out.println("-------------------------------------------------------");
        //Коллекция TreeMap
        TreeMap<Integer, String> tM = new TreeMap<Integer, String>();
        tM.put(90, "А вот и 90");
        tM.put(3, "А вот и 3");
        tM.put(1, "А вот и 1");
        tM.put(70, "А вот и 70");
        
        for (Map.Entry<Integer, String> item: tM.entrySet()){
            System.out.println(item.getValue());
        }
    }
   
}
