class Solution {
    public int maxSubstrings(String word) {
        int len = word.length();
        if (len < 4) {
            return 0;
        }
        int[] arr = new int[len + 1];
        int[] count = new int[26];
        Arrays.fill(count, -1);
        for (int k = 0; k < len; k++) {
            arr[k+1] = arr[k];
            if (k - 3 >= 0) {
                int idx = k - 3;
                char st = word.charAt(idx);
                int end = arr[idx];  
                count[st - 'a'] =
                    Math.max(count[st - 'a'], end);
            }
            char ch = word.charAt(k);
            int str = count[ch - 'a'];
            if (str != -1) {
                arr[k + 1] = Math.max(arr[k + 1], 1 + str);
            }
        }
        return arr[len];
    }
}

