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
public class Session1 {

    public static void main(String[] args) {
        a();
    }

    public static void a() {
        try {
            b();
        } catch (ArithmeticException canbeAnything) {
            System.out.println("Can handle it.");
        }
    }

    public static void b() {
        c();
    }

    public static void c() {
        d();
    }

    public static void d() {
        Object s1 = new Session1();
        System.out.println(s1.toString());
    }
    
    @Override
    public String toString(){
        return "I love java";
    }

}
