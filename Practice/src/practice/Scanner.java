/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author Libuseng
 */
public class Scanner {

    public static void main(String[] args) {
      int sj[][] = new int[2][3];
        for (int i = 0; i < sj.length; i++) {
            for (int j = 0; j < sj[i].length; j++) {
              
                sj[i][j]=i+j;
                System.out.println(j);
                
            }
        }
    }
    }


