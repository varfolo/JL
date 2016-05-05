/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lnkdlst;
import java.util.*;

/**
 *
 * @author galaxy
 */
public class LnkdLst {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Person> personList = new LinkedList();
        
        personList.add(new Person("Саша"));
        personList.add(new Person("Маша"));
        personList.add(new Person("Даша"));
        personList.add(new Person("Вера"));
        
        personList.addFirst(new Person("Валера"));
        personList.addLast(new Person("Жозефина"));
        Person p = new Person("Валера");
        System.out.println();
        
        
        for (Person pp: personList){
            System.out.println(pp.getName());
        }
    }
    
}
