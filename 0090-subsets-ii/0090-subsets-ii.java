class Solution {

//array contains duplicate elements so number of subset reduces

private void backtrack(int[] nums,int start, List<Integer> temp, List<List<Integer>> resultList ){

    
    if(start == nums.length){
        resultList.add(new ArrayList<>(temp));
        return;
    }

    temp.add(nums[start]);
    backtrack(nums, start+1, temp, resultList);
    temp.remove(temp.size()-1);// backtrack and undo the change we have done

    //use while so that it will don't pick element which is duplicate , also must ensure we skip all the duplicate occurrences of nums[i]
    while( start< nums.length-1 && (nums[start]==nums[start+1])){
        start++;
    }

    backtrack(nums, start+1, temp, resultList);
   
  
}
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       
       Arrays.sort(nums);
       List<List<Integer>> resultList= new ArrayList<>();

       backtrack(nums,0, new ArrayList<Integer>(), resultList);

       return resultList;

       
    }
}