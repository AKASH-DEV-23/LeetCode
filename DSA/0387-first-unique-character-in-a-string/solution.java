class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            ++count[a[i] - 97];
        }
        for (int i = 0; i < a.length; i++) {
            if(count[a[i]-97] == 1){
                return i;
            }
        }
        return -1;
    }
}
