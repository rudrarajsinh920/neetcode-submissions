class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0, n = s.length();
        for (int i = 0; i < n; i++){
            int[] count = new int[26];
            int maxFreq = 0;
            for (int j = i; j < n; j++){
                 maxFreq = Math.max(maxFreq, ++count[s.charAt(j) - 'A']);
                 if ((j - i + 1) - maxFreq <= k) {
                     res = Math.max(res, j - i + 1);
                 }
            }
        }
        return res;
    }
}