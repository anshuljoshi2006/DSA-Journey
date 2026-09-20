// Better approach

import java.util.*;
public class striver11findthenumberthatappearsonce{
    public static int numberthatappearonce(int arr[]){
        int max = 0;

        for(int i=0 ; i<arr.length ; i++){
            max = Math.max(max,arr[i]);
        }
    
        int hasharr[] = new int[max+1];

        for(int i=0 ; i<arr.length ; i++){
            hasharr[arr[i]]++;
        }

        for(int i=0 ; i<hasharr.length ; i++){
            if(hasharr[arr[i]] == 1){
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int arr[] = {2,1,3,1,4,5,4,6,7,6,7,2,5};
        System.out.print(numberthatappearonce(arr));
    }
}


// Optimal approach


import java.util.*;
public class striver11findthenumberthatappearsonce{
    public static int appearonce(int arr[]){
        int xor = 0;

        for(int i=0 ; i<arr.length ; i++){
            xor = xor ^ arr[i];
        }

        return xor;
    }
    public static void main(String args[]){
        int arr[] = {4,1,2,1,2};
        System.out.print(appearonce(arr));
    }
}