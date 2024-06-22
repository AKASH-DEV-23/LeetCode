class Solution {
    public int majorityElement(int[] nums) {
        int candi = 0;
        int point = 0;
        for (int n : nums) {
            if (point == 0) {
                candi = n;
                point++;
            } else if (candi == n) {
                point++;
            } else
                point--;
        }
        return candi;
    }
}
