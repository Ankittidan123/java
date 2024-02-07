import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter area/vol");
        String al=sc.nextLine();
        if(al.equals("area")){
            System.out.println("enter the character");
            String alpha=sc.nextLine();
            if(alpha.equals("tringle")){
                System.out.println("enter the height");
                int h=sc.nextInt();
                System.out.println("enter the base");
                int b=sc.nextInt();
                System.out.println("the area of tringle is"+((b*h)/2));
            }
            else if(alpha.equals("square")){
                System.out.println("enter the side value");
                int l=sc.nextInt();
                System.out.println("the area of square is "+(b*b));
            }
            else if(alpha.equals("rectangle")){
                System.out.println("enter the length");
                int l=sc.nextInt();
                System.out.println("enter the width");
                int w=sc.nextInt();
                System.out.println("the area of rectangle is"+(l*w));
            }
        }
        else if(al.equals("volumn")){
            System.out.println("Enter the char");
            String alpha = sc.nextLine();
            if(alpha.equals("triangle")){
        System.out.println("enter the height");
        int h=sc.nextInt();
        System.out.println("enter the base");
        int b=sc.nextInt();
        System.out.println("the volume of tringle is"+((b*h)/2));
    }
    else if(alpha.equals("square")){
        System.out.println("enter the side value");
        int b=sc.nextInt();
        System.out.println("the volume of square is "+(b*b*b));
    }
    else if(alpha.equals("rectangle")){
        System.out.println("enter the length");
        int l=sc.nextInt();
        System.out.println("enter the width");
        int w=sc.nextInt();
        System.out.println("enter the breath");
        int b=sc.nextInt();
        System.out.println("the volume of rectangle is"+(l*w*b));
    }
}
    }
}