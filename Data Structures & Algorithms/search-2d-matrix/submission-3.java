class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int arrayItsIn = 0;
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i] != null && matrix[i][0] <= target){
                arrayItsIn = i;
            }
        }
        int start = 0;
        int end = matrix[arrayItsIn].length - 1;
        while(start <= end){
            int mid = (end + start) / 2;
            if(matrix[arrayItsIn][mid] == target){
                return true;
            } else if (matrix[arrayItsIn][mid] > target){
                end = mid - 1;
            } else {
                start = start + 1;
            }
        }
        return false;
    }
    
}
