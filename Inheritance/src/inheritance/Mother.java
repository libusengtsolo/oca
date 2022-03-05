/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;
import java.util.Arrays;

public class Mother {
    String HairColor ="Black";
     float height =5.6f;
    String HairType="Curly";
    
    static int age=3;
    
    public String Sing(){
        return "Singing";
    }
    
    public int Sum(int x , int y){
      int  Sum = x + y ;
        return Sum;
    }
    public static void main(String[]args){
     //   Mother m =new Mother();
       m.Sum(23, 34);
       
      System.out.println(age);
    }
}
