class Solution {
    public int[] shuffle(int[] nums, int n) {
        int start = 0; int index = 0;
        int mid  = n;
        int[] ans = new int[nums.length];
        while(mid < nums.length){
            ans[index++] = nums[start++];
            ans[index++] = nums[mid++];
        }
    return ans;
    }
}