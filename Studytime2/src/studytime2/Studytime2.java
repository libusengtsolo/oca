
package studytime2;

public class Studytime2 {
private int j;
void showJ(){
    while(j<=5){
        for(int j=1;j<=5;j++){
            System.out.println(j+"");
            j++;
        }
        j++;
    }
}
    public static void main(String[] args) {
        new Studytime2().showJ();
    }
    
}
