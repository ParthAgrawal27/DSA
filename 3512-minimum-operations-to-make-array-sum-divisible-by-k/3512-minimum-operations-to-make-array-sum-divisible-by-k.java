class Solution {
    public int minOperations(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
       for(int i = 0 ; i < n ; i++){
        sum += nums[i];
       }
       int rem = sum % k;
       return rem ;
    }
}




 // int sum = 0;
        // int opp = 0;
        // int max = 0;
        // int count =0;
        // while(sum % k = 0){
        // for(int i = 0 ; i< n ; i++){
        //     sum += nums[i];
        //     max = Math.max(max , nums[i]);
        // }
        
        // if(sum % k != 0 ){
        //     opp = sum % k ;
        // }else{
        //     nums[max] = nums[max] - 1;
        //     count++;
        // }
        // }
        // return count;