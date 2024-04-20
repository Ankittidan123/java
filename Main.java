


class A{
    int c;

    A(int c){
        this.c=c;
        System.out.println(c);

    }

    int method1(){
        this.c=c;
        System.out.println("c value "+ c);
        return c;

    }
    
}
class B{
    int d;

    B(int d ){
        this.d=d;
        System.out.println(d);

    }

    int method2(int d ){
        this.d=d;
        System.out.println("Value is "+ d);
        return d;
    }
}
class C{
    int g;
    C(int g){
        this.g=g;
        System.out.println("value is " + g);

    }
    void method3(){
        this.g=g;
        System.out.println("value is "+g);
    }


}
class D{
    int j;
    D(int j){
        this.j = j;
        System.out.println(j);

    }

    int method4(){
        this.j=j;
        System.out.println("Value is "+j);
        return j;
    }
}
class E{
    int m;
    E(int m){
        this.m=m;
        System.out.println(m);
    }

    void method4(){
        this.m=m;
        System.out.println("Value of  "+m);
    }
}

public class Main {


    public static void main(String[] args) {

        int a=8;
        int b=9;
        int c = a+b;
        
        A aj = new A(c);
         aj.method1();
         int e = 5;
         int f = 4;
 
         int d= e-f;
 
         B bj= new B(d);
         bj.method2(d);
         int h = 6;
        int i = 4;

        int g = h*i;

        C cj = new C(g);
        cj.method3();
        int k = 6;
        int l = 2;

        int j = k/l;

        D dj = new D(j);
        dj.method4();
        int n= 25;
        int o = 5;

        int m = n%o;

        E ej = new E(m);
        ej.method4();
    }
}
