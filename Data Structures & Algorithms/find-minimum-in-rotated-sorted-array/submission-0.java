class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int l = 0, r = n - 1;
        int minele = nums[0];

        while (l <= r){
            minele = Math.min(minele, nums[l]);
            minele = Math.min(minele, nums[r]);

            if (l < r){
                 l++;
                 r--;
            }else {
                break;
            }
        }
        return minele;      
    }
}
