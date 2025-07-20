class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String str : sentences){
           String [] words = str.split(" ");
           int k = words.length;
           max = Math.max(max,k);
        }
        return max;
    }
}