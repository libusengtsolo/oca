/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclasses;

public class Place {

    String b = "bokang";

    public Place(String a, String b) {
        this.b = b;
         

    }

    private int sum(int i, int c) {
        int sum = i * c;
        return sum;
    }

    public static void main(String[] args) {

        // TODO code application logic here
        Place r = new Place(12, "Libuseng");
        System.out.println(r.b);

    }
}
