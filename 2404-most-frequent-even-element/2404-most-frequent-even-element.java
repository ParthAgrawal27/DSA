class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer > map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0) + 1);
        }
        int maxFrequency = 0 ;
        int ans = -1;
        for(int num : map.keySet()){
            if(num % 2 == 0){
                int freq = map.get(num);
                if(freq > maxFrequency || (freq == maxFrequency && num < ans)){
                    maxFrequency = freq ;
                    ans = num;
                }
            }
        }
        return ans;
    }
}