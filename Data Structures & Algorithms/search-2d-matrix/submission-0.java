class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int l = 0, r = rows * cols - 1;

            while (l <= r){
            int mid = l + (r - l) / 2;

            int row = mid / cols;
            int col = mid % cols;
            int midval = matrix[row][col];

            if(midval == target){
                return true;
            }else if (midval < target){
                l = mid + 1;
            }else {
                 r = mid - 1;
            }
        }
        return false;
    }
}
