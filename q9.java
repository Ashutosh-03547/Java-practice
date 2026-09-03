public class q9 {
    static void rotate(int[] arr, int r) {
        int n = arr.length;
        for (int i = 0; i < r; i++) {
               int last = arr[n - 1];
               for (int j = n - 1; j > 0; j--) {
                   arr[j] = arr[j - 1];
               }
               arr[0] = last;
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int r = 2;
        rotate(arr, r);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
