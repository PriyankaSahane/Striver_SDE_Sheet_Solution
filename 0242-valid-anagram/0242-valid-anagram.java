class Solution {
    public boolean isAnagram(String s, String t) {
         if (s.length() != t.length()) {
            return false;
        }

        /*int[] charCount = new int[26]; 

        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--; 
        }

        for (int count : charCount) {
            if (count != 0) {
                return false; 
            }
        }*/

        char[] charArray1= s.toCharArray();
        char[] charArray2= t.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
     

        return Arrays.equals(charArray1, charArray2);
    }
}