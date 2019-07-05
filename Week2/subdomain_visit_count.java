class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0;i<cpdomains.length;i++)
        {
            String temp[] = cpdomains[i].split("[ .]+");
            
            int count = Integer.valueOf(temp[0]);
            
            String temp3 = "";
            int p = 0;
            for(int j=temp.length - 1;j>0;j--)
            {
                if(p == 0)
                temp3 += temp[j];
                else
                 temp3 = temp[j] + "." + temp3;   
                map.put(temp3, map.getOrDefault(temp3,0) + count);
                p = 1;
            }
        }
        List<String> ans = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : map.entrySet())
        {
            ans.add(entry.getValue() + " " + entry.getKey());
        }
        return ans;
    }
}