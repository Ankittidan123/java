public class Tes {
    public static void target(int a[], int target) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                System.out.println("present");
            }
        }
    }
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 8;
        target(a, 8);
    }
}