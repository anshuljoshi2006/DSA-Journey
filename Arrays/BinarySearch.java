import java.util.*;
public class BinarySearch{
    public static int BinarySearch(int numbers[] , int key){
        int start = 0;
        int end = number.length- 1;
        int mid = (start+end)/2;

        while(start<=end){
        if(arr[mid] == key){
            return mid;
        }
        else if(arr[mid]>key){
                end  = mid - 1;                                        
            }
        else{
                start = mid + 1;
        }   
    }
}

    public static void main(String args){
        int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        int key = 9;

        int index = BinarySearch(numbers , key);

        System.out.print(index);
    }   
}