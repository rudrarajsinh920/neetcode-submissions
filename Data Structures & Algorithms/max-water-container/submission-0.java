class Solution {
    public int maxArea(int[] Heights) {
        int n = Heights.length;
        int res = 0;
        int l = 0, r = n - 1;

        while (l < r){
            int hieght =  Math.min(Heights[l], Heights[r]);
            int width = r - l;
            int area = hieght * width;
            res = Math.max(res, area);

            if (Heights[l] <= Heights[r]){
            l++;
            } else{
            r--;
            }
        }
        return res;
        
    }
}
