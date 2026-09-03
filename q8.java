import java.util.*;

public class q8 {
    static void reverse(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[n - 1 - i];
        }
        for (int j = 0; j < n; j++) {
            arr[j] = temp[j];
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2, 6, 5 };

        reverse(arr);
  
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " ");
            
        }
    }

