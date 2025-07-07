class Solution {
    boolean isPalindrome(String s) {
      
    // Function to check if a string is a palindrome.
        int i=0, j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
        // code here
        
    }

}
