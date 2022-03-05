    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codetime;


public class CodeTime {
       
    public static void main(String[] args) {
       String[][]ab=new String[2][];
       ab[0]=new String[2];
       ab[1]=new String[5];
       int i=97;
       for(int a=0;a< ab.length;a++){
           for(int b=0;b<ab.length;b++){
               ab[a][b]="*"+i;
               i++;
               System.out.println(ab[a][b]);
               
           }
           for(String []c:ab){
               for(String h:c){
                   //System.out.print(h);
               }
              // System.out.println();
                       
           }
           
       
           }
       }
         
    
    
}
