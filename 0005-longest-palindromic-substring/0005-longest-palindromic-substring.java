class Solution {
    public static boolean checkPalindrome(String s, int low, int high){
        while(low<high){
            if(s.charAt(low) != s.charAt(high)){
                return false;

            }
            low++;
            high--;
        }
        return true;
    }
    

    public String longestPalindrome(String s) {

        int n= s.length();

        int maxLen=1, start=0;

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(checkPalindrome(s,i,j) && (j-i+1)> maxLen){
                    start=i;
                    maxLen=j-i+1;
                }
            }
        }
        return s.substring(start, start+maxLen);
        
        
    }


}