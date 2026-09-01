import java.util.Scanner;

public class q5 {
    static void reverse(int num) {
        int count = 0;
        int rev=0;
        while (num != 0) {
            num /= 10;
            count+=1;
        }
        for (int i = 0; i <= count; i++) {
            int rem = num % 10;
            rev = (rev * 10) + rem;
        }
        System.err.println("the reverse number is :"+rev);
    }
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        reverse(num);

    }
}
