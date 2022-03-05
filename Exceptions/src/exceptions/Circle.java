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
public class Circle extends Shape {

    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        System.out.print("Area of circle with radiaus "+radius+" = ");
        return Math.pow(radius, 2) * Math.PI;
    }
}
