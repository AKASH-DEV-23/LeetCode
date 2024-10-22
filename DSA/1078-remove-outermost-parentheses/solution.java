class Solution {
public static String removeOuterParentheses(String s) {
        char[] ch = s.toCharArray();
        StringBuilder str = new StringBuilder();
        int open = 0;
        for (char c : ch) {
            if (c == '(') {
                if (open > 0) {
                    str.append(c);
                }
                open++;
            } else {
                open--;
                if (open > 0) {
                    str.append(c);
                }
            }
        }
        return str.toString();
    }

}
