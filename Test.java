import java.util.*;
final class A{
    final int a = 2;
    void setA(int b){
        b=a;
    }
    int getA(){
        return a;
    }
    int show(){
        System.out.println("Hello this is a "+a);
        return a;
    }
}

public class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int a = sc.nextInt();
        A k = new A();
        k.show();
        k.setA(a);
    }
}