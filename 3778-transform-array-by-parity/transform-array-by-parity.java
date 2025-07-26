class Solution {
    public int[] transformArray(int[] nums) {
        int x = 0;
        int y = 0;
        for(int i = 0 ; i< nums.length ; i++){
            if(nums[i]%2 == 0){
                x++;
            }else{
                y++;
            }
        }
        for(int i = 0;i < x ;i++){
            nums[i] = 0;
        }
        for(int j = x ; j < nums.length ; j++){
            nums[j] = 1;
        }  
        return nums;
    }
   
}