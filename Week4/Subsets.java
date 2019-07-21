class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
         genSub(0, nums, result, new ArrayList<>());
        return result;
    }
    public void genSub(int ind, int[] nums, List<List<Integer>> result, ArrayList<Integer> curr){
    
        result.add(new ArrayList<Integer>(curr));
    
        for(int i=ind;i<nums.length;i++){
            
            curr.add(nums[i]);
            
            genSub(i+1, nums, result,curr);
    
            curr.remove(curr.size()-1);
        }
    }
}