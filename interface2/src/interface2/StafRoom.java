/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface2;

/**
 *
 * @author Libuseng
 */
public class StafRoom extends Teacher {

    public static String Office() {
        return "nameOftheoffice";

    }
    static String nameoftheteacher = "Moloi";

    public static void main(String[] args) {
        StafRoom m = new StafRoom();
        m.office();
        
        System.out.println();
        System.out.println(nameoftheteacher);
    }

}
