import java.util.*;
public class striver8unionofsortedarrays{
    public static int[] unionArray(int arr1[] , int arr2[]){
        int n = arr1.length;
        int m = arr2.length;

        int i = 0;
        int j = 0;
        int k = 0;

        int result[] = new int[arr1.length + arr2.length];

        while(i<n && j<m){
            if(arr1[i] < arr2[j]){
                if(k==0 || result[k-1] != arr1[i]){
                    result[k] = arr1[i];
                    k++;
                }
              i++;
            }

            else if(arr2[j] < arr1[i]){
                if(k==0 || result[k-1] !=arr2[j]){
                    result[k] = arr2[i];
                    k++;
                }
                j++;
            }

            else{
                if(k==0 || result[k-1] != arr1[i]){
                    result[k] = arr1[i];
                    k++;
                }
                i++;
                j++;
            }
        }


        while(i<n){
            if(k==0 || result[k-1] != arr1[i]){
                result[k] = arr1[i];
                k++;
            }
            i++;
        }

        while(j<m){
            if(k==0 || result[k-1] != arr2[j]){
                result[k] = arr2[j];
                k++;
            }
            j++;
        }

        int finalArr[] = new int[k];

        for(int x=0 ; x<k ; x++){
            finalArr[x] = result[x];
        }
        return finalArr;
}
    public static void main(String args[]){
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {1,2,7};

        int result[] = unionArray(arr1,arr2);

        for(int i=0 ; i<result.length ; i++){
            System.out.print(result[i] + " ");
        }
    }
}