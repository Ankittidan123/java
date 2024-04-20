import java.util.*;
class A{
    Scanner sc=new Scanner(System.in);
       void getA(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String name = sc.next();
        System.out.println("empname ");
        String na=sc.nextLine();
        System.out.println("emf");
        String nam=sc.nextLine();
        System.out.println(" salary :");
        int a=sc.nextInt();

       }
       int setA(void getA){
    
    System.out.println(getA());
       return getA;
    }
public class Mnc{

    public static void main(String [] args)
    {
        Mnc k=new Mnc();
        k.setA();
      System.out.println(k.getA());
    }
}
}