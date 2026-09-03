import java.util.*;

public class q7 {
    static void duplicate(int[] arr) {
        for (int i = 0; i < 5; i++) {
            if (arr[i]==arr[i+1]) {
                System.out.println("duplicate found" + arr[i]);
                for (int j = i; j < 5; j++) {
                    arr[j] = arr[j + 1];
                }

            } else {
                System.out.println("fine");
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
