class Solution {
    public boolean isAnagram(String s, String t) {
        

        /*Optimal force approach
        int[] charCount = new int[26]; 

        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--; 
        }

        for (int count : charCount) {
            if (count != 0) {
                return false; 
            }
        }*/

        /*Brute force approach
        char[] charArray1= s.toCharArray();
        char[] charArray2= t.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
     

        return Arrays.equals(charArray1, charArray2);*/

        if (s.length() != t.length()) {
            return false;
        }
        //Better force approach
        HashMap<Character, Integer> countMap= new HashMap<>();
        for(char ch: s.toCharArray()){
            countMap.put(ch, countMap.getOrDefault(ch,0)+1);
        }
        for(char ch: t.toCharArray()){
            countMap.put(ch, countMap.getOrDefault(ch,0)-1);
        }

        for(var pair: countMap.entrySet()){
            if(pair.getValue() != 0)
             return false;
        }

        return true;

    }
}