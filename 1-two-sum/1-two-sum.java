class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[] {};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result = new int[] {i, j};
                }
            }
        }
        return result;
    }
}