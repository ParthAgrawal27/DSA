class Solution {
    public int beautySum(String s) {
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            Map<Character , Integer> mpp = new HashMap<>();
            for(int j = i ; j<s.length(); j++){
                mpp.put(s.charAt(j),mpp.getOrDefault(s.charAt(j), 0)+1);
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                for(int val: mpp.values()){
                    min = Math.min(val, min);
                    max = Math.max(val,max);
                }
                sum += max - min;
            }
        }
        return sum;
    }
}