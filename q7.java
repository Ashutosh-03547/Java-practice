import java.util.Scanner;

public class q7 {
    static void duplicate(int[] arr) {
        int a = arr[0];
        int i=1;
        while (i < 5) {
            if (arr[i] <= a) {
                arr[i - 1] = arr[i];
                arr[i] = a;
                i++;

            } else {
                a = arr[i];
                i++;
            }
        }
        for (int j = 0; j < 5; j++) {
            System.out.println(arr[j]);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the numbers :");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        duplicate(arr);
    }
}
