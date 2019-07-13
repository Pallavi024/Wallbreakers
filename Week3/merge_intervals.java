class Solution{
   
     class customcomparator implements Comparator<int []>
    {
        @Override
        public int compare(int[] o1, int[] o2)
        {
            
            if(o1[0] < o2[0])
                return -1;
            if(o1[0] == o2[0])
            return 0;
            else
                return 1;
                
        }
    }
    public int[][] merge(int[][] intervals) {
        
        if(intervals.length == 0)
            return intervals;
    
        customcomparator temp = new customcomparator();
        Arrays.sort(intervals, temp);
        ArrayList<int []> ans = new ArrayList<>();
        
        int[] temp1 = intervals[0];
        for(int i=1;i<intervals.length;i++)
        {
            int[] arr = intervals[i]; 
                if(temp1[1] >= arr[0] && temp1[1] <= arr[1])
                { 
                    temp1[1] = arr[1];
                }
            else if(temp1[0] <= arr[0] && temp1[1] >= arr[0] || arr[0] <= temp1[0] && arr[1] >= temp1[0])
            {
                temp1[0] = Math.min(temp1[0], arr[0]);
                temp1[1] = Math.max(temp1[1], arr[1]);
            }
            else{
         ans.add(temp1);
            temp1 = arr;
            }
        }
        ans.add(temp1);
    
       return ans.toArray(new int[ans.size()][2]);
    }
}
