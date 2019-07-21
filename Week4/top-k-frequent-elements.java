class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
    
    for(int i = 0; i < nums.length; i++)
        map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    
    PriorityQueue<Integer> maxpriorityqueue = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
    
    maxpriorityqueue.addAll(map.keySet());
    
    ArrayList<Integer> ans = new ArrayList<>();
    
    for(int i = 1; i<=k; i++)
    {
        ans.add(maxpriorityqueue.remove());
    }
 
    return ans;
    }
}