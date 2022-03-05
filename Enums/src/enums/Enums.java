/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

public class Enums {

    String VOL;
    int emp;

    public Enums() {
    }

    ; 
    public Enums(String colour, int wheels) {
        this.VOL = colour;
        this.emp = wheels;
    }

    public int getValue() {
        return emp;
    }

    enum car {
        BMW, POLO, KIA, JEEP,
    }

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        car sf = car.POLO;

        System.out.print(sf);

        if (sf == car.BMW) {
            System.out.println(sf);
        }

        for (car s : car.values());

        System.out.println();
        
        
        

        Enums obj1 = new Enums("polo", 4);
        Enums obj2 = new Enums("BMW", 3);
        System.out.println(car.KIA == car.JEEP);
        System.out.println(obj2.getValue());

    }

}
