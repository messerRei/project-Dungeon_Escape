/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saint
 */
public class randNumber {
    
    public static int gen(int a, int b)
    {
        int c = a+(int)(Math.random()*b);
        return c;
    }
    
}
