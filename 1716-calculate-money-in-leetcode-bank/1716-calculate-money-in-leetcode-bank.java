class Solution {
    public int totalMoney(int n) {
        int mon = 1;
        int sum = 0;
        int days = n %7;
        int weeks = n/7;

        for(int i = 0; i < weeks;i++){
            int num = mon;
        for(int j = 0; j < 7 ; j++){
            sum += num ;
            num++;
        }
        mon++;
        }
        int num = mon;
        for(int i = 0; i< days ; i++){
            sum += num;
            num++;
        }
        
        return sum;
    }
}