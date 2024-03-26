import java.util.*;
 
public class Test {
    public static void main(String[] args)
    {
       for(int i=0;i<=6;i++){
        int num=i%2==0?1:0;

       for(int j=0;j<=i;j++){
        System.out.print(" "+num);
        num = ( num+1 )%2;
       }
       System.out.println();

        }
    }
}

