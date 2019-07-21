class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        
        for (int n: nums) sum += n;
        if (sum % k != 0) return false;
    
        return dfs(nums, k, new boolean[nums.length], 0, sum/k, nums.length - 1);
    }
    
    public boolean dfs(int[] nums, int k, boolean[] visited, int sum, int target, int index) {
        if (k == 0) 
            return true;
        
        if (sum == target) 
            return dfs(nums, k - 1, visited, 0, target, nums.length - 1);
        
        for (int i = index; i >= 0; i--) {
           
            if (visited[i] || sum + nums[i] > target) 
                continue;
            
           
            visited[i] = true;
            if (dfs(nums, k, visited, sum + nums[i], target, i-1)) 
                return true;
            
            visited[i] = false;
        }
        
        return false;
    }
    
}