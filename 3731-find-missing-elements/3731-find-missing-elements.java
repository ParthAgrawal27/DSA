class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n ; i++){
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        List<Integer> res = new ArrayList<>();
        for(int num = min ; num <= max ;num++){
            boolean found = false;
            for (int x : nums){
                if(x == num){
                    found = true;
                    break;
                }
            }
            if(!found){
                res.add(num);
            }
        }
        return res;
    }
}