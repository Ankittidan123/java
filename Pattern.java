// 1. Write a Program to print the right triangle star pattern.

// *
// **
// ***
// ****
// *****
package Pattern;

public class Pattern {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
