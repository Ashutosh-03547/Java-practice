
import java.util.Scanner;

public class q3 {

    static void transaction(double[] arr,int num) {
        int sum=0;
        for (int i = 0; i < num; i++) {

            if (arr[i] == 0) {
                continue;
            } else if (sum + arr[i] <= 10000) {
                sum += arr[i];
            } else {
                break;
            }

        }
      System.out.println("the total transaction amount is:"+ sum);
    }
    public static void main(String[] args) {
        System.out.println("Enter number of transactions:");
        int num = 0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        double[] arr = new double[num];
        System.out.println("Enter all the transaction amounts:");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextDouble();
        }
        transaction(arr, num);

        sc.close();
    }
}
