class Solution {
    
    public int covert(String s)
    {
        int ans = 0;
        int k = 0;
        for(int i = s.length() - 1;i>=0;i--)
        {
            int num = s.charAt(i) - '0';
            ans += num*Math.pow(2,k);
            k++;
        }
        return ans;
    }
    public ArrayList<String> grayCode1(int a){
        if(a <= 0)
        {
            return null;
        }
        if(a == 1)
        {
            ArrayList<String> ans = new ArrayList<>();
            ans.add("0");
            ans.add("1");
            return ans;
        }

        ArrayList<String> L1 = grayCode1(a - 1);
        ArrayList<String> L2 = new ArrayList<>();
        for(int i= L1.size() - 1;i>=0;i--)
        L2.add(new String(L1.get(i)));
        
        for(int i=0;i<L1.size();i++)
        {
            L1.set(i,"0" + L1.get(i));
        }
        for(int i=0;i<L2.size();i++)
        {
            L2.set(i,"1" + L2.get(i));
        }
        
       for(int i=0;i<L2.size();i++)
       L1.add(L2.get(i));
       
       
       return L1;
    }
    public List<Integer> grayCode(int a) {
        
        List<String> ans = grayCode1( a);
        List<Integer> fans = new ArrayList<>();
        if(ans!= null)
        for(int i=0;i<ans.size();i++)
             {
            fans.add(covert(ans.get(i)) );
        }
        else
            fans.add(0);
        return fans;
    }
}