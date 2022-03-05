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
public class CalculateArea {
    
    public static void main(String[] args) {
        Shape shape = new Circle(10);
        System.out.println(shape.area());
    }
}
