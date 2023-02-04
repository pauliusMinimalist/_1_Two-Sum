import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Solution sol = new Solution();

        int[] nums = new int[]{3, 3};
        int target = 6;

        System.out.println(Arrays.toString(sol.twoSum(nums, target)));
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] arr = new int[0];
        int sum = 0;

        for (int i = 1; i < nums.length; i++) {

            for (int j = 0; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    arr = new int[]{j, i};
                    break;
                }
            }
            break;
        }
        return arr;
    }
}
