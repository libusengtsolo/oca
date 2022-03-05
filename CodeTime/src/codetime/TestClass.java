/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codetime;


public class TestClass extends CodeTime {
    
    TestClass(int age){
        super("he",34.67);
        
    }
    public static void main(String[] args){
       TestClass t = new TestClass(34);
       
       
       
        System.out.println(t);
    }
    
}
