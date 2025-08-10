class Solution {
    public boolean reorderedPowerOf2(int n) {
        String target = sortDig(n);
        for(int i = 0 ; i < 31 ; i++){
          int powerTwo  =1 << i;
          if(sortDig(powerTwo).equals(target)){
            return true;
          }
          }
         return false;
    }
    public String sortDig(int num){
            char[] arr = String.valueOf(num).toCharArray();
            Arrays.sort(arr);
            return new String(arr);
        }
    }
