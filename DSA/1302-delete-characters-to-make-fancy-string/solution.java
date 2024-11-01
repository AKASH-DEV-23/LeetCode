class Solution {
    public String makeFancyString(String s) {
        int count = 1;
        StringBuilder str = new StringBuilder();
        str.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                count = 1;
                str.append(s.charAt(i));
            } else if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
                if (count < 3) {
                    str.append(s.charAt(i));
                }
            }
        }
        String st = str.toString();
        return st;
    }
}
