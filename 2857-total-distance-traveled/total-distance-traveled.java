class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int kilo =0 ;
        while(mainTank >= 5){
            
                mainTank = mainTank - 5;
                kilo += 50;
                if(additionalTank > 0){
                    mainTank++;
                    additionalTank--;
                }
        }
        kilo += mainTank*10;
         return (kilo);
    }
   
    
}