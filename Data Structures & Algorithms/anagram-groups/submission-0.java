
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null) return new ArrayList<>();              // handle null input

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] arr = s.toCharArray();                        // convert to char array
            Arrays.sort(arr);                                    // sort characters
            String key = new String(arr);                        // sorted string is the key

            map.putIfAbsent(key, new ArrayList<>());             // create list if missing
            map.get(key).add(s);                                 // add original word
        }

        return new ArrayList<>(map.values());                    // return grouped anagrams
    }
}
