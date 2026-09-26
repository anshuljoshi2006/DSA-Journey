import java.util.*;
public class striver14rearrangearrayelementsbysign{
    public static int[] rearrange(int arr[]){
        int n = arr.length;
        int k = 1;
        int l = 0;

        int newarr[] = new int[arr.length];

        for(int i=0 ; i<n ; i++){
            if(arr[i] > 0){
                newarr[l] = arr[i];
                l = l+2; 
            }
        }

        for(int i=1 ; i<n ; i++){
            if(arr[i] < 0){
                newarr[k] = arr[i];
                k = k+2;
            }
        }

        return newarr;
    }
    public static void main(String args[]){
        int arr[] = {3,1,-2,-5,2,-4};

        int[] result = rearrange(arr);

        for(int i=0 ; i<result.length ; i++){
            System.out.print(result[i] + " ");
        }
    }
}