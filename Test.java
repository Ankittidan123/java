import java.util.*;
 
public class Test {
    public static void main(String[] args)
    {
        int rows = 5;
        int columns = 5;

        
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < columns; j++) {
                int num = i + (j * rows);
                System.out.print(num + " ");
            }
            System.out.println();
        }
        }
    }

