import java.util.*;

class A {
    
    int a;
    int b;
    A(int a, int b) {
        // this.a = a;
        // this.b = b; 
    }

    void method1(int a,int b) {
        this.a=a;
        this.b=b;
        int sum=a+b;
        System.out.println(sum);
    }
}

public class Main {

    public static void main(String[] args) {
        A k = new A(0, 0);
        k.method1(4, 6);
    }
}