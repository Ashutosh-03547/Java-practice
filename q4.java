import java.util.Scanner;

public class q4 {
    static void findlarge(int[] arr, int n){
        int large = arr[0];
        int slarge = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i]>large) {
                slarge = large;
                large=arr[i];
            }
            else if(arr[i]>slarge && arr[i]!=large){
                slarge=arr[i];
            }
        }
       
       System.out.println("the second higherst number is:"+slarge);

    }
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.err.println("Enter the array");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        findlarge(arr,10); 
    }
}
