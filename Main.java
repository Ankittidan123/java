import java.util.Scanner;
class A{
    void show(int a,int b){
        int c = a+b;
        System.out.println(c);
    }
    void show(float a,int b){
        float c = a-b;
        System.out.println(c);
    }
    void show(long a,int b){
        long c = a/b;
        System.out.println(c);
    }
    void show(short a,int b){
        int c = a*b;
        System.out.println(c);
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println("Enter the number");
        int b = sc.nextInt();
        A k2 = new A();
        k2.show(a, b);
        System.out.println("Enter the number");
        float c = sc.nextInt();
        System.out.println("Enter the number");
        int d = sc.nextInt();
        k2.show(c, d);
        System.out.println("Enter the number");
        long e = sc.nextInt();
        System.out.println("Enter the number");
        int f = sc.nextInt();
        k2.show(e,f);
    }
}