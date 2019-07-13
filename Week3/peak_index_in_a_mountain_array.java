class Solution {
    
     public int search(int[] nums, int si, int ei)
    {
        if(si > ei)
            return -1;
        int mid = (si + ei)/2;
        
        if(nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1])
            return mid;
        if(nums[mid] < nums[mid - 1])
            return search(nums,si,mid - 1);
        return search(nums,mid + 1,ei);
        
    }
    public int peakIndexInMountainArray(int[] A) {
        
        return search(A,0,A.length - 1);
    }
}