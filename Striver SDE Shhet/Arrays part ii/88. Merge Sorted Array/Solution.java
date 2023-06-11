class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int i = m - 1;  // Pointer for nums1 (from end to start)
        int j = n - 1;  // Pointer for nums2 (from end to start)
        int k = m + n - 1;  // Pointer for merged array (from end to start)

        // Merge the arrays from end to start
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // If there are any remaining elements in nums2, copy them to nums1
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}