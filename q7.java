import java.util.Scanner;

public class q7 {
    static int duplicate(int[] arr) {
        int a = arr[0];
        int i=1;
          while(i < 10) {
            if (arr[i] != a) {
                i++;
                
            } else {
                return arr[i];
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the numbers :");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        duplicate(arr);
    }
}
