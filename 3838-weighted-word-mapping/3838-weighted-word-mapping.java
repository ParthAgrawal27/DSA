class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder result = new StringBuilder();
        for(String word : words){
            int totalWeight = 0;
            for(char ch : word.toCharArray()){
                totalWeight += weights[ch - 'a'];
            }
            int modValue = totalWeight % 26;
            char mappedChar = (char)('z' - modValue);
            result.append(mappedChar);
        }
        return result.toString();
    }
}