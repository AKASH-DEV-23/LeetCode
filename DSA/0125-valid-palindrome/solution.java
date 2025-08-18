class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-zA-Z0-9]","");
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
