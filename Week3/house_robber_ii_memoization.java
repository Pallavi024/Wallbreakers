class Solution {

    public int rob(int [] nums,int si,int ei,int storage[][]){
        
        if(si > ei){
            //storage[si][ei] = 0;
            return 0;
        }
        if(si == ei){
            storage[si][ei] = nums[si];
            return nums[si];
        }
        if(storage[si][ei] != -1)
            return storage[si][ei];
        int smallans1;
        if(si == 0)
         smallans1 = nums[si] + rob(nums,si + 2,ei - 1,storage);
        else
          smallans1 = nums[si] + rob(nums,si + 2,ei,storage);  
        int smallans2 = rob(nums,si + 1,ei,storage);
        storage[si][ei] = Math.max(smallans1,smallans2);
        return storage[si][ei];
        
    }
    public int rob(int[] nums) {
        
        int storage[][] = new int[nums.length][nums.length];
        for(int i=0;i<storage.length;i++){
            for(int j=0;j<nums.length;j++)
            storage[i][j] = -1;
        }
        return rob(nums,0,nums.length - 1,storage);
    }
}
