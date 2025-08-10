class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int maxCap = n*n;
        return Math.min(maxCap , maxWeight/w);
    }
}



        //int maxCap = n*n;
        // int weight = 0;
        // int count = 0;
        // for(int i = 1  ; i <= maxCap ; i++){
        //     int newWeight = i*w;
        //     if(newWeight <= maxWeight){
        //         weight = newWeight;
        //         count++;
        //     }else{
        //         break;
        //     }
        // }
        // return count;