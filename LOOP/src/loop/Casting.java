
package loop;

public class Casting {
    
    int time;
    public void hello(){
     System.out.println("first");
    }
    static class A extends Casting{
      public  void hello(){
          System.out.println('d');
           
      }  
    }
    static class B{
    public static void main(String[] ergs){
     Casting b=new A();
        double a=214748364789.0d;
        int c=(int)a;
     }   
    }
    
}
}