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
public class Exceptions {

    public static void main(String[] args) {
        // TODO code application logic here
        //int r=20/0;
        int s[] = {1, 2, 3, 4, 5};
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        try {

            int b = 60 / 0;
            System.out.println(b);
        } catch (ArithmeticException e ){
            
                
            System.out.println("divided by " + e); 

            

        }
    }
}