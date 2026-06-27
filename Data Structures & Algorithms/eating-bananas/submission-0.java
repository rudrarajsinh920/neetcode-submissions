class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int maxPile = 0;
        for (int p : piles) {
            if (p > maxPile) maxPile = p;
        }

        for (int k = 1; k <= maxPile; k++) {
            long hours = 0;
            for (int p : piles) {
                hours += (long)(p + k - 1) / k;
            }
            if (hours <= h) return k;
        }
        return maxPile;
    }
}