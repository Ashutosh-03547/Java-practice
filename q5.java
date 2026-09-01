import java.util.Scanner;

public class q5 {
    static void reverse(int num) {
        int count = 0;
        int rev = 0;
        int temp = num;

        while (temp != 0) {
            temp /= 10;
            count++;
        }

        for (int i = 0; i < count; i++) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }

        System.out.println("The reverse number is: " + rev);
    }
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        reverse(num);

    }
}
