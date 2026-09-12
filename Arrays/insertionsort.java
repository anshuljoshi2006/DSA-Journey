import java.util.*;
public class insertion{
    public static void insertion(int arr[]){
        int n = arr.length;
        for(int i=1 ; i<arr.length ; i++){
            int prev = i-1;
            int curr = arr[i];

            while(prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
                arr[prev+1] = curr;
        }
    }
    public static void printArr(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        insertion(arr);
        printArr(arr);
    }
}