class Solution {
    public int reverseExponentiation(int n) {
        // code here
         int original = n;  
        int rev=0;
        while(n != 0){
     int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
            
        }
        return pow(original,rev);
    }
     public int pow(int n, int rev){
         if(rev == 0) return 1;
     
        return n*pow(n,rev-1);
        
    } }
    
