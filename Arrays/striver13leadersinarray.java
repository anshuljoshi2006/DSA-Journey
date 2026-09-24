import java.util.*;

public class striver13leadersinarray {

    public List<Integer> leadersInArray(int[] nums) {

        int n = nums.length;

        if (n == 0) {
            return new ArrayList<>();
        }

        List<Integer> leaders = new ArrayList<>();

        int maxRight = nums[n - 1];

        leaders.add(nums[n - 1]);

        for (int i = n - 2; i >= 0; i--) {

            if (nums[i] >= maxRight) {
                leaders.add(nums[i]);
            }

            maxRight = Math.max(maxRight, nums[i]);
        }

        Collections.reverse(leaders);

        return leaders;
    }

    public static void main(String[] args) {

        int nums[] = {10, 22, 12, 3, 0, 6};

        striver13leadersinarray solution = new striver13leadersinarray();

        List<Integer> leaders = solution.leadersInArray(nums);

        for (int value : leaders) {
            System.out.print(value + " ");
        }
    }
}