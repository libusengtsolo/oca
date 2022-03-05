/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moeketsi;

/**
 *
 * @author Libuseng
 */
public class Moeketsi {

    double width;
    double height;
    double base;
}

class keke {

    public static void main(String[] args) {
        // TODO code application logic here
        Moeketsi mymoeketsi1 = new Moeketsi();
        Moeketsi mymoeketsi2 = new Moeketsi();
        double vol;

        mymoeketsi1.width = 23;
        mymoeketsi1.height = 34;
        mymoeketsi1.base = 12;

        mymoeketsi2.width = 78;
        mymoeketsi2.height = 90;
        mymoeketsi2.base = 56;

        vol = mymoeketsi1.width * mymoeketsi1.height * mymoeketsi1.base;
                System.out.println("volume is "+ vol);

        vol = mymoeketsi2.width * mymoeketsi2.height * mymoeketsi2.base;
                        System.out.println("volume is "+ vol);
                        

                
                

    }

}
