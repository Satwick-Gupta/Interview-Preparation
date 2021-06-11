import java.util.*;
public class HelloWorld{

    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        int k1=s.nextInt();
        int t[][]=new int[N][M];
        for(int i=0;i<k1;i++)
        {
            int x=s.nextInt();
            int y=s.nextInt();
            t[x][y]=1;
        }
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                System.out.print(t[i][j]+" ");
            }
            System.out.println(" ");
        }
        int k=10;
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                if(i-1>=0&&j<M)
                {
                    if(t[i-1][j]==1&&t[i][j]!=1)
                    {
                        t[i][j]=t[i][j]+k;
                    }
                }
                if(i-1>=0&&j-1>=0)
                {
                    if(t[i-1][j-1]==1&&t[i][j]!=1)
                    {
                        t[i][j]=t[i][j]+k;
                    }
                }
                if(i-1>=0&&j+1<M)
                {
                    if(t[i-1][j+1]==1&&t[i][j]!=1)
                    {
                        t[i][j]=t[i][j]+k;
                    }
                }
                if(i+1<N&&j+1<M)
                {
                    if(t[i+1][j+1]==1&&t[i][j]!=1)
                    {
                        t[i][j]=t[i][j]+k;
                    }
                }
                if(i+1<N&&j-1>=0)
                {
                    if(t[i+1][j-1]==1&&t[i][j]!=1)
                    {
                        t[i][j]=t[i][j]+k;
                    }
                }
                if(i+1<N&&j<M)
                {
                    if(t[i+1][j]==1&&t[i][j]!=1)
                    {
                        t[i][j]=t[i][j]+k;
                    }
                }
                if(j-1>=0&&i<N)
                {
                    if(t[i][j-1]==1&&t[i][j]!=1)
                    {
                        t[i][j]=t[i][j]+k;
                    }
                }
                if(i-1>=0&&j<M)
                {
                    if(t[i-1][j]==1&&t[i][j]!=1)
                    {
                        t[i][j]=t[i][j]+k;
                    }
                }
            }
        }
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                System.out.print(t[i][j]+" ");
            }
            System.out.println(" ");
        }
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                if(t[i][j]!=1&&t[i][j]!=0)
                {
                    System.out.print(i+" "+j+" "+(t[i][j])/10+" ");
                }
                System.out.println("");
            }

        }

    }
}