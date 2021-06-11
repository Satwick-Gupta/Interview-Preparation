public class subsetswithsumDP {
    public static void main(String[] args) {
        int arr[]={1,2,3,3};
        int val=10;
        boolean dp[][]=new boolean[arr.length+1][val+1];
        for(int i=0;i<arr.length+1;i++)
        {
            dp[i][0]=true;
        }
        for(int j=1;j<val+1;j++)
        {
            dp[0][j]=false;
        }
        for(int i=1;i<arr.length+1;i++)
        {
            for(int j=1;j<val+1;j++)
            {
                if(arr[i-1]<=j)
                {
                    dp[i][j]=dp[i-1][j-arr[i-1]]||dp[i-1][j];
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        System.out.println(dp[arr.length][val]);
    }
}
