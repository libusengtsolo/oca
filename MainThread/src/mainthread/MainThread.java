/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainthread;

/**
 *
 * @author Libuseng
 */
public class MainThread {
    
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Thread s = Thread.currentThread();
        System.out.println(s.getName());
        
        s.setName("my thread");
        
        System.out.println(s.getName());
        
        s.setPriority(Thread.MIN_PRIORITY);
          
        System.out.println(s.getPriority());
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
            }
                Thread.sleep(1000);
        } catch (SecurityException e) {
            System.out.println("SecurityExceptions");
        }
    }
}
