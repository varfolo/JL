/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iter;

import java.util.*;
/**
 *
 * @author galaxy
 */
public class Iter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> arList = new ArrayList<String>();
        
        arList.add("Россия");
        arList.add("Германия");
        arList.add("Франция");
        arList.add("Италия");
        
//        Iterator<String> iter = arList.iterator();   
//        while (iter.hasNext()){
//            System.out.println(iter.hasNext());
//            System.out.println(iter.next());
//        }
        ListIterator<String> lstIt = arList.listIterator();
        while (lstIt.hasNext()){
            System.out.println(lstIt.nextIndex());
            if ("Франция".equals(lstIt.next())){
                lstIt.add("Колумбия");
            }
        }
           
        System.out.println("//////////////////////////////////////////////");
        while (lstIt.hasPrevious()){
            System.out.println(lstIt.previous());
        }
    }

            
    
}
