class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> groupedAnagramMap= new HashMap<>();

        for(String s: strs){

            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String sortedWord = new String(ch);
          
            if(!groupedAnagramMap.containsKey(sortedWord)){
                groupedAnagramMap.put(sortedWord,new ArrayList<>(Arrays.asList(s)));
            }else{
                groupedAnagramMap.get(sortedWord).add(s);
            }

        }
        return new ArrayList<>(groupedAnagramMap.values());
        
    }
}