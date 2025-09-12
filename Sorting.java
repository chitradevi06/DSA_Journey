import java.util.*;
public class Sorting{
    public static void selection(int n , int arr[]){
    for(int i =0;i <=n-2 ;i++){
        int minimum = i;
        for(int j = i;j <= n-1; j++){
            if(arr[j] < arr[minimum]){
                minimum = j;
            }
        }
                int temp = arr[minimum];
                arr[minimum] = arr[i];
                arr[i] = temp;
            

        }
    }
    public static void bubble(int n , int arr[]){
        for(int i = n-1;i >= 1 ; i--){
            for(int j = 0 ; j <= i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void insertion(int n,int arr[]){
        for(int i = 0; i <= n-1 ; i++){
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        } 
    }

    

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0 ; i<n;i++){
            arr[i] = sc.nextInt();
        }

        insertion(n,arr);

        for(int i =0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

    }
}

