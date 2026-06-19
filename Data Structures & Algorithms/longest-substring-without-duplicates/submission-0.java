class Solution {
    public int lengthOfLongestSubstring(String str) {
            int res = 0;

            for (int i = 0; i < str.length(); i++){
                Set<Character> t = new HashSet <> ();
                for (int j = i; j < str.length(); j++){
                    if (t.contains(str.charAt(j))){
                        break;
                    }
                    t.add(str.charAt(j));
                }
                    res = Math.max(res, t.size());
            }
            return res;
        }
        
    }
