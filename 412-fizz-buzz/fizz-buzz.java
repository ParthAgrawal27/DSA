class Solution {
    public List<String> fizzBuzz(int n) {
         String[] arr = new String[n];
        for(int i = 0; i < n ; i++ ){
            int j = i+1;
            if(j%3 == 0 && j%5==0 ){
              arr[i]  = "FizzBuzz";
            }
            else if(j%3 == 0){
               arr[i] = "Fizz";
            }
            else if(j%5 == 0){
                arr[i] = "Buzz";
            }
            else{
                arr[i] = Integer.toString(j);
            }
           
        }
         return Arrays.asList(arr);
        
    }
    
}