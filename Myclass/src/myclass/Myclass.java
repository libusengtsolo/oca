
package myclass;
class Fisrtclass{
    public static void speak() throws Exception{
    System.out.println("one") ;   
    }
}

public class Myclass extends Fisrtclass {
  /*  public static void speak() {
       System.out.println("second");
    }*/

    public static void main(String[] args) throws Exception {
     Fisrtclass ab=new Fisrtclass();
     ab.speak();
    }
    
}
