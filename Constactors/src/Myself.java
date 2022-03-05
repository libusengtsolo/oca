/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constactors;

/**
 *
 * @author Libuseng
 */
public class Myself extends Constactors {

    String a = "Libuseng";
    float b = 32.5f;

    public Myself(String first, String second, int third, float forth) {
        super(first, second, third, forth);
    }

    public static String introduction(String a, float b) {
        this.a = a;
        this.b = b;

        return "myself";
    }

    public static void main(String[] args) {
        Myself c = new Myself("Libuseng", "Tsolo", 12, 12.3f);
        System.out.print(c.b);
        
    }

}
