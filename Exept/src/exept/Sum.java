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
public class Sum {
    public static float sumActive(int x, int y) throws Exception{
        if (y == 0) throw new Exception("Деление на ноль"); 
        float z = (float)x/y;
        return z;
    }
    
}
