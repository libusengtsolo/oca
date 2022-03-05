
 
public class D extends C {
    int age;
         public void talk(){
             age++;
        System.out.println("my tlhoni");
     }
         public static void main(String[] args){
             B a=new B();
             B b=new D();
             a=(B)b;
             B c=(C)b;
            //  c=(C)d;
            //  System.out.println(c.talk());
             
             
         }
    
}
