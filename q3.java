
import java.util.Scanner;

public class q3 {

    static void transaction(double[] arr,int num) {
        int sum=0;
        for (int i = 0; i < num; i++) {

            if (arr[i] == 0) {
                continue;
            } else if (sum > 10000) {
                break;
            } else {
                sum += arr[i];
            }

        }
      System.err.println("the total transaction amount is:"+ sum);
    }
    public static void main(String[] args) {
        System.out.println("Enter all the transaction");
        int num = 0;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            num = sc.nextInt();
            break;
        }
        double[] arr = new double[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextDouble();
        }
        transaction(arr, num);
    }
}
