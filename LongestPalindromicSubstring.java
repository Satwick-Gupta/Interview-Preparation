import java.util.*;
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int  n=str.length();
        int dp[][]=new int[n][n];
        for(int i=0;i<dp.length;i++)
        {
            dp[i][i]=1;
        }
        int maxlength=0;
        for(int i=0;i<dp.length;i++) {
            for (int j =0; j < dp[i].length; j++) {
                if (j - i == 1) {
                    if (str.charAt(i) == str.charAt(j)) {
                        dp[i][j] = 1;
                        if (((j - i) + 1) > maxlength) {

                            maxlength = j - i + 1;
                        }
                    }
                }
            }
        }
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp.length;j++)
            {


                if(j-i>1)
                {
                    if(str.charAt(i)==str.charAt(j)&&dp[i+1][j-1]==1)
                    {
                        dp[i][j]=1;
                        if(((j-i)+1)>maxlength)
                        {
                            maxlength=j-i+1;
                        }

                    }

                }
            }

        }
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp.length;j++)
            {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println(maxlength);
    }
}
