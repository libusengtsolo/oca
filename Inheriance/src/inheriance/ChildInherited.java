
package inheriance;

class ChildInherited extends Inheriance {
    String surname;
    public ChildInherited(){
        super();
        
        
        this("tsolo");
        
    }
    public ChildInherited( String surname){
        this.surname=surname;
    }
   
 
 public static void main(String... tlhoni){
     Inheriance  sr=new ChildInherited();
        System.out.println(sr.istrue());
 }
}   

