class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String res = "";
        String res1 = "";
        for(int i =0 ; i < word1.length ; i++){
            res += word1[i];}
            for(int j = 0 ; j <word2.length ; j++){
                res1 += word2[j];
            }
            if(res.equals(res1)){
                return true;
            }
            return false;
        }
        
    }
