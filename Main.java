import java.util.*;
 
public class Main {
    public static void main(String[] args)
    {
       int a=1;
       for(int i=4; i>=1; i--){
        for(int j=1; j<=4; j++){
            System.out.print(a++);
        }
        System.out.println();
       }
    }
}