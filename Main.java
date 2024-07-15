import java.util.Scanner;
class A{
    private int a;
    private int b;
    void setA(int a,int b){
        this.a = a;
        this.b = b;
    }
    int getA(){
        return a+b;
    }
    void show(int a,int b){
        this.a = a;
        this.b = b;
        System.out.println(a/b);
    }
}
class B{
    private int a;
    private int b;
    void setA(int a,int b){
        this.a = a;
        this.b = b;
    }
    int getA(){
        return a+b;
    }
    void show1(int a,int b){
        this.a = a;
        this.b = b;
        System.out.println(a*b);
    }
}
public class Main {
    private int a;
    private int b;
    void setA(int a, int b){
        this.a = a;
        this.b = b;
    }
    int getA(){
        return a-b;
    }
    void show2(int a,int b){
        this.a = a;
        this.b = b;
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value ");
        int a = sc.nextInt();
        System.out.println("Enter the value ");
        int b = sc.nextInt();
        Mnc k = new Mnc();
        k.setA(a, b);
        System.out.println("The sum is "+k.getA());
        k.show2(a, b);
        A k1 = new A();
        k1.setA(a, b);
        System.out.println(k1.getA());
        k1.show(a, b);
        B k2 = new B();
        k2.setA(a, b);
        System.out.println(k2.getA());
        k2.show1(a, b);
    }
}
 