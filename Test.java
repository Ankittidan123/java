class A {
    // default constructor
    A() {
        this(34);
        System.out.println("default constructor ");
    }

    // constructor with int parameter
    A(int a) {
        this(3.5f);
        System.out.println("constructor with int: " + a);
    }

    // constructor with float parameter
    A(float b) {
        this('j');
        System.out.println("constructor with float: " + b);
    }

    // constructor with char parameter
    A(char c) {
        this("ankit");
        System.out.println("constructor with char: " + c);
    }

    // constructor with String parameter
    A(String name) {
        this((short) 32453);  // explicitly cast to short
        System.out.println("constructor with String: " + name);
    }

    // constructor with short parameter
    A(short d) {
        this(462378546L);  // use a long literal
        System.out.println("constructor with short: " + d);
    }

    // constructor with long parameter
    A(long e) {
        this(34.5);
        System.out.println("constructor with long: " + e);
    }

    // constructor with double parameter
    A(double f) {
        System.out.println("constructor with double: " + f);
    }
}

public class Main {
    public static void main(String[] args) {
        new A();
    }
}
