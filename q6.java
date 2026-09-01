import java.util.*;

public class q6 {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int nextnum;
        System.out.println("enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < num; i++) {
            nextnum = first + second;
            arr[i] = nextnum;
            first = second;
            second = nextnum;

        }
        System.out.println("the fibonacci series are:");
        for (int i = 0; i < num; i++) {
           System.out.println(arr[i]);            
        }
    }
}
