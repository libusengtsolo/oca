
package calling;

import java.util.Arrays;
public class Calling {
public int age;

    public static void main(String[] args) {
    String ac[]=new String[2];
    int x=0;
    String name="";
    for(String s:ac){
       s= ac[x].concat("elemets" );
        x++;
       // System.out.println(s);
    }
    for(x=0;x<ac.length;x++){
        System.out.println();
        
    }
    System.out.println(ac[x]);
    
    }
    
}
