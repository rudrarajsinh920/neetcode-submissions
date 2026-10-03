class Solution {
    public int longestConsecutive(int[] nums) {
        int log = 0;
        Set<Integer> store = new HashSet <> ();
        for (int num : nums){
            store.add(num);
        }

        for (int num : store){
            if (!store.contains(num - 1)){
                int len = 1;

                while (store.contains(num + len)){
                len++;
            }
            log = Math.max(log, len);
        }
            
            
    }
        return log;
 }
}
