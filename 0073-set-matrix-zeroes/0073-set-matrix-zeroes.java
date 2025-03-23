class Solution {
    public void setZeroes(int[][] matrix) {
       /* int n=matrix.length;
        int m=matrix[0].length;
        int first_column=1;
        //for 0st row and 0st column
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    if(j!=0){
                        matrix[0][j]=0;
                    }else{
                        first_column=0;
                    }
                }
            }
        }
        //to mark with 0 from (1,1) to (n-1,m-1)
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(matrix[i][j]!=0){
                    if(matrix[i][0] == 0 || matrix[0][j]==0)
                        matrix[i][j]=0;
                }
            }
        }

        //mark 1col & 1st row
        if(matrix[0][0]==0){
            for(int j=0; j<m; j++){
                matrix[0][j]=0;
            }
        }
        if(first_column==0){
            for(int i=0; i<n; i++){
                matrix[i][0]=0;
            }
        }
       // return matrix;*/

    int rowSize= matrix.length;
	int colSize= matrix[0].length;

	ArrayList<Integer> setRowList= new ArrayList<>();
	ArrayList<Integer> setColumnList= new ArrayList<>();

	for(int i=0;i<rowSize; i++){
		for(int j=0;j<colSize; j++){
			if(matrix[i][j]==0){
				setRowList.add(i);
				setColumnList.add(j);	
			}
		}
	}

	for(int i=0;  i<rowSize; i++){
		for(int j=0; j<colSize; j++){
			if(setRowList.contains(i) || setColumnList.contains(j)){
				matrix[i][j]=0;
			}
	    }
    }
    }
}