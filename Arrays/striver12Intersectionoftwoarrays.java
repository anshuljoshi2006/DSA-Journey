import java.util.*;
public class striver12Intersectionoftwoarrays{
    public static int[] intersection(int arr1[] , int arr2[]){
        int k = 0;
        int newarr[] = new int[arr1.length +  arr2.length];
        for(int i=0 ; i<arr1.length ; i++){
            int count = 0;
            for(int j=0 ; j<arr2.length ; j++){
                if(arr1[i] == arr2[j]){
                    count++;
                }
            }

            if(count > 0 && k==0){
                newarr[k] = arr1[i];
                k++;
            }
            else if(count>0 && newarr[k-1] != arr1[i]){
                newarr[k] = arr1[i];
                k++;
                }                
            }

        int finalArr[] = new int[k];
        for(int i=0 ; i<finalArr.length ; i++){
            finalArr[i] = newarr[i];
        }

    return finalArr;

    }
    public static void main(String args[]){
        int arr1[] = {1, 2, 2, 3, 3, 3};
        int arr2[] ={2, 3, 3, 4, 5, 7};

        int result[] = intersection(arr1,arr2);
        for(int i=0 ; i<result.length ; i++){
            System.out.print(result[i] + " ");
        }
    }
}