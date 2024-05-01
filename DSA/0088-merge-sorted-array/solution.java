class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    // Start from the end of nums1 and nums2
    int i = m - 1, j = n - 1, k = m + n - 1;
    
    // Merge in reverse order
    while (j >= 0) {
        if (i >= 0 && nums1[i] > nums2[j]) {
            nums1[k--] = nums1[i--];
        } else {
            nums1[k--] = nums2[j--];
        }
    }
}

}
