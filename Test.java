import java.util.*;
 
public class Test {
    public static void main(String[] args)
    {
        for (int i=1; i<=6; i++) {
            for(int s=5;s>=i;s--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if((j)%2==0){
                    System.out.print("0");
                }
                else{
                    System.out.print("1");
                }
            }
            System.out.println();
                }
    }
}