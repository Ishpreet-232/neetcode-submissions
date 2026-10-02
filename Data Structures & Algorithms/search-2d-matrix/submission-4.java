class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //Binary Search Approach
        int rows = matrix.length;
        int cols = matrix[0].length;
        int low = 0;
        int high = (rows * cols) - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int element = matrix[mid / cols][mid % cols]; 
            if(element==target) return true;
            else if(element>target) high = mid-1;
            else low = mid+1;
        }
        return false;
    }
}
