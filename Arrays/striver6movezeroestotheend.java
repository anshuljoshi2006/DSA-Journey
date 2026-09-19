import java.util.*;
public class striver6movezeroestotheend{
    public static int[] zeroestotheend(int arr[]){
        int j = -1;

        for(int i=0 ; i<arr.length ; i++){
                if(arr[i] == 0) {
                j = i;
                break;
            }
        }

        if(j == -1){
            return arr;
        }

        for(int i=j+1 ; i<arr.length ; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }
        return arr;
    }
    public static void main(String args[]){
        int arr[] = {0,1,0,3,12};
        zeroestotheend(arr);

        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}