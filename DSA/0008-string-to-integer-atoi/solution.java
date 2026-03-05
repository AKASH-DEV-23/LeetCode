class Solution {

    public int myAtoi(String s) {

        int i = 0;
        int n = s.length();

        // skip spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        int sign = 1;

        // check sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }

        return solve(s, i, 0, sign);
    }

    private int solve(String s, int i, long num, int sign) {

        if (i >= s.length() || !Character.isDigit(s.charAt(i))) {
            return (int)(sign * num);
        }

        num = num * 10 + (s.charAt(i) - '0');

        // overflow check
        if (sign * num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (sign * num < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return solve(s, i + 1, num, sign);
    }
}
