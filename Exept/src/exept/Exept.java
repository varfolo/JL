/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exept;

/**
 *
 * @author galaxy
 */
public class Exept {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


        try {
            float rez = Sum.sumActive(10, 3);
            System.out.println(rez);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
