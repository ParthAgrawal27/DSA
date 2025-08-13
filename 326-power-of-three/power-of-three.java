class Solution {
    public boolean isPowerOfThree(int n) {
       int maxPowerOf3 = 1162261467;
       return n > 0 && maxPowerOf3 % n == 0;
    }
}


 // for(int i = 0 ; i < n ; i++){
        //     if(Math.pow(3 , i) == n){
        //         return true;
        //     }
        // }