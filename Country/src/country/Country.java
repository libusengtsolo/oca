/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package country;

/**
 *
 * @author Libuseng
 */
public class Country {

    float kilometers;
    double height;
    String name;
    String race;
    int numoflang;
    static String colour;
    static String car(){
        return colour="red";     
        
    }
    

    void province(String name, String race, int numoflang) {
        this.name = name;
        this.race = race;
        this.numoflang = numoflang;

    }
    

    public static void main(String[] args) {
        // TODO code application logic here
        Country southAfrica = new Country();
        southAfrica.kilometers = 12.3f;
        southAfrica.height = 17000.3;
        southAfrica.name = "south Africa";
        southAfrica.race = "sotho";
        southAfrica.numoflang = 11;
        System.out.println(southAfrica.name);

    }
}
