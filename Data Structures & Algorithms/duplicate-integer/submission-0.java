class Solution {
    public static boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,3};
        System.out.println(hasDuplicate(nums));
    }
}