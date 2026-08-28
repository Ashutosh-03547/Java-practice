//use for exceptin handling


import java.util.Scanner;


public class q2 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the total no of students");
         int n = sc.nextInt();
     boolean[] arr = new boolean[n];
        System.out.println("Enter the attendance:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextBoolean();
        }
         int count = 0;
         for (int i = 0; i <n; i++) {
             if (arr[i] != false) {
                 count++;
             }
         }
         System.out.println("The no of student present are:"+ count);
     }
}
