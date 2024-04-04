import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size :");
        int size = sc.nextInt();
        int a[] = new int[size];
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        int count=0;
        int sum=0;
        System.out.println("enter the target :");
        int d=sc.nextInt();
        
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" \n");
            count++;
            sum=sum+a[i];
            }
            for(int i =0; i<a.length;i++){
                if(a[i]==d){
                    
                    break;
                }
            }
            
        }
        System.out.println("present");
        System.out.println(" the sum of array :"+sum);
       
        System.out.println("count :"+count);
    }
