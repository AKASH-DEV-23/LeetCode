class Solution {
    public int countGoodSubstrings(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int j = 0;
        int cnt = 0;
        char[] nums = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (i - j + 1 == 3) {
                if (map.size() == 3)
                    cnt++;
                int val = map.get(nums[j]);
                val--;
                if (val == 0)
                    map.remove(nums[j]);
                else
                    map.put(nums[j], val);
                j++;
                System.out.println(map);
            }
        }
        return cnt;
    }
}