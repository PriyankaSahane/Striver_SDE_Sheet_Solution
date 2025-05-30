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

    /*int rowSize= matrix.length;
	int colSize= matrix[0].length;

	ArrayList<Integer> setRowList= new ArrayList<>();// takes o(n) time complexity in worst case
	ArrayList<Integer> setColumnList= new ArrayList<>();//takes o(m) time coplexity in worst case 

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
    }*/

    /*ArrayList<Integer> setRowList= new ArrayList<>();
    ArrayList<Integer> setColList= new ArrayList<>();

    for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[i].length; j++){
            if(matrix[i][j]==0){
                setRowList.add(i);
                setColList.add(j);
                
            }
        }
    }

    matrix=setRowZero(setRowList, matrix);
    matrix=setColumnZero(setColList, matrix);

    
    }

    public static int[][] setRowZero(ArrayList<Integer> rowList, int[][] inputMatrix){

        for(int i=0; i<rowList.size(); i++){
            int rowPos= rowList.get(i);
            for( int j=0; j<inputMatrix[0].length; j++){
                inputMatrix[rowPos][j]=0;
            }
        }
        return inputMatrix;

    }

    public static int[][] setColumnZero(ArrayList<Integer> colList, int[][] inputMatrix){

        for(int i=0; i<colList.size(); i++){
            int colPos= colList.get(i);
            for( int j=0; j<inputMatrix.length; j++){
                inputMatrix[j][colPos]=0;
            }
        }
        return inputMatrix;
    }*/



    int col0=1;
    for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[i].length; j++){
            if(matrix[i][j]==0){
                if(j!=0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }else{
                    col0=0;
                }

                
            }
        }
    }

    for(int i =1; i<matrix.length; i++){
        for(int j=1; j<matrix[i].length; j++){
            if(matrix[i][j] != 0){
                // check for col and row
                if(matrix[0][j]==0 || matrix[i][0]==0){
                    matrix[i][j]=0;
                }
            }
          
        }
      
    }

    if(matrix[0][0]==0){
        for(int j=0; j<matrix[0].length; j++){
            matrix[0][j]=0;
        }
    }
    if(col0==0){
        for(int i=0; i<matrix.length; i++){
            matrix[i][0]=0;
        }
    }
    }
}