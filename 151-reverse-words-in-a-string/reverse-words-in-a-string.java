class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        String reversed = new StringBuilder(s).reverse().toString();
        int i = 0;
        while(i<n){
            StringBuilder word = new StringBuilder();
            while(i<n && reversed.charAt(i) == ' '){
                i++;
            }
            while(i<n && reversed.charAt(i) != ' '){
                word.append(reversed.charAt(i));
                i++;
            }
            if(word.length()>0){
                ans.append(" ").append(word.reverse());
            }
        }
        return ans.toString().trim();
    }
}