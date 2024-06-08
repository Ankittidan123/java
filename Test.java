public class Test {
    public static void main(String[] args) {
          
        for(int i=1; i<=5; i++){
            for(int s=4; s>=i; s--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int s = 0; s < 5-3/2; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}