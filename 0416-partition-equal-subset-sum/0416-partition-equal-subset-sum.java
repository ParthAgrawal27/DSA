class Solution {
    public boolean subsetSum(int[] nums , int s){
    boolean[][] t = new boolean[nums.length+1][s+1];
        for(int i = 0; i < nums.length +1 ; i++){
            for(int j = 0 ; j< s+1 ;j++){
                if(i == 0){
             t[i][j] = false;}
            if(j==0){
                t[i][j] = true;
            }}}
            for(int i = 1; i <nums.length +1 ; i++){
                for(int j =1 ; j < s+1 ; j++){
            if(nums[i - 1] <= j){
            t[i][j] = t[i-1][j - nums[i-1]] || t[i-1][j];
        }else{
            t[i][j] = t[i-1][j];
        }
            }
        }
        
        
        return t[nums.length][s];

    }

    public boolean canPartition(int[] nums) {
        int sum = 0;
    for(int i = 0 ; i<nums.length ; i++){
        sum += nums[i];
    }    
    if(sum%2 != 0){
        return false;
    }
        return subsetSum(nums ,sum/2);
    
    }
}