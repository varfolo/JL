/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massive;

import java.util.*;
/**
 *
 * @author galaxy
 */
public class Massive {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] mas = new String[]{ "ssss","aaaa","sfff","dsg","ddsds"};
        char[] chr = "For the following".toCharArray();
//        for(char elem: chr){
//            System.out.println(elem);
//        }
//        System.out.println();
//        for (String m: mas){
//           int i=0;
//            System.out.println(m);
//
//        }
        
        LinkedList<String> lL = new LinkedList<String>();
        lL.addAll(Arrays.asList(mas));
        System.out.println(lL.get(3));
        
        System.out.println("--------------------------------------------");
        ListIterator iL = lL.listIterator();
        while (iL.hasNext()){
            System.out.println(iL.next());
        }
    }
    
}
