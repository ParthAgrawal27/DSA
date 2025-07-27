class Solution {
    public String winningPlayer(int x, int y) {
    int count = 0;
    String name ;
    while(x >= 1 &&  y >= 4){
        x -= 1;
        y -= 4;
        count++;
    }
    if(count%2 == 0){
        name = "Bob";
    }
    else{
        name = "Alice";
    }
    return name;
    }
}