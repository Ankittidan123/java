public class SwapEvenOdd {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        // Print the original array
        System.out.println("Original array:");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Separate even and odd elements
        int[] even = new int[a.length];
        int[] odd = new int[a.length];
        int evenCount = 0;
        int oddCount = 0;
        
        for (int i : a) {
            if (i % 2 == 0) {
                even[evenCount++] = i;
            } else {
                odd[oddCount++] = i;
            }
        }
        
        // Merge even and odd elements back into the original array
        int index = 0;
        
        for (int i = 0; i < evenCount; i++) {
            a[index++] = even[i];
        }
        
        for (int i = 0; i < oddCount; i++) {
            a[index++] = odd[i];
        }
        
        // Print the modified array
        System.out.println("Modified array:");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
