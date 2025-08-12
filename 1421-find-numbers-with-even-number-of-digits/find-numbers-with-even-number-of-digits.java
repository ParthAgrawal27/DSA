class Solution {
    public int findNumbers(int[] nums) {
        int len = nums.length;
        int ans = 0;
        for(int i = 0; i< len ; i++){
           int count = 0;
            while(nums[i] > 0){
                nums[i]/= 10;
                count++;
            }
            if(count % 2 == 0){
                ans++;
            }

        }
        return ans;
    }
}