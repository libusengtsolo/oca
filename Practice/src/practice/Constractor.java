package practice;

public class Constractor {
    String name="Libuseng";
    boolean s=Boolean.parseBoolean(name);
 
    public void talk(Constractor p){
         p=new Constractor();
        p.name="Bokang";
        System.out.println(p.name);
    }
    public void walk(Constractor p){
        p.name="Thlohonolofatso";
        System.out.println(p.name);
    }
    public static void main(String[] args) {
      Constractor p= new Constractor();
      p.talk(p);
      System.out.println(p.name);
      p.walk(p);
      System.out.println(p.name);
      
    }
    }


