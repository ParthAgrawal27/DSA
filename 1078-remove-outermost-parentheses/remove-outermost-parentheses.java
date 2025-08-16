class Solution {
    public String removeOuterParentheses(String s) {
        int depth = 0;
        StringBuilder ans = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c == '('){
                if(depth > 0 ){
                ans.append(c);
                }
                depth++;
            }else{
                
                if(depth > 1){
                    ans.append(c);
                }
                depth--;
            }
        }
        return ans.toString();
    }
}