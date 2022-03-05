
public class LoopsAgain {
    public static void main(String[] args){
      A o1=new C();
      B o2=(B)o1;
      System.out.println(o2.ml());
      System.out.println(o2.ml());
    }
            
                

    class A{ int i=10;/*int ml()  {return i;}*/} 
 static    class B extends A{ int i=20; int ml( ){return i;}} 
  static class C extends B{ int i=30; int ml(){ return i;}}
                 
    }

