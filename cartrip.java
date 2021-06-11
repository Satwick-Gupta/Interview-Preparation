import java.util.Arrays;
import java.util.Scanner;

public class cartrip {

    public static void main (String []x)
    {
        Scanner s =new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        int K=s.nextInt();
        int matrix[][]=new int[N][M];
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
             matrix[i][j]=s.nextInt();
            }
        }
        System.out.println(solve(N,M,K,matrix));

    }
    static int solve(int N,int M,int K,int [][]matrix)
    {
        int[][][][] dp = new int[N][M+1][(M/2)+1][K];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M+1; j++){
                for(int jj = 0; jj < (M/2)+1; jj++){
                    Arrays.fill(dp[i][j][jj], Integer.MIN_VALUE);
                }
            }
        }
        dp[0][0][0][0] = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j <= M; j++){
                for(int jj = 0; jj <= (M/2); jj++){
                    for(int jjj = 0; jjj < K; jjj++){
                        if(j == M && i != N-1){
                            dp[i+1][0][0][jjj] = Math.max(dp[i+1][0][0][jjj], dp[i][j][jj][jjj]);
                        }else if(j != M){
                            dp[i][j+1][jj][jjj] = Math.max(dp[i][j+1][jj][jjj], dp[i][j][jj][jjj]);
                            if(jj < (M/2)){
                                dp[i][j+1][jj+1][(jjj+matrix[i][j])%K] = Math.max(dp[i][j+1][jj+1][(jjj+matrix[i][j])%K],
                                        dp[i][j][jj][jjj]+matrix[i][j]);
                            }
                        }
                    }
                }
            }
        }
        int result=0;

        for(int i = 0; i <= M/2; i++){
            result = (int)Math.max(result, dp[N-1][M][i][0]);

        }
        return result;
    }
}
