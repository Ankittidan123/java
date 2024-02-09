import java.util.*;

public class Mnc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for car");
        int num = sc.nextInt();
        if(num>=1000 && num<=9999){
            int rem;
            int sum = 0;
            while(num>0){
                rem = num%10;
                sum = sum+rem;
                num = num/10;
            }
            if(sum%3==0 || sum%5==0 || sum%7==0){
                System.out.println("This is lucky number");
            }
            else{
                System.out.println("This is not lucky number");
            }
        }
        else{
            System.out.println("Not vaild input");
        }
    }
}