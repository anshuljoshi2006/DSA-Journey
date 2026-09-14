import java.util.*;
public class striver3checksorted{
    public static boolean striver3checksorted(int nums[]){
        int count = 0;
        int n = nums.length;

        for(int i=0; i<n ; i++){
            if(nums[i] > nums[(i+1) % n]){
                count++;
            }
        }
        return count <=1;
    }
    public static void main(String args[]){
        int nums[]= {3,4,5,1,2};
        System.out.print(striver3checksorted(nums));
    }
}