import java.util.*;
public class Solu{
    static int largestfind(int arr[]){
        int largest = arr[0];
        for(int i = 1; i< arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    static int secondlargest(int arr[]){
        int largest = arr[0];
        int slargest = -1;
        for(int i = 1;i<arr.length;i++){
            if(arr[i] > largest){
                slargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > slargest){
                slargest = arr[i];
            }
        }
        return slargest;
    }
    static boolean isSorted(int arr[]){
        for(int i = 1; i<arr.length;i++){
            if( arr[i] < arr[i-1]){
                return false;
            }

        }
        return true;
        
    }
    static int removeDupli(int arr[]){
        int i = 0;
        for(int j = 1 ; j < arr.length ; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
                
            }
        }
        return (i + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Size of array: ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        for(int i =0; i<n;i++){
           arr[i] = sc.nextInt();
        }
        int k = removeDupli(arr);
        for(int i = 0 ; i< k ;i++){
            System.out.print(arr[i]+ " ");
        }
    
       // System.out.println("The largest from the array " + largestfind(arr));
       // System.out.println("The second largest from the array " + secondlargest(arr));
       //System.out.println(isSorted(arr));

    }
}
