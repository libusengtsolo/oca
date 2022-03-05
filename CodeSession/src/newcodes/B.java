/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newcodes;

/**
 *
 * @author Libuseng
 */
public class B extends A {
    public static void main(String[] args){
        int i = 2/0;
        try{
            System.out.println(i);
        }
catch (Exception e) {
System.out.println("RuntimeException ");
} 
/*catch (IndexOutOfBoundsException e) {
System.out.println("IndexOutOfBoundsException");
} 
/*catch (ArrayIndexOutOfBoundsException e) {
System.out.println("ArrayIndexOutOfBoundsException");
}*/
        
    }
}

