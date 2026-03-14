class Solution {
    public int pivotInteger(int n) {
        for(int i = 0 ; i<=n ; i++){
            if((i)*(1+i)/2 == ((n-i+1))*(i+n)/2){
                return i;
            }
        }
        return -1;
    }
}