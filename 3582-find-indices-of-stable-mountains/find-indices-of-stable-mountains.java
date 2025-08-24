class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
      int n = height.length;
       ArrayList<Integer> hei = new ArrayList<Integer>();
        
        for(int i =0 ; i< n-1 ; i++){
            if(height[i] > threshold){
                hei.add(i+1);
            }
        }
        return hei;
    }
}