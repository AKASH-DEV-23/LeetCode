class Solution {
    public int countDifferentSubsequenceGCDs(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        int maxNum = 0;
        for (int num : nums) {
            numSet.add(num);
            if (num > maxNum) {
                maxNum = num;
            }
        }
        int count = 0;
        for (int d = 1; d <= maxNum; d++) {
            int currentGcd = 0;
            for (int multiple = d; multiple <= maxNum; multiple += d) {
                if (numSet.contains(multiple)) {
                    currentGcd = gcd(currentGcd, multiple);
                    if (currentGcd == d) {
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }
    private int gcd(int a, int b) {
        if(b==0)    return a;
        return gcd(b,a%b);
    }
}
