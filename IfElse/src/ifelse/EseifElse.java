/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelse;

/**
 *
 * @author Libuseng
 */
public class EseifElse {

    public static void main(String[] args) {
        int month = 12;
        if (month == 12 || month == 3) {
            System.out.print(" february its  my birthday month");
        } else if (month == 4 && month == 8) {
            System.out.print("im really not sure");
        } else {
            System.out.println(" february its not my birthday");
        }
        System.out.println(" "+  month);

    }
}


