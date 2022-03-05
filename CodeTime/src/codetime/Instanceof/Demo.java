/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codetime.Instanceof;

/**
 *
 * @author Libuseng
 */
public class Demo extends Bubu {
    static int age;
    static {
        try{
        age=10/0;
        }catch(ArithmeticException e){
            age=3;
        }
        
    }
  
    public static void main(String[] args){
      Demo b=new Demo();
      System.out.println(age);
        
    }
        
    
}
