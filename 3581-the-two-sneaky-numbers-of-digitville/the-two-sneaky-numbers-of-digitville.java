class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int[] arr = new int[2];
        int indx = 0;
        for(int i = 0; i< nums.length; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }else{
                arr[indx++] = nums[i];
            }
        }
        return arr;
    }
}