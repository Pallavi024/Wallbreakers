class Solution {
    public boolean isMatch(String s, String p) {
        
        boolean [][] dp = new boolean [s.length() + 1][p.length() + 1];
        
        dp[0][0] = true;
        for (int i = 1; i < dp[0].length; i++) {
            if (p.charAt(i-1) == '*') {
                dp[0][i] = dp[0][i - 2];
            }
        }
        for(int i=1;i <=s.length();i++)
        {
            for(int j = 1;j<=p.length();j++)
            {
                if(p.charAt(j - 1) == '*')
                {
                    boolean smallans1 = dp[i][j - 2];
                    boolean smallans2 = false;
                    if(s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.')
                        smallans2 = dp[i -1][j];
                    dp[i][j] = smallans1 || smallans2;
                }
                else if(p.charAt(j - 1) == '.' || s.charAt(i - 1) == p.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];
            }
        }
        return dp[s.length()][p.length()];
    }
}