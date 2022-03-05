/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twodimensionarrays;

/**
 *
 * @author Libuseng
 */
public class TwoDimensionArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        int twoD[][] = {{2, 3, 4, 5, 1}, {6, 7, 8, 9, 10}, {34, 35, 36, 37, 38}, {41, 42, 43, 44, 45}};
//        System.out.println(twoD[3][4]);
        int i, j;
        for (i = 0; i < 10; i++) {
            
            for (j = 0; j <i ; j++) {
                j++;
                
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
