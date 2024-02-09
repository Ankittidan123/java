import java.util.*;
 
public class Main {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the four digit number :");
      int a=sc.nextInt();
      if(a%3==0 || a%5==0 || a%7==0){
        System.out.print("this is lucky number :"+a);
    }
    else{
        System.out.println("invalid number"+a);
    }
    }
}
