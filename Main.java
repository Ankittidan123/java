import java.util.*;
public class Main{
void add(int a, int b){
    int c=a+b;
    System.out.println("Sum of " + a+ " and " + b + " is: " +c);

}
void sub(int a, int b){
    int c=a-b;
    System.out.println("sub of " + a+ " and " + b + " is: " +c);
}
void div(int a,int b){
    int c=a/b;
    System.out.println("div of " + a+ " and " + b + " is: " +c);
}
void multi(int a,int b){
    int c=a*b;
    System.out.println("multi of " + a+ " and " + b + " is: " +c);
}
void mod(int a,int b){
    int c=a%b;
    System.out.println("mod of " + a+ " and " + b + " is: " +c);
}

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of a and b :");
    int a=sc.nextInt();
    int b=sc.nextInt();

    Main aj=new Main();
    aj.add(a, b);
    aj.sub(a, b);
    aj.div(a, b);
    aj.multi(a, b);
    aj.mod(a, b);
    
    
}

}