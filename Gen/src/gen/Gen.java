/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gen;

/**
 *
 * @author Libuseng
 */
public class Gen<T> {

    T ob;

    Gen(T o) {
        ob = o;
    }

    T getob() {
        return ob;
    }

    void showtype() {
        System.out.println("volumn is equals to" + "" + ob.getClass().getName());
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Gen<Integer> iob;
        iob = new Gen<>(22);
        String name = "";
        int age = 98;
        iob.showtype();
        int v = iob.getob();
        System.out.println("volumn is" + v);

    }

}
