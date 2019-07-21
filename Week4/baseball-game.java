class Solution {
    public int calPoints(String[] ops) {
        
        Stack<Integer> s = new Stack();

        for(int i = 0;i<ops.length;i++) {
            
            if (ops[i].equals("D")) {
                s.push(2 * s.peek());
                continue;
            }
            if (ops[i].equals("C")) {
                if(s.size()!= 0)
                s.pop();
                continue;
            } 
            if(ops[i].equals("+")) {
                int temp = s.pop();
                int temp1 = temp + s.peek();
                s.push(temp);
                s.push(temp1);
                continue;
            }
                s.push(Integer.valueOf(ops[i]));
            
        }

        int ans = 0;
        while(s.size()!= 0)
            ans += s.pop();
        return ans;
    }
}