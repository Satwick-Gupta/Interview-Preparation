import java.util.*;
public class KNAPSACKDP {
    public static int knapsack(int wt[],int val[],int n,int W)
    {
        if(W==0)
        {
            return 0;
        }
        if(n==0)
        {
            return 0;
        }
        if(wt[n-1]<=W)
        {
            return Math.max(val[n-1]+knapsack(wt,val,n-1,W-wt[n-1]),knapsack(wt,val,n-1,W));
        }
        else
        {
            return knapsack(wt,val,n-1,W);
        }
  }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=3;
        int curr[]={175,133,109,210,97};
        int future[]={200,125,128,229,133};
        int W=250;
        System.out.println(knapsack(curr,future,n,W));
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

                if(curr[i-1]<=j)
                {
                  dp[i][j]=Math.max(future[i-1]+dp[i-1][j-curr[i-1]],dp[i-1][j]);
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
