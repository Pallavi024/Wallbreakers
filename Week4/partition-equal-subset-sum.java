class Solution {
    
    public boolean canPartition(int[] nums, int si,int leftsum, int rightsum, int storage[][]){

        if(storage[leftsum][rightsum] != -1){
            if (storage[leftsum][rightsum] == 0) return false;
            else
                return true;
        }
        if(si >= nums.length)
        {
            if(leftsum == rightsum){
                storage[leftsum][rightsum] = 1;
                return true;
            }
            else{
                storage[leftsum][rightsum] = 0;
                return false;
            }
        }
        
        boolean smallans1 = canPartition(nums,si + 1, leftsum + nums[si], rightsum,storage);
        boolean smallans2 = canPartition(nums, si + 1, leftsum,rightsum + nums[si],storage);
        
        if(smallans1 || smallans2)
            storage[leftsum][rightsum] = 1;
        else
            storage[leftsum][rightsum] = 0;
        return smallans1 || smallans2;
    }
    public boolean canPartition(int[] nums) {
     
        int sum = 0;
        for(int i=0;i<nums.length;i++)
            sum += nums[i];
        int storage[][] = new int[sum + 1][sum + 1];
        for(int i=0;i<storage.length;i++)
        {
            for(int j=0;j<storage[0].length;j++)
                storage[i][j] = -1;
        }
        return canPartition (nums,0,0,0,storage);
    }
}