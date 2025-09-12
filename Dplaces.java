import java.util.*;
public class Dplaces {
    public static void rotate(int arr[] , int d){
        int n = arr.length;
         d = d % n;
        reverse(arr,0,d-1);
        reverse(arr, d , n-1);
        reverse(arr,0,n-1);
    }
    public static void reverse(int arr[] , int start , int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times the array has to rotate");
        int d = sc.nextInt();

        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++ ){
            arr[i] = sc.nextInt();
        }
        rotate(arr,d);

        System.out.println("After the " + d + " number of Rotations ");
        for(int i = 0 ; i < n;i++){
            System.out.print(arr[i] + " ");
        }


    }
    
}
