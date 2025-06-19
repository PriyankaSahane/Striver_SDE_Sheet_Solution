class Solution {
    public void sortColors(int[] arr) {

        for(int i=0; i<arr.length-1; i++){
            int min=i;
            for(int j=i; j<arr.length; j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
                
            }
            int temp= arr[i];
            arr[i]= arr[min];
            arr[min]= temp;
        }
        
        
    }
}