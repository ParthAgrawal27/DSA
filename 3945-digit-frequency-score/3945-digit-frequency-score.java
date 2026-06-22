class Solution {
    public int digitFrequencyScore(int n) {
        int r = 0;
        while(n > 0){
            r += n%10;
            n = n/10;
        }
        return r;
    }
}