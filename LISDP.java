import java.util.*;
public class LISDP {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        int s[]=new int[n];
        for(int i=0;i<n;i++)
        {
            s[i]=s1.nextInt();
        }
        int dp[]=new int[n];
        Arrays.fill(dp,1);
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(s[j]>s[i])
                {
                    dp[j]=Math.max(dp[i]+1,dp[j]);
                }
            }

        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(dp[i]>max)
            {
                max=dp[i];
            }
        }
        System.out.println(max);

    }
}
