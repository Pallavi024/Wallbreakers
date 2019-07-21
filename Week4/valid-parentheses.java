class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                stack.push(s.charAt(i));
            else
            {
                if(s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}')
                {
                    if(stack.size() == 0)
                        return false;
                    char temp= stack.pop();
                   if(s.charAt(i) == ')')
                   {
                       if(temp != '(')
                           return false;
                   }
                     if(s.charAt(i) == '}')
                   {
                       if(temp != '{')
                           return false;
                   }
                     if(s.charAt(i) == ']')
                   {
                       if(temp != '[')
                           return false;
                   }
                }
            }
        }
        
        return (stack.size() == 0);
    }
}