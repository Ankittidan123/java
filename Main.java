import java.util.*;

public class Main{
    
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8};
        int b[] = a.clone();
        int c[] = b.clone();

        int d[] = c.clone();
        
        a[2] = 98;
        a[4] = 56;
        for(int i=0; i<d.length; i++){
            
            System.out.print(d[i]+" ");
        }
    }
}
