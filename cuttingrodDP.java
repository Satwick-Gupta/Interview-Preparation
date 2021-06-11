public class cuttingrodDP {
    public static void main(String[] args) {
        int n=8;
        int wt[]={1,2,3,4,5,6,7,8};
        int val[]={1,5,8,9,10,17,17,20};
        int W=8;

        int dp[][]=new int[n+1][W+1];
        for(int i=0;i<n+1;i++)
        {
            dp[i][0]=0;
        }
        for(int j=0;j<W+1;j++)
        {
            dp[0][j]=0;
        }



        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<W+1;j++)
            {

                if(wt[i-1]<=j)
                {
                    dp[i][j]=Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }

        System.out.println(dp[n][W]);
    }
}
