class Solution {
    
    public int search(int[] nums, int target, int si, int ei)
    {
        if(si > ei)
            return -1;
        int mid = (si + ei)/2;
        
        if(nums[mid] == target)
            return mid;
        if(nums[mid] > target)
            return search(nums,target,si,mid - 1);
        return search(nums,target,mid + 1,ei);
        
    }
    public int search(int[] nums, int target) {
        
        return search(nums,target,0,nums.length - 1);
    }
}