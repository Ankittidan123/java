import java.util.*;

abstract class A{
    abstract int show1();
    int  show2(int a,int b){
       
       int c=a*b;
       System.out.println("multi :"+c);
       return c;
    }
}
class B extends A{

    int show1(){
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=a+b;
        System.out.println("addtion :"+c);
        return c;
    }
    int show3(int d,int f){
        
       int e=d-f;
       System.out.println("sub :"+e);
       return e;
    }
    void show4(){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=a/b;
        System.out.println("div"+c);

    }
}
public class Test {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
       
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int f=sc.nextInt();

     B k=new B();
     k.show1();
     k.show2(a, b);
     k.show3(d, f);
     k.show4();
                }
    }
