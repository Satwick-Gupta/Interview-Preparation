import java.util.*;
public class unboundedknapsackDP {
    public static void main(String[] args) {
        int val[]={10,40,50,70};
        int wt[]={1,3,4,5};
        int W=8;
        int dp[][]=new int[val.length+1][W+1];
        for(int i=0;i<val.length+1;i++)
        {
            dp[i][0]=0;
        }
        for(int j=0;j<W+1;j++)
        {
            dp[0][j]=0;
        }
        for(int i=1;i<val.length+1;i++)
        {
            for(int j=1;j<W+1;j++)
            {
                if(wt[i-1]<=j)
                {
                    dp[i][j]=Math.max(val[i-1]+dp[i][j-wt[i-1]],dp[i-1][j]);
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        System.out.println(dp[val.length][W]);
    }
}
