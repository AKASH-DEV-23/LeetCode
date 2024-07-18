class Solution{
public static int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        char[] ans = s.toCharArray();
        int left = 0;
        int maxCount = 0;
        int maxLength = 0;
        for (int right = 0; right < ans.length; right++) {
            arr[ans[right] - 'A']++;
            maxCount = Math.max(maxCount, arr[ans[right] - 'A']);
            // Check if the current window is valid
            while ((right - left + 1) - maxCount > k) {
                arr[ans[left++] - 'A']--;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
