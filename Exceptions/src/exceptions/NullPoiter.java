/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Libuseng
 */
public class NullPoiter extends Exceptions {
    
    public static void main(String args[]) {
        try {
            int  i[] = {23};
          
            int array[] = new int[1];
            array[0] = 23;
            
            System.out.println(i.length);
        }catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
