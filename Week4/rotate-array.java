class Solution {
    public void rotate(int[] nums, int k) {
        
        k = k % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            int next = start;
            do {
               next = (next + k) % nums.length;
               swap(nums, next, start);
               count++;
            } while (start != next);
        }
    }
   public int[] swap(int[]nums, int a, int b){
      int temp = nums[b];
      nums[b] = nums[a];
      nums[a] = temp;
      return nums;
    }
}