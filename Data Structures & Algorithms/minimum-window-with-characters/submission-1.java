class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()){
            return "";
        }

        String result = "";
        int minLen = Integer.MAX_VALUE;

        // Try all substrings of s
        for (int i = 0; i < s.length(); i++){
            for (int j = i; j < s.length(); j++){
                String sub = s.substring(i, j + 1);

                // Check if sub contains all characters of t
                if (containsAll(sub, t)) {
                    if (sub.length() < minLen) {
                        minLen = sub.length();
                        result = sub;
                    }
                }
            }
        }
        return result;
    }

    // Helper function: does sub contain all chars of t?
    private boolean containsAll(String sub, String t) {
        int[] freqSub = new int[128];
        int[] freqT = new int[128];

        for (char c : sub.toCharArray()) freqSub[c]++;
        for (char c : t.toCharArray()) freqT[c]++;

        for (int i = 0; i < 128; i++) {
            if (freqT[i] > freqSub[i]) return false;
        }
        return true;
    }
}
