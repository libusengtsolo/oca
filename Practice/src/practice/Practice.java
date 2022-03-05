/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;

public class Practice {
    public double calculateArea() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name :");
        String name=sc.nextLine();
        
        System.out.print("Enter lenght :");
        double length= sc.nextDouble();
        
        System.out.print("Enter width :");
        double width = sc.nextDouble();
        
        double Area = length * width;
        
        if (Area > 18.5) {
            System.out.println("Area is" + Area + "level is" + 'D' + "score is" + 1);
        } else if (Area >= 25.0) {
            System.out.println("Area is" + Area + "level is" + 'C' + "score is" + 2);
        } else if (Area >= 29.9) {
            System.out.println("Area is" + Area + "score is" + 'B' + "score is" + 3);
        } else {
            System.out.println("area is" + Area + "score is" + 'A' + "score is" + 4);
        }
        return Area;
    }
      public static void main(String[] args) {
        Practice fs = new Practice();
         
        fs.calculateArea();
        

        

    }

}
