class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
         int [] ans = new int [nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int j = 0, k = 0;
            for (; j < nums2.length; ++j) {
                if (nums2[j] == nums1[i]) 
                    break;
            }
            for (k = j + 1; k < nums2.length; ++k) {
                if (nums2[k] > nums2[j]) {
                    ans[i] = nums2[k];
                    break;
                }
            }
            if (k == nums2.length) 
                ans[i] = -1;
        }
        return ans;
    }
}