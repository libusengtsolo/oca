
package Exception;
import java.lang.RuntimeException;



public class Exception {
    
    public String name;
    public static  void main(String[] args){
        Exception bg=new Exception();
       // System.out.print("1");
        try{
          //  System.out.print("2");
           bg. name.toString();
         //   System.out.print("3");
        }catch(NullPointerException e ){
            System.out.print(e);
            throw e;
        }
    }
    

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
