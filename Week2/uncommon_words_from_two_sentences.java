class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        
        HashMap<String, Integer> map = new HashMap<>();
        String[] arr1 = A.split(" ");
        String[] arr2 = B.split(" ");
        
        for(int i=0;i<arr1.length;i++)
        {
            if(map.containsKey(arr1[i]))
                map.put(arr1[i],map.get(arr1[i]) + 1);
            else
                map.put(arr1[i],1);
        }
        for(int i=0;i<arr2.length;i++)
        {
                 if(map.containsKey(arr2[i]))
                map.put(arr2[i],map.get(arr2[i]) + 1);
            else
                map.put(arr2[i],1);
        }
        ArrayList<String> ans = new ArrayList<>();
        
        for(String temp : map.keySet())
        {
            if(map.get(temp) == 1)
                ans.add(temp);
        }
        return ans.toArray(new String[ans.size()]);
    }
}