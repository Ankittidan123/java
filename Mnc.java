import java.util.*;
 
public class Mnc{
  void swap(){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the value of a :");
  int a=sc.nextInt();
  System.out.println("enter the value of b:");
  int b=sc.nextInt();
  int c;
  c=a;
  a=b;
  b=c; 
  System.out.println("the swap value of a :"+a);
  System.out.println("the swap value of b :"+b); 
  }  
  void pallindrome(){
    
  }
  public static void main(String[] args) {
    Mnc k=new Mnc();
    k.swap();
  }
}
