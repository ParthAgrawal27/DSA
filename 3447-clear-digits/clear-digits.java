class Solution {
    public String clearDigits(String s) {
        StringBuilder A = new StringBuilder();
        for(char c:s.toCharArray()){
            if(c>= '0'&& c<='9'){
                if(A.length() > 0){
                    A.deleteCharAt(A.length() -1);
                }
                }else{
                    A.append(c);
                }
               
            }
            return  A.toString();
        } 
    
    }

