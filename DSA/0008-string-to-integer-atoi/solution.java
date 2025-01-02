class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        int n = s.length();
        if (n == 0) {
            return 0;
        }

        long ans = 0;
        boolean isNegative = false;
        int i = 0;

        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            isNegative = s.charAt(i) == '-';
            i++;
        }

        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            ans = ans * 10 + digit;

            if (isNegative && -ans < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            } else if (!isNegative && ans > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            i++;
        }

        return isNegative ? (int) -ans : (int) ans;
    }
}

