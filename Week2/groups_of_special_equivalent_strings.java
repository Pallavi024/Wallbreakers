class Solution {
    public int numSpecialEquivGroups(String[] A) {
        
        Set<String> ans = new HashSet<>();
        for(int i = 0;i<A.length;i++)
        {
            String even = "";
            String odd = "";
            for(int j=0;j<A[i].length();j++)
            {
                if(j % 2 == 0)
                    even+= A[i].charAt(j);
                else
                    odd+=A[i].charAt(j);
            }
            char [] evenarr = even.toCharArray();
            char [] oddarr = odd.toCharArray();
            Arrays.sort(evenarr);
            Arrays.sort(oddarr);
            even = String.valueOf(evenarr);
            odd = String.valueOf(oddarr);
            ans.add(even + odd);
        }
        return ans.size();
    }
}