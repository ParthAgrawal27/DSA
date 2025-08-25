class Solution {
    public double minimumAverage(int[] nums) {
        int n = nums.length;
       
        Arrays.sort(nums);
        int minElement = 0;
        int maxElement = 0 ;
        double minAvg = Double.MAX_VALUE;
        for(int i = 0 ; i < n/2 ; i++){
            minElement = nums[i];
            maxElement = nums[n - i -1];
           double avg = (minElement  + maxElement)/2.0;
            minAvg = Math.min(minAvg , avg);
        }
        
        return minAvg;
    }
}


// double[] averages = new double[n/2];