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
public class Square extends Shape {

    int length;
    int width;

    public Square(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        System.out.print(String.format("Area of sqaure with length %d and widht %d = ",length,width));
        return length * width;
    }

}
