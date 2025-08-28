class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List <Boolean> l = new ArrayList<>();
        int max = candies[0];
        for(int i = 0 ; i<candies.length ; i++){
            if(candies[i] > max){
                max = candies[i] ;
            }
        }
        for(int j = 0; j<candies.length;j++){
            if(candies[j] +extraCandies >= max){
                l.add(true);
            }
            else{
                l.add(false);
            }
        }
        return l;
    }
}