class Solution {
public boolean isPalindrome(String s) {
    s = s.toLowerCase(); // convert to lowercase
    int left = 0, right = s.length() - 1;
    while (left <= right) {
        if (!Character.isLetterOrDigit(s.charAt(left))) {
            left++; // skip non-alphanumeric characters
        } else if (!Character.isLetterOrDigit(s.charAt(right))) {
            right--; // skip non-alphanumeric characters
        } else if (s.charAt(left) != s.charAt(right)) {
            return false; // mismatched characters
        } else {
            left++; right--; // move towards center
        }
    }
    return true; // palindrome
}

}
