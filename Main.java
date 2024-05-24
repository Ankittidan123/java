public class Main {
    static double[] show(double a[]){
        return a;
    }
    static void display(double a[]){
        for(int  i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        
    }
    public static void main(String[] args){
        double a[]={1.1, 2.2, 3.3, 4.4, 5.5};
        double b[]=show(a);
        display(b);
    }
       
   }