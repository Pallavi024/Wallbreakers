class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permute(nums, new ArrayList<>(), result);
        
        return result;
    }
    
    void permute(int[] nums, List<Integer> current, List<List<Integer>> result) {
        for (int i=0; i<nums.length; i++) {
            if (current.size() == nums.length) {
                result.add(new ArrayList<>(current));
                return;
            } else if (current.contains(nums[i])) continue;
            
            current.add(nums[i]);
            permute(nums, current, result);
            current.remove(current.size()-1);
        }
    }
}