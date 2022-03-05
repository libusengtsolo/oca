/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author Libuseng
 */
public class Dog extends Animal {
    
    public void setBreed(String breed){
        this.breed = breed;
    }
    
    public void bucks(){
        
    }
    
    public int add(int i, int j){
        return i + j;
    }
    
    public static void main(String[] args) {
        Dog animal = new Dog();
        int add = animal.add(2,3);
        
        System.out.println(add);
    }
}
