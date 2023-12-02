public class TwoSum1 {
    public static void main(String[] args) {
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] location = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }
}