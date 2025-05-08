class Solution {
    public int rotatedDigits(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (helper(i))
                cnt++;
        }
        return cnt;
    }

    private boolean helper(int num) {
        Set<Integer> set = new HashSet<>();
        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            set.add(rem);
        }
        if (set.contains(3) || set.contains(4) || set.contains(7)) {
            return false;
        }
        if(set.contains(2) || set.contains(5) || set.contains(6) || set.contains(9)){
            return true;
        }
        return false;
    }
}
