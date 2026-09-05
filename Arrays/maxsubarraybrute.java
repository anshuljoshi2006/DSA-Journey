import java.util.*;
public class pairs{
    public static void subArrays(int numbers[]){
        int maxsum = Integer.MIN_VALUE;
        for(int i=0 ; i<numbers.length ; i++){
            int start = i;
            for(int j=i ; j<numbers.length ; j++){
                int sum = 0;
                int end = j;
                for(int k=start ; k<=end ; k++){
                    sum = sum + numbers[k];
                }
        if(maxsum<sum){
            maxsum = sum;
        }
            }
        }
        System.out.print(maxsum);
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        subArrays(numbers);
    }
}