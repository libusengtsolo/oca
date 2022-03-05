/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication58;


public class testclass {
    private char var;
    public static void main(String[] libu){
      char var1='a';
      char var2=var1;
      var2='e';
      testclass obj1=new testclass();
      testclass obj2=obj1;
      obj1.var='i';
      obj2.var='o';
      System.out.println(obj1.var +" " + obj2.var);
      
              
    }
    
}
