import java.util.*;
public class striver2secondlargestelement{
    public static int secondlargest(int arr[]){
        if(arr.length < 2){
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] > largest){
                secondlargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondlargest && arr[i] != largest){
                secondlargest = arr[i];
            }
        }

        if(secondlargest == Integer.MIN_VALUE){
            return -1;
        }
        else{
            return secondlargest;
        }
    }
    public static void main(String args[]){
        int arr[] = {7, 8, 4, 6, 5};
        System.out.print(secondlargest(arr));
    }
}