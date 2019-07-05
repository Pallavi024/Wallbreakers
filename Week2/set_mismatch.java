class Solution {
    public int[] findErrorNums(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum1 = 0;
        int sum2 = 0;
        int ans [] = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            sum1+=i + 1;
            sum2+=nums[i];
            if(map.containsKey(nums[i]))
                ans[0] = nums[i];
            map.put(nums[i],1);
        }
        ans[1] = ans[0] + sum1 - sum2;
        return ans;
    }
}