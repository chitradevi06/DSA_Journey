
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Medium{
    static ArrayList<Integer> union(int arr1[] , int arr2[], int m, int n){
        int i = 0;
        int j = 0;
        ArrayList<Integer> union = new ArrayList<>();
        while(i< m && j < n){
            if(arr1[i] < arr2[j]){
            
            if(union.size() == 0 || union.get(union.size()-1) != arr1[i]){
                union.add(arr1[i]);
            }
            i++;
        }
            else if(arr1[i] > arr2[j]){
            if(union.size()==0 || union.get(union.size()-1)!= arr2[j]){
                union.add(arr2[j]);
                }
                j++;
            }
            else {
                if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
                   union.add(arr1[i]);
                }
                  i++;
                 j++;
    }
        }
        while(i<m){
            if(union.get(union.size()-1) != arr1[i]){
                union.add(arr1[i]);
                
            }
            i++;
        }
        while(j<n){
            if(union.get(union.size()-1)!= arr2[j]){
                union.add(arr2[j]);
               
            }
             j++;
        }
        return union;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of 1st array");
        int m = sc.nextInt();

        int arr1[] = new int[m];
        for(int i = 0 ; i < m; i++){
            arr1[i] = sc.nextInt();
        }
        Arrays.sort(arr1);
        
        for(int i = 0 ; i < m;  i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        System.out.println("Enter the size of 2nd array");
        int n = sc.nextInt();

        int arr2[] = new int[n];
        for(int i = 0 ; i < n; i++){
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr2);
        
        for(int i = 0 ; i < n;  i++){
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        ArrayList<Integer> k = union(arr1,arr2,m,n);

        System.out.print("The Union of Two array " + k);




    }
}