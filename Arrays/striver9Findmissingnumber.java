// Better Approach - Hashing

// import java.util.*;
// public class striver9Findmissingnumber{
//     public static int missingnumber(int arr[]){
//         int newarr[] = new int[arr.length+1];

//         for(int i=0 ; i<arr.length ; i++){
//             newarr[arr[i]]++;
//         }

//         for(int i=0 ; i<newarr.length ; i++){
//             if(newarr[i] == 0){
//                 return i;
//             }
//         }
//           return -1;     
//     }
//     public static void main(String args[]){
//         int arr[] = {0,1,2,4,5,6};
//         System.out.print(missingnumber(arr));
//     }
// }

// Optimal Approach - Sum of n terms

import java.util.*;
public class striver9Findmissingnumber{
    public static int missing(int arr[]){
        long n = arr.length;

        long sum = 0;
        for(int i=0 ; i<arr.length ; i++){
            sum += arr[i];
        }

        long expected = (n*(n+1))/2;

        return (int)(expected - sum);
    }
    public static void main(String args[]){
        int arr[] = {0,1,3,4,5};
        System.out.print(missing(arr));
    }
}