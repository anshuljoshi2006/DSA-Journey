import java.util.*;
public class prefixSum{
    public static int prefixSum(int arr[]){
        int maxsum = 0;
        int currsum = 0;

        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        for(int i=1 ; i<arr.length ; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0 ;i<prefix.length ; i++){
            int start = i;
            for(int j=i ; j<prefix.length; j++){
                int end = j;

                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if(maxsum < currsum){
                    maxsum = currsum;
                }
            }
        }

        return maxsum;
    }
    public static void main(String args[]){
        int arr[] = {1,-2,6,-1,3};
        System.out.print(prefixSum(arr));
    }
}