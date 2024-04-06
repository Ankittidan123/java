import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("eter the size :");
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<a.length;i++){
            System.out.println("enter the values :");
            a[i]=sc.nextInt();

        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
        for(int i=a.length/2;i<a.length;i++){
            if(a[i]%2==0){
                System.out.println(a[i]+" mid element is even");
            }
        }
    }
}