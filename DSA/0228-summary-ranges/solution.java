class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            StringBuilder str = new StringBuilder();
            str.append(nums[i]);
            boolean flag = false;
            int last = -1;
            while (i+1 < nums.length && (nums[i] + 1) == nums[i + 1]) {
                flag = true;
                i++;
                last = nums[i];
            }
            if (flag) {
                str.append("->");
                str.append(last);
            }
            list.add(str.toString());
        }
        return list;
    }
}
