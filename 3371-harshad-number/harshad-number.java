class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
   int temp = x;
   int  sum = 0;
   while(temp > 0 ){
    sum += temp % 10;
    temp /= 10 ;
   }
   if(x % sum == 0){
    return sum;
   }
   else{
    return -1;
   }
    }
    }
    //     if(x == 100){
    //         return 1;
    //         }
    //     if( x % ((x/10) +( x%10 )) == 0){
    //         return (x/10) +( x%10 );
    //     }
    //     else{
    //         return -1;
    //     }

    // }
    
