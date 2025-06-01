class Solution {

    /*public static int nCr(int n, int r){
        long res= 1;
        for(int i=0; i<r; i++){
            res = res*(n-i);
            res = res/(i+1);
        }
        return (int)res;
    }*/
    public List<List<Integer>> generate(int numRows) {

       /* List<List<Integer>> resultList = new ArrayList<>();
        for(int row=1; row<=numRows; row++){
            List<Integer> tempList= new ArrayList<>();
            for(int col=1; col<= row; col++){
                tempList.add(nCr(row-1,col-1));

            }
            resultList.add(tempList);
        }
        return resultList;*/


        List<List<Integer>> resultList= new ArrayList<>();

        if(numRows==0){
            return resultList;
        }

           // List<Integer> firstRow = new ArrayList<>();
            //firstRow.add(1);
            resultList.add(new ArrayList<>(Arrays.asList(1)));

            for(int i=1; i<numRows; i++){
                List<Integer> prevList= resultList.get(i-1);
                List<Integer> rowList= new ArrayList<>();
                 
                rowList.add(1);
                for(int j=0; j<i-1; j++){
                   rowList.add(prevList.get(j)+ prevList.get(j+1));
                }
                rowList.add(1);
                resultList.add(rowList);
            }
            return resultList;
        }
        
}
