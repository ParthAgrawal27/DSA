class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i = 1 ; i< n ; i++){
            for(int j = 0 ; j <n;j++){
                if(nums[i] + nums[j] == target && j!= i){
                    return new int[] {i,j} ;
                }
                
            }
            
        }
        return new int[] {-1,-1};
            
        }

    }