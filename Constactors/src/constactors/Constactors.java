/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constactors;

/**
 *
 * @author Libuseng
 */
public class Constactors {

    
   String name;
   String surname;
   int age;
   float height;

    public Constactors(String first, String second,int third,float fourth) {
        this.name=first;
        this.surname=second;
        this.age=third;
        this.height=fourth;
    }
    public  void introduction( String a,String b){
        
    }
        
    


    public static void main(String[] args) {
        Constactors set = new Constactors("Libuseng","tsolo",22,12.3f);
       
        System.out.println(set.name);

    }

}
