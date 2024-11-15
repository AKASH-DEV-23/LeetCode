class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int maxCount = 0;
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int cnt=1;
                while(set.contains(num+cnt)){
                    cnt++;
                }
                maxCount=Math.max(cnt,maxCount);
        }
        }
        return maxCount;
    }

}
