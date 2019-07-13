class Solution {

    public int rob(int[] nums, int si, int ei){
    if(si == ei){
        return nums[si];
    }
 
    int[] storage = new int[nums.length];
    storage[si]=nums[si];
    storage[si+1]=Math.max(nums[si+1], storage[si]);
 
    for(int i=si+2; i<=ei; i++){
        storage[i]=Math.max(storage[i-1], storage[i-2]+nums[i]);    
    }
 
    return storage[ei];
}
     public int rob(int[] nums) {
         
        if(nums.length==0)
        return 0; 
 
    if(nums.length == 1)
        return nums[0];
 
    int Max1 = rob(nums, 0, nums.length-2);
    int Max2 = rob(nums, 1, nums.length-1);
 
    return Math.max(Max1, Max2);
         
     }
}
