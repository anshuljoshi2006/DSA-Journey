// Brute Force approach

// import java.util.*;
// public class striver12Intersectionoftwoarrays{
//     public static int[] intersection(int nums1[] , int nums2[]){
//         int k = 0;
//         int newarr[] = new int[nums1.length +  nums2.length];
//         for(int i=0 ; i<nums1.length ; i++){
//             int count = 0;
//             for(int j=0 ; j<nums2.length ; j++){
//                 if(nums1[i] == nums2[j]){
//                     count++;
//                 }
//             }

//             if(count > 0 && k==0){
//                 newarr[k] = nums1[i];
//                 k++;
//             }
//             else if(count>0 && newarr[k-1] != nums1[i]){
//                 newarr[k] = nums1[i];
//                 k++;
//                 }                
//             }

//         int finalArr[] = new int[k];
//         for(int i=0 ; i<finalArr.length ; i++){
//             finalArr[i] = newarr[i];
//         }

//     return finalArr;

//     }
//     public static void main(String args[]){
//         int nums1[] = {1,2,3,4,5};
//         int nums2[] = {1,2};

//         int result[] = intersection(nums1,nums2);
//         for(int i=0 ; i<result.length ; i++){
//             System.out.print(result[i] + " ");
//         }
//     }
// }


// Optimal approach

import java.util.*;
public class striver12Intersectionoftwoarrays{
    public static int[] intersection(int nums1[] , int nums2[]){
        int i = 0;
        int j = 0;
        int k = 0;

        int newarr[] = new int [nums1.length + nums2.length];

        int n = nums1.length;
        int m = nums2.length;

        while(i<n && j<m){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums2[j] < nums1[i]){
                j++;
            }
            else{
                    newarr[k] = nums1[i];
                    k++;
                    i++;
                    j++;
            }
        }

        int finalArr[] = new int[k];
        for(int p=0 ; p<k ; p++){
            finalArr[p] = newarr[p];
        }
        return finalArr;
    }
    public static void main(String args[]){
        int nums1[] = {10,10,10,10,100,119};
        int nums2[] = {4,10,10,11,119};

        int result[] = intersection(nums1 , nums2);
        for(int i=0 ; i<result.length ; i++){
            System.out.print(result[i] + " ");
        }
    }
}