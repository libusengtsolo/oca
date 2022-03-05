/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moreaboutclass;

import animal.Dog;

/**
 *
 * @author Libuseng
 */
class Speed {

    int hour;
    int min;
    int sec;
}

public class MoreAboutClass {

    public static void main(String[] args) {
        // TODO code application logic here
        Speed myspeed = new Speed();

        myspeed.hour = 17;
        myspeed.min = 23;
        myspeed.sec = 49;

        int speed = myspeed.hour * myspeed.min * myspeed.sec;
        System.out.println("total = " + speed);

        Dog animal = new Dog();
        int add = animal.add(2, 3);
        System.out.println(add);

    }

}
