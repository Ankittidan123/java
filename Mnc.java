import java.util.Scanner;
class A{
    void show(int a,int b){
        int c = a+b;
        System.out.println(c);
    }
    void show(int a,int b){
        int c = a-b;
        System.out.println(c);
    }
    void show(int a,int b) {
        int c = a/b;
        System.out.println(c);
    }
    void show(int a,int b){
        int c = a*b;
        System.out.println(c);
    }
}
public class Mnc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println("Enter the number");
        int b = sc.nextInt();
        A k2 = new A();
        k2.show(a,b);
    }
}