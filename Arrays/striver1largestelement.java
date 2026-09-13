import java.util.*;
public class striver1largestelement{
    public static int largestelement(int arr[]){
        int max = arr[0];
        for(int i=1 ;i<arr.length; i++){
            if(arr[i] > max){
            max = Math.max(max , arr[i]);
            }
        }
        return max;
    }
    public static void main(String args[]){
        int arr[] = {3,3,6,1};
        System.out.print(largestelement(arr));
    }
}