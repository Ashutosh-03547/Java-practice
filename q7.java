import java.util.Scanner;

public class q7 {
    static void duplicate(int[] arr) {
        int a = arr[0];
        int i=0;
        while (i < 5) {
            if (arr[i] <= arr[i+1]) {
                
                i++;

            } else {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
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
        int[] arr = new int[6];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        duplicate(arr);
    }
}
