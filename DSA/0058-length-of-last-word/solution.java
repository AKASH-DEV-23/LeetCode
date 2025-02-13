class Solution {
    public int lengthOfLastWord(String s) {
        s.trim();
        int j=s.length()-1;
        String[] str=s.split(" ");
        return str[str.length-1].length();
    }
}
