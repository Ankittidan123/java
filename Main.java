import java.util.*;
//abstract class and abstract method : 

abstract class Mahindra {
    abstract void logo(); 
   abstract void mirror();
   abstract void ac();
    abstract void airbag();
}



abstract class Thar extends Mahindra {
    void method(){
        System.out.println("1st car");
    }
    void logo() {
        System.out.println("attractive");
    }
    void mirror(){
        System.out.println("2 mirror");
    }
    void ac(){
        System.out.println("high ac");
    }
    void airbag(){
        System.out.println("4 airbags");
    }

}
abstract class Honda extends Thar {
    void method1(){
        System.out.println("2st car");
    }
    void method(){
        System.out.println("1st car");
    }
    void logo() {
        System.out.println("attractive");
    }
    void mirror(){
        System.out.println("2 mirror");
    }
    void ac(){
        System.out.println("high ac");
    }
    void airbag(){
        System.out.println("4 airbags");
    }


}
abstract class Hero extends Honda{
    void method2(){
        System.out.println("3rd car");
    }
    void method1(){
        System.out.println("2st car");
    }
    void method(){
        System.out.println("1st car");
    }
    void logo() {
        System.out.println("attractive");
    }
    void mirror(){
        System.out.println("2 mirror");
    }
    void ac(){
        System.out.println("high ac");
    }
    void airbag(){
        System.out.println("4 airbags");
    }



}

public class Main extends  Hero {
    public static void main(String[] args) {
    
        Main t = new Main();
        t.logo();
        t.mirror();
        t.ac();
        t.airbag();
        t.method();
        t.method1();
        t.method2();
    }
}
