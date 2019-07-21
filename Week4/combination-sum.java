class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
    	backtrack(0, 0, target, new ArrayList<Integer>(), list, candidates);
    	return list;
    }
    
   private void backtrack(int choice, int sum, int target, List<Integer> combList, List<List<Integer>> all, int[] candidates) {
    	if(sum == target) {
    		all.add(new ArrayList<Integer>(combList));
    	}
        else if(sum > target) {
            return;
        }
    	else {
    		for(int i = choice; i < candidates.length; i++) {
    			for(int j = 1; j <= (target-sum) / candidates[i]; j++) {
                    for(int k = 0; k < j; k++){
                        combList.add(candidates[i]);
                    }
    				backtrack(i+1, sum+candidates[i]*j, target, combList, all, candidates);
                    for(int k = 0; k < j; k++){
                        combList.remove(combList.size()-1);
                    }
    			}
    		}
    	}
    }
}