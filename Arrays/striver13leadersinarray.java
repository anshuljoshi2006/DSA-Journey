import java.util.*;

public class striver13leadersinarray {

    public List<Integer> leadersInArray(int[] nums) {
        int n = nums.length;

        // No leaders exist in an empty array.
        if (n == 0) {
            return new ArrayList<>();
        }

        List<Integer> leaders = new ArrayList<>();

        int maxRight = nums[n - 1];

        // The rightmost element is always a leader.
        leaders.add(nums[n - 1]);

        for (int index = n - 2; index >= 0; index--) {

            if (nums[index] >= maxRight) {
                leaders.add(nums[index]);
            }

            // Keep the greatest value seen on the right.
            maxRight = Math.max(maxRight, nums[index]);
        }

        // Leaders were collected from right to left.
        Collections.reverse(leaders);

        return leaders;
    }
}

class Main {
    public static void main(String[] args) {

        int[] nums = {10, 22, 12, 3, 0, 6};

        striver13leadersinarray solution = new striver13leadersinarray();

        List<Integer> leaders = solution.leadersInArray(nums);

        for (int value : leaders) {
            System.out.print(value + " ");
        }
    }
}