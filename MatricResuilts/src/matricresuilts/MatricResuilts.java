/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matricresuilts;

/**
 *
 * @author Libuseng
 */
public class MatricResuilts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mark = 79;
        String level;

        if (mark == 56 || mark == 45) {
            level = "6";
        } else if (mark == 43 || mark == 79) {
            level = "5";
        } else if (mark == 34 || mark == 26) {
            level = "4";
        } else if (mark == 14 || mark == 57) {
            level = "3";
        } else {
            level = ("no match");
        }

        System.out.println("mark is" +""+ level);

    }
}


