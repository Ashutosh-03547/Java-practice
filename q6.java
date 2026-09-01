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
        for (int i = 1; i < num; i++) {
            nextnum = first + second;
            arr[i] = nextnum;
            first = second;
            second = nextnum;

        }
        System.out.println("the fibonacci series are:"+arr);
    }
}
