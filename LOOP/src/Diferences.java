
public class Diferences {
   int [][] a=new int[2][3];
    
      a[0][0] =12;
    int b[]={4,5,6};
    public int compute(int x,int y){
     return a[x]*b[y];   
    }
    public void loadmatrix(){
     for(int x=0;x<matrix.length;x++){
         for(int y=0;y<matrix[x].length;y++){
             
             System.out.println(matrix[x]);
         }
     }
    }
         public static void main(String[] args){
          Diferences dk=new Diferences();
          dk.loadmatrix();
          //System.out.println(dk.compute(2, 2));
         }
     }   
    
    

