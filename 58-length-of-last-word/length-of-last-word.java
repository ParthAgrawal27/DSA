class Solution {
    public int lengthOfLastWord(String s) {
        String[] Array = s.split(" ");
        int n = Array.length;
        String str = Array[n-1];
        return str.length();

    }
}