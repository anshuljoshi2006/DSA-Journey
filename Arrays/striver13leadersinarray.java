import java.util.*;
public class striver13leadersinarray{
    public static List<Integer> leaders(int arr[]){
        int n = arr.length;

        List<Integer> lead = new ArrayList<>();

        if(n == 0){
            return new ArrayList<>();
        }

        int maxRight = arr[n-1];

        lead.add(arr[n-1]);

        for(int i = n-2 ; i>=0 ; i--){
            if(arr[i] >= maxRight){
                lead.add(arr[i]);
            }
            maxRight = Math.max(maxRight , arr[i]);
        }

        Collections.reverse(lead);

        return lead;
    }
    public static void main(String args[]){
        int arr[] = {1,2,5,3,1,2};
        
        List<Integer> lead = leaders(arr);

        for(int value : lead){
            System.out.print(value + " ");
        }
    }
}

