
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Libuseng
 */
public abstract class varieble {
    String name;
    String days;
    String hours;
    
    public static void main(String[] args) {
       
        LocalDate d = dateOfBirth();
        
        System.out.println(d.get);
        
    }
//    
//    public static String toUpperCase(String name){
//        return name.toUpperCase();
//    }
//    
//    public static String replace(String str, char st1,char st2){
//        return str.replace(st1, st2);
//    }
//    
//    public static int sumOfTwoNumbers(int x, int y){
//        return x + y;
//    }
//    
    public static LocalDate dateOfBirth(){
       return LocalDate.now().minusDays(8037);
    }
        
    
}
