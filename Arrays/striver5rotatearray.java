import java.util.*;
public class striver5rotatearray{
    public static void reverse(int arr[] , int start , int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static int[] rotate(int k , int arr[]){
        int n = arr.length;

        k = k % n;

        if(k==0 || n==0){
            return arr;
        }
        
        reverse(arr , 0 , n-1);
        reverse(arr , 0 , k-1);
        reverse(arr , k , n-1);

        return arr;

    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(k , arr);

        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}