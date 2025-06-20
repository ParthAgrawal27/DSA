class Solution {
    public void moveZeroes(int[] nums) {
        int[] ans = new int[nums.length];
        int ind = 0;
        Arrays.fill(ans, 0);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                ans[ind++] = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ans[i];
        }
    }

}