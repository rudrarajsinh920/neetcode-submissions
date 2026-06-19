public class Solution {
    public static int[] getConcatenation(int[] nums) {  // ✅ made static
        int ans[] = new int[2 * nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {1, 4, 1, 2};
        int result[] = getConcatenation(nums);  // ✅ directly call static method

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
