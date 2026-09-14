import java.util.*;
public class striver6movezeroestotheend{
    public static void zeroestotheend(int arr[]){
        int newarr[] = new int[arr.length];

        int j=0;
        for(int i=0 ; i<newarr.length ; i++){
            if(arr[i] != 0){
                newarr[j] = arr[i];
                j++;
            }
        }

        for(int i=0 ; i<newarr.length ; i++){
            System.out.print(newarr[i] + " ");
        }

    }
    public static void main(String args[]){
        int arr[] = {0,1,0,3,12};
        zeroestotheend(arr);
    }
}