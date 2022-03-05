
public class Striing {
    public static void stringbuildera(StringBuilder s){
     s.append('c');
    }
    public static void Strieng(String b ){
        b=b.replace('j','l');
        System.out.println(b);
    }
    public static void main(String[] args){
    String kj=new String("java");
    StringBuilder sb=new StringBuilder("java");
    stringbuildera(sb);
    Strieng(kj);
    System.out.println(kj+sb);
    
    }
            
    
}
