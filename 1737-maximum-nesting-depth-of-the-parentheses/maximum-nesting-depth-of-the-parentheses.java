class Solution {
    public int maxDepth(String s) {
        int n =s.length();
        int count = 0;
        int maxDepth= 0;
        for(char c : s.toCharArray()){
            if(c == '(' ){
                count++;
                
            }
            else if(c == ')'){
                count--;
            }
            maxDepth = Math.max(maxDepth, count);
        }
        return maxDepth;
    }
}