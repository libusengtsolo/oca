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
public class IfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String results;
        int score =10;
        if (score ==5) {
            results = "A";
        } else if ((score = score + 0) == 10) {
            results = "b";
        } else if ((score = score + 200) == 10) {
            results = "c";
        } else {
            results = "f";
        }
        System.out.println(results + ":" + score);
    }

}
