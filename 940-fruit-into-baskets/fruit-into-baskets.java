class Solution {
    public int totalFruit(int[] fruits) {
        int num1 = -1,frq1 = 0;
        int num2 = -1,frq2 = 0;

        int l = 0 , r = 0;
        int n = fruits.length;
        int ans = 0;
        while(r < n){
            int cur = fruits[r];
            if(num1 == -1){
                num1 = cur;
                frq1 = 1;
            }
            else if(num1 == cur){
                frq1++;
            }
            else if(num2 == -1){
                num2 = cur;
                frq2 = 1;
            }
            else if(num2 == cur){
                frq2++;
            }
            if(cur != num1 && cur != num2){
                ans = Math.max(frq1 + frq2 , ans);
                int last = fruits[r - 1];
                while(frq1 > 0 && frq2 > 0){
                    int prev = fruits[l];
                    if(prev == num1){
                        frq1--;
                    }
                    else if(prev == num2){
                        frq2--;
                    }
                    l++;
                }
                if(frq1 == 0){
                    num1 = cur;
                    frq1 = 1;
                }
                else if(frq2 == 00){
                    num2 = cur;
                    frq2 = 1;
                }
            }
            r++;
        }
        ans = Math.max(frq1 + frq2, ans);
        return ans;
    }
}