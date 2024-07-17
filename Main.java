import java.util.*;
public class Main {
    public static void main(String[] args) {
        try {
            try{
                String name=null;
            
                System.out.println(name);
            }
            catch(NullPointerException ex){
                System.out.println("null handle");
            }
            try {
                int a = 9 / 0;
                System.out.println(a);
            } catch (ArithmeticException ex) {
                System.out.println("Arithmetic exception handle");
            }
            catch(NumberFormatException ex){
                System.out.println("number format exception");
            }
        } catch (Exception ex) {
            System.out.println("handle");
        }
    }
}