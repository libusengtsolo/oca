
package tostring;


public class Tostring {
int age;
String name;
double num;
public Tostring(){
    this.age=new Integer(10);
    this.num=new Double(100);
            this.name=new String("thlonie");
}
    
    public  String toString(){
        System.out.println(name);
         System.out.println(age);
          System.out.println(num);
        return "";
    }
 
            
        
    
    public static void main(String[] args){
        Tostring sh=new Tostring();
        System.out.println(sh);
    }
    
}
