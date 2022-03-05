
package algorithms;
import java. util.Arrays; 

public class Algorithms {
    int index=5;
    boolean s=true;
 int  name[]={2,10,40,49,50};
 
 public void arrayIndex(){
 for(int k=0; k<name.length;k++ ){
      if(index<=k & index>=k){
         
      // System.out.println(name); 
         
      }
       Arrays.sort(name);
    System.out.println(name[k+1]);
}
 }
 
    public static void main(String[] args) {
     Algorithms ds=new Algorithms();
    //  Arrays.sort(ds.name);
     
     ds.arrayIndex();
      double age=Math.random();
     // System.out.println(age);
    }
    
}
