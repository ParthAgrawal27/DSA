class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n ; i++){
        int num = nums[i];
        int sum = 0;
        while(num > 0){
            int dig = num % 10;
            sum += dig;
            num /= 10;
        }
        nums[i] = sum ;
        sum = 0;
    }
    Arrays.sort(nums);
    return nums[0];
}
}
