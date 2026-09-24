class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char d = board[r][c];
                if (d == '.') continue;
                if (!seen.add(d + " in row " + r) ||
                    !seen.add(d + " in col " + c) ||
                    !seen.add(d + " in box " + r/3 + "-" + c/3)) {
                    return false;
                }
            }
        }
        return true;
    }
}