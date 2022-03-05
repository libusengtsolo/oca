/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etsviewer;

/**
 *
 * @author Libuseng
 */
public class Enhanced {
    public static void main(String [] args){
        int e;
        int results;
        for(int i=0;i<10;i++){
            results=1;
            e=i;
            while(e>0){
                results *=2;
                e--;
               // System.out.println(i);
                System.out.println(e);
            }
        }
    }
    
}
