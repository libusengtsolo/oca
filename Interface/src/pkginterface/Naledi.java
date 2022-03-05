/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author Libuseng
 */
public class Naledi implements Libuseng {
        
    public void name(String name) {
        System.out.println("libuseng");
    }

    public void age(int age) {
        System.out.println(22);

    }
    final static float hieght = 12.4f;

    public static void main(String[] args) {
        Naledi s = new Naledi();
        s.name("libuseng");
        s.age(22);
        System.out.println(hieght);

    }

}
