import java.util.*;
public class striver7LinearSearch{
    public static void LinearSearch(int arr[] , int key){
        for(int i=0 ; i<arr.length ; i++){  
            if(arr[i] == key){
            System.out.print("key is at " + i);
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {5,3,4,1,2};
        int key = 4;

        LinearSearch(arr,key);
    }
}