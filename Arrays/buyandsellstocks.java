import java.util.*;
public class buyandsellstocks{
    public static int maxprofit(int prices[]){
        int BP = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i=0 ; i<prices.length ; i++){
            if(BP<prices[i]){
                int profit = prices[i] - BP;
                maxprofit = Math.max(profit,maxprofit);
            }
            else{
                BP = prices[i];
            }
        }
        return maxprofit;
    }
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        System.out.print(maxprofit(prices));
    }
}