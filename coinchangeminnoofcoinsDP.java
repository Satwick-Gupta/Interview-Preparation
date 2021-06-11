public class coinchangeminnoofcoinsDP {
    public static void main(String[] args) {
        int coins[]={1,2,3};
        int sum=9;
        int dp[][]=new int[coins.length+1][sum+1];
        for(int i=0;i<coins.length+1;i++)
        {
            dp[i][0]=0;
        }
        for(int j=0;j<sum+1;j++)
        {
            dp[0][j]=Integer.MAX_VALUE-1;
        }
        for(int j=1;j<sum+1;j++)
        {
            if(j%coins[0]==0)
            {
                dp[1][j]=j/coins[0];
            }
            else
            {
                dp[1][j]=Integer.MAX_VALUE-1;
            }
        }
        for(int i=2;i<coins.length+1;i++)
        {
            for(int j=1;j<sum+1;j++)
            {
                if(coins[i-1]<=j)
                {
                    dp[i][j]=Math.min(1+dp[i][j-coins[i-1]],dp[i-1][j]);
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        System.out.println(dp[coins.length][sum]);
    }
}
