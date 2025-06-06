class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int n = x;
        int ReverseNum = 0;
        while(n>0){
            int digit = n % 10;
            ReverseNum = ReverseNum * 10 + digit;
            n = n / 10;
        }
        if(ReverseNum == x){
            return true;
        }else{
            return false;
        }
    }
}