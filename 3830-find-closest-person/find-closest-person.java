class Solution {
    public int findClosest(int x, int y, int z) {
        int sum1 = Math.abs(x-z);
        int sum2 = Math.abs(y-z);
        if(sum1==sum2){
            return 0;
        }
        if(sum1 > sum2 ){
            return 2;
        }
        else{
            return 1;
        }
    }
}